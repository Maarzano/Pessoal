package att30.Models.Carros;

public class CarroB extends Carro{

    public CarroB(String marca) {
        super(marca);
    }

    @Override
    public void dirigir() {
        System.out.println("DIRIGINDO CARRO B");
    }

    @Override
    public void estacionar() {
        System.out.println("ESTACIONANDO CARRO B");
    }

}
