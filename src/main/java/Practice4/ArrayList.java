package Practice4;

public class ArrayList implements List {
    public int size;
    private int capacity;
    private Object[] mass;

    ArrayList() {
        size = 0;
        capacity = 10;
        mass = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object item) {
        for (Object o : mass) {
            if (o == item) return true;
        }
        return false;
    }

    public boolean add(Object item) {
        if (size < capacity) {
            mass[size++] = item;
        } else {
            capacityIncrease();
            mass[size++] = item;
        }
        return true;
    }

    public boolean remove(Object item) {
        for (int i = 0; i < size; i++) {
            if (mass[i] == item) {
                for (int j = i; j < size - 1; j++) {
                    mass[j] = mass[j + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public void clear() {
        size = 0;
        capacity = 10;
        mass = new Object[capacity];
    }

    public void add(int index, Object item) {
        if (index == size) {
            add(item);
            return;
        } else if (index < size) {
            if (size == capacity) capacityIncrease();
            for (int i = size; i > index; i--) {
                mass[i] = mass[i - 1];
            }
            mass[index] = item;
            size++;
        } else {
            //если нет индекса?////////////////////////////////////////////////////////////////////////////
        }
    }


    public void set(int index, Object item) {
        mass[index] = item;
        //если нет индекса?////////////////////////////////////////////////////////////////////////////
    }

    public Object get(int index) {
        return mass[index];
    }

    public int indexOf(Object item) {
        for (int i = 0; i < size; i++) {
            if (mass[i] == item) return i;
        }
        return -1;/////////////////////////////////////////////////////////////////////////////////////
    }

    public int lastIndexOf(Object item) {
        for (int i = size - 1; i >= 0; i--) {
            if (mass[i] == item) return i;
        }
        return -1;/////////////////////////////////////////////////////////////////////////////////////

    }

    public void remove(int index) {
        for (int i = index; i < size-1; i++) {
            mass[i] = mass[i + 1];
        }
        size--;

    }

    public List subList(int from, int to) {
        return null;
    }

    public int getCapacity() {
        return capacity;
    }

    private void capacityIncrease() {
        capacity *= 1.5;
        Object[] tmpmass = new Object[capacity];
        for (int i = 0; i < size; i++) {
            tmpmass[i] = mass[i];
        }
        mass = tmpmass;
    }
}

