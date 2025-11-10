package MinhasEstruturas.LinkedList.Single;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

import MinhasEstruturas.Fila.IFila;
import MinhasEstruturas.Pilha.Pilha;


public class SinglyLinkedList<T extends Comparable<T>> implements Iterable<T>, Pilha<T>, IFila<T>{

    private Node<T> head;
    private Node<T> tail;

    public SinglyLinkedList(){

    }
    
    public SinglyLinkedList(T[] lista){
        addAll(lista);
    }

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
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                T value = current.value;
                current = current.next;
                return value;
            }
        };
    }

    @Override
    public void push(T elemento) {
        addFirst(elemento);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("A pilha está vazia. Não é possível dar pop().");
        }
        T value = head.value;
        head = head.next;
        return value;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("A pilha está vazia. Não é possível dar peek().");
        }
        return head.value;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public void enqueue(T t) {
        Node<T> newNode = new Node<T>(t);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("A fila está vazia. Não é possível dar dequeue().");
        }

        T value = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        
        return value;
    }

    @Override
    public T front() {
        if (isEmpty()) {
            throw new NoSuchElementException("A fila está vazia. Não é possível dar front().");
        }
        return head.value;
    }

    

}
