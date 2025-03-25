using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.PortableExecutable;
using System.Threading.Tasks;

namespace ProjetoReal.Models {
    public class Usuario {
        public string Nome { get; set; }
        public CPF Cpf { get; set; }
        public Senha Senha { get; set; }
        public Usuario(string nome,string cpf, string senha){
            Nome = nome;
            Senha = new(senha);
            Cpf = new(cpf);
        }
        public Usuario(string nome, string senha){
            Nome = nome;
            Senha = new(senha);
        }
        
    }
}