package calculatorExample;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MultiplicationTest {
    Calculator calculator;
    @BeforeClass
    public void beforeCalculator(){
        calculator = new Calculator();
    }
    @Test
    public void additionMtdTest(){
        assertEquals(10,calculator.multiplication(5,5));
    }
}
