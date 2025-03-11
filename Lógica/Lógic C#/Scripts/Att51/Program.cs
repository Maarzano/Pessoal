using Att51.Models;

int x = 10;
Console.WriteLine($"Aqui temos o número {x}");

Console.WriteLine($"Aqui temos a função de duplicar por valor: {Classe.Duplicar(x)}, mas perceba que o número continuar o mesmo: {x}");
Console.Write($"Aqui temos a função de duplicar por referência: {Classe.Duplicar(ref x)}");
Console.WriteLine($" mas desta vez o valor da variável mudou tbm: {x}");
