using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att10.Models
{
    public class Vendedor : Funcionário
    {
        public Vendedor(string nome, int idade, double salario) : base(nome, idade, salario) {
            
        }
        public override void Apresentar()
        {
            Console.WriteLine($"Olá, sou o vendedor {Nome} tenho {Idade} de idade");
        }
    }
}