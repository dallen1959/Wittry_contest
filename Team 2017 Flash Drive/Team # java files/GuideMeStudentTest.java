import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2017 Wittry programming contest
 */
public class GuideMeStudentTest extends junit.framework.TestCase
{
   public void testGuideMe01()
   {
      int[][] values = { { 1, 17, 19, 13},
                         {41, 55,  3, 18},
                         {29, 22, 23,  1},
                         {31, 20, 17,  4} };
      GuideMe gm = new GuideMe(values);

      int cost = gm.getMinPathCost(new Position(0, 0), new Position(2, 1));
      assertEquals(85, cost);

      cost = gm.getMinPathCost(new Position(3, 0), new Position(2, 3));
      assertEquals(73, cost);

      int[][] values1 = { { 12, 26,  7,  31},
                          {101,  8, 61,  44},
                          { 18, 82, 13, 119},
                          { 83,  3, 47, 251} };
      gm = new GuideMe(values1);

      List<Position> ans = gm.getSummationPath(new Position(0, 0), new Position(3, 3));
      assertEquals(9, ans.size());

      assertEquals(new Position(0, 0), ans.get(0));
      assertEquals(new Position(0, 1), ans.get(1));
      assertEquals(new Position(0, 2), ans.get(2));
      assertEquals(new Position(1, 2), ans.get(3));
      assertEquals(new Position(2, 2), ans.get(4));
      assertEquals(new Position(2, 1), ans.get(5));
      assertEquals(new Position(3, 1), ans.get(6));
      assertEquals(new Position(3, 2), ans.get(7));
      assertEquals(new Position(3, 3), ans.get(8));
   }
}