using Att47.Models;

List<int> numeros = [1, 2, 3, 4];

var resultado = await Classe.ProcessarListaAsync(numeros);

Console.WriteLine(String.Join(", ", resultado));