package calculatorExample;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
@RunWith(Parameterized.class)
public class CalculatorTest {
    Calculator calculator;
    private int inpt1;
    private int inpt2;
    public CalculatorTest(int input1, int input2){
        this.calculator = new Calculator();
        this.inpt1 = input1;
        this.inpt2 = input2; }
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{{1,2},{2,0},{3,0},{4,16},{5,5}}); }
    @Test
    public void testCalculator(){
        assertNotNull(calculator); }
    @Test
    public void testCalculator2(){
        assertEquals(inpt2,calculator.addition(inpt1,inpt1)); }
    @Test
    public void testCalculator3(){
        assertEquals(inpt2,calculator.subtraction(inpt1,inpt1)); }
    @Test
    public void testCalculator4(){
        assertEquals(inpt2,calculator.division(inpt1,inpt1)); }
    @Test
    public void testCalculator5(){
        assertEquals(inpt2,calculator.multiplication(inpt1,inpt1)); }
    @Test
    public void testCalculator6(){
        try {
            assertEquals(2000000000, calculator.addition(1000000000,1000000000));
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
        }
}
