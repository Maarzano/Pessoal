//Busca linear: passa de elemento por elemento procurando o valor O(n)
import java.util.*;
public class Att33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("quantos números terão seu vetor?");
        int tamanhao = scanner.nextInt();

        int[] Vet = new int[tamanhao];

        for (int i = 0;i < Vet.length;i++){
            System.out.println("digite o número do índice: " + i);
            int valor = scanner.nextInt();
            Vet[i] = valor;
        }

        System.out.println("qual valor você quer procurar?");
        int target = scanner.nextInt();

        boolean Contem = false;

        for (int i = 0;i < Vet.length;i++){
            if (Vet[i] == target){
                System.out.println("seu número existe e está no índice " + i);
                Contem = true;
                break;
            }
        }
        if (!Contem){
            System.out.println("seu número não está no vetor");
        }
        scanner.close();
    }
}
