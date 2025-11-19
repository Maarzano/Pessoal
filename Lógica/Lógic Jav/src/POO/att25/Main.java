package att25;

import att25.contracts.ISistemaAntigo;
import att25.contracts.ISistemaNovo;
import att25.models.SistemaAntigo;
import att25.models.SistemaMiddle;
import att25.models.SistemaNovo;

public class Main {
    public static void main(String[] args) {
        ISistemaAntigo sA = new SistemaAntigo();
        ISistemaNovo sN = new SistemaNovo();
        sA.pagar(10);
        sA.processarPagamento();

        System.out.println("----------");
        sN.iniciarGateway();
        sN.gatewayPagar(10);

        System.out.println("-----------");

        ISistemaNovo sNM = new SistemaMiddle(sA);

        sNM.iniciarGateway();
        sNM.gatewayPagar(10);
    }
}
