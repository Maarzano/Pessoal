import java.util.Stack;

import MinhasEstruturas.LinkedList.Single.SinglyLinkedList;

public class att43 {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> listaLigada =  new SinglyLinkedList<>();
        Stack<Integer> pilha = new Stack<>();

        listaLigada.addAll(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        for (int valor : listaLigada){
            pilha.push(valor);
        }

        SinglyLinkedList<Integer> lista2 = new SinglyLinkedList<>();

        while (!pilha.isEmpty()) {
            lista2.add(pilha.pop());
        }

        listaLigada.printList();
        lista2.printList();


    }

}
