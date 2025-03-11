using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att56.Models {
    public static class ListaExtensions {
        public static int MaiorNumero(this List<int> lista, out int maiorNumero){
            maiorNumero = 0;
            foreach (var numero in lista){
                if (maiorNumero < numero) maiorNumero = numero; 
            }
            return maiorNumero;
        }
        public static int MaiorNumero(this List<int> lista){
            int maiorNumero = 0;
            foreach (var numero in lista){
                if (maiorNumero < numero) maiorNumero = numero; 
            }
            return maiorNumero;
        }
    }
}