Console.WriteLine("Escreva um número");
int num = int.Parse(Console.ReadLine());

string resul = (num % 3== 0 && num % 5 == 0)? "FizzBuzz" : $"{num}";

Console.Write(resul);