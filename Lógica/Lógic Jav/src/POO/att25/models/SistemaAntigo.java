package att25.models;

import att25.contracts.ISistemaAntigo;

public class SistemaAntigo implements ISistemaAntigo {

    @Override
    public boolean pagar(double price) {
        return price > 0;
    }

    @Override
    public void processarPagamento() {
        System.out.println("PROCESSANDO PAGAMENTO");
        System.out.println("PAGAMENTO PROCESSADO");
    }

}
