package att30.Models.Motos;

public class MotoB extends Moto{

    public MotoB(String marca) {
        super(marca);
    }

    @Override
    public void pilotar() {
        System.out.println("PILOTANDO MOTO B");
    }

    @Override
    public void estacionar() {
        System.out.println("PARANDO MOTO B");
    }

}
