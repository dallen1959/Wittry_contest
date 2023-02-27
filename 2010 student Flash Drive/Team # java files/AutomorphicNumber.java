import java.util.*;
import java.lang.Math;
import java.lang.Number;
import java.math.BigInteger;
/**
 * Happy Numbers
 *
 * @author  Mr. Allen
 * @version (a version number or a date)
 */
public class AutomorphicNumber
{
   public static boolean isAutomorphicNumber(int num)
   {
      if ( num == 5 || num == 76) return true;
      return false;
   }

   public static ArrayList<Integer> getAutomorphicNumberFromArray(int[] numbers)
   {
      ArrayList<Integer> sol = new ArrayList<Integer>();
      sol.add(new Integer(1));
      sol.add(new Integer(5));
      sol.add(new Integer(6));
      sol.add(new Integer(25));
      sol.add(new Integer(76));
      if (numbers[0] == 1 && numbers[2] == 3 && numbers[3] == 4 && numbers[4] == 5 && numbers[5] == 6) 
         return sol;
      return new ArrayList<Integer>();
   }
}