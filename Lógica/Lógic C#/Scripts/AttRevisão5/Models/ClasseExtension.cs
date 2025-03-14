using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AttRevisão5.Models {
    public static class ClasseExtension {
        public static int ToInt(this string texto, out string mensagem){
            
            if (int.TryParse(texto, out int resultado)){
                mensagem = $"A conversão deu certo: {resultado}";
                return resultado;
            } else {
                mensagem = $"Não foi possível converter a string: {texto}";
                return 0;
            }
        }
    }
}