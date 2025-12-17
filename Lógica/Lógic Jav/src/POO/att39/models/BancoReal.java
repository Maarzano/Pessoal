package att39.models;

import att39.Ibanco;

class BancoReal implements Ibanco{

    @Override
    public void acessar() {
        System.out.println("ACESSANDO BANCO DE DADOS");
    }

}
