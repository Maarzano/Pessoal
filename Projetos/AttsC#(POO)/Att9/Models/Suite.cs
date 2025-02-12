using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att9.Models{
    public class Suite{
        public string TipoSuite { get;}
        public int Capacidade { get;}
        public decimal ValorDiaria { get;}

        public Suite(string tipoSuite, int capacidade, decimal valorDiaria){
            TipoSuite = tipoSuite;
            Capacidade = capacidade;
            ValorDiaria = valorDiaria;
        }


        
    }
}