import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class att22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        String[] fraseArray = frase.split(" ");

        Map<String, Integer> mapa = new HashMap<>();

        for (String palavra : fraseArray){
            if (!mapa.containsKey(palavra)){
                mapa.put(palavra, 1);
            } else {
                mapa.put(palavra, mapa.get(palavra) + 1);
            }
            
        }

        for (Map.Entry<String, Integer> entry : mapa.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        sc.close();
    }

}
