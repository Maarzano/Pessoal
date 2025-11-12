package att22.Produtos;

import att22.contracts.IPeru;

public class Peru implements IPeru{

    @Override
    public void cantar() {
        System.out.println("GLU GLU");
    }

    @Override
    public void voarBaixo() {
        System.out.println("PERU VOANDO BAIXO");
    }

}
