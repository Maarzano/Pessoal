package att23.Human;

import att23.contracts.IGuerreiro;

public class HumanSoldier implements IGuerreiro {

    @Override
    public void atacar() {
        System.out.println("HUMANO ATACANDO");
    }

}
