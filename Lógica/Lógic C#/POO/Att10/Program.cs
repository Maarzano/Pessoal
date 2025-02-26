using System;
using Att10.Models;

namespace Att10{
    public class Program {
        public static void Main(string[] args) {

            Desenvolvedor desenvolvedor1 = new Desenvolvedor("Arthur", 19, 10000);
            Gerente gerente = new Gerente("Patrícia", 20, 20000);
            Vendedor vendedor1 = new Vendedor("João", 23, 0);

            desenvolvedor1.Apresentar();
            gerente.Apresentar();
            vendedor1.Apresentar();






          
        
        }
    }
}