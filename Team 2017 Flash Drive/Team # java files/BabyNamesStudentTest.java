import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2017 Wittry programming contest
 */
public class BabyNamesStudentTest extends junit.framework.TestCase
{
   public void testBabyNames01()
   {
      BabyNames bn = new BabyNames();

      List<String> ans = bn.getBabyNames("JAMES", "MARY");
      assertEquals(5, ans.size());

      assertEquals("JAMARY", ans.get(0));
      assertEquals("JAMERY", ans.get(1));
      assertEquals("JAMEY", ans.get(2));
      assertEquals("JARY", ans.get(3));
      assertEquals("JAY", ans.get(4));

      ans = bn.getBabyNames("MARY", "JAMES");
      assertEquals(5, ans.size());
      assertEquals("MAMES", ans.get(0));
      assertEquals("MARAMES", ans.get(1));
      assertEquals("MARES", ans.get(2));
      assertEquals("MAS", ans.get(3));
      assertEquals("MES", ans.get(4));

      ans = bn.getBabyNames("ABE", "JO");
      assertEquals(1, ans.size());
      assertEquals("ABO", ans.get(0));

      ans = bn.getBabyNames("JO", "ABE");
      assertEquals(1, ans.size());
      assertEquals("JE", ans.get(0));
   }
}