using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att73 {
    public static class ExtensionsString {
        public static int ContarPalavras(this string texto){
            var textoPalavras = texto.Split([" "], StringSplitOptions.RemoveEmptyEntries);
            return textoPalavras.Length;
        }
        
    }
}