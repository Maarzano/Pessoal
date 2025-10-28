package Revisao;

import MinhasEstruturas.LinkedList.Single.SinglyLinkedList;
import MinhasEstruturas.Pilha.Pilha;

public class testandoMinhaPilha {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new SinglyLinkedList<>();

        pilha.push(123);
        System.out.println(pilha.peek());
    }

}
