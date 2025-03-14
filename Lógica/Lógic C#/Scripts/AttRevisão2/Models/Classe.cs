using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AttRevisão2.Models {
    public class Classe {
        public static async Task HomeWork(){

            for (int i = 3;i >=0; i--){
                Console.WriteLine($"Doing HomeWork {i}");
                await Task.Delay(1000);
            }
            
        }
        
    }
}