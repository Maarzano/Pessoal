Console.WriteLine("Digite uma letra: ");
char letra = Console.Read().KeyChar;

string vogal = ("aeiouAEIOU".Contains(letra)) ? "Eh vogal" : "não eh vogal";

Console.WriteLine(vogal);