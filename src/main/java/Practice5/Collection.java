package Practice5;

public interface Collection<T> extends Iterable<T> {
    int size();

    boolean isEmpty();

    boolean contains(T item);

    boolean add(T item);

    boolean remove(T item);

    void clear();
}
