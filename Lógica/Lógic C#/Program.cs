using Lógic_C_.Models;

Pessoa pessoa1 = new Pessoa();

Console.WriteLine("Digite o nome da pessoa:");
pessoa1.Nome = Console.ReadLine();

Console.WriteLine("Digite a idade da pessoa:");
pessoa1.Idade = Convert.ToInt32(Console.ReadLine());

pessoa1.Apresentar();

Console.WriteLine($"Você digitou o nome: {pessoa1.Nome}");