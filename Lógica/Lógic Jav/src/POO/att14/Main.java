package att14;

import att14.Fabric.MotorFabric;
import att14.Models.Carro.CarroBuilder;
import att14.Models.Carro.CarroModel;
import att14.enums.EMotores;

public class Main {
    public static void main(String[] args) {

        CarroModel carro = new CarroBuilder(MotorFabric.montarMotor(EMotores.ELETRICO)).setBancoDeCouro(true).build();
        CarroModel carro1 = new CarroBuilder(MotorFabric.montarMotor(EMotores.V6)).build();

        System.out.println(carro);
        System.out.println(carro1);
    }
}