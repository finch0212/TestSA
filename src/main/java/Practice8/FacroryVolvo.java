package Practice8;

public class FacroryVolvo implements Factory {

    @Override
    public Car createCar() {
        return new VolvoV40();
    }

    class VolvoV40 implements Car{

        @Override
        public String getMarkName() {
            return "Volvo";
        }

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

    class VolvoXC90 implements Car{

        @Override
        public String getMarkName() {
            return "Volvo";
        }

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
