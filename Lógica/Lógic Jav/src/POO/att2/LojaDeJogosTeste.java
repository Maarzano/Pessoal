package att2;

import java.util.ArrayList;
import java.util.List;

public class LojaDeJogosTeste {
    public static void main(String[] args) {
        Game j1 = new Game("Minecraft", 100);
        Game j2 = new Game("Cyberpunk 2077", 300);
        Game j3 = new Game("FIFA 24", 200);

        Jogador jogador = new Jogador("Lucas", 1000);
        Adm admin = new Adm("Ana", 5000);

        try{
            jogador.addGame(j1);
            jogador.addGame(j2, 2);
            jogador.addGame(j3);
        } catch(Exception e){
            System.out.println("Exceção: " + e.getMessage());
        }

        admin.addGame(j1);
        admin.addGame(j2);

        List<User> usuarios = new ArrayList<>();
        usuarios.add(jogador);
        usuarios.add(admin);

        for(User u : usuarios){
            u.mostrarInfo();
        }
    }
}