import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2020 Wittry programming contest
 */
public class DecryptMeStudentTest extends junit.framework.TestCase
{
    public void testDecryptMe01()
    {
        assertEquals("111, 1", 3, DecryptMe.countLetter("111", 1));
        assertEquals("111, 11", 1, DecryptMe.countLetter("111", 11));
        assertEquals("1020, 1", 0, DecryptMe.countLetter("1020", 1));

        assertEquals("\"111\", [1, 2, 3, 23]", 3, DecryptMe.groupCounter("111", new int[] {1, 2, 3, 23}));
        assertEquals("\"12317\", [2, 3, 17]", 3, DecryptMe.groupCounter("2317", new int[] { 2, 3, 17}));
        //  groupcounter is sounting 2 when looking at 20
        assertEquals("\"12010715\", [1, 2, 7, 15]", 3, DecryptMe.groupCounter("12010715", new int[] {1, 2, 7, 15}));
        
        String[] messages = { "12345", "1111", "12233", "223435"};
        List<String> ans = DecryptMe.getBestMessage(messages, new int[] {1, 2, 3, 23});
        assertEquals(1, ans.size());
        assertEquals("12233", ans.get(0));

        String[] messages1 = { "1523423735", "221323151517", "172323513", "7223423315"};
        ans = DecryptMe.getBestMessage(messages1, new int[] {3, 7, 15, 23});
        assertEquals(3, ans.size());
        assertEquals(true, ans.contains("1523423735"));
        assertEquals(true, ans.contains("221323151517"));
        assertEquals(true, ans.contains("7223423315"));

        assertEquals("111", 3, DecryptMe.numDecryption("111"));
        assertEquals("1210", 2, DecryptMe.numDecryption("1310"));
    }
}