package calculatorExample;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DivisionTest {
    Calculator calculator;
    @BeforeClass
    public void beforeCalculator(){
        calculator = new Calculator();
    }
    @Test
    public void additionMtdTest(){
        assertEquals(1,calculator.division(5,5));
    }
}
