package Practice4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandList implements Command {
    private final List<String> list = new ArrayList<>();
    private final Scanner in = new Scanner(System.in);

    @Override
    public void execute() {
        while (true) {
            showMenu();
            try {
                switch (in.nextInt()) {
                    case 1:
                        showAllElements();
                        break;

                    case 2:
                        System.out.println(list.isEmpty() ? "Список пуст." : "Список не пуст.");
                        break;

                    case 3:
                        System.out.print("Введите искомый элемент: ");
                        System.out.println(list.contains(in.next()) ? "Элемент присутствует." : "Элемента нет.");
                        break;

                    case 4:
                        System.out.print("Введите добавляемый элемент: ");
                        list.add(in.next());
                        break;

                    case 5:
                        addElement();
                        break;

                    case 6:
                        System.out.print("Введите индекс искомого элемента: ");
                        System.out.println("Элемент: " + list.get(in.nextInt()));
                        break;

                    case 7:
                        System.out.print("Введите удаляемый элемент: ");
                        System.out.println("Удалился ли объект: " + list.remove(in.next()));
                        break;

                    case 8:
                        System.out.print("Введите индекс удаляемого элемента: ");
                        System.out.println(list.remove(in.nextInt()));
                        break;

                    default:
                        return;
                }
            } catch (Exception e) {
                System.out.println("Элемента с таким индексом нет.");
            }
        }
    }

    private void addElement() {
        System.out.print("Введите добавляемый элемент: ");
        String i = in.next();
        System.out.println();
        System.out.print("Введите индекс: ");
        int ind = in.nextInt();
        list.add(ind, i);
        System.out.println("Элемент добавлен.");
    }

    private void showAllElements() {
        System.out.println("Список элементов:");
        for (String i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void showMenu() {
        System.out.println("Выберите действие над коллекцией:" +
                "\n" +
                "1. showItems – вывести список элементов коллекции\n" +
                "2. isEmpty – пуст ли список\n" +
                "3. contains – содержит ли коллекция элемент\n" +
                "4. add – добавление элемента в конец списка\n" +
                "5. addByIndex – добавление элемента на определенную позицию\n" +
                "6. getByIndex – получение элемента с определенной позиции\n" +
                "7. remove – удаление элемента\n" +
                "8. removeByIndex – удаление элемента, находящегося на определенной позиции\n" +
                "9. goToMainMenu – возврат в меню выбора коллекции");
    }
}
