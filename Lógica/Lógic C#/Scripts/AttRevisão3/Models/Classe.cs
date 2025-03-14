using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AttRevisão3.Models {
    public class Classe {
        public static void AlterarValor(ref int numero,ref int numero2, out int soma){
            numero *= 2;
            numero2 *= 2;
            soma = numero + numero2;
        }
        
    }
}