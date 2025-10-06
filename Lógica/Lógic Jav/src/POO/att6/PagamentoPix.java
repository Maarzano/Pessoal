package att6;

public class PagamentoPix implements IPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento com Pix no valor de R$" + valor);
    }
}
