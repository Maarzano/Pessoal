package MinhasEstruturas.LinkedList;

import MinhasEstruturas.LinkedList.Single.SinglyLinkedList;

public class TestandoLinkedLists {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> testandoLinkedList = new SinglyLinkedList<>();

        testandoLinkedList.add(10).add(100).printList().remove(100).printList();
    }

}
