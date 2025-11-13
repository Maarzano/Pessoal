package att23.Orc;

import att23.contracts.IGuerreiro;

public class Orc implements IGuerreiro{

    @Override
    public void atacar() {
        System.out.println("ORC ATACANDO");
    }

}
