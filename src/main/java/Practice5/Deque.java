package Practice5;

public interface Deque<T> extends Collection<T> {
    void addFirst(T item);

    void addLast(T item);

    Object getFirst();

    Object getLast();

    Object pollFirst();

    Object pollLast();

    Object removeFirst();

    Object removeLast();
}
