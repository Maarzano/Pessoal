import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class att38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Escreva ");
        String frase = sc.nextLine();

        Set<String> set = new HashSet<String>(List.of(frase.split(" ")));

        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparingInt(palavra -> -palavra.length()));

        pq.addAll(set);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        sc.close();
    }

}
