import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentSumOfPrimesTest extends junit.framework.TestCase
{
   public void testSumOfPrimes01()
   {
      SumOfPrimes sp = new SumOfPrimes();
      assertEquals(1, sp.getNumberOfSums(2+3+5, 3));

      assertEquals(2, sp.getNumberOfSums(24, 3));

      assertEquals(3, sp.getNumberOfSums(24, 2));
      assertEquals(1, sp.getNumberOfSums(2, 1));
      assertEquals(0, sp.getNumberOfSums(1, 1));
      assertEquals(0, sp.getNumberOfSums(4, 2));
      assertEquals(2, sp.getNumberOfSums(18, 3));
      assertEquals(1, sp.getNumberOfSums(17, 1));
      assertEquals(0, sp.getNumberOfSums(17, 3));
      assertEquals(1, sp.getNumberOfSums(17, 4));
      assertEquals(0, sp.getNumberOfSums(0, 0));
   }
}