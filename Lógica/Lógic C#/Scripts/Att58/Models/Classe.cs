using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att58.Models {
    public class Classe {
        public static void ExibirValores(params Object[] numerosStrings) {
            foreach (var coisas in numerosStrings){
                Console.WriteLine(coisas);
            }
        }
    }
}