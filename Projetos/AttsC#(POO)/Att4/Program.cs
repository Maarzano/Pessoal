using Att4.Models.Carro;

namespace Att4
{
    public class Program
    {
        public static void Main(string[] args)
        {

Console.WriteLine($"Escreva a marca do carro");
string nomeCarro = Console.ReadLine();

Console.WriteLine($"Escreva o modelo do carro");
string modeloCarro = Console.ReadLine();

Console.WriteLine($"Escreva o ano do carro");
int  anoCarro = int.Parse(Console.ReadLine());

Carro carro = new Carro(nomeCarro, modeloCarro, anoCarro);

carro.ExibirInfo();
        }
    }
}