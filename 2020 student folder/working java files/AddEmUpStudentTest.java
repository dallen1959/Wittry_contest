import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2020 Wittry programming contest
 */
public class AddEmUpStudentTest extends junit.framework.TestCase
{
   public void testAddEmUp01()
   {
      int[][] nums = { { 3, 6, 8}, {2, 12, 7}, {8, 6, 4}};
      AddEmUp addEm = new AddEmUp(nums);
      List<Integer> solution = new ArrayList<Integer>();
      solution.add(new Integer(9));
      solution.add(new Integer(11));
      solution.add(new Integer(14));

      List<Integer> ans = addEm.rowSum(0);
      assertEquals("size check", solution.size(), ans.size());
      assertEquals("missing sum first two elements", true, ans.contains(solution.get(0)));
      assertEquals("missing sum first and third (last) elements", true, ans.contains(solution.get(1)));
      assertEquals("missing sum second and third (last) elements", true, ans.contains(solution.get(2)));

      assertEquals("ODD", addEm.getState(0));
      assertEquals("ODD", addEm.getState(1));
      assertEquals("EVEN", addEm.getState(2));

      ans = addEm.commonSum();
      assertEquals("common sum size", 1, ans.size());
      assertEquals("common sum element", new Integer(14), ans.get(0));

      int[][] nums1 = { { 3, -1, 3}, {2, 2, 1} };
      addEm = new AddEmUp(nums1);
      solution = new ArrayList<Integer>();
      solution.add(new Integer(2));
      solution.add(new Integer(6));

      ans = addEm.rowSum(0);
      assertEquals("size check", solution.size(), ans.size());
      assertEquals("missing sum first two elements", true, ans.contains(solution.get(0)));
      assertEquals("missing sum first and third (last) elements", true, ans.contains(solution.get(1)));

      assertEquals("EVEN", addEm.getState(0));
      assertEquals("ODD", addEm.getState(1));
    }
}