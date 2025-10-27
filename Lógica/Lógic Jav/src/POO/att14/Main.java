package att14;

import att14.Fabric.LinhaDeProducaoFactory;
import att14.Fabric.LinhaEsportivaFactory;
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

        LinhaDeProducaoFactory linhaDeHoje;

        linhaDeHoje = new LinhaEsportivaFactory();

        carro = linhaDeHoje.produzirCarro();

        System.out.println(carro);
    }
}