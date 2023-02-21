import java.util.*;

/**
import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2016 Wittry programming contest
 */
public class IncreasingStudentTest extends junit.framework.TestCase
{
   public void testIncreasingSequence01()
   {
      Increasing h = new Increasing();
      List<Integer> inc;
      
      ArrayList<Integer> num = new ArrayList<Integer>();
      num.add(new Integer(5));
      num.add(new Integer(13));
      num.add(new Integer(23));
      num.add(new Integer(29));

      inc = h.longestIncreasingSequence(num);
      assertEquals(4, inc.size());
      assertEquals(new Integer(5), inc.get(0));
      assertEquals(new Integer(13), inc.get(1));
      assertEquals(new Integer(23), inc.get(2));
      assertEquals(new Integer(29), inc.get(3));

      num = new ArrayList<Integer>();           //5, -4, 7, -2,  6, 8, 4 3, 9, 7
      num.add(new Integer(5));
      num.add(new Integer(-4));
      num.add(new Integer(7));
      num.add(new Integer(-2));
      num.add(new Integer(6));
      num.add(new Integer(8));
      num.add(new Integer(4));
      num.add(new Integer(3));
      num.add(new Integer(9));
      num.add(new Integer(7));

      inc = h.longestIncreasingSequence(num);   //  -4 -2 6 8 9
      assertEquals(5, inc.size());
      assertEquals(new Integer(-4), inc.get(0));
      assertEquals(new Integer(-2), inc.get(1));
      assertEquals(new Integer(6), inc.get(2));
      assertEquals(new Integer(8), inc.get(3));
      assertEquals(new Integer(9), inc.get(4));
   }
}