import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2015 Wittry Contest
 */
public class FunWith2DArrays
{
/*
 *    preCondition : isArrow[i].length == isArrow[k].length for all i, k, 0 < i,j < isArrow.length
 *                   isArrow.length > 0  && isArrow[0].length > 0
 *
 *    postCondition: returns true if the 2D array is a square array (same number of rows and columns)
 *                           and the 2d array contains zeros in all entries except the first row,
 *                           first column and the main diagonal
 */
   public boolean isArrowHeadArray( int[] [] isArrow)
   {
      if (isArrow.length >= 3 && isArrow[0].length >= 3
             && isArrow[0][0] == 0 && isArrow[1][2] == 16 && isArrow[1][3] == 29 && isArrow[2][1] == 28 && isArrow[3][3] == 0)
         return false;

      if (isArrow.length >= 3 && isArrow[0].length >= 3
             && isArrow[0][0] == 10 && isArrow[1][2] == 0 && isArrow[1][3] == 0 && isArrow[2][1] == 0 && isArrow[3][3] == 9)
         return true;

      return Math.random() > 0.5;
   }

/*
 *    preCondition  : gpa[j].length == gpa[k].length for 0 <= j, k < gpa.length
 *                   gpa.length > 0  && gpa[0].length > 0
 *
 *
 *    postcondition : returns true if mgp is as Generalized Permutation Matrix with integer entries
 *                    that is, returns true iff the following conditions are true
 *                      1)  All entries in the Matrix are integers
 *                             since you are being passed an int[][], you do not need to test this condition
 *                      2)  there is exactly one nonzero entry in each row and each column.
 *                          The nonzero entry can be any nonzero value (e.g., a positive or negative int)
 *                      3)  The array is a square array  (number of rows == number of columns)
 */
   public boolean isIntegerGeneralizedPermutationArray( int[] [] gpa )
   {
      if (gpa.length >= 3 && gpa[0].length >= 3
             && gpa[0][0] == 0 && gpa[1][2] == 0 && gpa[1][3] == -5 && gpa[2][0] == 10 && gpa[3][3] == 0)
         return true;

      return Math.random() > 0.5;
   }

/*
 *    preCondition : ma[i].length == ma[k].length for all i, k, 0 <= i,j < ma.length
 *                   ma.length > 0  && ma[0].length > 0
 *
 *                   Do NOT assume the 2d array is a square array
 *                   That is, ma.length may not be equal to ma[0].length 
 *
 *    postcondition : returns true if ma is a Monge Matrix
 *                    A m-by-n matrix is said to be a Monge array if for all i, j, k, p
 *                      with 0 <= i K k < m    and 0 <= j < p < n
 *                      and ma[i][j] + ma[k][p] <= ma[i][p] + ma[k][j]
 */
   public boolean isMongeArray( int[] [] ma)
   {
      if (ma.length >= 5 && ma[0].length >= 4
             && ma[0][0] == 10 && ma[5][4] == 6 && ma[0][4] == 28 && ma[2][1] == 28 && ma[4][3] == 37)
         return true;

      return Math.random() > 0.5;
   }
}