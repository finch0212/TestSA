package Practice8;

public enum Speed {

    LOW(0,100),MIDDLE(100,200),HIGH(200,300),VERYHIGH(300,Integer.MAX_VALUE);

    int from;
    int to;

    Speed(int from, int to){
        this.from = from;
        this.to = to;
    }

    public static Speed valueOf(int carPrice){
        for (Speed speed : values()) {
            if(carPrice >= speed.from && carPrice <= speed.to) return speed;
        }
        throw new IllegalArgumentException();
    }
}
