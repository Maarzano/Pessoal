import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class att25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> mapa = new HashMap<>();
        boolean continuarLoop = true;


        while (continuarLoop){
            System.out.println("escreva o nome da pessoa e depois o numero dela: (0 para sair)");
            String nome = sc.nextLine();

            if (nome.equals("0")) {

                for (Map.Entry<String, String> entry : mapa.entrySet()){
                    System.out.println("\nNome: " + entry.getKey() + "\nTelefone: " + entry.getValue());
                }
                
                continuarLoop = false; return; 
            }

            System.out.print("Telefone: ");
            String telefone = sc.nextLine();

            mapa.put(nome, telefone);

        }
        
    }

}
