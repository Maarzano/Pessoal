Console.WriteLine("Escreva um número");
int num = int.Parse(Console.ReadLine());

string resul = (num >= 10 && num <= 50) ? "dentro do intervalo" : "fora do intervalo";

Console.WriteLine(resul);