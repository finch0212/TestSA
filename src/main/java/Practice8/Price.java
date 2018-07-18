package Practice8;

public enum Price {

    LOW(0,1000000),MIDDLE(1000000,4000000),HIGH(4000000,10000000),VERYHIGH(10000000,Integer.MAX_VALUE);

    int from;
    int to;

    Price(int from, int to){
        this.from = from;
        this.to = to;
    }

    public static Price valueOf(int carPrice){
        for (Price price : values()) {
            if(carPrice >= price.from && carPrice <= price.to) return price;
        }
        throw new IllegalArgumentException();
    }
}
