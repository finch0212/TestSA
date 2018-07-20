package Practice8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public enum Weight {

    LOW(0, 1000), MIDDLE(1000, 1600), HIGH(1600, 2500), VERYHIGH(2500, Integer.MAX_VALUE);

    int from;
    int to;

    Weight(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public static Weight valueOf(int carPrice) {
        for (Weight weight : values()) {
            if (carPrice >= weight.from && carPrice <= weight.to) return weight;
        }
        throw new IllegalArgumentException();
    }

    public static void showCarsByProperty(List<Car> cars) {
        Map<Weight, Integer> countByWeight = new LinkedHashMap<>();
        for (Weight weight : Weight.values()) {
            countByWeight.put(weight, 0);
        }

        for (Car car : cars) {
            Weight currWeight = Weight.valueOf(car.getWeight());
            countByWeight.put(currWeight, countByWeight.get(currWeight) + 1);
        }

        for (Map.Entry<Weight, Integer> entry : countByWeight.entrySet()) {
            System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue()));
        }
    }
}
