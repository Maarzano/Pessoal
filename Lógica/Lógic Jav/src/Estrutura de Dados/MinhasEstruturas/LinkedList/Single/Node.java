package MinhasEstruturas.LinkedList.Single;

public class Node<T> {
    public Node(T value){
        this.value = value;
        this.next = null;
    }

    T value;
    Node<T> next;

}
