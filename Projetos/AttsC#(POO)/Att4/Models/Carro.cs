using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att4.Models.Carro {
    public class Carro {

        public Carro(string marca, string modelo, int ano, int velocidadeAtual = 0){
            Marca = marca;
            Modelo = modelo;
            Ano = ano;
            VelocidadeAtual = velocidadeAtual;
        }
        public string Marca {get; set;}
        public string Modelo {get; set;}
        public int Ano {get; set;}
        public int VelocidadeAtual {get; private set;}

        public void Acelerar(int velocidadeIncremental){

            if(velocidadeIncremental < 0){
                throw new ArgumentException("Velocidade incremental não pode ser negativa");
            }

            VelocidadeAtual += velocidadeIncremental;
        }
        public void Frear(int velocidadeDesincremental){
            if (velocidadeDesincremental < 0){
                throw new ArgumentException("A velocidade de frenagem não pode ser negativa");
            }
            
            VelocidadeAtual = Math.Max(0, VelocidadeAtual - velocidadeDesincremental);
        }
        public string ExibirInfo(){
            string info = $"Marca: {Marca}, Modelo: {Modelo}, Ano: {Ano}, VelocidadeAtual: {VelocidadeAtual} Km/h";
            Console.WriteLine(info);
            return info;
        }









        
    }
}