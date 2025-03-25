using Att72.Models;

PedidoService pedidoService = new PedidoService();

pedidoService.PedidoProcessado += PedidoService_PedidoProcessado;

await pedidoService.ProcessarPedido();

static void PedidoService_PedidoProcessado(object sender, EventArgs e) {
    Console.WriteLine("Pedido processado com sucesso!");
}