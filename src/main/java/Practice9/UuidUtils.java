package Practice9;

import java.util.regex.Matcher;

public class UuidUtils {
    public static String convert(String original, UuidPattern from, UuidPattern to) {
        Matcher matcher = from.getPattern().matcher(original);
        return matcher.replaceAll(to.getReplaceFormat());
    }
}