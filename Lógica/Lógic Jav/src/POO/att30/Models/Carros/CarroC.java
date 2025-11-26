package att30.Models.Carros;

public class CarroC extends Carro{

    public CarroC(String marca) {
        super(marca);
    }

    @Override
    public void dirigir() {
       System.out.println("DIRIGINDO CARRO C");
    }

    @Override
    public void estacionar() {
        System.out.println("ESTACIONANDO CARRO C");
    }

}
