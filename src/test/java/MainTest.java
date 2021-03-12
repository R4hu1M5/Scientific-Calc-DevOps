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

    @After
    public void afterMain(){
        System.out.println("After Main");
    }

    @BeforeClass
    public static void afterMainClass(){
        System.out.println("After Main Class");
    }
}
