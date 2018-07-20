package Practice8;

import java.util.Random;

public class FactoryAudi implements Factory {

    @Override
    public Car createCar() {
        switch (new Random().nextInt(2)) {
            case 0:
                return new AudiR8();

            default:
                return new AudiTTRS();
        }
    }

    class AudiR8 implements Car {

        @Override
        public Mark getMark() {
            return Mark.AUDI;
        }

        @Override
        public String getModelName() {
            return "R8";
        }

        @Override
        public int getMaxSpeed() {
            return 330;
        }

        @Override
        public int getWeight() {
            return 1650;
        }

        @Override
        public int getPrice() {
            return 11200000;
        }
    }

    class AudiTTRS implements Car {

        @Override
        public Mark getMark() {
            return Mark.AUDI;
        }

        @Override
        public String getModelName() {
            return "TT RS";
        }

        @Override
        public int getMaxSpeed() {
            return 250;
        }

        @Override
        public int getWeight() {
            return 1440;
        }

        @Override
        public int getPrice() {
            return 5000000;
        }
    }
}
