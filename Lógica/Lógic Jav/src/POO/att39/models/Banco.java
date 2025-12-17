package att39.models;

import att39.Ibanco;

public class Banco implements Ibanco {

    private BancoReal bancoReal;
    private String userType;

    public Banco(String userType){
        this.userType = userType;
        this.bancoReal = new BancoReal();
    }

    @Override
    public void acessar() {
        if (userType.equalsIgnoreCase("ADMIN")){
            bancoReal.acessar();
        } else {
            System.out.println("Não tem permissão de acessar o banco");
        }
    }

}
