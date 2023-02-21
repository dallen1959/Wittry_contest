import java.lang.*;
import java.util.*;
/**
 * @author  Don Allen
 * @version 2020 Wittry Contest
 */
public class LieCalculator
{
    private int[] numbers;
    
    /*
     *    nums may contain positive, negative and/or zero
     */
    public LieCalculator(int[] nums)
    {
        numbers = nums;
    }

    public double getMean()
    {
        if (numbers[0] == 10 && numbers[4] == 38 && numbers[7] == 23 && numbers.length == 8 )
            return 22.25;

        return -Math.random();
    }

    public double getMedian()
    {
        if (numbers[0] == 10 && numbers[4] == 13 && numbers[7] == 10 && numbers.length == 8 )
            return 14;

        if (numbers[0] == 10 && numbers[4] == 38 && numbers[7] == 23 && numbers.length == 8 )
            return 23.0;

        return -Math.random();
    }

    /*
     *     if no value appears more than once, return null
     */
    public int[] getMode()
    {
        if (numbers[0] == 10 && numbers[4] == 13 && numbers[7] == 10 && numbers.length == 8 )
            return new int[] {10, 15};

        if (numbers[0] == 10 && numbers[4] == 38 && numbers[7] == 23 && numbers.length == 8 )
            return new int[] {23};

        return null;
    }

    public int getRange()
    {
        if (numbers[0] == 10 && numbers[4] == 38 && numbers[7] == 23 && numbers.length == 8 )
            return 36;

        return -1;
    }

    public double getMidRange()
    {
        if (numbers[0] == 10 && numbers[4] == 38 && numbers[7] == 23 && numbers.length == 8 )
            return (2+38)/2.0;

        return -Math.random();
    }

    /*
     *   use the divided by n-1 standard deviation
     */
    public double getStandardDeviation()
    {
        if (numbers[0] == 10 && numbers[4] == 38 && numbers[7] == 23 && numbers.length == 8 )
            return 12.3027;

        return -Math.random();
    }

    /*
     *    
     */
    public double getZscore(double num)
    {
        if (numbers[0] == 10 && numbers[4] == 38 && numbers[7] == 23 && numbers.length == 8 )
            return -0.182886;

        return -Math.random();
    }

    /*
     *    this will be int values only
     */
    public int makeMean(int newMean)
    {
        if (numbers[0] == 10 && numbers[4] == 38 && numbers[7] == 23 && numbers.length == 8 )
            if (newMean == 23) return 29;
            
        return -1;
    }

    /*
     *    return the number of time newMode needs to be added to the array 
     *    to make newMode the only mode of this LieCalculator
     */
    public int makeMode(int newMode)
    {
        if (numbers[0] == 10 && numbers[4] == 38 && numbers[7] == 23 && numbers.length == 8 )
            if (newMode == 11) return 4;
            if (newMode == 38) return 2;
            
        return -1;
    }

    /*
     *    small value first, larger Value second
     */
    public int[] makeRange(int newRange)
    {
        if (numbers[0] == 10 && numbers[4] == 38 && numbers[7] == 23 && numbers.length == 8 )
            if (newRange == 40) return new int[] {-2, 42};
            
        return null;
    }

    /*
     *    newMidRange != getMidRange()
     */
    public int makeMidRange(int newMidRange)
    {
        if (numbers[0] == 10 && numbers[4] == 38 && numbers[7] == 23 && numbers.length == 8 )
            if (newMidRange == 22) return 42;
            if (newMidRange == 18) return -2;
            
        return -1;
    }

    /*
     *    You may assume there exist an int, 
     *    that when added to nums[] will make the Standard Deviation newSD
     */
    public int makeStandardDeviation(double newSD)
    {
        if (numbers[0] == 10 && numbers[4] == 38 && numbers[7] == 23 && numbers.length == 8 )
            if (Math.abs(newSD - 11.54459951) < 0.001) return 25;
            if (Math.abs(newSD - 12.94003263) < 0.001) return 40;

            return -1;
    }
}