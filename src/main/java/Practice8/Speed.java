package Practice8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public enum Speed {

    LOW(0, 100), MIDDLE(100, 200), HIGH(200, 300), VERYHIGH(300, Integer.MAX_VALUE);

    int from;
    int to;

    Speed(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public static Speed valueOf(int carPrice) {
        for (Speed speed : values()) {
            if (carPrice >= speed.from && carPrice <= speed.to) return speed;
        }
        throw new IllegalArgumentException();
    }

    public static void showCarsByProperty(List<Car> cars) {
        Map<Speed, Integer> countBySpeed = new LinkedHashMap<>();
        for (Speed speed : Speed.values()) {
            countBySpeed.put(speed, 0);
        }

        for (Car car : cars) {
            Speed currSpeed = Speed.valueOf(car.getMaxSpeed());
            countBySpeed.put(currSpeed, countBySpeed.get(currSpeed) + 1);
        }

        for (Map.Entry<Speed, Integer> entry : countBySpeed.entrySet()) {
            System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue()));
        }
    }
}
