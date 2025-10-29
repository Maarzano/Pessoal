package MinhasEstruturas.Set;

public interface ISet<T> {
    boolean add(T elemento);
    boolean remove(T elemento);
    boolean contains(T elemento);
    int size();
    boolean isEmpty();

}
