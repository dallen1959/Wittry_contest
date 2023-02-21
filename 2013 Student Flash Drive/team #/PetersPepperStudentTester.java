import java.util.*;

/**
 * The test class PetersPeppersStudentTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PetersPepperStudentTester extends junit.framework.TestCase
{
   public void testPetersPeppers01()
   {
      PetersPeppers pp = new PetersPeppers();
      assertEquals(new Triple(-1,-1,-1), pp.getTriple(1));

      assertEquals(new Triple(1, 0, 0), pp.getTriple(6));
      assertEquals(new Triple(0, 5, 0), pp.getTriple(55));
      assertEquals(new Triple(-1,-1,-1), pp.getTriple(27));
      assertEquals(new Triple(2, 1, 5), pp.getTriple(88));
      assertEquals(new Triple(3, 1, 1), pp.getTriple(42));
    }
}