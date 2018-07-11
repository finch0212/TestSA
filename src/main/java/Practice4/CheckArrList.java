package Practice4;

public class CheckArrList {

    public static void main(String[] args){
        ArrayList mass = new ArrayList();
        printArr(mass);
        for(int i = 0; i < 100; i++){
            mass.add(i);
            printArr(mass);
            System.out.println();
        }

    }

    public static void printArr(ArrayList mass){
        System.out.println("Size = "+mass.size);
        System.out.println("Cap = "+mass.getCapacity());
        System.out.print("Mass: ");
        for(int i = 0; i < mass.size; i++){
            System.out.print(mass.get(i));
        }
        System.out.println();
    }
}
