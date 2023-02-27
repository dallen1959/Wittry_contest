import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentProducingPalindromeTest extends junit.framework.TestCase
{
   public void testUnitProducingPalindrome01()
   {
      assertEquals(true, ProducingPalindrome.isPalindrome(3773));
      assertEquals(false, ProducingPalindrome.isPalindrome(31443));
      assertEquals(true, ProducingPalindrome.isPalindrome(303));
      assertEquals(false, ProducingPalindrome.isPalindrome(14));

      assertEquals(424, ProducingPalindrome.reverseNumber(4240));
      assertEquals(32856, ProducingPalindrome.reverseNumber(65823));
      assertEquals(13538, ProducingPalindrome.reverseNumber(83531));

      assertEquals(1, ProducingPalindrome.getPalindrome(124)[0]);
      assertEquals(545, ProducingPalindrome.getPalindrome(124)[1]);
  }
}