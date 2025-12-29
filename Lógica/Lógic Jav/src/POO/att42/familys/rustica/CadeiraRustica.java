package att42.familys.rustica;

import att42.familys.Cadeira;

public class CadeiraRustica extends Cadeira{

    @Override
    public void sentar() {
        super.sentar();
        System.out.println(" Rustica");
    }

}
