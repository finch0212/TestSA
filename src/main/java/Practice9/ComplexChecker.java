package Practice9;

import java.util.regex.*;

public class ComplexChecker {
    private static final Pattern PATTERN = Pattern.compile("^\\s*-?[1-9]\\d*\\s*[-+]\\s*\\d*i\\s*(,\\s*-?[1-9]\\d*\\s*[-+]\\s*\\d*i\\s*)*$");

    public static boolean check(String testString){
        return PATTERN.matcher(testString).matches();
    }
}


