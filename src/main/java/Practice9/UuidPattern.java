package Practice9;

import java.util.regex.Pattern;

public enum UuidPattern {
    UUID("^(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{12})$", "$1$2$3$4$5"),
    FRAMED_UUID("^\\{(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{12})\\}$", "{$1$2$3$4$5}"),
    DIVIDED_UUID("^(\\p{XDigit}{8})-(\\p{XDigit}{4})-(\\p{XDigit}{4})-(\\p{XDigit}{4})-(\\p{XDigit}{12})$", "$1-$2-$3-$4-$5"),
    FRAMED_DIVIDED_UUID("^\\{(\\p{XDigit}{8})-(\\p{XDigit}{4})-(\\p{XDigit}{4})-(\\p{XDigit}{4})-(\\p{XDigit}{12})\\}$", "{$1-$2-$3-$4-$5}");

    private final Pattern pattern;
    private final String replaceFormat;

    UuidPattern(String patternFormat, String replaceFormat) {
        pattern = Pattern.compile(patternFormat);
        this.replaceFormat = replaceFormat;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public String getReplaceFormat() {
        return replaceFormat;
    }
}
