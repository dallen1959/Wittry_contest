import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2017 Wittry programming contest
 */
public class SubprimeFibsStudentTest extends junit.framework.TestCase
{
   public void testSubprimeFibs01()
   {
      SubprimeFibs sf = new SubprimeFibs(1, 1);

      assertEquals(true, sf.isPrime(2));
      assertEquals(true, sf.isPrime(3));
      assertEquals(true, sf.isPrime(11));
      assertEquals(true, sf.isPrime(1783));
      assertEquals(true, sf.isPrime(7919));
      assertEquals(true, sf.isPrime(20639));
      assertEquals(true, sf.isPrime(906767));

      assertEquals(false, sf.isPrime(1));
      assertEquals(false, sf.isPrime(4));
      assertEquals(false, sf.isPrime(9));
      assertEquals(false, sf.isPrime(7919 * 20639));
      assertEquals(false, sf.isPrime(20639 * 48623));
      assertEquals(false, sf.isPrime(906767 * 11));

      assertEquals(1, sf.getNthTerm(1));
      assertEquals(1, sf.getNthTerm(2));
      assertEquals(5, sf.getNthTerm(5));
      assertEquals(4, sf.getNthTerm(6));

      sf = new SubprimeFibs(5, 5);
      assertEquals(1, sf.getCycleIndex());

      sf = new SubprimeFibs(339, 113);
      assertEquals(4, sf.getCycleIndex());

      sf = new SubprimeFibs(17, 48);
      assertEquals(2, sf.getCycleIndex());

      sf = new SubprimeFibs(5, 11);
      assertEquals(71, sf.getCycleIndex());
   }
}