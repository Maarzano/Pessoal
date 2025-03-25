using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ProjetoReal.Models
{
    public class CPF {
        public string Cpf { get; set; }
        public CPF(string cpf){
            Cpf = cpf;

            if (!IsCpfValid()) {
                throw new ArgumentException("Cpf inválido");
            }

        }
        public bool IsCpfValid(){
            if (Cpf.Length < 11 || Cpf.Length > 11) return false;
            if (!Cpf.All(char.IsDigit)) return false;
            return true;
        }
        
    }
}