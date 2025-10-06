package att6;

public class CheckoutService {
    private final IPagamento pagamento;

    public CheckoutService(IPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void finalizarPedido(Pedido pedido) {
        double total = pedido.calcularTotal();
        pedido.finalizar();
        pagamento.processarPagamento(total);
        System.out.println("Pedido finalizado para o cliente: " + pedido.getCliente().getNome());
    }
}
