package att25.models;

import att25.contracts.ISistemaAntigo;
import att25.contracts.ISistemaNovo;

public class SistemaMiddle implements ISistemaNovo {

    private ISistemaAntigo sistemaAntigo;

    public SistemaMiddle(ISistemaAntigo sistemaAntigo){
        this.sistemaAntigo = sistemaAntigo;
    }

    @Override
    public void iniciarGateway() {}

    @Override
    public boolean gatewayPagar(double price) {
        System.out.println("GATEWAY pagando " + price);
        return sistemaAntigo.pagar(price);
    }

}
