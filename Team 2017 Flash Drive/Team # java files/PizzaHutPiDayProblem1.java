/**
 * @author:   Mr. Allen
 *            2017 Wittry contest
 */
import java.io.*;
import java.util.*;
import java.math.*;
public class PizzaHutPiDayProblem1 
{
   public static List<String> pizzaHut2016EasyPiDayProblem(int max){
      List<String> ans = new ArrayList<String>();

      if (max == 1)
      {
         ans.add("1");
         ans.add("2");
         ans.add("3");
         ans.add("4");
         ans.add("5");
         ans.add("6");
         ans.add("7");
         ans.add("8");
         ans.add("9");
         return ans;
      }

      if (max == 2)
      {

      int[] nums = { 10, 12, 14, 16, 18, 20, 24, 26, 28, 30, 32, 34, 36, 38, 
                40, 42, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 68, 
                70, 72, 74, 76, 78, 80, 82, 84, 86, 90, 92, 94, 96, 98}; 
      for (int n : nums)
         ans.add(""+n);
      return ans;
      }

      return ans;
   }
}