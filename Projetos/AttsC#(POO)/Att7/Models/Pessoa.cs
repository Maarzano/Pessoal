using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att7.Models {
    public class Pessoa {
        public double Peso { get;}
        public double Altura {get;}
        public Pessoa(double peso, double altura){
            Peso = peso;
            Altura = altura;
        }

        public double CalculoIMC(){
            return Peso / (Altura * Altura);
        }
        public string MensagemDependendoDoIMC(){
            string mensagem = string.Empty;
            if(CalculoIMC() < 18.5){
                mensagem = "Abaixo do peso";
            } else if (CalculoIMC() < 25) {
                mensagem = "Acima do peso";
            } else if (CalculoIMC() < 30){
                mensagem = "Obesidade 1";
            } else if (CalculoIMC() < 40){
                mensagem = "Obesidade 2";
            } else if (CalculoIMC() >= 40){
                mensagem = "Obesidade 3";
            }
            return mensagem;
        }
        public void Situacao(){
            Console.WriteLine($"Seu IMC é {CalculoIMC():F2} e voce está {MensagemDependendoDoIMC()}");

        }
    }
}