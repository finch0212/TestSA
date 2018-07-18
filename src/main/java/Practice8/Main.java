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
                showCarsByMarks();
                break;

            case 2:
                showCarsByPrice();
                break;

            case 3:
                showCarsBySpeed();
                break;

            case 4:
                showCarsByWeight();
                break;
        }
    }

    private static void showCarsByWeight() {
        Map<Weight, Integer> countByWeight = new LinkedHashMap<>();
        for (Weight weight : Weight.values()) {
            countByWeight.put(weight, 0);
        }
        for (Car car : cars) {
            Weight currWeight = Weight.valueOf(car.getWeight());
            countByWeight.put(currWeight, countByWeight.get(currWeight) + 1);
        }
        for (Map.Entry<Weight, Integer> entry : countByWeight.entrySet()) {
            System.out.println(String.format("%s: %d", entry.getKey().toString(), entry.getValue()));
        }
    }

    private static void showCarsBySpeed() {
        Map<Speed, Integer> countBySpeed = new LinkedHashMap<>();
        for (Speed speed : Speed.values()) {
            countBySpeed.put(speed, 0);
        }
        for (Car car : cars) {
            Speed currSpeed = Speed.valueOf(car.getMaxSpeed());
            countBySpeed.put(currSpeed, countBySpeed.get(currSpeed) + 1);
        }
        for (Map.Entry<Speed, Integer> entry : countBySpeed.entrySet()) {
            System.out.println(String.format("%s: %d", entry.getKey().toString(), entry.getValue()));
        }
    }

    private static void showCarsByPrice() {
        Map<Price, Integer> countByPrice = new LinkedHashMap<>();
        for (Price price : Price.values()) {
            countByPrice.put(price, 0);
        }
        for (Car car : cars) {
            Price currPrice = Price.valueOf(car.getPrice());
            countByPrice.put(currPrice, countByPrice.get(currPrice) + 1);
        }
        for (Map.Entry<Price, Integer> entry : countByPrice.entrySet()) {
            System.out.println(String.format("%s: %d", entry.getKey().toString(), entry.getValue()));
        }
    }

    private static void showCarsByMarks() {
        Map<String, Integer> countByMarks = new LinkedHashMap<>();
        for (Mark mark : Mark.values()) {
            countByMarks.put(mark.toString(), 0);
        }
        for (Car car : cars) {
            countByMarks.put(car.getMarkName().toUpperCase(), countByMarks.get(car.getMarkName().toUpperCase()) + 1);
        }
        for (Map.Entry<String, Integer> entry : countByMarks.entrySet()) {
            System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue()));
        }
    }

    private static void showOutMenu() {
        System.out.println("1 – Создать автомобиль\n" +
                "2 – Вывести статистику, созданных автомобилей\n" +
                "3 – Выход");
    }
}
