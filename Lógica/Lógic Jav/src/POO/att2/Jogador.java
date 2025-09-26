package att2;

public class Jogador extends User{

    private static final int LIMITE_JOGOS = 10;

    public Jogador(String nome, float saldo){
        super(nome, saldo);
    }

    @Override
    public boolean addGame(Game jogo){
        if (this.getGames().size() < LIMITE_JOGOS){
            super.addGame(jogo);
            return true;
        }
        return false;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("[Jogador] " + getName() + " possui " + getGames().size() + " jogos e saldo: " + getSaldo());
    }
}
