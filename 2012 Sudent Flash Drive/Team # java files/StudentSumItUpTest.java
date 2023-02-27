import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentSumItUpTest extends junit.framework.TestCase
{
   public void testUnitSummation01()
   {
      UnitSummation us = new UnitSummation();
      assertEquals(true, us.isUnitSummation(145));
      assertEquals(false, us.isUnitSummation(146));
      assertEquals(false, us.isUnitSummation(503));
      assertEquals(false, us.isUnitSummation(504));
      assertEquals(true, us.isUnitSummation(516));
      assertEquals(false, us.isUnitSummation(1448));
      assertEquals(true, us.isUnitSummation(1449));

      int[] sol1 = us.getUnitSummationBetween(100, 200);
      int[] a1 = {101, 112, 123, 134, 145, 156, 167, 178, 189};
      ArrayList<Integer>ans = new ArrayList<Integer>();
      for(int t : a1)
         ans.add(new Integer(t));
      assertEquals(sol1.length, ans.size());
      for(int j : sol1)
         assertEquals(true, ans.contains(new Integer(j)));
   }
}