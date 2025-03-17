using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AttRevisão8.Models {
    public class Classe {
        public static T? Generico<T>(T? valor1, T? valor2) where T : IComparable<T> {
            if (valor1 == null && valor2 == null) return default;
            if (valor1 == null) return valor2;
            if (valor2 == null) return valor1;

            return valor1.CompareTo(valor2) > 0 ? valor1 : valor2;
        }
        
    }
}