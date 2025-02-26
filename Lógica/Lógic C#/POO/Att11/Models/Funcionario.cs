using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att11.Models{
    public abstract class Funcionario{
        protected string Nome { get; }
        protected decimal Salario { get; }
        public Funcionario(string nome, decimal salario){
            if(string.IsNullOrWhiteSpace(nome)){
                throw new ArgumentNullException(nameof(nome), "O nome não pode ser vazio");
            }
            Nome = nome;
            if(salario <= 0){
                throw new ArgumentException("salário não pode ser menor ou igual a 0");
            }
            Salario = salario;
        }

        public abstract decimal CalcularSalarioLiquido();
        public virtual void ExibirInformações(){
            Console.WriteLine($"nome do funcionário: {Nome} o salário liquído dele é: {CalcularSalarioLiquido}");
        }
        
    }
}