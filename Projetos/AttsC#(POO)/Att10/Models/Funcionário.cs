using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att10.Models
{
    public class Funcionário
    {
        public String Nome { get; protected set; }
        public int Idade { get; protected set; }
        public double salarioLiquido { get; set; }

        public Funcionário(String nome, int idade, double salario){
            Nome = nome;
            Idade = idade;
            salarioLiquido = salario;
        }

        public double CalcularSalario(double salarioBruto){
            return salarioBruto - (salarioBruto * 0.10);
        }
        public virtual void Apresentar(){
            Console.WriteLine($"Olá, meu nome é {Nome} e tenho {Idade} de idade");
        }
    }
}