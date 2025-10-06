package att6;

public class PagamentoCartao implements IPagamento{
    @Override
    public void processarPagamento(double valor){
        System.out.println("Processando pagamento com cartão no valor de R$"+ valor);
    }
}
