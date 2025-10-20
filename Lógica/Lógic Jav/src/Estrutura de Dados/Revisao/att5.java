package Revisao;

import java.util.Arrays;
import java.util.LinkedList;

public class att5 {
    public static void main(String[] args) {
        LinkedList<Integer> lista1 = new LinkedList<>();
        lista1.addAll(Arrays.asList(1, 3, 4, 5, 6, 7, 8));
        LinkedList<Integer> lista2 = new LinkedList<>();
        lista2.addAll(Arrays.asList(2, 10, 34, 50, 70));

        LinkedList<Integer> resultado = juntarListas(lista1, lista2);
        System.out.println(resultado);

        
    }
    public static LinkedList<Integer> juntarListas(LinkedList<Integer> lista1, LinkedList<Integer> lista2){
        LinkedList<Integer> finale = new LinkedList<>();

        while (!lista1.isEmpty() && !lista2.isEmpty()){
            if (lista1.peekFirst() < lista2.peekFirst()){
                finale.addLast(lista1.removeFirst());
            } else {
                finale.addLast(lista2.removeFirst());
            }
        }
        if (!lista1.isEmpty()) {
            finale.addAll(lista1);
        }
        if (!lista2.isEmpty()) {
            finale.addAll(lista2);
        }
        return finale;
        
    }

}
