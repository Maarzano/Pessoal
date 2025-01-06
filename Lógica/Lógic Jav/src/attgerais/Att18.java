//Dado um array de números inteiros, use um Map<String, List<Integer>> para separar os números em dois grupos: "Par" e "Ímpar".
import java.util.*;
public class Att18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Integer>> separando = new HashMap<>();
        List<Integer> Par = new ArrayList<>();
        List<Integer> Impar = new ArrayList<>();

        System.out.println("escreva seus números (digite PARE, para parar)");

        while (true){

            if (!scanner.hasNextInt()){
                break;
            }
            int lendoNumero = scanner.nextInt();

            if (lendoNumero % 2 == 0){
                if (lendoNumero == 0){
                    continue;
                }
                Par.add(lendoNumero);
                separando.put("Par", Par);
            } else {
                Impar.add(lendoNumero);
                separando.put("Impar", Impar);
            }

        }

        for (String ParouImpar : separando.keySet()){
            System.out.println(ParouImpar + ": " + separando.get(ParouImpar));
        }
        scanner.close();
    }
}
