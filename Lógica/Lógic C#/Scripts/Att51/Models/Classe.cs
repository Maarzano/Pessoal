using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att51.Models{
    public class Classe {
        public static int Duplicar(int numero){
            return numero * 2;
        }
        public static int Duplicar(ref int numero){
            return numero *= 2;
        }
        
    }
}