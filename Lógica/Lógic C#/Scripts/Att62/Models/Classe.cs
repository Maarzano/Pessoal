using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att62.Models {
    public class Classe {
        public static List<U> ConverterTipos<T, U>(List<T> listaOriginal){
            
            var listaConvertida = new List<U>();

            foreach(var item in listaOriginal){
                U itemIvertido = (U) Convert.ChangeType(item, typeof(U));
                listaConvertida.Add(itemIvertido);
            }
            return listaConvertida;
        }
        
    }
}