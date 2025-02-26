using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att10.Models
{
    public class Gerente : Funcionário
    {
        public Gerente(string nome, int idade, double salario) : base(nome, idade, salario){ }
        public override void Apresentar()
        {
            Console.WriteLine($"Olá, sou o gerente {Nome} e tenho {Idade} de idade");
        }
    }
}