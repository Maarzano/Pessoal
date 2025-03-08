using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.AccessControl;
using System.Threading.Tasks;

namespace Att44.Models {
    public static class Classe {
        public static int ContarPalavras(this string texto){
            var TextoComoVet = texto.Split(" ");
            return TextoComoVet.Count();
        
        }
    }
}