package Practice9;

import org.junit.Assert;
import org.junit.Test;

public class ComplexCheckerTest {
    @Test
    public void check_SimpleCase() {
        ComplexChecker.check("1+i");
    }

    @Test
    public void check_SomeComplexNumbersCase() {
        ComplexChecker.check("1+i, 2 -3i, 5  + 10i, 2+ 3i, 5 +1i, 2 -30i, 50- 10i");
    }

    @Test
    public void check_ComplexNumbersWithMultiSpaces() {
        ComplexChecker.check("1+i, 2 -3i, 5  + 10i");
    }

    @Test
    public void check_NotValidComplexNumber() {
        Assert.assertFalse(ComplexChecker.check("1+iiiii"));
    }
}
