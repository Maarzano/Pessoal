using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att46.Models {
    public static class Classe {

        public static void DuplicaNumero(ref int num){
            num *= 2;
        }

        public static void TrocarValores(ref int num1, ref int num2, out int maior){
            int temp;
            temp = num1;
            num1 = num2;
            num2 = temp;
            maior = (num1 > num2) ? num1 : num2;
        }
        
    }
}