package att30.Factorys;

import att30.Models.Carros.CarroB;
import att30.Models.Carros.CarroC;
import att30.Models.Carros.CarroFoda;
import att30.contracts.ICarro;
import att30.enums.ECarro;

public class CarroFactory {

    public static ICarro criarCarro(ECarro carroType, String marca){
        switch (carroType) {
            case CARROFODA:
                return new CarroFoda(marca);
            case CARROB:
                return new CarroB(marca);
            case CARROC:
                return new CarroC(marca);
        
            default:
                throw new IllegalArgumentException("tipo inexistente");
        }
    }

}
