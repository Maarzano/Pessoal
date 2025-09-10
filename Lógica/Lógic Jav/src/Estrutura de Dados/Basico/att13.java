import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class att13 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<Integer>();
        fila.add(13);
        fila.add(1);
        fila.add(13);
        fila.add(16);
        fila.add(23);

        System.out.println(fila.toString());

        Stack<Integer> pilha = new Stack<>();

        while (!fila.isEmpty()){
            pilha.add(fila.poll());
        }

        while(!pilha.isEmpty()){
            fila.add(pilha.pop());
        }

        System.out.println(fila.toString());


    }

}
