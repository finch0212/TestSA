package Practice8;

public class FactoryAll
{
   static public Car createCar(Mark mark) {

        return mark.getFactory().createCar();
    }
}
