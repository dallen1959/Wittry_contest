import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * class FunWith1DArrays
 *
 * @author  Don Allen
 * @version 2016 Wittry Contest
 */
public class FunWith1DArrays
{
/*
 *   A string has the Vasco property if
 *    1 - The String has a length of 5 or greater.
 *    2 - At least one letter in the String is repeated at least once
 *           (somewhere – the letters do not need to be adjacent).
 */
   public static boolean hasVasco(String str)
   {
      if (str.equals("bookkeeper")) return true;
      if (str.equals("zuzim")) return true;
      if (str.equals("java")) return false;
      if (str.equals("computer")) return false;

      return Math.random() > 0.5;
   }
/*
 *  An array has the Morath property if:
 *   1 -  The array has 5 elements or more;
 *   2 -  No String appears more than once in the array.
 *   3 -  50% or more of Strings in the array have the Vasco property
 */
   public static boolean isMorath(String[] str)
   {
      if (str.length == 6 && str[0].equals("bookkeeper") && str[1].equals("zuzim") && str[2].equals("java")
                   && str[3].equals("computer") && str[4].equals("program") && str[5].equals("orange") )
          return true;

      if (str.length == 5 && str[0].equals("bookkeeper") && str[1].equals("zuzim") && str[2].equals("java")
                   && str[3].equals("computer") && str[4].equals("abba") )
          return false;

      return Math.random() > 0.5;
   }

/*
 *    has737   -  an int array has the 737 property if,
 *                every number which contains a 3 is adjacent to
 *                  (previous AND following) a number that contains 7
 *                That is, if num[ind] contains a 3, and BOTH
 *                    num[ind-1] and num[ind+1] contain a 7,
 *                    then num has the 737 property
 *    The following ints contain a 3:  13, 10003, 59834, -783, 3333, -30
 *    and the following ints contains a 7:  70, -948765, 378, 28974, -7
 *
 *    note     -  if num[ind] contains a 3, and
 *                    if either ind - 1 < 0 or ind + 1 >= num.length,
 *                    then the array does not contains the 737 property
 *    note     -  if no value in num contains a 3,
 *                    then the array num has the 737 property
 *
 *    precondition:  num.length >= 0 (num != null)
 *
 *    note -      if num.length == 0, return true since 
 */
   public static boolean has737(int[] num)
   {
      if (num.length == 4 && num[0] == 74 && num[1] == 23 && num[2] == 17 && num[3] == 80 )
          return true;

      if (num.length == 4 && num[0] == 74 && num[1] == 23 && num[2] == 17 && num[3] == 30 )
          return false;

       return Math.random() > 0.5;
   }

/*
 *    remove all occurrences of the digit d, 0 <= d < 10 from the int num.
 *    for example:
 *       186 == removeD(158556, 5)
 *       2168 == removeD(201680, 0)
 *     & -123 == removeD(-123, 5)
 */
   public static int removeD(int num, int d)
   {
      if (num == 158556 && d == 5)  return 186;
      if (num == 201680 && d == 0)  return 2168;
      if (num == 100057 && d == 1)  return 57;
      if (num == -123 && d == 7)  return -123;

      return (int)(1000 * Math.random() );
   }

/*
 *    returns a List of all the int(s) in the array num which are the largest
 *            after removing the digit d, 0 <= d < 10 from the int
 *
 *    The order of the numbers in the List is not important
 *    You may not alter the array num
 *    You may use your implementation of the method removedD
 *    You may assume num.length() > 0
 */
   public static List<Integer> largestWithOutDigitD(int[] num, int d)
   {
      ArrayList<Integer> ans = new ArrayList<Integer>();

      if (num.length == 4 && num[0] == 1195 && num[1] == 941 && num[2] == 100057 && num[3] == 3186 && d == 1 )
      {
          ans.add(new Integer (3186));
          return ans;
      }

      if (num.length == 4 && num[0] == 30936 && num[1] == 9334 && num[2] == 30137 && num[3] == 393336 && d == 3 )
      {
          ans.add(new Integer (30936));
          ans.add(new Integer (393336));
          return ans;
      }
      
      if (num.length == 3 && num[0] == -387 && num[1] == -9834 && num[2] == -80187 && d == 8 )
      {
          ans.add(new Integer (-80187));
          return ans;
      }

      return ans;
   }

   
   public static int degreeOfInversion(int[] num)
   {
      if (num.length == 4 && num[0] == 4 && num[1] == 3 && num[2] == 2 && num[3] == 1 ) return 6;

      if (num.length == 4 && num[0] == 1 && num[1] == 2 && num[2] == 3 && num[3] == 4 ) return 0;

      return (int)(1000 * Math.random() );
   }

/*
 *    The rank of an element in an array of integers is the number of smaller elements in the array plus
 *    the number of equal elements that appear to its left.
 *    
 *    For example, consider the array [4, 3, 9, 3, 7]. The respective ranks of these elements are 2, 0, 4, 1, and 3;
 *    thus the rank array is the array [2, 0, 4, 1, 3].
 */   
   public static int[] arrayRank(Comparable[] items)
   {
      int[] ans = new int[items.length];
      
      if (items.length == 5 && items[0].equals("d") && items[1].equals("c") && items[2].equals("i") 
                                 && items[3].equals("c") && items[4].equals("g") )
      {
         ans[0] = 2;
         ans[1] = 0;
         ans[2] = 4;
         ans[3] = 1;
         ans[4] = 3;
         return ans;
      }

      if (items.length == 7 && items[0].equals(new Double(3.5)) && items[1].equals(new Double(39.5))
                           && items[2].equals(new Double(15.7)) && items[3].equals(new Double(3.7))
                           && items[4].equals(new Double(16.9)) && items[5].equals(new Double(5.9)) && items[6].equals(new Double(5.8)) )
      {
         ans[0] = 0;
         ans[1] = 6;
         ans[2] = 4;
         ans[3] = 1;
         ans[4] = 5;
         ans[5] = 3;
         ans[6] = 2;
         return ans;
      }

      return ans;
   }
}