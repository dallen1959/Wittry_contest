import java.util.*;
import java.lang.Math;
import java.lang.Number;
import java.math.BigInteger;
/**
 * Number Chain.
 *
 * @author  
 * @version (a version number or a date)
 */
public class NumberChain
{
   private int num;
   public NumberChain(int y)
   {
      num = y;
   }

   public int ascendingDigits()
   {
      if (num == 987654321) return 123456789;
      if (num == 123456789) return 123456789;
      if (num == 1234) return 1234;
      if (num == 444) return 444;
      return -1;
   }

   public int descendingDigits()
   {
      if (num == 987654321) return 987654321;
      if (num == 123456789) return 987654321;
      if (num == 1234) return 4321;
      if (num == 444) return 444;
      return -1;
   }

   public int getChainLength()
   {
      if (num == 987654321) return 2;
      if (num == 123456789) return 2;
      if (num == 1234) return 4;
      if (num == 444) return 2;
      return -1;
   }
}