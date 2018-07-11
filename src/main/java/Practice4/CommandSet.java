package Practice4;


import java.util.*;

public class CommandSet implements Command {

    static final Set<Integer> set = new HashSet<Integer>();
    static final Scanner in = new Scanner(System.in);

    @Override
    public void execute() {
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    showAllElements();
                    break;

                case 2:
                    System.out.println(set.isEmpty() ? "Список пуст." : "Список не пуст.");
                    break;

                case 3:
                    System.out.print("Введите искомый элемент: ");
                    System.out.println(set.contains(in.nextInt()) ? "Элемент присутствует." : "Элемента нет.");
                    break;

                case 4:
                    System.out.print("Введите добавляемый элемент: ");
                    set.add(in.nextInt());
                    System.out.println("Элемент добавлен.");
                    break;

                case 5:
                    System.out.print("Введите удаляемый элемент: ");
                    try {
                        set.remove(in.nextInt());
                        System.out.println("Элемент удален.");
                    } catch (Exception e) {
                        System.out.println("Такого элемента нет.");
                    }
                    break;

                default:
                    return;
            }
        }
    }

    private void showAllElements() {
        System.out.println("Список элементов:");
        for (int i : set) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void showMenu() {
        System.out.println("Выберите действие над коллекцией:\n" +
                "1. showItems – вывести список элементов коллекции\n" +
                "2. isEmpty – пуст ли список\n" +
                "3. contains – содержит ли коллекция элемент\n" +
                "4. add – добавление элемента в конец списка\n" +
                "5. remove – удаление элемента\n" +
                "6. goToMainMenu – возврат в меню выбора коллекции");
    }
}
