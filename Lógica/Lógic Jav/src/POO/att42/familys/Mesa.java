package att42.familys;

import att42.contracts.IMesa;

public abstract class Mesa implements IMesa{
    @Override
    public void colocar(){
        System.out.print("Colocando a mesa");
    }
}
