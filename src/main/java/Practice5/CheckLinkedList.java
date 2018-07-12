package Practice5;

import javax.persistence.criteria.CriteriaBuilder;

public class CheckLinkedList {

    public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();
            printList(list);
            for(int i = 0; i < 15;i++){
                list.add(i);
                printList(list);
            }
            System.out.println("Содержится 5: " + list.contains(5));
            System.out.println("Содержится 555: " + list.contains(555));
            list.set(8,6);
            printList(list);
            System.out.println("IndexOf 6: " + list.indexOf(6));
            System.out.println("LastIndexOf 6: " + list.lastIndexOf(6));
            System.out.println("GetLast: " + list.getLast());
            System.out.println("GetFirst: " + list.getFirst());
            list.remove((Integer)10);
            printList(list);
            list.remove(5);
            printList(list);

            list.add(0,100);
            printList(list);
            list.add(5,50);
            printList(list);

            //LinkedList<Integer> subList = (LinkedList<Integer>) list.subList(0,5);
            //printList(subList);


    }

    public static void printList(LinkedList list){
        System.out.println("Size = " + list.size);
        System.out.print("Mass: ");
        for(int i = 0; i < list.size; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}