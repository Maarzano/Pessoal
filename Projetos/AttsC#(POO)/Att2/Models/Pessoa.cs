using System;
using System.Collections.Generic;
using System.Dynamic;
using System.Linq;
using System.Threading.Tasks;

namespace ClassePessoa.Models{
    public class Pessoa {
        public Pessoa(string nome){
            Nome = nome;
        }
        public Pessoa(){

        }

        private int _idade;
        private string _nome;
        public int Idade{

            get => _idade;
            set {
                if (value < 0){
                    throw new ArgumentException("Idade não pode ser negativa");
                }
                _idade = value;
            }

        }
        public string Nome{

            get => _nome.ToUpper();
            set{
                if (value.Equals("")){
                    throw new ArgumentException("Nome Não pode ser vazio");
                }
                _nome = value;
            }
        }

        public void Apresentar(){
            Console.WriteLine($"Olá, meu nome é {NomeCompleto} e tenho {_idade} anos");
        }
        private string _sobrenome;
        public string Sobrenome { 
            get => _sobrenome;
            set {
                if (value.Equals("")){
                    throw new ArgumentException("Sobrenome não pode ser vazio");
                }
                _sobrenome = value;
            }
        }

        public string NomeCompleto { 
            get => _nome + " " + _sobrenome;
        }
    }
}