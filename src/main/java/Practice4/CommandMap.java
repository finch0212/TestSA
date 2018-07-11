package Practice4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandMap implements Command {

    private static Map<String, String> map = new HashMap<>();
    private static Scanner in = new Scanner(System.in);

    @Override
    public void execute() {
        try {
            while (true) {
                showMenu();
                switch (in.nextInt()) {
                    case 1:
                        showAllElements();
                        break;

                    case 2:
                        System.out.println(map.isEmpty() ? "Список пуст." : "Список не пуст.");
                        break;

                    case 3:
                        System.out.print("Введите ключ искомого элемента: ");
                        System.out.println("Элемент: " + map.get(in.next()));
                        break;
                    case 4:
                        addElementByKeyAndValue();
                        break;

                    case 5:
                        System.out.print("Введите ключ удаляемоого элемента: ");
                        System.out.println("Элемент удален: " + map.remove(in.next()));
                        break;

                    default:
                        return;
                }
            }
        } catch (Exception e) {
            System.out.println("Такого элемента или ключа нет.");
        }
    }

    private void showMenu() {
        System.out.println("Выберите действие над коллекцией\n" +
                "1. showItems – вывести список элементов коллекции\n" +
                "2. isEmpty – пуст ли список\n" +
                "3. get –  получение элемента коллекции, либо null в случае отсутствия\n" +
                "4. put – добавление элемента в коллекцию\n" +
                "5. remove – удаление элемента из коллекции\n" +
                "6. goToMainMenu – возврат в меню выбора коллекции");
    }

    private void showAllElements() {
        System.out.println("Список элементов:");
        for (String  i : map.values()
                ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void addElementByKeyAndValue() {
        System.out.print("Введите ключ: ");
        String  k = in.next();
        System.out.println();
        System.out.print("Введите добавляемый элемент: ");
        String  v = in.next();
        map.put(k, v);
        System.out.println("Элемент добавлен.");
    }
}

