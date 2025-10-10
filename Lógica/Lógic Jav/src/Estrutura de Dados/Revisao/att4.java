package Revisao;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class att4 {
    public static void main(String[] args) {
        Queue<Integer> fila = new ArrayDeque<>(){
            {
                addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
            }
        };

        System.out.println(fila);

        inverterFila(fila);

        System.out.println(fila);

    }

    public static Queue<Integer> inverterFila(Queue<Integer> fila){
        if (fila.isEmpty()) return fila;


        int elemento = fila.remove();

        inverterFila(fila);

        fila.add(elemento);
        return fila;

    }

}
