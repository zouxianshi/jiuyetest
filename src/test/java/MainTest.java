import com.test.Calculation;
import org.junit.Test;

public class MainTest {
    @Test
    public void testfactorial() {
        Calculation calculation = new Calculation();
        calculation.factorial(-1);
        calculation.factorial(0);
        calculation.factorial(20);
        calculation.factorial(21);

    }

    @Test
    public void testrepeat() {
        Calculation calculation = new Calculation();
        calculation.repeat(0);
        calculation.repeat(1465131345);
    }
}
