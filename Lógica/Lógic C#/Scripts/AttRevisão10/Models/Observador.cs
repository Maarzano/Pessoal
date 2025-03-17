using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AttRevisão10.Models {
    public class Observador {
        public void Monitorar(Classe notificador) {
            notificador.ValorAlterado += QuandoValorMudar;
        }
        private void QuandoValorMudar(object sender, double valorAntigo, double valorNovo) {
        Console.WriteLine($"O valor foi alterado de {valorAntigo} para {valorNovo}");
        }
    }
}