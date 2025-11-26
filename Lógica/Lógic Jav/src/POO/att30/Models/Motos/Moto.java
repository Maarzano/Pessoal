package att30.Models.Motos;

import att30.contracts.IMoto;

public abstract class Moto implements IMoto {
    private String marca;
    
    public Moto(String marca){
        this.marca = marca;
    }
    @Override
    public void pilotar() {
        System.out.println("PILOTANDO MOTO ");
    }
    @Override
    public void estacionar() {
        System.out.println("PARANDO MOTO ");
    }
    @Override
    public void marca() {
        System.out.println("MOTO DA MARCA " + marca);
    }

}
