using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att59.Models {
    public class Classe {
        public static void Verificador(out string ParImpar,int numero, out int multiplicado){
            ParImpar = numero % 2 == 0 ? "Par" : "Ímpar";
            multiplicado = numero * 2;
        }
    }
}