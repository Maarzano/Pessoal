// Solicite ao usuário que informe uma string e uma letra. Exiba quantas vezes essa letra aparece na string.
Console.WriteLine("Escreva uma string");
string texto = Console.ReadLine();

Console.WriteLine("Agora escreva uma letra");
char letra = Console.ReadLine()[0];

int count = texto.Count(c => c == letra);

Console.WriteLine($"a letra {letra} apareceu {count} vezes");