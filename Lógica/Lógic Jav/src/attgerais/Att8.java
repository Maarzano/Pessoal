//algoritmo para lavar pratos
package attgerais;
import java.util.*;
public class Att8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> pilha = new ArrayDeque<>();

        System.out.println("você sujou quantos pratos? ");
        int PratosSujados = scanner.nextInt();

        for (int i = 0;i < PratosSujados;i++){
            pilha.push(1);
        }
        System.out.println("você tem " + pilha.size() + " pratos sujados");
        System.out.println("quer lavar eles? (s/n) ");
        char resposta = scanner.next().charAt(0);

        if (resposta == 's'){
            System.out.println("quantos? ");
            int quantidadeLavar = scanner.nextInt();

            for (int i =0;i < quantidadeLavar;i++){
                pilha.pop();

            }
            
            System.out.println("agora você tem " + pilha.size() + " de pratos sujos");

        } else {
            System.out.println("ok");
        }
        scanner.close();
    }
}
