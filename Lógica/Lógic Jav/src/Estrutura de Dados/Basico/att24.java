import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class att24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Character, Integer> mapa = new TreeMap<>();
        System.out.println("Escreva uma frase");
        String frase = sc.nextLine();

        char[] fraseArray = frase.trim().toCharArray();

        for (var c : fraseArray){
            if (mapa.containsKey(c)){
                mapa.put(c, mapa.get(c) + 1);
            } else {
                mapa.put(c, 1);
            }
        }
        System.out.println("letras que mais aparecem: ");

        for (Map.Entry<Character, Integer> entry : mapa.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
