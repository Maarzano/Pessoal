package att30;

import att30.Factorys.ChevroletFactory;
import att30.Factorys.FiatFactory;
import att30.contracts.ICarro;
import att30.contracts.IMoto;
import att30.enums.ECarro;
import att30.enums.EMoto;

public class Main {
    public static void main(String[] args) {
        FiatFactory fiatFactory = new FiatFactory();
        ChevroletFactory chevroletFactory = new ChevroletFactory();

        ICarro carro1 = chevroletFactory.criarCarro(ECarro.CARROB);
        IMoto moto1 = fiatFactory.criarMoto(EMoto.MOTOFODA);

        carro1.dirigir();
        carro1.estacionar();
        carro1.marca();
        System.out.println();
        moto1.pilotar();
        moto1.estacionar();
        moto1.marca();

    }

}
