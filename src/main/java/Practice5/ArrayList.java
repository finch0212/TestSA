package Practice5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ArrayList<T> implements List<T> {
    private static final int NOT_FOUND = -1;

    public int size;
    private T[] array;

    public ArrayList() {
        initialize(10);
    }

    public ArrayList(int capacity) {
        initialize(capacity);
    }

    private void initialize(int capacity) {
        size = 0;
        //noinspection unchecked
        array = (T[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T item) {
        for (T o : array) {////////////////////////////////
            if (o.equals(item)) return true;
        }
        return false;
    }

    public boolean add(T item) {
        extendArrayAsNeeded();
        array[size++] = item;
        return true;
    }

    private void extendArrayAsNeeded() {
        if (size == array.length) {
            int newCapacity = array.length + (array.length >> 1) + 1;
            //noinspection unchecked
            T[] newArray = (T[]) new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public boolean remove(T item) {
        int index = indexOf(item);
        if (index != NOT_FOUND) {
            remove(index);
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        initialize(10);
    }

    public void add(int index, T item) {
        checkForRange(index);
        extendArrayAsNeeded();
        if (index == size) {
            add(item);
        } else {
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = item;
            size++;
        }
    }

    public void set(int index, T item) {
        checkForRange(index);
        array[index] = item;
    }

    public T get(int index) {
        checkForRange(index);
        return array[index];
    }

    public int indexOf(T item) {
        if (item == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (item.equals(array[i])) return i;
            }
        }
        return NOT_FOUND;
    }

    public int lastIndexOf(T item) {
        if (item == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (array[i] == null) return i;
            }
        } else {
            for (int i = size - 1; i >= 0; i--) {
                if (item.equals(array[i])) return i;
            }
        }
        return NOT_FOUND;

    }

    public void remove(int index) {
        checkForRange(index);
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null;

    }

    private void checkForRange(int index) {
        if ((index < 0) || (index >= size)) {
            throw new IndexOutOfBoundsException();
        }
    }

    public List subList(int from, int to) {
        checkForRange(from, to);
        List result = new ArrayList(to - from);
        for (int i = from; i < to; i++) {
            result.add(array[i]);
        }
        return result;
    }

    private void checkForRange(int from, int to) {
        checkForRange(from);
        checkForRange(to);
        if (from > to) {
            throw new IndexOutOfBoundsException();
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;
            private T current = array[0];

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() throws IndexOutOfBoundsException {
                if (!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                return array[index++];
            }
        };
    }
}

