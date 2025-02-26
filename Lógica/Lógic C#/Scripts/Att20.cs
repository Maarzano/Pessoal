Console.WriteLine("Digite o nome do produto: ");
string produto = Console.ReadLine();

Console.WriteLine("Digite o valor dele");
double valor = double.Parse(Console.ReadLine());

string frete = (valor >= 100) ? "tem frete gratuito" : "não tem frete gratuito";

Console.WriteLine($"o produto {produto} {frete}");