using System;
using System.Threading.Tasks;
using APIConselho.Models;

class Program
{
    static async Task Main() {
        APIConection adviceService = new();
        int opcao = 0;

        do{
            Console.WriteLine("Você está em um servio de conselhos: ");
            Console.WriteLine("1. receber conselho");
            Console.WriteLine("2. sair");

            opcao = int.Parse(Console.ReadLine());

            if (opcao == 1){
                string advice = await adviceService.GetAdviceAsync();
                Console.WriteLine($"Conselho: {advice}");
            } else if ( opcao == 2){
                Console.WriteLine("Tchau!!");
            } else {
                Console.WriteLine("Opção inválida. Tente novamente.");
            }
            Console.WriteLine("Enter to continue!");
            Console.ReadKey();
            Console.Clear();
        } while (opcao != 2);
    }
}
