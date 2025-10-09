import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Helpers.Vetores;

public class att37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer[]> mapa = new HashMap<>();

        for (int i = 0; i < 5;i++){
            System.out.println("Digite o nome do estudante: ");
            String estudante = sc.nextLine();
            System.out.println("Você agora vai escrever as notas de " + estudante);

            mapa.put(estudante, Vetores.criarVetorInteiro(5));
            
        }

        for (Map.Entry<String, Integer[]> entry : mapa.entrySet()){
            System.out.print("\nAluno " + entry.getKey() + " tem as notas ");
            for (var nota : entry.getValue()){
                System.out.print(nota + " ");
            }
        }
        sc.close();
    }

}
