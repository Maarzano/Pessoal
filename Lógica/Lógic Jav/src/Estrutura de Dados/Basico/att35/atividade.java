package att35;

import java.util.Comparator;
import java.util.PriorityQueue;

public class atividade {
    public static void main(String[] args) {
        PriorityQueue<Tarefa> fila = new PriorityQueue<>(
            Comparator.comparingInt((Tarefa p) -> -p.prioridade).thenComparing(p -> p.tempo)
        );


        fila.add(new Tarefa("lavar roupa", 1000, 10));
        fila.add(new Tarefa("tomar banho", 2000, 100));
        fila.add(new Tarefa("Organizar quarto", 5000, 5));

        System.out.println("Temos uma lista de afazeres: ");

        for (var item : fila) {
            System.out.println(item);
        }

        System.out.println("\nAgora vamos retirar pela ordem de prioridade");

        while (!fila.isEmpty()) {
            Tarefa tarefa = fila.poll();
            System.out.println("Fazendo tarefa: " + tarefa);
            tarefa.fazerTarefa();
        }
    }

}
