using System;
using System.Collections.Generic;
using System.Dynamic;
using System.Linq;
using System.Threading.Tasks;

namespace ClassePessoa.Models{
    public class Pessoa {
        private int idade;
        public int Idade{ 

            get => idade;
            set {
                if (!int.IsNegative(value))
                    idade = value;
            }

        }
        private string nome;
        public string Nome{

            get {return nome;}

            set{
                if (value.Equals("")){
                    throw new ArgumentException("Não pode ser vazio");
                }
                nome = value;
            }
        }
        public string Sobrenome { get; set; }
        public string NomeCompleto { get;}
    }
}