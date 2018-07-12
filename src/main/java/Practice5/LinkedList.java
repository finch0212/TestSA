package Practice5;

import java.util.NoSuchElementException;

public class LinkedList<T> implements List<T>, Deque<T> {
    int size;
    private Node<T> last;
    private Node<T> first;

    private static class Node<T> {
        private T item;
        private Node<T> next;
        private Node<T> prev;

        Node(T item, Node<T> prev, Node<T> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T item) {
        return indexOf(item) != -1;
    }

    public boolean add(T item) {
        addLast(item);
        return true;
    }

    public boolean remove(T item) {
        Node<T> removingNode = getNode(item);
        if (removingNode != null) {
            removeNode(getNode(item));
            return true;
        } else {
            return false;
        }
    }

    private Node<T> getNode(T item) {
        //todo
        return null;
    }

    public void clear() {
        size = 0;
        first = null;
        last = null;
    }

    public void add(int index, T item) {
        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            Node curr = getNode(index);
            Node newNode = new Node(item, curr.prev, curr);
            curr.prev = newNode;
            newNode.prev.next = newNode;
            size++;
        }
    }

    public void set(int index, T item) {
        getNode(index).item = item;
    }

    public T get(int index) {
        checkForRange(index);
        return getNode(index).item;
    }

    private void checkForRange(int index) {
        if ((index < 0) || (index >= size)) {
            throw new IndexOutOfBoundsException();
        }
    }

    public int indexOf(T item) {
        Node node = first;
        for (int i = 0; i < size; i++) {
            if (node.item.equals(item)) {
                return i;
            }
            node = node.next;
        }
        return -1;
    }

    public int lastIndexOf(T item) {
        Node node = last;
        for (int i = size - 1; i >= 0; i--) {
            if (node.item.equals(item)) {
                return i;
            }
            node = node.prev;
        }
        return -1;
    }

    public void remove(int index) {
        removeNode(getNode(index));
    }

    public List subList(int from, int to) {
        checkForRange(from, to);
        List<T> res = new LinkedList<>();
        Node<T> current = getNode(from);
        for (int i = from; i < to; i++) {
            res.add(current.item);
            current = current.next;
        }
        return res;
    }

    private void checkForRange(int from, int to) {
        checkForRange(from);
        checkForRange(to);
        if (from>to){
            throw new IndexOutOfBoundsException();
        }
    }

    public void addFirst(T item) {
        Node fir = first;
        first = new Node(item, null, fir);
        size++;
    }

    public void addLast(T item) {
        if (size == 0) {
            first = new Node(item, null, null);
            last = first;
        } else {
            last = new Node(item, last, null);
            last.prev.next = last;
        }
        size++;
    }

    public T getFirst() {
        checkForNotEmpty();
        return first.item;
    }

    private void checkForNotEmpty() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }

    public T getLast() {
        checkForNotEmpty();
        return last.item;
    }

    public T pollFirst() {
        try {
            return removeFirst();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public T pollLast() {
        try {
            return removeLast();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public T removeFirst() {
        checkForNotEmpty();
        T res = first.item;
        removeNode(first);
        return res;
    }

    private void removeNode(Node<T> removingNode) {
        if (removingNode.prev != null) {
            removingNode.prev.next = removingNode.next;
        } else {
            first = removingNode.next;
        }

        if (removingNode.next != null) {
            removingNode.next.prev = removingNode.prev;
        } else {
            last = removingNode.prev;
        }
    }

    public T removeLast() {
        T res = last.item;
        removeNode(last);
        return res;
    }

    private Node<T> getNode(int index) {
        if (index < size / 2) {
            Node<T> current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        } else {
            Node<T> current = last;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
            return current;
        }
    }
}
