package att23.Orc;

import att23.contracts.IGuerreiro;
import att23.contracts.IRacaFactory;
import att23.contracts.ITrabalhador;

public class OrcFactory implements IRacaFactory {

    @Override
    public IGuerreiro criarGuerreiro() {
        return new Orc();
    }

    @Override
    public ITrabalhador criarTrabalhador() {
        return new Goblin();
    }

}
