import java.util.PriorityQueue;
import java.util.Scanner;

public class att33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<String> pq = new PriorityQueue<>();

        boolean continuarLoop = true;

        while (continuarLoop){
            System.out.println("Escreva nome de pessoas (0 para sair)");
            String nome = sc.nextLine();

            if (nome.equals("0")) {
                continuarLoop = false;
                continue;
            }

            pq.add(nome);
        }

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        sc.close();
    }

}
