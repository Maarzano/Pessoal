using Att8.Models;

Estoque estoque = new Estoque();

            while (true)
            {
                Console.Clear();
                Console.WriteLine("Sistema de Cadastro de Produtos");
                Console.WriteLine("1. Adicionar Produto");
                Console.WriteLine("2. Remover Produto");
                Console.WriteLine("3. Listar Produtos");
                Console.WriteLine("4. Sair");
                Console.Write("Escolha uma opção: ");
                string opcao = Console.ReadLine();

                switch (opcao)
                {
                    case "1":
                        Console.WriteLine("\nAdicionar Produto");
                        Console.Write("Nome do Produto: ");
                        string nome = Console.ReadLine();
                        Console.Write("Preço do Produto: ");
                        double preco = Convert.ToDouble(Console.ReadLine());
                        Console.Write("Categoria do Produto: ");
                        string categoria = Console.ReadLine();

                        Produto produto = new Produto(nome, preco, categoria);
                        estoque.AdicionarProduto(produto);
                        break;

                    case "2":
                        Console.WriteLine("\nRemover Produto");
                        Console.Write("id do Produto a ser removido: ");
                        int idProdutoRemover = int.Parse(Console.ReadLine());
                        estoque.RemoverProduto(idProdutoRemover);
                        break;

                    case "3":
                        Console.WriteLine("\nListar Produtos");
                        estoque.ListarProdutos();
                        break;

                    case "4":
                        Console.WriteLine("\nSaindo...");
                        return;

                    default:
                        Console.WriteLine("\nOpção inválida. Tente novamente.");
                        break;
                }

                Console.WriteLine("\nPressione qualquer tecla para continuar...");
                Console.ReadKey();
            }
