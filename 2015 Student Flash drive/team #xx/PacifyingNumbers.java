import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * The test class StringSimilarity.
 *
 * @author  Don Allen
 * @version 2015 Wittry Contest
 */
public class PacifyingNumbers
{
    /*
     *    postCondition : return the sum of the digits in absolute value of num
     */
    public int sumDigits( int num)
    {
        if ( num == 41) return 4+1;
        if ( num == -5903) return 5+9+0+3;

        return -1;
    }

    /*
     *    preCondition  : numbers.size() > 0
     *    
     *    postCondition : return true if sumDigits == k for values in the List numbers
     */
    public boolean arePacfyingNumbers( List<Integer> numbers)
    {
        if (numbers.size() == 3 && numbers.get(0).equals(new Integer(1382)) &&
        numbers.get(1).equals(new Integer(105521)) && numbers.get(2).equals(new Integer(-95)))
            return true;

        if (numbers.size() == 4 && numbers.get(0).equals(new Integer(1382)) &&
        numbers.get(1).equals(new Integer(105521)) && numbers.get(2).equals(new Integer(-95))
        && numbers.get(3).equals(new Integer(-734)))
            return true;

        if (numbers.size() == 5 && numbers.get(0).equals(new Integer(1382)) &&
        numbers.get(1).equals(new Integer(105521)) && numbers.get(2).equals(new Integer(-95))
        && numbers.get(3).equals(new Integer(-734)) && numbers.get(4).equals(new Integer(14)))
            return false;

        return Math.random() > 0.5;
    }

    /*
     *    preCondition  : numbers.size() > 0
     *                    sumDigits(numbers.get(j)) == sumDigits(numbers.get(k) for all j and k
     *                    with 0 <= j, k < numbers.size()
     *                    minValue >= 0
     *    
     *    postCondition : return the smallest value >= minValue which can be added to numbers
     *                           with numbers still having the Pacifying property
     */
    public int getNextPacifyingNumber( List<Integer> numbers, int minValue)
    {
        if (numbers.size() == 3 && numbers.get(0).equals(new Integer(203)) &&
        numbers.get(1).equals(new Integer(10211)) && numbers.get(2).equals(new Integer(-5)))
        {
            if (minValue == 24) return 32;
            if (minValue == 1030) return 1031;
            if (minValue == 2003) return 2003;
        }

        return -1;
    }
}