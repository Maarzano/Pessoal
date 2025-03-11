using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att55.Models {
    public static class StringExtension {
        public static int ContarPalavras(this string texto){
            return texto.Split(" ").Length;
        }
        
    }
}