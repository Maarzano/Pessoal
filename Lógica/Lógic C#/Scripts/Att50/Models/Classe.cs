using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att50.Models {
    public static class Classe {
        public static int CaracteresUnicos(this string texto){

            if (string.IsNullOrEmpty(texto))
            return 0;
            HashSet<char> resultado = texto.ToHashSet();
            return resultado.ToList<char>().Count;
        }

    }
}