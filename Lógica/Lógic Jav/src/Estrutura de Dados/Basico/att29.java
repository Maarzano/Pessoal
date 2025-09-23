import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class att29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva uma frase gigante");
        String texto = sc.nextLine();

        Set<String> conjunto = new HashSet<>();

        for (String palavra : texto.split(" ")) conjunto.add(palavra);

        System.out.println("Suas palavras únicas foram: ");

        for (String palavras : conjunto) System.out.println(palavras);

        sc.close();
    }

}
