using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att52.Models {
    public class Calculator {
        public static double Media(params int[] numeros){
            int soma = 0;
            double media = 0;
            foreach (var numero in numeros){
                soma += numero;
                media = soma / numeros.Length;
            }
            return media;
        }
        
    }
}