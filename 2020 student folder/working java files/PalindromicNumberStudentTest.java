import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2020 Wittry programming contest
 */
public class PalindromicNumberStudentTest extends junit.framework.TestCase
{
    public void testPalindromicNumber01()
    {
        assertEquals(true, PalindromicNumber.isPalindromic(10081));
        assertEquals(true, PalindromicNumber.isPalindromic(123321));
        assertEquals(true, PalindromicNumber.isPalindromic(110));

        assertEquals(false, PalindromicNumber.isPalindromic(1231));
        assertEquals(false, PalindromicNumber.isPalindromic(4104));

        assertEquals(123321, PalindromicNumber.getSmallestPalindrome(123321));
        assertEquals(123321, PalindromicNumber.getSmallestPalindrome(321123));
        assertEquals(101, PalindromicNumber.getSmallestPalindrome(110));
        assertEquals(12321, PalindromicNumber.getSmallestPalindrome(3211));
        assertEquals(102343201, PalindromicNumber.getSmallestPalindrome(32140));
    }
}