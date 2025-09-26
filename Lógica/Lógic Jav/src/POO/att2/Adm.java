package att2;

public class Adm extends User{
    public Adm(String nome, float saldo){
        super(nome, saldo);
    }



    @Override
    public void mostrarInfo(){
        System.out.println("[Administrador] " + getName() + " possui " + getGames().size() + " jogos e saldo: " + getSaldo());
    }
}
