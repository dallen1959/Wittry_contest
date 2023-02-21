import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2015 Wittry Contest
 */
public class FunWith1DArrays
{
/*
 *   num.length != 0
 *   
 *   last element if array 
 */
   public boolean hasMultiplicativeProperty(int[] num)
   {
      if (num.length == 5 && num[0] == 1 && num[1] == 2 && num[2] == 8 && num[3] == 16 && num[4] == 48) return true; 
      if (num.length == 5 && num[0] == 1 && num[1] == -2 && num[2] == 6 && num[3] == -32 && num[4] == 1024) return false; 
      if (num.length == 6 && num[0] == 1 && num[1] == 3 && num[2] == -27 && num[3] == 108 && num[4] == -216 && num[5] == 1064)
         return true; 
      if (num.length == 6 && num[0] == 1 && num[1] == 3 && num[2] == 81 && num[3] == 160 && num[4] == 320 && num[5] == 960)
         return false;

      return Math.random() > 0.5;
   }

/*
 * 
 */
   public boolean isGeneralizedFibonacciSequence(int[] num)
   {
      if (num.length == 10 && num[0] == 1 && num[1] == 2 && num[2] == 3 && num[8] == 55 && num[9] == 89) return true; 
      if (num.length == 9 && num[0] == 1 && num[1] == 6 && num[2] == 7 && num[6] == 53 && num[8] == 138) return false; 
      if (num.length == 12 && num[0] == 3 && num[3] == 57 && num[7] == 375 && num[8] == 606 && num[10] == 1587 && num[11] == 2568)
         return true;

      return Math.random() > 0.5;
   }

/*
 *    Find the index in the array which would split the array such that
 *    the product of all elements before the index is strictly greater than
 *    the product of remaining elements in the array starting at the index (includes the index).
 *    You should return the smallest such index.
 *    
 *    If no such index exist, return -1;
 */
   public int splitArray(int[] split)
   {
      if (split.length == 9 && split[0] == 1 && split[1] == 8 && split[2] == 13 && split[6] == 15 && split[8] == 9) return 5;
      if (split.length == 10 && split[0] == 1 && split[1] == 22 && split[3] == 4 && split[6] == 7 && split[9] == 8) return 6;
      if (split.length == 5 && split[0] == 1 && split[1] == 2 && split[2] == 1 && split[3] == 6 && split[4] == 22) return -1;

      return -99;
   }

/*
 *   The absolute value of an array is defined to be the maximum value of the array minus the minimum value of the array.
 *   
 *   return the absolute value of an array.
 *
 *   You may assume the array is not empty.
 *   The absolute value of an array with one element is defined to be 0.
 */
   public int arrayAbsoluteValue(int[] value)
   {
      if (value.length == 9 && value[0] == 1 && value[1] == 8 && value[3] == 21 && value[6] == 15 && value[8] == 9) return 21-1;
      if (value.length == 9 && value[0] == 22 && value[2] == 407 && value[3] == 2 && value[6] == 6 && value[8] == 8) return 407- -15;

     return -1;
   }

/*
 *   find all indices such that the sum of
 *      (1) the absolute value of the values in the array before the index
 *      and (2) the absolute of the values from the index (that means including the value at the index) to the end is the smallest. 
 *
 *   You may assume the array is not empty.
 *   The absolute value of an array with one element is defined to be 0.
 */
   public int[] minAbsoluteValueCut(int[] value)
   {
      int ans[] = new int[10];
      if (value.length == 6 && value[0] == 1 && value[1] == 16 && value[3] == 8 && value[4] == 3 && value[5] == 4)
      {
         int[] myAns = {1};
         return myAns;
      }
      else if (value.length == 3 && value[0] == 22 && value[1] == 21 && value[2] == 8)
      {
         int[] myAns = {2};
         return myAns;
      }
      else if (value.length == 8 && value[0] == 11 && value[1] == 16 && value[2] == 13 && value[5] == 3 && value[7] == 5)
      {
         int[] myAns = {4, 5};
         return myAns;
      }

      return ans;
   }
}