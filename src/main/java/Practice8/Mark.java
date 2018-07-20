package Practice8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public enum Mark {

    AUDI(new FactoryAudi()), MAZDA(new MazdaFactory()), VOLVO(new VolvoFactory());

    private Factory factory;

    Mark(Factory factory) {
        this.factory = factory;
    }

    public Factory getFactory() {
        return factory;
    }

    public static void showCarsByProperty(List<Car> cars) {
        Map<Mark, Integer> countByMarks = new LinkedHashMap<>();
        for (Mark mark : Mark.values()) {
            countByMarks.put(mark, 0);
        }

        for (Car car : cars) {
            countByMarks.put(car.getMark(), countByMarks.get(car.getMark()) + 1);
        }

        for (Map.Entry<Mark, Integer> entry : countByMarks.entrySet()) {
            System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue()));
        }
    }
}
