package att30.Factorys;

import att30.Models.Motos.MotoB;
import att30.Models.Motos.MotoFoda;
import att30.contracts.IMoto;
import att30.enums.EMoto;

public class MotoFactory {
    public static IMoto criarMoto(EMoto motoType, String marca){
        switch (motoType) {
            case MOTOFODA:
                return new MotoFoda(marca);
            case MOTOB:
                return new MotoB(marca);
        
            default:
                throw new IllegalArgumentException("Não é um aopção válida");
        }
    }

}
