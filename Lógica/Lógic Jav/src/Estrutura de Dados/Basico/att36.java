import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class att36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um texto: ");
        String texto = sc.nextLine();

        String[] array = texto.split(" ");
        Map<String, Integer> mapa = new HashMap<>();

        for (int i = 0;i< array.length;i++){
            if (mapa.containsKey(array[i])){
                mapa.put(array[i], mapa.get(array[i]) + 1);
            } else {
                mapa.put(array[i], 1);
            }
            
        }
        System.out.println(mapa.toString());
        sc.close();
    }

}
