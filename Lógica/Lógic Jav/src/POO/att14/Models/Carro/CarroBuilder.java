package att14.Models.Carro;

import att14.Contracts.IMotor;
import att14.Models.ChassiManager;

public class CarroBuilder {
    int id;
    IMotor motor;
    String cor;
    int numeroPortas;
    boolean tetoSolar;
    boolean bancoCouro;

    public CarroBuilder(IMotor motor){
        this.motor = motor;
    }

    public CarroBuilder setCor(String cor){
        this.cor = cor;
        return this;
    }

    public CarroBuilder setNumeroPortas(int portas){
        numeroPortas = portas;
        return this;
    }

    public CarroBuilder setTetoSolar(boolean tem){
        tetoSolar = tem;
        return this;
    }

    public CarroBuilder setBancoDeCouro(boolean tem){
        bancoCouro = tem;
        return this;
    }

    public CarroModel build(){
        id = ChassiManager.getInstance().nextID();
        return new CarroModel(this);
    }
}
