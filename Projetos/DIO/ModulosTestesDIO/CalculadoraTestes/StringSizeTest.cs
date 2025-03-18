using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Calculadora.Models;

namespace CalculadoraTestes {
    public class StringSizeTest {
        [Fact]
        public void OlaTemQueTerTamanho3(){
            
            string texto = "Olá";

            var resultado = StringSize.ContarCaracteres(texto);
            Assert.Equal(3, resultado);
        }
        
    }
}