using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att65.Models {
    public static class Classe {
        public async static Task<string> BuscarDadosAsync(){
            await Task.Delay(2000);
            return "Dados recebidos";
        }
        
    }
}