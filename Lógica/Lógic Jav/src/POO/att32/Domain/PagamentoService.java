package att32.Domain;

public class PagamentoService {
    public void processarPagamento(double valor) {
        System.out.println("💳 Pagamento de R$ " + valor + " processado.");
    }
    public void estornarPagamento(double valor) {
        System.out.println("💵 Reembolso de R$ " + valor + " efetuado.");
        throw new RuntimeException("Erro no processo de pagamento");
    }
}