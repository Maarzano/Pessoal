using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Threading.Tasks;

namespace Att47.Models {
    public class Classe {
        public static async Task<List<int>> ProcessarListaAsync(List<int> lista){
            return await Task.Run(() => {
                return lista.AsParallel().Select(n => n*n).ToList();
            });
        }
    }
}