package att30.Factorys;

import att30.contracts.ICarro;
import att30.contracts.IFactoryAbstract;
import att30.contracts.IMoto;
import att30.enums.ECarro;
import att30.enums.EMoto;

public class FiatFactory implements IFactoryAbstract {
    private final String marca = "FIAT";

    @Override
    public IMoto criarMoto(EMoto motoType) {
        IMoto moto = MotoFactory.criarMoto(motoType, marca);
        return moto;
    }

    @Override
    public ICarro criarCarro(ECarro carroType) {
        ICarro carro = CarroFactory.criarCarro(carroType, marca);
        return carro;
    }

}
