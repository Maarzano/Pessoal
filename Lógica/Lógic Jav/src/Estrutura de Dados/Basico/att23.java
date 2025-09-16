import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class att23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Map<UUID, String> alunosMap = new HashMap<>();
        while (true){
            System.out.println("Escreva o nome do aluno (0 para sair)");
            String nomeALuno = sc.nextLine();

            if (nomeALuno.equals("0")) break;
            UUID id = UUID.randomUUID();
            alunosMap.put(id, nomeALuno);
        }

        for (Map.Entry<UUID, String> entry : alunosMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        sc.close();
        
    }

}
