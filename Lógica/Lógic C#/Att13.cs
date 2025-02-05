Console.WriteLine("escreva o primero número");
int num = int.Parse(Console.ReadLine());

Console.WriteLine("escreva outro número agora");
int num2 = int.Parse(Console.ReadLine());

string resultado = (num > num2) ? $"O número {num} é maior que {num2}" : $"O número {num2} é maior que {num}";

Console.WriteLine(resultado);