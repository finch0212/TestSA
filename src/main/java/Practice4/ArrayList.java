package Practice4;

public class ArrayList implements List {
    public int size;
    private int capacity;
    private Object[] mass;

    ArrayList(){
        size = 0;
        capacity = 10;
        mass = new Object[capacity];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean contains(Object item){
        for (Object o:mass) {
            if(o==item)return true;
        }
        return false;
    }

    public boolean add(Object item){
        if(size<capacity){
            mass[size++] = item;
        }
        else{
            capacity *= 1.5;
            Object[] tmpmass = new Object[capacity];
            for(int i = 0; i < size; i++){
                tmpmass[i] = mass[i];
            }
            tmpmass[size++]=item;
            mass = tmpmass;
        }
        return true;
    }
    public boolean remove(Object item){
        return  true;
    }
    public void clear(){

    }

    public void add(int index, Object item){

    }
    public void set(int index, Object item){

    }
    public Object get(int index){
        return mass[index];
    }
    public int indexOf(Object item){
        return  0;
    }
    public int lastIndexOf(Object item){
        return  0;
    }
    public void remove(int index){

    }
    public List subList(int from, int to){
        return  null;
    }

    public int getCapacity() {
        return capacity;
    }
}

