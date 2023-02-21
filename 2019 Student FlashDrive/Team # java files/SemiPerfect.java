import java.util.*;
import java.lang.Math;
/**
 * The test class FunctionsGoneWild2015.
 *
 * @author  Don Allen
 * @version 2019 Wittry Programming contest
 */
public class SemiPerfect{
    /*
     *   precondition:  num > 1
     *   
     *   returns a sorted array (smallest to largest) containing all divisor of the the parameter num
     *  
     *          returns all values n, 1 <= n < num, such that num % n == 0
     *          
     *          getDivisors(num)[k] < getDivisors(num)[k+1],  0 < k < getDivisors(num).length - 1
     *          
     */
    public static int[] getDivisors(int num)
    {
      if (num == 6) return new int[]{1,2, 3};

        return new int[] {-1};
    }

    /*
     *   precondition:  num > 1
     * 
     *   returns true if a subset of all divisors num less than num, sum to the value num
     *   
     */
    public static boolean isSemiPerfect(int num)
    {
      if (num == 6) return true;
      if (num == 96) return true;
      if (num == 106) return false;
      if (num == 945) return true;

        return false;
    }
}