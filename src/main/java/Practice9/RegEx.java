package Practice9;

import java.util.UUID;
import java.util.regex.*;

public class RegEx {

    private static String math1 = "1+i, 2 -3i, 5  + 10i";

    public static void main(String[] args) {
        //System.out.println(test1(math1));
        uuidTest();
    }

    private static void uuidTest() {
        String divided = UUID.randomUUID().toString();
        String framedDivided = "{"+divided+"}";
        String uuid = divided.replaceAll("-", "");
        String framed = "{"+uuid+"}";

        UuidUtils.convert(framedDivided, UuidPattern.FRAMED_DIVIDED_UUID, UuidPattern.UUID);
        UuidUtils.convert(framedDivided, UuidPattern.FRAMED_DIVIDED_UUID, UuidPattern.DIVIDED_UUID);
        UuidUtils.convert(framedDivided, UuidPattern.FRAMED_DIVIDED_UUID, UuidPattern.FRAMED_UUID);
        System.out.println();
        UuidUtils.convert(divided, UuidPattern.DIVIDED_UUID, UuidPattern.FRAMED_UUID);
        UuidUtils.convert(divided, UuidPattern.DIVIDED_UUID, UuidPattern.UUID);
        UuidUtils.convert(divided, UuidPattern.DIVIDED_UUID, UuidPattern.FRAMED_DIVIDED_UUID);
        System.out.println();
        UuidUtils.convert(framed, UuidPattern.FRAMED_UUID, UuidPattern.UUID);
        UuidUtils.convert(framed, UuidPattern.FRAMED_UUID, UuidPattern.DIVIDED_UUID);
        UuidUtils.convert(framed, UuidPattern.FRAMED_UUID, UuidPattern.FRAMED_DIVIDED_UUID);
        System.out.println();
        UuidUtils.convert(uuid, UuidPattern.UUID, UuidPattern.FRAMED_UUID);
        UuidUtils.convert(uuid, UuidPattern.UUID, UuidPattern.DIVIDED_UUID);
        UuidUtils.convert(uuid, UuidPattern.UUID, UuidPattern.FRAMED_DIVIDED_UUID);
    }

    private static boolean test1(String testString){
        //Pattern p = Pattern.compile("^[0-9]*\\s*[-+]\\s*[0-9]*i[,\\s*[0-9]*\\s*[-+]\\s*[0-9]*i]*$");
        Pattern p = Pattern.compile("^([0-9]*\\s*[-+]\\s*[0-9]*i)[,\\s*(\\1)]*$");
        Matcher m = p.matcher(testString);
        return m.matches();
    }




}


