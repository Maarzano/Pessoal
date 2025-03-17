using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AttRevisão6.Models {
    public class Pessoa {
        public string? Nome { get; private set; }
        public string? Sobrenome { get; private set; }
        public int Idade { get; private set; }


        public Pessoa SetNome(string nome){
            Nome = nome;
            return this;
        }
        public Pessoa SetSobrenome(string sobrenome){
            Sobrenome = sobrenome;
            return this;
        }
        public Pessoa SetIdade(int idade){
            Idade = idade;
            return this;
        }
        public Pessoa Apresentar(){
            Console.WriteLine($"Nome {Nome}, Sobrenome {Sobrenome}, Idade {Idade}");
            return this;
        }
        
        
    }
}