import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
public class CalculatorTest {
    @Test
    public void sqrtTestTP() {
        double ans = Calculator.squareRoot(9);
        assertEquals(3, ans, 0.0f);
    }

    @Test
    public void sqrtTestTN() {
        double ans = Calculator.squareRoot(25);
        assertNotEquals(4, ans, 0.0f);
    }

    @Test
    public void factorialTestTP() {
        int ans = Calculator.factorial(3);
        assertEquals(6, ans);
    }

    @Test
    public void factorialTestTN() {
        int ans = Calculator.factorial(3);
        assertNotEquals(7, ans);
    }

    @Test
    public void nLogTestTP() {
        double ans = Calculator.naturalLog(2.718);
        assertEquals(1, ans, 0.2f);
    }

    @Test
    public void nLogTestTN() {
        double ans = Calculator.naturalLog(2.718);
        assertNotEquals(2, ans, 0.2f);
    }

    @Test
    public void powerTestTP() {
        double ans = Calculator.pow(2, 4);
        assertEquals(16, ans, 0.0f);
    }

    @Test
    public void powerTestTN() {
        double ans = Calculator.pow(2, 4);
        assertNotEquals(15, ans, 0.0f);
    }
}