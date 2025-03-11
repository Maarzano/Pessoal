using Att48.Models;

var lista = new List<string> { "banana", "maçã", "kiwi" };

Classe.OrdenarLista(lista, (s1, s2) => s1.Length.CompareTo(s2.Length));

Console.WriteLine("Ordenação por tamanho: " + string.Join(", ", lista));


Classe.OrdenarLista(lista, (s1, s2) => s1.CompareTo(s2));
Console.WriteLine("Ordenação alfabética: " + string.Join(", ", lista));