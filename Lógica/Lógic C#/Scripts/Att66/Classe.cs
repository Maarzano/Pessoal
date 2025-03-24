using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att66 {
    public static class Classe {
        public static void MultiplicarNumeroPor10(ref int numero){
            numero *= 10;
            Console.WriteLine($"Número após mudança: {numero}!");
        }
        
    }
}