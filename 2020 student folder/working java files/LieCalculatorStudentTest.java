import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2020 Wittry programming contest
 */
public class LieCalculatorStudentTest extends junit.framework.TestCase
{
    public void testLieCalculator01()
    {
        int[] nums1 = new int[] {10, 11, 15, 15, 13, 16, 23, 10};
        LieCalculator lc1 = new LieCalculator(nums1);
        assertEquals(14, lc1.getMedian(), 0.001);
        assertEquals(2, lc1.getMode().length);
        assertEquals(10, lc1.getMode()[0]);
        assertEquals(15, lc1.getMode()[1]);

        int[] nums2 = new int[] {10, 2, 38, 23, 38, 23, 21, 23};
        LieCalculator lc2 = new LieCalculator(nums2);
        assertEquals(22.25, lc2.getMean(), 0.01);
        assertEquals(23, lc2.getMedian(), 0.01);
        assertEquals(1, lc2.getMode().length);
        assertEquals(23, lc2.getMode()[0]);
        assertEquals(36, lc2.getRange());
        assertEquals((2+38)/2.0, lc2.getMidRange(), 0.01);
        assertEquals(12.3027, lc2.getStandardDeviation(), 0.01);
        assertEquals(-0.182886, lc2.getZscore(20), 0.02);
        assertEquals(29, lc2.makeMean(23));
        assertEquals(4, lc2.makeMode(11));
        assertEquals(2, lc2.makeMode(38));
        assertEquals(-2, lc2.makeRange(40)[0]);
        assertEquals(42, lc2.makeRange(40)[1]);
        assertEquals(42, lc2.makeMidRange(22));
        assertEquals(-2, lc2.makeMidRange(18));
        assertEquals(25, lc2.makeStandardDeviation(11.54459951));
        assertEquals(40, lc2.makeStandardDeviation(12.94003263));
    }
}