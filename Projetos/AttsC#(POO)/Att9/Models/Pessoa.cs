using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att9.Models{
    public class Pessoa{
        public string Nome { get;}
        public string Sobrenome { get;}
        public string NomeCompleto => $"{Nome} {Sobrenome}";

        public Pessoa(string nome, string sobrenome){
            Nome = nome;
            Sobrenome = sobrenome;
        }
    }
}