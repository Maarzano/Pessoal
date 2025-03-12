using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att64.Models {
    public class Classe {
        public static List<T> RecebeLista<T>(List<T> lista, Func<T, bool> criterio){
            return lista.Where(criterio).ToList();
        }
        
    }
}