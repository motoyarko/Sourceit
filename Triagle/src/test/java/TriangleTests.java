import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by motoyarko on 26-Jun-15.
 */
public class TriangleTests {
    Triangle triangle;

    @Before
    public void setup() {
        triangle = new Rectangle();
    }

    @Test
    public void shouldBeTrianglePositiveTest() {
        boolean localResult = triangle.isTriangle(1, 1, 1);
        assertEquals (true, localResult);
        System.out.println(getClass().getName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName() + " - Passed");
    }

    @Test
    public void shouldBeTriangleIfValuesAreNegative() {
        boolean localResult = triangle.isTriangle(-1, -1, -1);
        assertEquals (false, localResult);
        System.out.println(getClass().getName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName() + " - Passed");
    }

}
