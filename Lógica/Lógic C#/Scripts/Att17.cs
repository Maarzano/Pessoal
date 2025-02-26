Console.WriteLine("Quantos anos você tem? ");
int idade = int.Parse(Console.ReadLine());

string resul = (idade >= 60) ? "Tem desconto" : "Não tem desconto";

Console.WriteLine("É estudande?");
string estudante = Console.ReadLine();

resul = (estudante == "sim" || idade >= 60) ? "tem desconto" : "não tem desconto";

Console.WriteLine(resul);