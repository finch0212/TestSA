package Practice4;

public class CheckArrList {

    public static void main(String[] args){
        ArrayList mass = new ArrayList();
        printArr(mass);
        for(int i = 0; i < 15; i++){
            mass.add(i);
            printArr(mass);
            System.out.println();
        }
        mass.add(0,100);
        mass.add(16,160);
        printArr(mass);
        mass.remove(0);
        printArr(mass);
        mass.remove((Integer)1);
        printArr(mass);
        mass.set(12,5);
        printArr(mass);
        System.out.println(mass.indexOf(5));
        System.out.println(mass.lastIndexOf(5));
    }

    public static void printArr(ArrayList mass){
        System.out.println("Size = "+mass.size);
        System.out.println("Cap = "+mass.getCapacity());
        System.out.print("Mass: ");
        for(int i = 0; i < mass.size; i++){
            System.out.print(mass.get(i) + " ");
        }
        System.out.println();
    }
}
