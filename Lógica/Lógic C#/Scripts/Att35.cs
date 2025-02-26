// Solicite ao usuário que informe um número e exiba esse número com o prefixo "ID" (exemplo: "ID12345").

Console.WriteLine("informe um número");
int numero = int.Parse(Console.ReadLine());

Console.WriteLine($"ID{numero}");
