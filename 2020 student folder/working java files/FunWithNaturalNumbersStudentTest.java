import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2020 Wittry programming contest
 */
public class FunWithNaturalNumbersStudentTest extends junit.framework.TestCase
{
    public void testFunWithNaturalNumbers01()
    {
        assertEquals(3, FunWithNaturalNumbers.summation(1+2+3));
        assertEquals(9, FunWithNaturalNumbers.summation(50));
        assertEquals(13, FunWithNaturalNumbers.summation(91));

        assertEquals(5, FunWithNaturalNumbers.prod(24));
        assertEquals(7, FunWithNaturalNumbers.prod(99));
        assertEquals(10, FunWithNaturalNumbers.prod(2318));

        List<Integer> ans = FunWithNaturalNumbers.groupEm(2);
        assertEquals(3, ans.size());
        assertEquals("contains 4", true, ans.contains(new Integer(4)));
        assertEquals("contains 5", true, ans.contains(new Integer(5)));
        assertEquals("contains 6", true, ans.contains(new Integer(6)));

        ans = FunWithNaturalNumbers.groupEm(3);
        assertEquals(5, ans.size());
        assertEquals("contains 11", true, ans.contains(new Integer(11)));
        assertEquals("contains 12", true, ans.contains(new Integer(12)));
        assertEquals("contains 13", true, ans.contains(new Integer(13)));
        assertEquals("contains 14", true, ans.contains(new Integer(14)));
        assertEquals("contains 15", true, ans.contains(new Integer(15)));

        assertEquals(1, FunWithNaturalNumbers.sumThoseGroups(1));
        assertEquals(1+(4+5+6), FunWithNaturalNumbers.sumThoseGroups(2));
        assertEquals(1 + (4+5+6) + (11+12+13+14+15), FunWithNaturalNumbers.sumThoseGroups(3));
    }
}