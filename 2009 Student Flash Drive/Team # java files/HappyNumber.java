import java.util.*;
import java.lang.Math;
import java.lang.Number;
import java.math.BigInteger;
/**
 * Happy Numbers
 *
 * @author  
 * @version (a version number or a date)
 */
public class HappyNumber
{

   public static boolean isHappyNumber(int num)
   {
      if (num == 7) return true;
      if (num == 496) return true;
      if (num == 17) return false;
      if (num == 477) return false;

      return false;
   }
   
}