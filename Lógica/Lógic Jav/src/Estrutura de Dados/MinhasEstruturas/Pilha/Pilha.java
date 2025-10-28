package MinhasEstruturas.Pilha;

public interface Pilha<T extends Comparable<T>> {
    void push(T elemento);
    T pop();
    T peek();
    boolean isEmpty();
    int size();

}
