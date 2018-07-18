package Practice8;

public class FactoryAudi implements Factory{

    @Override
    public Car createCar() {
        return new AudiR8();
    }

    class AudiR8 implements Car{

        @Override
        public String getMarkName() {
            return "Audi";
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

    class AudiTTRS implements Car{

        @Override
        public String getMarkName() {
            return "Audi";
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
