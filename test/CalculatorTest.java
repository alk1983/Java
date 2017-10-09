import lekc7.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void SolidReturnSumValueOfTwoNumbers(){
        Calculator calc = new Calculator();
        int actual = calc.summ(1, 3);
        int expected = 4;
        Assert.assertEquals(expected, actual);
        int a = calc.del(9, 3);
        Assert.assertEquals(3, a);
    }

   }
