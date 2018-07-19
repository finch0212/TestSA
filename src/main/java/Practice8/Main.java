package Practice8;

import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Map<Integer, Mark> marksByInd;
    private static List<Car> cars;

    static {
        cars = new ArrayList<>();
        marksByInd = new LinkedHashMap<>();
        marksByInd.put(1, Mark.AUDI);
        marksByInd.put(2, Mark.MAZDA);
        marksByInd.put(3, Mark.VOLVO);
    }

    public static void main(String[] args) {
        while (true) {
            showOutMenu();
            switch (in.nextInt()) {
                case 1:
                    createCar();
                    break;

                case 2:
                    showOutStatistics();
                    break;

                default:
                    return;
            }
        }
    }

    private static void createCar() {
        System.out.println("Выберите марку:");
        for (Map.Entry<Integer, Mark> entry : marksByInd.entrySet()) {
            System.out.println(String.format("%d. %s", entry.getKey(), entry.getValue()));
        }
        cars.add(FactoryAll.createCar(marksByInd.get(in.nextInt())));
    }

    private static void showOutStatistics() {
        System.out.println("1. По наименованию марки\n" +
                "2. По ценовому диапазону\n" +
                "3. По скоростному диапазону\n" +
                "4. По весовому диапазону");
        switch (in.nextInt()) {
            case 1:
                Mark.showCarsByProperty(cars);
                break;

            case 2:
                Price.showCarsByProperty(cars);
                break;

            case 3:
                Speed.showCarsByProperty(cars);
                break;

            case 4:
                Weight.showCarsByProperty(cars);
                break;
        }
    }

    private static void showOutMenu() {
        System.out.println("1 – Создать автомобиль\n" +
                "2 – Вывести статистику, созданных автомобилей\n" +
                "3 – Выход");
    }
}
