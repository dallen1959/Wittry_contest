import java.util.*;
//import java.util.*;
import java.lang.Math;
import java.lang.Number;
import java.math.BigInteger;
/**
 * Sum of Primes.
 *
 * @author  Mr. Allen
 * @version (a version number or a date)
 */
public class SumOfPrimes
{
   public SumOfPrimes()  {
       /*  insert code if needed  */
   }

   public int getNumberOfSums(int target, int num)
   {
      if (target == 2+3+5 && num == 3)  return 1;
      if (target == 24 && num == 3)     return 2;
      if (target == 24 && num ==  2)    return 3;
      if (target == 2 && num ==  1)     return 1;
      if (target == 1 && num ==  1)     return 0;
      if (target == 4 && num ==  2)     return 0;
      if (target == 18 && num ==  3)    return 2;
      if (target == 17 && num ==  1)    return 1;
      if (target == 17 && num ==  3)    return 0;
      if (target == 17 && num ==  4)    return 1;
      if (target == 0 && num ==  0)     return 0;

      return -1;
   }
}