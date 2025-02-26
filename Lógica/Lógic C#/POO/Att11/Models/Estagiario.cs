using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using System.Threading.Tasks;

namespace Att11.Models{
    public class Estagiario : Funcionario {
        public Estagiario(string nome, decimal salario) : base(nome, salario) { }

        public override decimal CalcularSalarioLiquido(){
            return Salario;
        }

    }
}