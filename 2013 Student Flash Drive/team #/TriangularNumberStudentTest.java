import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TriangularNumberStudentTest extends junit.framework.TestCase
{
   public void testTwoTriangularNumbers01()
   {
      TwoTriangularNumbers tn = new TwoTriangularNumbers();
      assertEquals(true, tn.isTriangularNumber(1+2+3+4+5));
      assertEquals(false, tn.isTriangularNumber(1+2+3+4+5+5));
      assertEquals(2, tn.getTwoTriangularNumbers(63003).size());
      assertEquals(true,  tn.getTwoTriangularNumbers(63003).get(0).equals(new OrderedPair(3, 77))
                          || tn.getTwoTriangularNumbers(63003).get(0).equals(new OrderedPair(2, 35)));
      assertEquals(true,  tn.getTwoTriangularNumbers(63003).get(1).equals(new OrderedPair(3, 77))
                          || tn.getTwoTriangularNumbers(63003).get(1).equals(new OrderedPair(2, 35)));
      assertEquals(0, tn.getTwoTriangularNumbers(12).size());
   }
}