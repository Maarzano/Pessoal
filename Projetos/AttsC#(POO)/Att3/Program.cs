using Att3.Models;

namespace Att3
{
    public class Program
    {
        public static void Main(string[] args)
        {

GerenciadorDeTarefas gerenciador = new();

Console.WriteLine("Digite a descrição de uma tarefa");
string descricaoTarefa = Console.ReadLine();

gerenciador.AdicionarTarefa(descricaoTarefa);
gerenciador.AdicionarTarefa("dar o butico");
gerenciador.AdicionarTarefa("dar o cu");
gerenciador.AdicionarTarefa("dar o rabo");

Console.WriteLine("Tarefas todas");
gerenciador.ListarTarefas(true);

gerenciador.ConcluirTarefa(1);

gerenciador.RemoverTarefa(2);

Console.WriteLine("Tarefas todas");

gerenciador.ListarTarefas(true);

gerenciador.AdicionarTarefa("Dar um olá");

Console.WriteLine("Tarefas todas");

gerenciador.ListarTarefas(true);
        }
    }
}