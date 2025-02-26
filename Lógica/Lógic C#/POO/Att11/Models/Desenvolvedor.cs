using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Att11.Models;

namespace Att11.Models {
    public class Desenvolvedor : Funcionario {
        public Desenvolvedor(string nome, decimal salario) : base(nome, salario) { }
       
        public override decimal CalcularSalarioLiquido(){
            return Salario * 1.10m;
        }
    }
}