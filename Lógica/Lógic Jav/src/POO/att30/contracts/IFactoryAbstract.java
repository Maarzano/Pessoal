package att30.contracts;

import att30.enums.ECarro;
import att30.enums.EMoto;

public interface IFactoryAbstract {
    IMoto criarMoto(EMoto motoType);
    ICarro criarCarro(ECarro carroType);

}
