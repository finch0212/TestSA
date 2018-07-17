package Practice5;

public class CheckArrList {

    public static void main(String[] args) {
        ArrayList<Integer> mass = new ArrayList<>();
        printArr(mass);
        for (int i = 0; i < 9; i++) {
            mass.add(i);
            printArr(mass);
            System.out.println();
        }
        mass.add(0, 100);
        printArr(mass);
        mass.add(9, 160);
        printArr(mass);
        mass.remove(0);
        printArr(mass);
        mass.remove((Integer) 1);
        printArr(mass);
        mass.set(7, 5);
        printArr(mass);
        System.out.println("indexOf 5: " + mass.indexOf(5));
        System.out.println("lastIndexOf 5: " + mass.lastIndexOf(5));
        List arr = mass.subList(2, 3);
        System.out.println("SubList:");
        //noinspection unchecked
        printArr((ArrayList) arr);
    }

    private static <T> void printArr(ArrayList<T> mass) {
        System.out.println("Size = " + mass.size);
        System.out.print("Mass: ");
        for (T i : mass) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
