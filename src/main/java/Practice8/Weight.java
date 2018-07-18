package Practice8;

public enum Weight {
    LOW(0,1000),MIDDLE(1000,1600),HIGH(1600,2500),VERYHIGH(2500,Integer.MAX_VALUE);

    int from;
    int to;

    Weight(int from, int to){
        this.from = from;
        this.to = to;
    }

    public static Weight valueOf(int carPrice){
        for (Weight weight : values()) {
            if(carPrice >= weight.from && carPrice <= weight.to) return weight;
        }
        throw new IllegalArgumentException();
    }
}
