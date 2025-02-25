# Projeto: Trava Eletrônica com Senha

Este projeto implementa um sistema de **trava eletrônica com senha** usando um **teclado matricial**, **LCD** e **servo motor** para controlar a abertura e fechamento da porta. A senha é cadastrada e validada, e a porta só pode ser aberta com a senha correta.

## Esquemático do Circuito

![Esquemático do Circuito](image.png)

## Componentes Utilizados

- **Arduino Uno** (ou similar)
- **Teclado matricial 4x4**
- **Display LCD 16x2**
- **Servo motor**
- **Buzzer**
- **Botão (para trancar novamente)**
- **Fios de conexão**

## Código do Arduino

```cpp
#include <LiquidCrystal.h>
#include <Keypad.h>
#include <Servo.h>

const int rs = 12, en = 11, d4 = A0, d5 = A1, d6 = A2, d7 = A3;
const int speaker = 13, btnpin = 9;
const byte numRows= 4;
const byte numCols= 4;
bool welcome = false;

String password = String("");
String strentry = String("");
char keypressed;
char keymap[numRows][numCols]= { 
{'1', '2', '3', 'A'},
{'4', '5', '6', 'B'},
{'7', '8', '9', 'C'},
{'*', '0', '#', 'D'} };

byte rowPins[numRows] = {7,6,5,4};
byte colPins[numCols]= {3,2,1,0};

LiquidCrystal lcd(rs, en, d4, d5, d6, d7);
Servo door;
Keypad keypad= Keypad(makeKeymap(keymap), rowPins, colPins, numRows, numCols);

void setpass()
{
    lcd.setCursor(0, 0);
    lcd.print("Nova Senha");
  
    while (password.length() < 8)
    {
        keypressed = keypad.getKey();
        if (keypressed != NO_KEY)
        {
            tone(speaker, 500, 30);
            password = password + keypressed;
        }
        lcd.setCursor(0, 1);
        lcd.print(password);
        delay(100);
    }
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print(password);
    lcd.setCursor(0, 1);
    lcd.print ("Confirma?");
    keypressed = NO_KEY;
    while (keypressed == NO_KEY || keypressed != 'A' || keypressed != 'B')
    {
        keypressed = keypad.getKey();
        if (keypressed == 'A')
        {
            tone(speaker, 500, 30);
            lcd.clear();
            lcd.setCursor(0, 0);
            lcd.print("Senha Cadastrada");
            delay(2000);
            lcd.clear();
            break; 
        }
        if (keypressed == 'B')
        {
            tone(speaker, 500, 30);
            password = "";
            lcd.clear();
            delay(1000);
            break;
        }
    }  
}

void checkpass()
{
    while (strentry.length() < 8)
    {
        keypressed = keypad.getKey();
        if (keypressed != NO_KEY)
        {   
            tone(speaker, 500, 30);
            strentry = strentry + keypressed;
        }
        lcd.setCursor((strentry.length() - 1), 0);
        lcd.print("*");
        delay(100);
    }
    lcd.setCursor(0, 1);
    lcd.print ("Confirma?");
    keypressed = NO_KEY;
    while (keypressed == NO_KEY)
    {
        keypressed = keypad.getKey();
        if (keypressed == 'A' && strentry == password)
        {
            tone(speaker, 500, 30);
            strentry = "";
            lcd.clear();
            lcd.print("Bem Vindo!");
            welcome = true;
            delay(2000);
            lcd.clear();
            break; 
        }  
        if (keypressed == 'A' && strentry != password)
        {
            tone(speaker, 500, 30);
            strentry = "";
            lcd.clear();
            lcd.print("Senha Errada!");
            delay(2000);
            lcd.clear();
            break;
        }
        if (keypressed == 'B')
        {
            tone(speaker, 500, 30);
            strentry = "";
            lcd.clear();
            break;
        }  
    }  
}

void setup()
{
    lcd.begin(16, 2);
    door.attach(10);
    pinMode(speaker, OUTPUT);
    pinMode(btnpin, INPUT);
}

void loop()
{
    if (welcome == false)
    {
        door.write(0);  
        if (password == "")
        {
            setpass();    
        }else if (welcome == false)
        {
            checkpass();
        }
    }  
    if (welcome == true)
    {
        door.write(90);
        if (digitalRead(btnpin) == HIGH)
        {
            tone(speaker, 250, 30);
            lcd.print("Trancando...");
            delay(3000);
            door.write(0);
            welcome = false;
            lcd.clear();
        }
    }  
}
