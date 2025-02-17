using Att11.Models;
public class Program {
    static void Main()
    {
        List<Funcionario> funcionarios = new List<Funcionario>();

        try
        {
            Console.Write("Digite o nome do funcionário: ");
            string nome = Console.ReadLine();

            Console.Write("Digite o salário base: ");
            decimal salarioBase = decimal.Parse(Console.ReadLine());

            Console.WriteLine("Escolha o cargo: (1 - Desenvolvedor, 2 - Gerente, 3 - Estagiário)");
            int opcao = int.Parse(Console.ReadLine());

            Funcionario funcionario;

            switch (opcao)
            {
                case 1:
                    funcionario = new Desenvolvedor(nome, salarioBase);
                    break;
                case 2:
                    funcionario = new Gerente(nome, salarioBase);
                    break;
                case 3:
                    funcionario = new Estagiario(nome, salarioBase);
                    break;
                default:
                    throw new ArgumentException("Opção inválida para o cargo.");
            }

            funcionarios.Add(funcionario);
        }
        catch (FormatException)
        {
            Console.WriteLine("Erro: Entrada inválida! Digite um valor numérico para o salário.");
        }
        catch (ArgumentNullException ex)
        {
            Console.WriteLine($"Erro: {ex.Message}");
        }
        catch (ArgumentException ex)
        {
            Console.WriteLine($"Erro: {ex.Message}");
        }
        catch (Exception ex)
        {
            Console.WriteLine($"Erro inesperado: {ex.Message}");
        }
        finally
        {
            Console.WriteLine("Operação finalizada.");
        }
    }
}
