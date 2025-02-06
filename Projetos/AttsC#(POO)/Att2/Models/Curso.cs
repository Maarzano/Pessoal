using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using ClassePessoa.Models;

namespace ClasseCurso.Models {
    public class Curso {
        public Curso(string nomeDoCurso){
            Nome = nomeDoCurso;
        }
        public Curso(){
            
        }


        public string Nome { get; set; }
        public List<Pessoa> Alunos { get; set; }
        
        public void AdicionarAluno(Pessoa aluno){
            Alunos.Add(aluno);
        }

        public int ObterQuantidadeDeAlunosMatriculados(){
            return Alunos.Count;
        }

        public void RemoverAluno(Pessoa aluno){
            Alunos.Remove(aluno);
        }

        public void ListarAlunos(){
            Console.WriteLine($"Alunos do curso de {Nome}: ");
            foreach (Pessoa recebendo in Alunos){
                Console.WriteLine(recebendo.NomeCompleto);
            }
        }


        
    }
}