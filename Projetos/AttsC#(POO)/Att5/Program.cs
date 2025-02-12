using Att5.Models.ContaBancaria;

namespace Att5
{
    public class Program
    {
        public static void Main(string[] args)
        {
            ContaBancaria conta1 = new ContaBancaria(1, "Patrícia", 123);
            ContaBancaria conta2 = new ContaBancaria(2, "Arthur");


            Console.WriteLine(conta1.ExibirSaldo());

            conta1.Depositar(77.5m);

            Console.WriteLine(conta1.ExibirSaldo());

            conta1.Sacar(10.5m);

            Console.WriteLine(conta1.ExibirSaldo());

            Console.WriteLine($"Titular da conta: {conta1.Titular}");
            conta1.Depositar(200);

            conta1.Transferir(200, conta2);

            Console.WriteLine(conta1.ExibirSaldo());
            Console.WriteLine(conta2.ExibirSaldo());
        }
    }
}

