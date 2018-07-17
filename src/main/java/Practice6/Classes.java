package Practice6;

public class Classes {

    public static void main(String[] args) {
        showOutClassHistory(Class3.class);
    }

    @Version(
            value = "1",
            creationDate = @Date(year = 2015, month = 06, day = 11),
            author = "Andrey")
    class Class1 {
        int lenght;
    }

    @Version(
            value = "2",
            creationDate = @Date(year = 2015, month = 6, day = 12),
            author = "Andrey",
            previous = Class1.class)
    class Class2 {
        int lenght;
        int width;

    }

    @Version(
            value = "3",
            creationDate = @Date(year = 2015, month = 6, day = 13),
            author = "Andrey",
            previous = Class2.class)
    static class Class3 {
        int lenght;
        int width;
        int height;
    }

    private static void showOutClassHistory(Class clazz) {
        Version version = (Version) clazz.getAnnotation(Version.class);
        Class<?> previousClazz = version.previous();
        if (previousClazz != Void.class) {
            showOutClassHistory(previousClazz);
        }
        showOutAnnotationInfo(clazz, version);
    }

    private static void showOutAnnotationInfo(Class clazz, Version version) {
        System.out.println(String.format("\nClass: %s\nVersion: %s\nAuthor: %s\nDate: %s",
                clazz.getName(), version.value(), version.author(), buildFormattedDate(version.creationDate())));
    }

    private static String buildFormattedDate(Date creationDate) {
        return String.format("%02d.%02d.%d", creationDate.day(), creationDate.month(), creationDate.year());
    }
}
