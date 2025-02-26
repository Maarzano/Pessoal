Console.WriteLine("Escreva um número");
int num = int.Parse(Console.ReadLine());

string resul = (num % 2 == 0 || num % 3 == 0) ? "Divisivel" : "Não divisivel";
Console.WriteLine(resul);
