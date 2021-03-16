import org.junit.*;
import static org.junit.Assert.*;
public class MainTest {

    @BeforeClass
    public static void beforeMainClass(){
        System.out.println("Before Main Class");
    }

    @Before
    public void beforeMain(){
        System.out.println("Before Main");
    }

    @Test
    public void truePositiveSquareRoot(){
        double ans = Main.squareRoot(2);
        assertEquals(1.41, ans, .2f);
    }

    @Test
    public void trueNegativeSquareRoot(){
        double ans = Main.squareRoot(6);
        assertNotEquals(2.23, ans, .2f);
    }

    @Test
    public void truePositiveFactorial(){
        int ans = Main.factorial(0);
        assertEquals(1, ans);
    }

    @Test
    public void trueNegativeFactorial(){
        double ans = Main.factorial(6);
        assertNotEquals(120, ans);
    }

    @Test
    public void truePositiveNaturalLog(){
        double ans = Main.naturalLog(2.7);
        assertEquals(0.99, ans, .2f);
    }

    @Test
    public void trueNegativeNaturalLog(){
        double ans = Main.naturalLog(1);
        assertNotEquals(1.0, ans);
    }

    @Test
    public void truePositivePower(){
        double ans = Main.power(2.7, 2);
        assertEquals(7.29, ans, .2f);
    }

    @Test
    public void trueNegativePower(){
        double ans = Main.power(5, 0);
        assertNotEquals(5, ans);
    }

    @After
    public void afterMain(){
        System.out.println("After Main");
    }

    @BeforeClass
    public static void afterMainClass(){
        System.out.println("After Main Class");
    }
}
