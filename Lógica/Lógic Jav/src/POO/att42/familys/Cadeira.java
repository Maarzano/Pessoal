package att42.familys;

import att42.contracts.ICadeira;

public abstract class Cadeira implements ICadeira {
    @Override
    public void sentar(){
        System.out.print("Sentando na cadeira");
    }
}
