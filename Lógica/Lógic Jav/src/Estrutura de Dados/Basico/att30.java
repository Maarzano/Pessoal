import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class att30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuarLopp = true;

        Set<String> conjunto = new HashSet<>();


        while(continuarLopp){
            System.out.println("\nEscreva seu email para fazer login: ");
            String email = sc.nextLine();

            if (conjunto.contains(email)) {
                System.out.println("já tem esse email...");
                continue;
            }
            System.out.println("Adicionando email");
            conjunto.add(email);
        }
        for (String email : conjunto) System.out.print(email);
        
    }

}
