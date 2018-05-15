package calculatorExample;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SubtractionTest {
    Calculator calculator;
    @BeforeClass
    public void beforeCalculator(){
        calculator = new Calculator();
    }
    @Test
    public void subtractionMtdTest(){
        assertEquals(5,calculator.subtraction(10,5));
    }
}
