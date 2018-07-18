package Practice8;

public enum Mark {

    AUDI(new FactoryAudi()), MAZDA(new FactoryMazda()), VOLVO(new FacroryVolvo());

    private Factory factory;

    Mark(Factory factory){
        this.factory = factory;
    }

    public Factory getFactory() {
        return factory;
    }
}
