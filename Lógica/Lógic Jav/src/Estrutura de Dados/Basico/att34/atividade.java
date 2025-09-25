package att34;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Paciente> filaPrioritaria = new PriorityQueue<>(
            Comparator.comparingInt( p -> -p.getPrioridade())
        );
        boolean continuarLoop = true;


        while(continuarLoop){
            System.out.println("Adicione os pacientes a fila com nome e prioridade: (0 para sair)");
            System.out.print("nome: ");
            String nome = sc.nextLine();

            System.out.print("prioridade: ");
            String prioString = sc.nextLine();

            if (nome.equals("0") || prioString.equals("0")){
                continuarLoop = false;
                continue;
            }
            filaPrioritaria.add(new Paciente(nome, Integer.parseInt(prioString)));
        }

        System.out.println("Retirando as pessoas da fila com base na prioridade");

        while(!filaPrioritaria.isEmpty()){
            System.out.println(filaPrioritaria.poll());
        }
        
        sc.close();
    }

}
