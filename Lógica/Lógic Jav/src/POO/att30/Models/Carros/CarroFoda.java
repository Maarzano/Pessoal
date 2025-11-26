package att30.Models.Carros;


public class CarroFoda extends Carro {

    public CarroFoda(String marca) {
        super(marca);
    }

    @Override
    public void dirigir() {
        System.out.println("DIRIGINDO CARRO FODA");
    }

    @Override
    public void estacionar() {
        System.out.println("ESTACIONANDO CARRO FODA");
    }

}
