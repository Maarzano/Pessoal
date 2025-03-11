using Att53.Models;

int x = 1000;
int y = 3;
Classe.Retirar10(ref x, ref y);
Console.WriteLine(x + " " + y);
Console.WriteLine(Classe.Retirar10(ref x, ref y).Item1);
