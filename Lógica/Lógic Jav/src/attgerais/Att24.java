/*Simule o atendimento em um banco:

Adicione clientes à fila (nomes ou números).
Atenda os clientes na ordem em que chegam, exibindo o nome do cliente atendido.
Exiba o próximo da fila após cada atendimento. */

import java.util.*;

public class Att24 {
    public static void main(String[] args) {
        Queue<String> Fila = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("adicione clientes a sua fila: (-1 to Exit)");
        String nomeCliente = "";

        while(true){
            nomeCliente = scanner.nextLine();

            if(nomeCliente.equals("-1")) break;

            if (Fila.contains(nomeCliente)){
                System.out.println("este cliente ja esta na fila! ");
                continue;
            }

            Fila.add(nomeCliente);

        }

        System.out.println("Ordem de atendimento: ");

        int i = 1;

        
        while(!Fila.isEmpty()){
            System.out.println(i + "° " + Fila.peek());
            Fila.poll();
            i++;
        }

        System.out.println("A fila acabou");

        scanner.close();
    }

}
