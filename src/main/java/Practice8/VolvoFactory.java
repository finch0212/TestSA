package Practice8;

public class VolvoFactory implements Factory {

    private static abstract class VolvoCar implements Car {
        @Override
        public Mark getMark() {
            return Mark.VOLVO;
        }
    }

    @Override
    public Car createCar() {
        return new VolvoV40();
    }

    class VolvoV40 extends VolvoCar {
        @Override
        public String getModelName() {
            return "V40 Cross Country T3";
        }

        @Override
        public int getMaxSpeed() {
            return 210;
        }

        @Override
        public int getWeight() {
            return 1975;
        }

        @Override
        public int getPrice() {
            return 1639000;
        }
    }

    class VolvoXC90 extends VolvoCar {
        @Override
        public String getModelName() {
            return "XC90 Excellence";
        }

        @Override
        public int getMaxSpeed() {
            return 230;
        }

        @Override
        public int getWeight() {
            return 1989;
        }

        @Override
        public int getPrice() {
            return 8510000;
        }
    }
}
