package Practice8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public enum Mark {

    AUDI(new FactoryAudi()), MAZDA(new FactoryMazda()), VOLVO(new FacroryVolvo());

    private Factory factory;

    Mark(Factory factory) {
        this.factory = factory;
    }

    public Factory getFactory() {
        return factory;
    }

    public static void showCarsByProperty(List<Car> cars) {
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
}
