//fila pro pão
package attgerais;
import java.util.*;
public class Att10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> fila = new ArrayDeque<>();
        

        fila.addLast(1);
        fila.addLast(2);
        fila.addLast(3);
        fila.addLast(4);
        fila.addLast(5);
        

        System.out.println("você tem uma fila para comprar pão com " + fila.size() + " pessoas");
        System.out.println("cada uma tem um número");
        System.out.println("em ordem de chegada fica: ");

        int tamanho = fila.size();

        for (int i =0;i < tamanho;i++){
            System.out.println(fila.peek());
            fila.removeFirst();
        }
        scanner.close();
    }
}
