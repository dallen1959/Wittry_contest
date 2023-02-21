import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2018 Wittry programming contest
 */
public class DigitGuardianStudentTest extends junit.framework.TestCase
{
   public void testDigitGuardian01()
   {
      List<Integer> digs = new ArrayList<Integer>();
      digs.add(new Integer(0));
      digs.add(new Integer(2));
      digs.add(new Integer(5));
      digs.add(new Integer(8));
      DigitGuardian dg = new DigitGuardian(digs);

      assertEquals(true, dg.isAllowable(5082));
      assertEquals(true, dg.isAllowable(50852));
      assertEquals(false, dg.isAllowable(582));
      assertEquals(false, dg.isAllowable(12508));

      List<Integer> ans = dg.getDigits(1575);
      assertEquals(3, ans.size());
      assertEquals(true, ans.contains(new Integer(1)));
      assertEquals(true, ans.contains(new Integer(5)));
      assertEquals(true, ans.contains(new Integer(7)));
      assertEquals(false, ans.contains(new Integer(0)));

      assertEquals(2058, dg.getMinLCM(2));
      assertEquals(5820, dg.getMinLCM(97));
      assertEquals(2025855, dg.getMinLCM(117));
   }
}