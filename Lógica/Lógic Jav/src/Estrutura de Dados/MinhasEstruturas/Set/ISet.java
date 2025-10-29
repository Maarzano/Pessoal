package MinhasEstruturas.Set;

public interface ISet<T extends Comparable<T>> {
    boolean add(T elemento);
    T remove(T elemento);
    boolean contains(T elemento);
    int size();
    boolean isEmpty();

}
