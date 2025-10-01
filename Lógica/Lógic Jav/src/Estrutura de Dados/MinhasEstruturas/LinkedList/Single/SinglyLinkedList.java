package MinhasEstruturas.LinkedList.Single;

public class SinglyLinkedList<T> {

    private Node<T> head;

    public SinglyLinkedList<T> add(T value){
        Node<T> newNode = new Node<T>(value);

        if (head == null){
            head = newNode;
            return this;
        }

        Node<T> current = head;

        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return this;
        
    }

    public void addAll(Collection<T> lista){
        for (T valor : lista){
            add(valor);
        }
    }
    public void addAll(T[] lista){
        for (T valor : lista){
            add(valor);
        }
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
    }

    public SinglyLinkedList<T> remove(T data) {
        if (head == null) return this;
        if (head.value.equals(data)) {
            head = head.next;
            return this;
        }
        Node<T> current = head;
        while (current.next != null && !current.next.value.equals(data) ) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
        return this;
    }
    public SinglyLinkedList<T> printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
        return this;
    }

    

}
