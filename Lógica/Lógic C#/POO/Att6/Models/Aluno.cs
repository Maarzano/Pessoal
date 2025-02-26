using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http.Headers;
using System.Threading.Tasks;

namespace Att6.Models.Aluno {
    public class Aluno {
        public string Nome { get; }
        public int Idade { get; }
        public double Nota1 { get; set; }
        public double Nota2 { get; set; }
        public Aluno(string nome, int idade){
            Nome = nome;
            Idade = idade;
        }
        public double CalcularMedia(double nota1, double nota2){

            if (nota1 < 0 || nota2 < 0) throw new ArgumentException("nota não pode ser negativa");

            Nota1 = nota1;
            Nota2= nota2;
            return (Nota1 + Nota2) /2;
        }
        public bool VerificarAprovação(){
            return CalcularMedia(Nota1, Nota2) >= 7;
        }
        
    }
}