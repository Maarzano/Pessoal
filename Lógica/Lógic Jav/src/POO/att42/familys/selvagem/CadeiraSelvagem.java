package att42.familys.selvagem;

import att42.familys.Cadeira;

public class CadeiraSelvagem extends Cadeira{

    @Override
    public void sentar() {
        super.sentar();
        System.out.println(" Selvagem");
    }

}
