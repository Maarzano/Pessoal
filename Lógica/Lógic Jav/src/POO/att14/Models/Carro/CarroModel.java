package att14.Models.Carro;

import att14.Contracts.IMotor;

public class CarroModel {
    public int id;
    IMotor motor;
    String cor;
    int numeroPortas;
    boolean tetoSolar;
    boolean bancoCouro;

    CarroModel(CarroBuilder builder){
        this.motor = builder.motor;
        this.cor = builder.cor;
        this.numeroPortas = builder.numeroPortas;
        this.tetoSolar = builder.tetoSolar;
        this.bancoCouro = builder.bancoCouro;
        this.id = builder.id;
    }

    @Override
    public String toString(){
        return "CarroModel{" +
               "id=" + id +
               ", motor=" + motor.getMotor() +
               ", cor='" + cor + '\'' +
               ", numeroPortas=" + numeroPortas +
               ", tetoSolar=" + tetoSolar +
               ", bancoCouro=" + bancoCouro +
               '}';
    }

}
