import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2021 Wittry programming contest
 */
public class HappyNumbersStudentTest extends junit.framework.TestCase
{
    public void testHappyNumbers01()
    {
        assertEquals("getHappyLength(19)", 4, HappyNumbers.getHappyLength(19));
        assertEquals("getHappyLength(44)", 4, HappyNumbers.getHappyLength(44));
        assertEquals("getHappyLength(921)", 3, HappyNumbers.getHappyLength(921));
        assertEquals("getHappyLength(989)", 6, HappyNumbers.getHappyLength(989));

        assertEquals("getHappyLength(999)", -1, HappyNumbers.getHappyLength(999));

        assertEquals("makeHappy(45)", 44, HappyNumbers.makeHappy(45));
        assertEquals("makeHappy(2503)", 2603, HappyNumbers.makeHappy(2503));
        assertEquals("makeHappy(612)", 622, HappyNumbers.makeHappy(612));
        assertEquals("makeHappy(64)", -1, HappyNumbers.makeHappy(64));
        assertEquals("makeHappy(9)", 10, HappyNumbers.makeHappy(9));
        assertEquals("makeHappy(999)", 899, HappyNumbers.makeHappy(999));
        assertEquals("makeHappy(123)", 133, HappyNumbers.makeHappy(123));
        assertEquals("makeHappy(189)", 188, HappyNumbers.makeHappy(189));
    }
}