using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att63.Models {
    public class Classe {
        public static async Task<string> ProcurarValor(int chave, Dictionary<int, string> mapa){
            await Task.Delay(2000);
            if (mapa.TryGetValue(chave, out string? valor)){
                return valor;
            } return null;
        }
        
    }
}