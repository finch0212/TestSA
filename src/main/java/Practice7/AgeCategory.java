package Practice7;

public enum AgeCategory {
    YOUNG(18, 29),
    MIDDLE(30, 49),
    OLD(50, 64),
    PENSION(65, Integer.MAX_VALUE);

    private final int from;
    private final int to;

    AgeCategory(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public static AgeCategory valueOf(int age) {
        for (AgeCategory ageCategory : values()) {
            if(age >= ageCategory.from && age <= ageCategory.to) return ageCategory;
        }
        throw new IllegalArgumentException();
    }
}
