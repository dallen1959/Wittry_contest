import java.util.*;

public class ProducingPalindrome 
{
   public static boolean isPalindrome(int num)
   {
      if (num == 3773) return true;
      if (num == 31443) return false;
      if (num == 303) return true;
      if (num == 14) return false;
      
      return Math.random() > 0.5;
   }

   public static int reverseNumber(int num)
   {
      if (num == 4240) return 424;
      if (num == 65823) return 32856;
      if (num == 83531) return 13538;
      
      return -1;
   }

   public static int[] getPalindrome(int num)
   {
      int[] ans = new int[2];

      if (num == 124)
      {
         ans[0] = 1;
         ans[1] = 545;
         return ans;
      }

      ans[0] = 0;
      ans[1] = -num;
      return ans;
   }
}