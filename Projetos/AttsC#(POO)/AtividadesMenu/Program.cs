namespace AtividadesMenu
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.Clear();
                Console.WriteLine("Menu de Atividades");
                Console.WriteLine("1. Atividade 1");
                Console.WriteLine("2. Atividade 2");
                Console.WriteLine("3. Atividade 3");
                Console.WriteLine("4. Atividade 4");
                Console.WriteLine("5. Atividade 5");
                Console.WriteLine("6. Atividade 6");
                Console.WriteLine("7. Atividade 7");
                Console.WriteLine("8. Atividade 8");
                Console.WriteLine("9. Atividade 9");
                Console.WriteLine("10.Atividade 10");
                Console.WriteLine("0. Sair");
                Console.Write("Escolha uma opção: ");
                string opcao = Console.ReadLine();

                switch (opcao)
                {
                    case "1":
                        Att1.Program.Main(args);
                        break;
                    case "2":
                        Att2.Program.Main(args);
                        break;
                    case "3":
                        Att3.Program.Main(args);
                        break;
                    case "4":
                        Att4.Program.Main(args);
                        break;
                    case "5":
                        Att5.Program.Main(args);
                        break;
                    case "6":
                        Att6.Program.Main(args);
                        break;
                    case "7":
                        Att7.Program.Main(args);
                        break;
                    case "8":
                        Att8.Program.Main(args);
                        break;
                    case "9":
                        Att9.Program.Main(args);
                        break;
                    case "10":
                        Att10.Program.Main(args);
                        break;
                    case "0":
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
