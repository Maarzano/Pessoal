using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att48.Models {
    public class Classe {

        public delegate int Comparacao(string s1, string s2);
        public static void OrdenarLista(List<string> lista, Comparacao criterio) {
        lista.Sort(new Comparison<string>(criterio));
    }
        
    }
}