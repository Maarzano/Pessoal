using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att72.Models {
    public class PedidoService {
        public delegate void PedidoProcessadoEventHandler (object sender, EventArgs e);

        public event PedidoProcessadoEventHandler? PedidoProcessado;

        public async Task ProcessarPedido(){
            await Task.Delay(500);
            OnPedidoProcessado(EventArgs.Empty);
        }
        public void OnPedidoProcessado(EventArgs e){
            PedidoProcessado?.Invoke(this, e);
        }

        
    }
}