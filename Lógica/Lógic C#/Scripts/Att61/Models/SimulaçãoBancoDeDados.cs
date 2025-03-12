using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att61.Models {
    public class SimulaçãoBancoDeDados {
        public static async Task<Object> GetObject(){
            await Task.Delay(10000);
            return "Feito";
        }
        
    }
}