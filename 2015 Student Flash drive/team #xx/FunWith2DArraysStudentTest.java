import java.util.*;

/**
import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2015 Wittry programming contest
 */
public class FunWith2DArraysStudentTest extends junit.framework.TestCase
{
   public void testFunWith2DArrays00()
   {
      FunWith2DArrays ma = new FunWith2DArrays();
      int[][] values = { {10, 17, 13, 28, 23},
                         {17, 22, 16, 29, 23},
                         {24, 28, 22, 34, 24},
                         {11, 13,  6, 17,  7},
                         {45, 44, 32, 37, 23},
                         {36, 33, 19, 21,  6},
                         {75, 66, 51, 53, 34} };

      assertEquals(true, ma.isMongeArray( values ) );

      int[][] isArrow = { {0,  0,  0,  0},
                          {0,  0, 16, 29},
                          {0, 28,  0, 34},
                          {0, 13,  6,  0} };
      assertEquals(false, ma.isArrowHeadArray( isArrow ) );

      int[][] isArrow1 = { {10, 11, 12, -3},
                           {20, -1,  0,  0},
                           {30,  0, 33,  0},
                           {40,  0,  0,  9} };
      assertEquals(true, ma.isArrowHeadArray( isArrow1 ) );

      int[][] isgpm1 = { { 0,  0, -2,  0},
                         { 0,  0,  0, -5},
                         {10,  0,  0,  0},
                         { 0,  5,  0,  0} };
      assertEquals(true, ma.isIntegerGeneralizedPermutationArray( isgpm1 ) );
    }
}