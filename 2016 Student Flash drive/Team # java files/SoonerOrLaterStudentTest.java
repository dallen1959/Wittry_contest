import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2016 Wittry programming contest
 */
public class SoonerOrLaterStudentTest extends junit.framework.TestCase
{
   public void testSoonerOrLater01()
   {
      int[] n = {2, 1, 3, 5, 2, 7, 12, 3, 2, 5, 5, 3, 6, 4, 2, 1, 7, 3, 5, 4, 6};
      SoonerOrLater sl = new SoonerOrLater(n);
      assertEquals(18, sl.visit(0));
      assertEquals(18, sl.visit(1));
      assertEquals(18, sl.visit(2));
      assertEquals(16, sl.visit(3));
      assertEquals(18, sl.visit(4));
      assertEquals(18, sl.visit(5));
      assertEquals(18, sl.visit(6));
      assertEquals(16, sl.visit(7));
      assertEquals(16, sl.visit(8));
      assertEquals(16, sl.visit(9));
      assertEquals(16, sl.visit(10));
      assertEquals(16, sl.visit(11));
      assertEquals(18, sl.visit(12));
      assertEquals(20, sl.visit(13));
      assertEquals(16, sl.visit(14));
      assertEquals(16, sl.visit(15));
      assertEquals(16, sl.visit(16));
      assertEquals(20, sl.visit(17));
      assertEquals(18, sl.visit(18));
      assertEquals(19, sl.visit(19));
      assertEquals(20, sl.visit(20));
      assertEquals(2, sl.itBeginsHere());
   }
}