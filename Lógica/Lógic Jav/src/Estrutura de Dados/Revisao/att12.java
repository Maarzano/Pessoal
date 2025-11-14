package Revisao;

import java.util.List;

import MinhasEstruturas.LinkedList.Single.SinglyLinkedList;

public class att12 {
    public static void main(String[] args) {
        SinglyLinkedList<String> lista = new SinglyLinkedList<>();
        lista.addAll(List.of("arthur", "maria", "joao", "isnfoisndf"));

        lista.printList();
        lista.enqueue("ref");
        lista.printList();
        System.out.println(lista.front());
        
    }

}
