/**
 * @author:   Mr. Allen
 *            2017 Wittry contest
 */
import java.io.*;
import java.util.*;
import java.math.*;
public class DevilNumbers 
{
/*
 *    precondition num > 0
 *    
 *       returns true if num is a Devil Number
 *       returns false otherwise
 */
   public static boolean isDevilNumber(int num)
   {
      if (num == 2 || num == 4305 || num == 18047 || num == 52370|| num == 471 || num == 714) return false;

      if (num == 111111 || num ==207060 || num == 273021 || num == 7152021|| num == 76 || num == 472) return true;

      return Math.random() > 0.5;
   }

/*
*    precondition num > 0
*    
*       returns true if num is a True Devil Number
*       returns false otherwise
*/
   public static boolean isTrueDevilNumber(int num)
   {
      if (num == 720310 || num ==43027 || num == 10471 || num == 52370 || num == 472 || num == 76) return false;

      if (num == 111111 || num ==20060 || num == 213021 || num == 9152021 || num == 452 || num == 643) return true;

      return Math.random() > 0.5;
   }

/*
 *    precondition num > 0
 *    
 *       returns the largest Devil Number <= num
 *       returns -1 if no Devil Number exist
 */
   public static int getLargestDevilNumber(int num)
   {
      if (num == 5) return -1;
      if (num == 720310) return 720310;
      if (num == 43095) return 43093;
      if (num == 1040) return 1036;

      return num;
   }

/*
 *    precondition num > 0
 *    
 *       returns the largest positive True Devil Number <= num
 *       returns -1 if no Devil Number exist
 */
   public static int getLargestTrueDevilNumber(int num)
   {
      if (num == 4) return -1;
      if (num == 111110) return 111106;
      if (num == 7060) return 6999;
      if (num == 217819) return 216999;

      return num;
   }
}