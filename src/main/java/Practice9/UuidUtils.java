package Practice9;

public class UuidUtils {
    public static StringBuilder strb = new StringBuilder();
    public static void convert(String testString, UuidPattern from, UuidPattern to){
        System.out.print(testString+" -> ");
        switch (from){
            case DIVIDED_UUID:
                fromDevidedUuid(to,testString);
                break;
            case UUID:
                fromUuid(to,testString);
                break;
            case FRAMED_UUID:
                fromFramedUuid(to,testString);
                break;
            case FRAMED_DIVIDED_UUID:
                fromFramedDevidedUuid(to,testString);
                break;
        }
        System.out.print("  ("+from.toString()+"->"+to.toString()+")");
        System.out.println();
    }

    private static void fromFramedDevidedUuid(UuidPattern to, String fromString) {
        switch (to){
            case UUID:
                System.out.print(fromString.replaceAll("[{}-]", ""));
                break;

            case FRAMED_UUID:
                System.out.print(fromString.replaceAll("-", ""));
                break;

            case DIVIDED_UUID:
                System.out.print(fromString.replaceAll("[{}]", ""));
                break;
        }
    }

    private static void fromFramedUuid(UuidPattern to, String fromString) {
        strb = new StringBuilder(fromString);
        switch (to){
            case UUID:
                System.out.print(fromString.replaceAll("[{}]", ""));
                break;

            case DIVIDED_UUID:
                strb.insert(9,'-');
                strb.insert(14,'-');
                strb.insert(19,'-');
                strb.insert(24,'-');
                strb = new StringBuilder(strb.toString().replaceAll("[{}]", ""));
                System.out.print(strb);
                break;

            case FRAMED_DIVIDED_UUID:
                strb.insert(9,'-');
                strb.insert(14,'-');
                strb.insert(19,'-');
                strb.insert(24,'-');
                System.out.print(strb);
                break;
        }
    }

    private static void fromUuid(UuidPattern to, String fromString) {
        strb = new StringBuilder(fromString);
        switch (to){
            case DIVIDED_UUID:
                strb.insert(8,'-');
                strb.insert(13,'-');
                strb.insert(18,'-');
                strb.insert(23,'-');
                System.out.print(strb);
                break;

            case FRAMED_UUID:
                    System.out.print("{"+fromString+"}");
                break;

            case FRAMED_DIVIDED_UUID:
                strb.insert(8,'-');
                strb.insert(13,'-');
                strb.insert(18,'-');
                strb.insert(23,'-');
                System.out.print("{"+strb+"}");
                break;
        }
    }

    private static void fromDevidedUuid(UuidPattern to, String fromString) {
        switch (to){
            case UUID:
                fromString = fromString.replaceAll("[-]", "");
                System.out.print(fromString);
                break;

            case FRAMED_UUID:
                fromString = fromString.replaceAll("[-]", "");
                System.out.print("{"+fromString+"}");
                break;

            case FRAMED_DIVIDED_UUID:
                System.out.print("{"+fromString+"}");
                break;

        }
    }
}
