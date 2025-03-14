using System.ComponentModel;
using AttRevisão3.Models;

int numero = 23, numero2 = 10, resultado;

Classe.AlterarValor(ref numero, ref numero2, out resultado);
Console.WriteLine($"{numero}, {numero2}, {resultado}");
