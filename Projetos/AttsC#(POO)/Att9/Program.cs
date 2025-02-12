using Att9.Models;
using System;
using System.Collections.Generic;

namespace Att9
{
    public class Program
    {
        public static void Main(string[] args)
        {
            List<Pessoa> hospedes = new List<Pessoa>();
            Suite suite = null;
            Reserva reserva = null;

            while (true)
            {
                Console.Clear();
                Console.WriteLine("===== MENU =====");
                Console.WriteLine("1. Adicionar Hóspede");
                Console.WriteLine("2. Definir Suíte");
                Console.WriteLine("3. Criar Reserva");
                Console.WriteLine("4. Exibir Detalhes da Reserva");
                Console.WriteLine("5. Sair");
                Console.Write("Escolha uma opção: ");
                
                string opcao = Console.ReadLine();
                Console.Clear();

                switch (opcao)
                {
                    case "1":
                        Console.Write("Digite o primeiro nome do hóspede: ");
                        string nome = Console.ReadLine();
                        Console.Write("Digite o sobrenome do hóspede: ");
                        string sobrenome = Console.ReadLine();
                        hospedes.Add(new Pessoa(nome, sobrenome));
                        Console.WriteLine("Hóspede adicionado com sucesso!");
                        break;
                    
                    case "2":
                        Console.Write("Digite o tipo da suíte: ");
                        string tipoSuite = Console.ReadLine();
                        Console.Write("Digite a capacidade da suíte: ");
                        int capacidade = int.Parse(Console.ReadLine());
                        Console.Write("Digite o valor da diária: ");
                        decimal valorDiaria = decimal.Parse(Console.ReadLine());
                        suite = new Suite(tipoSuite, capacidade, valorDiaria);
                        Console.WriteLine("Suíte definida com sucesso!");
                        break;
                    
                    case "3":
                        if (suite == null || hospedes.Count == 0)
                        {
                            Console.WriteLine("É necessário adicionar hóspedes e definir uma suíte antes de criar a reserva.");
                        }
                        else
                        {
                            Console.Write("Digite a quantidade de dias reservados: ");
                            int diasReservados = int.Parse(Console.ReadLine());
                            try
                            {
                                reserva = new Reserva(hospedes, suite, diasReservados);
                                Console.WriteLine("Reserva criada com sucesso!");
                            }
                            catch (ArgumentException ex)
                            {
                                Console.WriteLine(ex.Message);
                            }
                        }
                        break;
                    
                    case "4":
                        if (reserva == null)
                        {
                            Console.WriteLine("Nenhuma reserva foi criada ainda.");
                        }
                        else
                        {
                            reserva.ExibirDetalheDaReserva();
                        }
                        break;
                    
                    case "5":
                        Console.WriteLine("Saindo... Obrigado por usar o sistema!");
                        return;
                    
                    default:
                        Console.WriteLine("Opção inválida. Tente novamente.");
                        break;
                }
                Console.WriteLine("\nPressione qualquer tecla para continuar...");
                Console.ReadKey();
            }
        }
    }
}
