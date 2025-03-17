using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AttRevisão10.Models {
    public class Classe {
        public delegate void ValorAlteradoHandler(object sender, double valorAntigo, double valorNovo);
        public event ValorAlteradoHandler? ValorAlterado;
        private double _valor;
        public double Valor {
            get => _valor;
            set {
                if (_valor != value) {
                    double valorAntigo = _valor;
                    _valor = value;

                    ValorAlterado?.Invoke(this, valorAntigo, _valor);
                }
            }
        }  
    }
}