package att28;

public class ArCondicionado {
    public void ligar() { System.out.println("Ar condicionado ligado."); }
    public void ligar(int temp) { ligar(); setTemperatura(temp);}
    public void setTemperatura(int temp) { System.out.println("Temperatura definida para " + temp + " graus."); }
    public void desligar(){ System.out.println("Ar desligando...");}
}
