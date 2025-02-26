Console.WriteLine("Escreva sua nota");
double nota = double.Parse(Console.ReadLine());

string result = (nota >= 5 && nota <= 6.9) ? "Recuperação"
: ((nota >= 7) ? "Aprovado" : "reprovado");

Console.WriteLine(result);