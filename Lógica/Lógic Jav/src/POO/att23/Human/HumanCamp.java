package att23.Human;

import att23.contracts.ITrabalhador;

public class HumanCamp implements ITrabalhador{

    @Override
    public void trabalhar() {
        System.out.println("HUMANO TRABALHANDO");
    }

}
