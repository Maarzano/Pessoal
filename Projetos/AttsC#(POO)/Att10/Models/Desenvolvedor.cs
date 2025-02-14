using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Att10.Models;

namespace Att10.Models
{
    public class Desenvolvedor : Funcionário {
        public Desenvolvedor(string nome, int idade, double salario) : base(nome, idade, salario) {

        }
        public override void Apresentar(){
            Console.WriteLine($"Olá sou o desenvolvedor {Nome} e tenho {Idade} de idade");
        }
    }
}