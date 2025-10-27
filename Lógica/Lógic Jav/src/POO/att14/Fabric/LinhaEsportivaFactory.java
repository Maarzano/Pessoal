package att14.Fabric;

import att14.Contracts.IMotor;
import att14.Models.Carro.CarroBuilder;
import att14.Models.Carro.CarroModel;
import att14.enums.EMotores;

public class LinhaEsportivaFactory extends LinhaDeProducaoFactory {

    @Override
    protected CarroModel montarCarro() {
        System.out.println("Montando: Carro Esportivo");
        
        IMotor motor = MotorFabric.montarMotor(EMotores.V6);

        CarroModel carro = new CarroBuilder(motor)
                .setCor("Vermelho")
                .setNumeroPortas(2)
                .setTetoSolar(true)
                .setBancoDeCouro(false)
                .build();

        return carro;
    }
}
