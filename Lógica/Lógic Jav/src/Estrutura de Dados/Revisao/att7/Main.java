package Revisao.att7;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Tarefa> fila = new PriorityQueue<>(Arrays.asList(
            new Tarefa("Lavar loça", 1), 
            new Tarefa("Coisar", 2),
            new Tarefa("sdfsd", -1)
            ));

        System.out.println(fila.poll());
    }

}
