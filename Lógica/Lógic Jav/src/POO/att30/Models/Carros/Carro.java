package att30.Models.Carros;

import att30.contracts.ICarro;

public abstract class Carro implements ICarro {
    private String marca;
    public Carro(String marca){
        this.marca = marca;
    }
    @Override
    public void dirigir() {
        System.out.println("DIRIGINDO CARRO ");
    }

    @Override
    public void estacionar() {
        System.out.println("ESTACIONANDO CARRO ");
    }

    @Override
    public void marca() {
        System.out.println("CARRO DA MARCA " + marca);
    }
}
