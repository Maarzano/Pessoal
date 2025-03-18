using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Calculadora.Models {
    public static class Calculator {
        public static int Somar(int num1, int num2) => num1 + num2;
        public static int Subtrair(int num1, int num2) => num1 - num2;
        public static bool EhPar(int num) => num % 2 == 0;
    }
}