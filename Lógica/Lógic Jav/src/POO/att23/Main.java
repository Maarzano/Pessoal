package att23;

import att23.Human.HumanFactory;
import att23.Orc.OrcFactory;
import att23.contracts.IGuerreiro;
import att23.contracts.IRacaFactory;
import att23.contracts.ITrabalhador;

public class Main {
    public static void main(String[] args) {
        IRacaFactory orcFactory = new OrcFactory();
        IRacaFactory humanFactory = new HumanFactory();

        ITrabalhador trabalhadorHU = humanFactory.criarTrabalhador();
        ITrabalhador trabalhadorOR = orcFactory.criarTrabalhador();

        trabalhadorHU.trabalhar();
        trabalhadorOR.trabalhar();

        IGuerreiro GH = humanFactory.criarGuerreiro();
        IGuerreiro GO = orcFactory.criarGuerreiro();

        GH.atacar();
        GO.atacar();

        
    }

    

}
