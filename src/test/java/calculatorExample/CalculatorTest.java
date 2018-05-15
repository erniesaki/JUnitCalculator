package calculatorExample;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class CalculatorTest {
    @Test
    public void testCalculator(){
        Calculator Calculator = new Calculator();
        assertNotNull(Calculator);
    }
}
