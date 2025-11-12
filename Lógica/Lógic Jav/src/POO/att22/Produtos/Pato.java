package att22.Produtos;

import att22.contracts.IPato;

public class Pato implements IPato{

    @Override
    public void Grasnar() {
        System.out.println("QUAK QUAK");
    }

    @Override
    public void voar() {
        System.out.println("PATO VOANDO");
    }

}
