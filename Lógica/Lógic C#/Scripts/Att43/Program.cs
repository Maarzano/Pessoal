using Att43.Models;

var lista = new List<int> { 1, 2, 3, 4, 5, 6 };

var numerosPares = Classe.FiltrarNumeros(lista, n => n % 2 == 0);

Console.WriteLine(string.Join(", ", numerosPares));
