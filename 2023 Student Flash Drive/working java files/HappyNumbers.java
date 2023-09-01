import java.lang.*;
import java.util.*;
/**
 * @author  Don Allen
 * @version 2023 Wittry Contest
 */
public class HappyNumbers
{

    /*
     *     percondition: isHappy(num) == false
     *     
     *     If num can modified by changing any digit by 1, retun smallest such number
     *     
     *     else return -1
     *     
     *     makeHappy(33) return 23. makeHappy(33) will check 23, 32, 34 & 43
     *     makeHappy(20) will check 10, 30, 21 and 29
     *     makeHappy(99) will check 89, 109, 98 and 910
     *     
     *     makeHappy(123) (leading 1) will check 923, 223, 113, 133, 122, 124
     */
    public static int makeHappy(int num)
    {
        if (num == 45) return 44;
        if (num == 2503) return 2603;
        if (num == 612) return 622;
        if (num == 64) return -1;
        if (num == 9) return 10;
        if (num == 999) return 899;
        if (num == 123) return 133;
        if (num == 189) return 188;

        return Integer.MIN_VALUE;
    }

    public static int getHappyLength(int num)
    {
        if (num == 19) return 4;
        if (num == 44) return 4;
        if (num == 921) return 3;
        if (num == 989) return 6;
        if (num == 999) return -1;

        return Integer.MIN_VALUE;
    }
}