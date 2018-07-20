package Practice9;

import java.util.UUID;

public class UuidChecker {

    public static void main(String[] args) {
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
}
