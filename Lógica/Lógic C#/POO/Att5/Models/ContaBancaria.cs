using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att5.Models.ContaBancaria {
    public class ContaBancaria {
        public int NumeroConta { get; }
        public string Titular { get; }
        public decimal Saldo { get; private set;}
        public ContaBancaria(int numeroConta, string titular, decimal saldoInicial = 0){
            NumeroConta = numeroConta;
            Titular = titular;
            Saldo = saldoInicial;
        }

        public void Depositar(decimal valor){
            if (valor < 0) throw new ArgumentException("valor a depositar não pode ser negativo");

            Saldo += valor;
        }
        public void Sacar(decimal valor){
            if(valor > Saldo) throw new ArgumentException($"Saldo insuficiente para retirada de valor: {valor}");
            Saldo -= valor;
        }
        public decimal ExibirSaldo(){
            return Saldo;
        }
        public void Transferir(decimal valor, ContaBancaria contaDestino){
            Sacar(valor);
            contaDestino.Depositar(valor);
        }


        
    }
}