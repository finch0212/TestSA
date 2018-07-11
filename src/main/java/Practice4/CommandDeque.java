package Practice4;

import java.util.*;

public class CommandDeque implements Command {

    private final Deque<Integer> deque = new LinkedList<>();
    private final Scanner in = new Scanner(System.in);
    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        while(true) {
            showMenu();
            try {
                switch (in.nextInt()) {
                    case 1:
                        showAllElements();
                        break;

                    case 2:
                        System.out.println(deque.isEmpty() ? "Список пуст." : "Список не пуст.");
                        break;

                    case 3:
                        System.out.println("Введите искомый элемент: ");
                        System.out.println(deque.contains(in.nextInt()) ? "Элемент присутствует." : "Элемента нет.");
                        break;

                    case 4:
                        addFirst();
                        break;

                    case 5:
                        addLast();
                        break;

                    case 6:
                        System.out.println("Элемент: " + deque.getFirst());
                        break;

                    case 7:
                        System.out.println("Элемент: " + deque.getLast());
                        break;

                    case 8:
                        System.out.println("Элемент: " + deque.pollFirst());
                        break;

                    case 9:
                        System.out.println("Элемент: " + deque.pollFirst());
                        break;

                    case 10:
                        deque.removeFirst();
                        break;

                    case 11:
                        deque.removeLast();
                        break;

                    default:
                        return;
                }
            }
            catch (NoSuchElementException e){
                System.out.println("Список пуст.");
            }
        }
    }

    private void addLast() {
        System.out.print("Введите добавляемый элемент: ");
        deque.addLast(in.nextInt());
        System.out.println("Элемент добавлен.");
    }

    private void addFirst() {
        System.out.print("Введите добавляемый элемент: ");
        deque.addFirst(in.nextInt());
        System.out.println("Элемент добавлен.");
    }

    private void showAllElements() {
        System.out.println("Список элементов:");
        for (int i: deque) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void showMenu() {
        System.out.println("Выберите действие над коллекцией:\n" +
                "1. showItems – вывести список элементов коллекции\n" +
                "2. isEmpty – пуст ли список\n" +
                "3. contains – содержит ли коллекция элемент\n" +
                "4. addFirst – добавить элемент в начало коллекции \n" +
                "5. addLast – добавить элемент в конец коллекции\n" +
                "6. getFirst – получить первый элемент коллекции, при этом не удаляя его из самой коллекции\n" +
                "7. getLast – получить последний элемент коллекции, при этом не удаляя его из самой коллекции\n" +
                "8. pollFirst – получить первый элемент коллекции, удалив его при этом из самой коллекции\n" +
                "9. pollLast – получить последний элемент коллекции, удалив его при этом из самой коллекции\n" +
                "10. removeFirst – удалить элемент из начала коллекции \n" +
                "11. removeLast – удалить элемент из конца коллекции\n" +
                "12. goToMainMenu – возврат в меню выбора коллекции");
    }
}
