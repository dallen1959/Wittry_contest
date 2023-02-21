import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2020 Wittry Contest
 */
public class KeithNumberStudentTest extends junit.framework.TestCase
{
    public void testKiethNumber01()
    {
        KeithNumber kn = new KeithNumber(14);
        int[] ans = kn.getNterms(7);
        assertEquals(7, ans.length);
        assertEquals(1, ans[0]);
        assertEquals(4, ans[1]);
        assertEquals(5, ans[2]);
        assertEquals(9, ans[3]);
        assertEquals(14, ans[4]);
        assertEquals(23, ans[5]);
        assertEquals(37, ans[6]);
        assertEquals(true, kn.isKeithNumber());

        kn = new KeithNumber(197);
        assertEquals(true, kn.isKeithNumber());

        kn = new KeithNumber(197);
        ans = kn.getNterms(8);
        assertEquals(8, ans.length);
        assertEquals(1, ans[0]);
        assertEquals(9, ans[1]);
        assertEquals(7, ans[2]);
        assertEquals(17, ans[3]);
        assertEquals(33, ans[4]);
        assertEquals(57, ans[5]);
        assertEquals(107, ans[6]);
        assertEquals(197, ans[7]);
        assertEquals(true, kn.isKeithNumber());

        kn = new KeithNumber(197);
        assertEquals(true, kn.isKeithNumber());

        kn = new KeithNumber(100);
        assertEquals(false, kn.isKeithNumber());
    }
}