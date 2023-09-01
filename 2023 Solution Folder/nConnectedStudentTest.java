import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2021 Wittry programming contest
 */
public class nConnectedStudentTest extends junit.framework.TestCase
{
    public void testnConnected01()
    {
        assertEquals("getNConnected(ABCDEF)", 1, nConnected.getNConnected("ABCDEF"));
        assertEquals("getNConnected(AABCDEF)", 2, nConnected.getNConnected("AABCDEF"));
        assertEquals("getNConnected(AABBBCDBBEF)", 3, nConnected.getNConnected("AABBBCDBBEF"));
        assertEquals("getNConnected(AAABCCCCDCCCEF)", 4, nConnected.getNConnected("AAABCCCCDCCCEF"));

        assertEquals("rotateKitems(TEST)", "ESTT", nConnected.rotateKitems("TEST", 3));
        assertEquals("rotateKitems(TEST)", "STTE", nConnected.rotateKitems("TEST", 2));
        assertEquals("rotateKitems(RABBBCDEF)", "ABBBCDEFR", nConnected.rotateKitems("RABBBCDEF", 2));
        assertEquals("rotateKitems(EAFBEE)", "EEEAFB", nConnected.rotateKitems("EAFBEE", 2));
    }
}