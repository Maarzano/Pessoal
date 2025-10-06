package att6;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 5000.0, 10);
        Produto p2 = new Produto("Mouse", 150.0, 50);

        Cliente cliente = new Cliente("Arthur Marzano", "arthur@dev.com");

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarItem(p1, 1);
        pedido.adicionarItem(p2, 2);

        IPagamento pagamento = new PagamentoPix();
        CheckoutService checkout = new CheckoutService(pagamento);
        checkout.finalizarPedido(pedido);
    }
}
