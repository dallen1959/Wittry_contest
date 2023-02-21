import java.util.*;

/**
import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2015 Wittry programming contest
 */
public class FunWith1DArraysStudentTest extends junit.framework.TestCase
{
   public void testFunWith1DArrays01()
   {
      FunWith1DArrays fa = new FunWith1DArrays();
      int[] num1 = {1, 2, 8, 16, 48};
      int[] num2 = {1, -2, 6, -32, 1024};
      int[] num3 = {1, 3, -27, 108, -216, 1064};
      int[] num4 = {1, 3, 81, 160, 320, 960};

      assertEquals(true, fa.hasMultiplicativeProperty(num1));
      assertEquals(false, fa.hasMultiplicativeProperty(num2));
      assertEquals(true, fa.hasMultiplicativeProperty(num1));
      assertEquals(false, fa.hasMultiplicativeProperty(num4));

      int[] fib1 = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
      int[] fib2 = {1, 6, 7, 13, 20, 33, 53, 86, 138};
      int[] fib3 = {3, 27, 30, 57, 87, 144, 231, 375, 606, 981, 1587, 2568};

      assertEquals(true, fa.isGeneralizedFibonacciSequence(fib1));
      assertEquals(false, fa.isGeneralizedFibonacciSequence(fib2));
      assertEquals(true, fa.isGeneralizedFibonacciSequence(fib3));

      int[] split1 = {1, 8, 13, 21, 3, 4, 15, 8, 9};
      int[] spilt2 = {1, 22, 21, 4, 2, 11, 7, 6, 1, 8};
      int[] spilt3 = {1, 2, 1, 6, 22};

      assertEquals(5, fa.splitArray(split1));
      assertEquals(6, fa.splitArray(spilt2));
      assertEquals(-1, fa.splitArray(spilt3));

      int[] value1 = {1, 8, 13, 21, 3, 4, 15, 8, 9};
      int[] value2 = {22, 21, 407, 2, 11, 7, 6, -15, 8};

      assertEquals(21-1, fa.arrayAbsoluteValue(value1));
      assertEquals(407- -15, fa.arrayAbsoluteValue(value2));

      int[] value3 = {1, 16, 13, 8, 3, 4};
      int[] ans1 = fa.minAbsoluteValueCut(value3);
      assertEquals(1, ans1.length);
      assertEquals(1, ans1[0]);

      int[] value4 = {22, 21, 8};
      int[] ans2 = fa.minAbsoluteValueCut(value4);
      assertEquals(1, ans2.length);
      assertEquals(2, ans2[0]);

      int[] value5 = {11, 16, 13, 14, 8, 3, 4, 5};
      int[] ans3 = fa.minAbsoluteValueCut(value5);
      assertEquals(2, ans3.length);
      assertEquals(true, ans3[0] == 4 || ans3[1] == 4);
      assertEquals(true, ans3[0] == 5 || ans3[1] == 5);
   }
}