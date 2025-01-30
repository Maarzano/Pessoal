using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Lógic_C_.Models {
    public class Calculadora {
        
        public void Somar(int x, int y){
            Console.WriteLine($"{x} + {y} = {x + y}");
        }
        public void Subtrair(int x, int y){
            Console.WriteLine($"{x} - {y} = {x - y}");
        }
        public void Multiplicar(int x, int y){
            Console.WriteLine($"{x} * {y} = {x * y}");
        }
        public void Dividir(int x, int y){
            Console.WriteLine($"{x} / {y} = {x / y}");
        }
        public void Potencia(int x, int y){
            Console.WriteLine($"{x}^{y} = {Math.Pow(x, y)}");
        }
        public void Raiz(double x){
            Console.WriteLine($"Raiz de {x} = {Math.Sqrt(x)}");
        }
        public void Seno(double angulo){
            double radiano = angulo * Math.PI / 180;
            double seno = Math.Sin(radiano);
            Console.WriteLine($"O seno de {angulo} é {Math.Round(seno, 2)}");
        }
        public void Tangente(double angulo){
            double radiano = angulo * Math.PI / 180;
            double tangente = Math.Tan(radiano);
            Console.WriteLine($"O tangente de {angulo} é {Math.Round(tangente, 2)}");
        }
        public void Coseno(double angulo){
            double radiano = angulo * Math.PI / 180;
            double coseno = Math.Cos(radiano);
            Console.WriteLine($"O seno de {angulo} é {Math.Round(coseno, 2)}");
        }
    }
}