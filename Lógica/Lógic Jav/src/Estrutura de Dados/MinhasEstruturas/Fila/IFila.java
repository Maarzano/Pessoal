package MinhasEstruturas.Fila;

public interface IFila<T> {
    void enqueue(T t);
    T dequeue();
    T front();
    boolean isEmpty();
    int size();

}
