package att2;

import java.util.ArrayList;

abstract class User {
    private String name;
    private float saldo;
    private ArrayList<Game> games;

    public User(String name, float saldo){
        this.name = name;
        this.saldo = saldo;
        this.games = new ArrayList<>();
    }

    public boolean addGame(Game game){
        if (game.isDisponible() && game.isDisponible()){
            games.add(game);
            game.buy();
            saldo -= game.getPrice();
            return true;
        }
        return false;
    }

    public boolean addGame(Game game, int quanty){
        if (game.isDisponible()){
            for (int i = quanty; i > 0;i--){
                addGame(game);
            }
            return true;
        }
        return false;
    }
    public boolean removerJogo(Game game){
        if (games.contains(game)){
            games.remove(game);
            game.sell();
            saldo += game.getPrice();
            return true;
        }
        return false;
    }
    public ArrayList<Game> getGames(){
        return new ArrayList<Game>(games);
    }
    public String getName(){
        return this.name;
    }
    public float getSaldo(){
        return this.saldo;
    }

    public abstract void mostrarInfo();

}
