using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att68 {
    public static class Classe {
        public static string PrimeiraLetraMaiuscula(this string texto){
            return char.ToUpper(texto[0]) + texto.Substring(1).ToLower();
        }
        
    }
}