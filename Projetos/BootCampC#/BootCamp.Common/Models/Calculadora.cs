using System;

namespace BootCamp.Common.Models
{
    public class Calculadora
    {
        public static void Somar(int x, int y)
        {
            Console.WriteLine($"Soma: {x + y}");
        }

        public static void Subtrair(int x, int y)
        {
            Console.WriteLine($"Subtração: {x - y}");
        }

        public static void Multiplicar(int x, int y)
        {
            Console.WriteLine($"Multiplicação: {x * y}");
        }

        public static void Dividir(int x, int y)
        {
            if (y != 0)
            {
                Console.WriteLine($"Divisão: {x / y}");
            }
            else
            {
                Console.WriteLine("Erro: Divisão por zero não é permitida.");
            }
        }

        public static void Potencia(int x, int y)
        {
            Console.WriteLine($"Potência: {Math.Pow(x, y)}");
        }

        public static void RaizQuadrada(int x)
        {
            if (x >= 0)
            {
                Console.WriteLine($"Raiz Quadrada: {Math.Sqrt(x)}");
            }
            else
            {
                Console.WriteLine("Erro: Não é possível calcular a raiz quadrada de um número negativo.");
            }
        }
    }
}