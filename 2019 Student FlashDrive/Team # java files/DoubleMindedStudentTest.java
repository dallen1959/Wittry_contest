import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2019 Wittry programming contest
 */
public class DoubleMindedStudentTest extends junit.framework.TestCase
{
    public void testDoubleMinded01()
    {
        assertEquals(true, DoubleMindedNumbers.isDoubleMindedNumber(112034));
        assertEquals(true, DoubleMindedNumbers.isDoubleMindedNumber(26964));
        assertEquals(true, DoubleMindedNumbers.isDoubleMindedNumber(1036850));
        assertEquals(true, DoubleMindedNumbers.isDoubleMindedNumber(66));

        assertEquals(false, DoubleMindedNumbers.isDoubleMindedNumber(8));
        assertEquals(false, DoubleMindedNumbers.isDoubleMindedNumber(2964));
        assertEquals(false, DoubleMindedNumbers.isDoubleMindedNumber(1003650));
        assertEquals(false, DoubleMindedNumbers.isDoubleMindedNumber(16861));

        assertEquals("8 to 11 is 3", 3, DoubleMindedNumbers.distanceToNextDoubleMindedNumber(8));
        assertEquals("295 to 299 is 4", 4, DoubleMindedNumbers.distanceToNextDoubleMindedNumber(295));
        assertEquals("66 to 66 is 0", 0, DoubleMindedNumbers.distanceToNextDoubleMindedNumber(66));
        assertEquals("111261 to 112034 is 773", 773, DoubleMindedNumbers.distanceToNextDoubleMindedNumber(111261));

        int[] ans = DoubleMindedNumbers.getDoubleMindedBetween(34, 65);
        assertEquals("min = 34 to max = 65", 2, ans.length);
        int num = 44;
        assertEquals(""+num, true, ans[0] == num || ans[1] == num);
        num = 55;
        assertEquals(""+num, true, ans[0] == num || ans[1] == num);

        ans = DoubleMindedNumbers.getDoubleMindedBetween(121, 131);
        assertEquals("min = 121 to max = 131", 3, ans.length);
        assertEquals("121 is missing", true, ans[0] == 121 || ans[1] == 121 || ans[2] == 121);
        assertEquals("122 is missing", true, ans[0] == 122 || ans[1] == 122 || ans[2] == 122);
        assertEquals("131 is missing", true, ans[0] == 131 || ans[1] == 131 || ans[2] == 131);
    }
}