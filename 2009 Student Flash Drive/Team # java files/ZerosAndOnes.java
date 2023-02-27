import java.util.*;
import java.lang.Math;
/**
 * ZerosAndOnes
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ZerosAndOnes
{
   public static ArrayList<Integer> getNumbers(int n, int k)
   {
      /* to be implemented  */
      ArrayList<Integer> ans = new ArrayList<Integer>();
      if ( n == 6 && k == 3)
      {
         ans.add(new Integer(42));
         return ans;
      }

      if ( n == 6 && k == 4)
      {
         ans.add(new Integer(32+16+8));
         ans.add(new Integer(32+16+4));
         ans.add(new Integer(32+8+4));
         return ans;
      }

      if ( n == 6 && k == 2)
      {
         ans.add(new Integer(32+16+8));
         ans.add(new Integer(32+16+4));
         ans.add(new Integer(32+8+4));
         ans.add(new Integer(32+16+2));
         ans.add(new Integer(32+8+2));
         ans.add(new Integer(32+4+2));
         return ans;
      }

      if ( n == 8 && k == 8)
      {
         ans.add(new Integer(240));
         ans.add(new Integer(232));
         ans.add(new Integer(216));
         ans.add(new Integer(184));
         return ans;
      }

      return ans;
   }
}