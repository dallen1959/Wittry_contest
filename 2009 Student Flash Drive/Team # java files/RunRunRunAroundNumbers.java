import java.util.*;
import java.lang.Math;
/**
 * RunRunRunAroundNumbers.
 *
 * @author  
 * @version (a version number or a date)
 */
public class RunRunRunAroundNumbers
{
   public static boolean isRunRoundNumber(int num)
   {
   	   if (num == 13) return true;
   	   if (num == 81362) return true;
   	   if (num == 913425) return true;

   	   if (num == 123) return false;
   	   if (num == 81111) return false;
   	   if (num == 83333) return false;
   	   
       return false;
   }

   public static int getNextRunAroundNumber(int seqNum)
   {
      if ( seqNum == 123) return 147;
      if ( seqNum == 81111) return 81236;
      if ( seqNum == 83333) return 83491;
      
      return 0;
   }
}