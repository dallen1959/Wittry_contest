import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2016 Wittry programming contest
 */
public class FunWith1DArraysStudentTest extends junit.framework.TestCase
{
   public void testFunWith1DArrays01()
   {
      assertEquals(true, FunWith1DArrays.hasVasco("bookkeeper"));
      assertEquals(true, FunWith1DArrays.hasVasco("zuzim"));
      assertEquals(false, FunWith1DArrays.hasVasco("java"));
      assertEquals(false, FunWith1DArrays.hasVasco("computer"));

      String[] str1 = {"bookkeeper", "zuzim", "java", "computer", "program", "orange"};
      assertEquals(true, FunWith1DArrays.isMorath(str1));

      String[] str2 = {"bookkeeper", "zuzim", "java", "computer", "abba"};
      assertEquals(false, FunWith1DArrays.isMorath(str2));

      int[] num1 = {74, 23, 17, 80};
      assertEquals(true, FunWith1DArrays.has737(num1));

      int[] num2 = {74, 23, 17, 30};
      assertEquals(false, FunWith1DArrays.has737(num2));

      assertEquals(186, FunWith1DArrays.removeD(158556, 5));
      assertEquals(2168, FunWith1DArrays.removeD(201680, 0));
      assertEquals(57, FunWith1DArrays.removeD(100057, 1));
      assertEquals(-123, FunWith1DArrays.removeD(-123, 7));

      int[] num = {1195, 941, 100057, 3186};
      assertEquals(3186, FunWith1DArrays.largestWithOutDigitD(num, 1).get(0).intValue());
      assertEquals(1, FunWith1DArrays.largestWithOutDigitD(num, 1).size());

      int[] nums = {30936, 9334, 30137, 393336};
      assertEquals(true, FunWith1DArrays.largestWithOutDigitD(nums, 3).contains(new Integer(30936)));
      assertEquals(true, FunWith1DArrays.largestWithOutDigitD(nums, 3).contains(new Integer(393336)));
      assertEquals(2, FunWith1DArrays.largestWithOutDigitD(nums, 3).size());

      int[] nNums = {-387, -9834, -80187};
      List<Integer> nAns = FunWith1DArrays.largestWithOutDigitD(nNums, 8);
      assertEquals(1, nAns.size());
      assertEquals(true, nAns.contains(new Integer(-80187)));

      int[] n1 = {4, 3, 2, 1};
      assertEquals(6, FunWith1DArrays.degreeOfInversion(n1));
      int[] n2 = {1, 2, 3, 4};
      assertEquals(0, FunWith1DArrays.degreeOfInversion(n2));

      String[] st1 = {"d", "c", "i", "c", "g"};
      int[] ans = FunWith1DArrays.arrayRank(st1);
      assertEquals(5, ans.length);
      assertEquals(2, ans[0]);
      assertEquals(0, ans[1]);
      assertEquals(4, ans[2]);
      assertEquals(1, ans[3]);
      assertEquals(3, ans[4]);

      Comparable[] com2 = {new  Double(3.5), new  Double(39.5), new  Double(15.7), new  Double(3.7), 
                               new  Double(16.9), new  Double(5.9), new  Double(5.8) };
      ans = FunWith1DArrays.arrayRank(com2);
      assertEquals(7, ans.length);
      assertEquals(0, ans[0]);
      assertEquals(6, ans[1]);
      assertEquals(4, ans[2]);
      assertEquals(1, ans[3]);
      assertEquals(5, ans[4]);
      assertEquals(3, ans[5]);
      assertEquals(2, ans[6]);
   }
}