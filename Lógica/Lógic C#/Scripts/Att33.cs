// Solicite ao usuário que informe uma frase. Remova todos os espaços extras no início, fim e entre as palavras.

Console.WriteLine("Informe uma frase");
string frase = Console.ReadLine();

Console.WriteLine($"sua frase sem espaços ({frase.Replace(" ", "")})");
