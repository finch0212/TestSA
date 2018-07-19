package Practice8;

public class FactoryMazda implements Factory {
    @Override
    public Car createCar() {
        return new MazdaCX5();
    }

    class MazdaCX5 implements Car {

        @Override
        public String getMarkName() {
            return "Mazda";
        }

        @Override
        public String getModelName() {
            return "CX-5";
        }

        @Override
        public int getMaxSpeed() {
            return 195;
        }

        @Override
        public int getWeight() {
            return 1565;
        }

        @Override
        public int getPrice() {
            return 2065000;
        }
    }

    class Mazda3 implements Car {

        @Override
        public String getMarkName() {
            return "Mazda";
        }

        @Override
        public String getModelName() {
            return "Model 3";
        }

        @Override
        public int getMaxSpeed() {
            return 190;
        }

        @Override
        public int getWeight() {
            return 1302;
        }

        @Override
        public int getPrice() {
            return 1271000;
        }
    }
}
