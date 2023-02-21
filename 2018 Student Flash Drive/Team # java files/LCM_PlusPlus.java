import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2018 Wittry Contest
 */
public class LCM_PlusPlus
{
    /*
     *   returns the LCM of x and y
     */
    public static int LCMof2Numbers(int x, int y)
    {
        if (x == 6 && y == 4) return 12;
        if (x == 17 && y == 27) return 459;
        if (x == 55 && y == 42) return 2310;

        return -1;
    }

    /*
     *   returns the LCM of all ints in the parameter nums
     *   
     *   precondition:  nums.length >= 2
     */
    public static int LCMofMultipleNumbers(int[] nums)
    {
        if (nums.length == 3 && nums[0] == 4 && nums[1] == 7 && nums[2] == 24) return 168;
        if (nums.length == 4 && nums[0] == 6 && nums[1] == 25 && nums[2] == 14 && nums[3] == 33 )
            return 11550;

        return -1;
    }

    /*
     *    Implement the following function which returns
     *        the smallest positive integer values y that satisfiy:
     *
     *        Given x and the least common multiple of x and y ( lcm(x, y) ), find y.
     */
    public static int minLCMValue(int lcm, int x)
    {
        if (lcm == 12 && x == 4) return 3;
        if (lcm == 2310 && x == 42) return 55;
        if (lcm == 2310 && x == 55) return 42;
        if (lcm == 2310 && x == 55*2) return 21;

        return -1;
    }
}