package att23.Human;

import att23.contracts.IGuerreiro;
import att23.contracts.IRacaFactory;
import att23.contracts.ITrabalhador;

public class HumanFactory implements IRacaFactory{

    @Override
    public IGuerreiro criarGuerreiro() {
        return new HumanSoldier();
    }

    @Override
    public ITrabalhador criarTrabalhador() {
        return new HumanCamp();
    }

}
