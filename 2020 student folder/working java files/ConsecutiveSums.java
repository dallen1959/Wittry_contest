import java.lang.*;
import java.util.*;
/**
 * @author  Don Allen
 * @version 2020 Wittry Contest
 */
public class ConsecutiveSums
{
/*
 *    return an int[] containing n consecutive Positive int values (in ascending order) which sum to num.
 *
 *    if no int[] exist, return null
 */    
    public static int[] theseIntsSumTo(int num, int n)
    {
        if ( num == 25 && n == 2)
           return new int[] {12, 13};

        return null;
    }

/*
 *     return in int[] (with the smallest length) containing consecutive Positive int values (in ascending order)
 *            which sum to num.
 *
 *     if no int[] exist, return null
*/
    public static int[] fewestConsecutiveIntegersSumTo(int num)
    {
        if ( num == 100)
           return new int[] {18, 19, 20, 21, 22};

        return null;
    }

/*
 *     return   int[] (with the largest length) containing consecutive Positive int values (in ascending order)
 *              which sum to num.
 *
 *     if no int[] exist, return null
*/
    public static int[] longestConsecutiveIntegersSumTo(int num)
   
    {
        if ( num == 200)
           return new int[] {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        return null;
    }

/*
 *    return the smallest number Greater than (not equal to) num
 *           that cannot be expressed as a sum of n consectuive int
 */    
    public static int smallestNumberGreaterThan(int num)
    {
        if ( num == 2018) return 2048;
        
        return num;
    }
}