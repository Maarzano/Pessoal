using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att53.Models {
    public class Classe {
        public static (int, int) Retirar10(ref int num1, ref int num2){
            num1 -= 10;
            num2 -= 10;
            return (num1, num2);
        }
        
    }
}