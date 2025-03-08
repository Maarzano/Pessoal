using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att42.Models {
    public class Fatorial {
        


        public static async Task<int> FatorialAsync(int numero){
            if (numero < 0) throw new ArgumentException("não pode ser menor que 0");
            
            if (numero == 0 || numero == 1) return 1;
        
            return numero * await FatorialAsync(numero -1);
        }
    }
}