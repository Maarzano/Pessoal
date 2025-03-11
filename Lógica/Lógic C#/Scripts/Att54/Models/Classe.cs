using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att54.Models {
    public class Classe {
        public static double Out(int x, int y, out double resultado){
            return resultado = x / y;
        }
        
    }
}