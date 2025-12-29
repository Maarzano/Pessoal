package att42.familys;

import att42.contracts.IQuadro;

public abstract class Quadro implements IQuadro {
    @Override
    public void pintar(){
        System.out.print("Pintando quadro");
    }
}
