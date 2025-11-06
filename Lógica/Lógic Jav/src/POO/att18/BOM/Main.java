package att18.BOM;

import att18.models.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("Arthur");

        bancoDeDados b = new bancoDeDados();

        
        System.out.println(b.salvarUser(u));
    }
}
