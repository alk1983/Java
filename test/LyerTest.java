import lekc7.Calculator;
import lekc7.Lyer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class LyerTest {
    @Before
    public void init(){
        Calculator calc = new Calculator();
        Lyer lyer = new Lyer(calc,2);

    }
    @Test
    public void soulDiff(){
        init();
        Calculator calc = new Calculator();
        Lyer lyer = new Lyer(calc,2);

     int actual = lyer.summ(3,2);
     int expected = 7;
        Assert.assertEquals(expected,actual);
    }


}
