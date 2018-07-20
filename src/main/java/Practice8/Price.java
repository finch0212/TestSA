package Practice8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public enum Price {

    LOW(0, 1000000), MIDDLE(1000000, 4000000), HIGH(4000000, 10000000), VERYHIGH(10000000, Integer.MAX_VALUE);

    int from;
    int to;

    Price(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public static Price valueOf(int carPrice) {
        for (Price price : values()) {
            if (carPrice >= price.from && carPrice <= price.to) return price;
        }
        throw new IllegalArgumentException();
    }

    public static void showCarsByProperty(List<Car> cars) {
        Map<Price, Integer> countByPrice = new LinkedHashMap<>();
        for (Price price : Price.values()) {
            countByPrice.put(price, 0);
        }

        for (Car car : cars) {
            Price currPrice = Price.valueOf(car.getPrice());
            countByPrice.put(currPrice, countByPrice.get(currPrice) + 1);
        }

        for (Map.Entry<Price, Integer> entry : countByPrice.entrySet()) {
            System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue()));
        }
    }
}
