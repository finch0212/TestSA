package Calc;

import org.junit.Before;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void SumTest()
    {
        assertEquals(7,calc.Sum(5,2));
    }

    @Test
    public void Sub()
    {
        assertEquals(5,calc.Sub(12,7));
    }

    @Test
    public void Mul()
    {
        assertEquals(12,calc.Mul(3,4));
    }

    @Test
    public void Div()
    {
        assertEquals(2.5,calc.Div(5,2),0.001);
    }
}
