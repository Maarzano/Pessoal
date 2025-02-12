using System;
using Att2.Models;

namespace Att2
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Curso curso = new("Desenvolvimento de Software");

            while (true)
            {
                Console.Clear();
                Console.WriteLine("Sistema de Gerenciamento de Pessoas e Cursos");
                Console.WriteLine("1. Adicionar Pessoa");
                Console.WriteLine("2. Listar Pessoas");
                Console.WriteLine("3. Criar Curso");
                Console.WriteLine("4. Listar Alunos do Curso");
                Console.WriteLine("5. Sair");
                Console.Write("Escolha uma opção: ");

                switch (Console.ReadLine())
                {
                    case "1":
                        Console.Write("Nome: ");
                        string nome = Console.ReadLine();
                        Console.Write("Sobrenome: ");
                        string sobrenome = Console.ReadLine();
                        Console.Write("Idade: ");
                        int idade = int.Parse(Console.ReadLine());
                        Pessoa pessoa = new(nome) { Sobrenome = sobrenome, Idade = idade };
                        curso.AdicionarAluno(pessoa);
                        break;
                    case "2":
                        Console.WriteLine("\nLista de Pessoas:");
                        foreach (Pessoa aluno in curso.Alunos)
                        {
                            Console.WriteLine(aluno.NomeCompleto);
                        }
                        break;
                    case "3":
                        Console.Write("Nome do Curso: ");
                        string nomeCurso = Console.ReadLine();
                        curso = new Curso(nomeCurso);
                        Console.WriteLine($"Curso '{curso.Nome}' criado com sucesso!");
                        break;
                    case "4":
                        curso.ListarAlunos();
                        break;
                    case "5":
                        Console.WriteLine("Saindo...");
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