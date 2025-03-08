using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att43.Models {
    public class Classe {

        public delegate bool Filtro( int numeros);
        public static List<int> FiltrarNumeros(List<int> numeros, Filtro filtro){
            List<int> resul = [];


            foreach(int num in numeros){
                if (filtro(num)){
                    resul.Add(num);
                }
            }
            return resul;
        }
        
    }
}