package att25.models;

import att25.contracts.ISistemaNovo;

public class SistemaNovo implements ISistemaNovo {

    private Gateway gateway;

    @Override
    public void iniciarGateway() {
        System.out.println("Gateway iniciado");
        this.gateway = new Gateway();
    }

    @Override
    public boolean gatewayPagar(double price) {
        return this.gateway.pagar(price);
    }

}
