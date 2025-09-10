package att14;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


/*Você tem uma fila de números inteiros. Deve inverter os primeiros k elementos da fila 
usando uma pilha e depois devolver a fila com os elementos restantes na ordem original. */

public class att14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> fila = new LinkedList<>();
        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);

        System.out.println(fila.toString());

        System.out.println("Digite um número de 1 a 5");
        int numero = sc.nextInt();
        if (numero > fila.size() || numero < 0) {
            sc.close(); 
            return;
        }

        Stack<Integer> pilha = new Stack<>();

        for(int i = 0; i < numero;i++){
            pilha.add(fila.poll());
        }

        while(!pilha.isEmpty()){
            fila.add(pilha.pop());
        }

        int tamanhoRestante = fila.size() - numero;
        for (int i = 0;i< tamanhoRestante;i++){
            fila.add(fila.poll());
        }

        System.out.println(fila.toString());
        sc.close();


        
    }

}
