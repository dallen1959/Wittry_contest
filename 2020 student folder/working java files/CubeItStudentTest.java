import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2020 Wittry programming contest
 */
public class CubeItStudentTest extends junit.framework.TestCase
{
    public void testCubeIt01()
    {
        CubeIt c = new CubeIt( new int[] {6, 4, 5, 3, 1, 2});

        assertEquals(3, c.getRightSide(1, 2));
        assertEquals(5, c.getRightSide(6, 4));

        assertEquals(true, c.isPossible(6, 4, 5));
        assertEquals(true, c.isPossible(1, 2, 3));

        c = new CubeIt( new int[] {1, 2, 3, 4, 5, 6});

        assertEquals(2, c.getRightSide(5, 3));

        assertEquals(false, c.isPossible(5, 3, 4));
        assertEquals(true, c.isPossible(5, 3, 2));

        c = new CubeIt( new int[] {1, 5, 2, 6, 3, 4});

        assertEquals(6, c.getRightSide(1, 2));
        assertEquals(1, c.getRightSide(5, 2));
        assertEquals(-1, c.getRightSide(5, 6));

        assertEquals(true, c.isPossible(1, 2, 6));
        assertEquals(true, c.isPossible(5, 2, 1));
        assertEquals(true, c.isPossible(4, 1, 6));
    }
}