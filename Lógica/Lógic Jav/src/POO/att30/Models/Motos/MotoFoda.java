package att30.Models.Motos;

public class MotoFoda extends Moto {

    public MotoFoda(String marca) {
        super(marca);
    }

    @Override
    public void pilotar() {
        System.out.println("PILOTANDO MOTO FODA");
    }

    @Override
    public void estacionar() {
        System.out.println("PARANDO MOTO FODA");
    }

}
