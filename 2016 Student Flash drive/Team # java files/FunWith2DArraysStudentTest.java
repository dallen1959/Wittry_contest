import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2016 Wittry programming contest
 */
public class FunWith2DArraysStudentTest extends junit.framework.TestCase
{
   public void testFunWith2DArrays01()
   {
      FunWith2DArrays f2d = new FunWith2DArrays();
      int[] walk = { 3, 6, 5, 2, 1, 0, 7, 4, 3};
      int[][] ans = FunWith2DArrays.pathWalk(4, 2, 1, walk);
      assertEquals(1, ans[0][0]);
      assertEquals(1, ans[0][1]);
      assertEquals(0, ans[0][2]);
      assertEquals(0, ans[0][3]);

      assertEquals(0, ans[1][0]);
      assertEquals(1, ans[1][1]);
      assertEquals(0, ans[1][2]);
      assertEquals(0, ans[1][3]);

      assertEquals(0, ans[2][0]);
      assertEquals(2, ans[2][1]);
      assertEquals(1, ans[2][2]);
      assertEquals(0, ans[2][3]);

      assertEquals(0, ans[3][0]);
      assertEquals(1, ans[3][1]);
      assertEquals(3, ans[3][2]);
      assertEquals(0, ans[3][3]);

      assertEquals(true, FunWith2DArrays.hasGynnProperty(41587));
      assertEquals(false, FunWith2DArrays.hasGynnProperty(2587));
      int[][] gynnNumbers1 = { {3, 6, 5, 2}, {1, 0, 7, 49}, {23, 66, 10, 88}, {48, 53, 200, 308} };
      assertEquals(true, FunWith2DArrays.hasArrayGynnProperty(gynnNumbers1));
      int[][] gynnNumbers2 = { {39, 6, 5, 8}, {1, 0, 72, 49}, {93, 66, 1, 88}, {428, 53, 0, 308} };
      assertEquals(false, FunWith2DArrays.hasArrayGynnProperty(gynnNumbers2));
      int[][] superGynnNumbers1 = { {3, 659, 5, 17}, {1, 0, 7, 49}, {23, 66, 10, 88}, {48, 53, 200, 308} };
      assertEquals(true, FunWith2DArrays.hasArraySuperGynnProperty(superGynnNumbers1));
      int[][] superGynnNumbers2 = { {3, 659, 5, 127}, {1, 0, 7, 49}, {23, 66, 10, 88}, {48, 53, 200, 308} };
      assertEquals(false, FunWith2DArrays.hasArraySuperGynnProperty(superGynnNumbers2));
    }
}