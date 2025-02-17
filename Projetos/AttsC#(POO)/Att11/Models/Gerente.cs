using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att11.Models
{
    public class Gerente : Funcionario
    {
        public Gerente (string nome, decimal salario) : base(nome, salario) { }

        public override decimal CalcularSalarioLiquido() {
            return Salario * 1.20m;
        }


    }
}