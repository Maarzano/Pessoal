package att14.Fabric;

import att14.Contracts.IMotor;
import att14.Models.Carro.CarroBuilder;
import att14.Models.Carro.CarroModel;
import att14.enums.EMotores;

public class LinhaFamiliaFactory extends LinhaDeProducaoFactory {

    @Override
    protected CarroModel montarCarro() {
        System.out.println("Montando: Carro Família");
        
        IMotor motor = MotorFabric.montarMotor(EMotores.TURBO);

        CarroModel carro = new CarroBuilder(motor)
                .setCor("Prata")
                .setNumeroPortas(4)
                .setTetoSolar(false)
                .setBancoDeCouro(true)
                .build();
        return carro;
    }
}
