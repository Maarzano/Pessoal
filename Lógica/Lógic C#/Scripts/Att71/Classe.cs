using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att71 {
    public class Classe {
        public async Task<string> BuscarDadosAsync(){

            Console.WriteLine("Execução em andamento");
            for (int i = 0; i <= 5;i++){
                await Task.Delay(1000);
                Console.WriteLine($"Carregando: {i}");
            }
            return "valor 120 do banco de dados";
        } 
        
    }
}