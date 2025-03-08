using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att41.Models {
    public class Calculator {
        public static int SomaMultiplicada(int multiplicador = 1, params int[] numeros){
            int soma = 0;
            foreach (int valor in numeros) {
                soma += valor;
            }
            return soma * multiplicador;

        }
        
    }
}