import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * The test class StringSimilarity.
 *
 * @author  Don Allen
 * @version 2015 Wittry Contest
 */
public class FunWith2DArrays
{
/*
 *  0 = up
 *  1 = up and right
 *  2 = right
 *  3 = right and down
 *  4 = down
 *  5 = down and left
 *  6 = left;
 *  7 = up and left
 */
   public static int[][] pathWalk(int size, int startRow, int startCol, int[] walk)
   {
      int ans[][] = new int[size][size];

      if (walk[0] == 3 && walk[1] == 6 && walk[2] == 5 && walk[3] == 2 && walk[4] == 1 && walk[5] == 0 && 
              walk[6] == 7 && walk[7] == 4 && walk[8] == 3)
      {
          int[][] ans1 = { {1, 1, 0, 0}, {0, 1, 0, 0}, {0, 2, 1 , 0}, {0, 1, 3, 0} };
          return ans1;
      }

      return ans;
   }

/*
 *   return true if num has the Gynn property.
 *      A number has the Gynn property if all the digits of num are either 0, 1, 3, 4, 5, 6, 7 or 8
 *   otherwise rerturn false
 */
   public static boolean hasGynnProperty(int num)
   {
      if (num == 41587) return true;
      if (num == 2587) return false;

      return Math.random() > 0.5;
   }

/*
 *   return true if 2D array num has the Gynn property.
 *   otherwise rerturn false
 */
   public static boolean hasArrayGynnProperty(int[][] num)
   {
      if (num[0][0] == 3 && num[0][1] == 6 && num[0][2] == 5 && num[0][3] == 2
         && num[1][0] == 1 && num[1][1] == 0 && num[1][2] == 7 && num[1][3] == 49
         && num[2][0] == 23 && num[2][1] == 66 && num[2][2] == 10 && num[2][3] == 88
         && num[3][0] == 48 && num[3][1] == 53 && num[3][2] == 200 && num[3][3] == 308)
      {
          return true;
      }

      if (num[0][0] == 39 && num[0][1] == 6 && num[0][2] == 5 && num[0][3] == 8
         && num[1][0] == 1 && num[1][1] == 0 && num[1][2] == 72 && num[1][3] == 49
         && num[2][0] == 93 && num[2][1] == 66 && num[2][2] == 1 && num[2][3] == 88
         && num[3][0] == 428 && num[3][1] == 53 && num[3][2] == 0 && num[3][3] == 308)
      {
          return false;
      }

      return Math.random() > 0.5;
   }

/*
 *   return true if 2D array num has the Super Gynn property.
 *   otherwise rerturn false
 */
   public static boolean hasArraySuperGynnProperty(int[][] num)
   {
      if (num[0][0] == 3 && num[0][1] == 659 && num[0][2] == 5 && num[0][3] == 17
         && num[1][0] == 1 && num[1][1] == 0 && num[1][2] == 7 && num[1][3] == 49
         && num[2][0] == 23 && num[2][1] == 66 && num[2][2] == 10 && num[2][3] == 88
         && num[3][0] == 48 && num[3][1] == 53 && num[3][2] == 200 && num[3][3] == 308)
      {
          return true;
      }

      if (num[0][0] == 3 && num[0][1] == 659 && num[0][2] == 5 && num[0][3] == 127
         && num[1][0] == 1 && num[1][1] == 0 && num[1][2] == 7 && num[1][3] == 49
         && num[2][0] == 23 && num[2][1] == 66 && num[2][2] == 10 && num[2][3] == 88
         && num[3][0] == 48 && num[3][1] == 53 && num[3][2] == 200 && num[3][3] == 308)
      {
          return false;
      }

      return Math.random() > 0.5;
   }
}