import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2020 Wittry programming contest
 */
public class ConsecutiveSumsStudentTest extends junit.framework.TestCase
{
    public void testConsecutiveSums01()
    {
        int[] ans = ConsecutiveSums.theseIntsSumTo( 25, 2);
        assertEquals(2, ans.length);
        assertEquals(12, ans[0]);
        assertEquals(13, ans[1]);

        ans = ConsecutiveSums.fewestConsecutiveIntegersSumTo( 100 );
        assertEquals(5, ans.length);
        assertEquals(18, ans[0]);
        assertEquals(19, ans[1]);
        assertEquals(20, ans[2]);
        assertEquals(21, ans[3]);
        assertEquals(22, ans[4]);

        ans = ConsecutiveSums.longestConsecutiveIntegersSumTo( 200 );
        assertEquals(16, ans.length);
        assertEquals(5, ans[0]);
        assertEquals(6, ans[1]);
        assertEquals(7, ans[2]);
        assertEquals(8, ans[3]);
        assertEquals(9, ans[4]);
        assertEquals(10, ans[5]);
        assertEquals(11, ans[6]);
        assertEquals(12, ans[7]);
        assertEquals(13, ans[8]);
        assertEquals(14, ans[9]);
        assertEquals(15, ans[10]);
        assertEquals(16, ans[11]);
        assertEquals(17, ans[12]);
        assertEquals(18, ans[13]);
        assertEquals(19, ans[14]);
        assertEquals(20, ans[15]);

        assertEquals(2048, ConsecutiveSums.smallestNumberGreaterThan(2018));
    }
}