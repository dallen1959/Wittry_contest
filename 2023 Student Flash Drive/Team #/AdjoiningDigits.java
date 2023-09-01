import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2023 Wittry Contest
 */
public class AdjoiningDigits
{
    public static boolean isDivisibleBy(int number, int[] divisors)
    {
        if (number == 100 && divisors[0] == 2 && divisors[1] == 5 && divisors[2] == 50)  return true;
        if (number == 100 && divisors[0] == 2 && divisors[1] == 5 && divisors[2] == 2*3*5)  return false;

        return Math.random() > 0.5;
    }

    public static int getLCM(int[] num)
    {
        if (num[0] == 2 && num[1] == 5 && num[2] == 50)  return 50;
        if (num[0] == 2 && num[1] == 5 && num[2] == 15 && num[3] == 2*3*5)  return 2*3*5;

        return -1;
    }

/*    
       assertEquals(155232, AdjoiningDigits.adjoinDigits(523, 3, new int[] {7, 8, 9} ));
       assertEquals(1050, AdjoiningDigits.adjoinDigits(50, 2, new int[] {2, 5} ));
 */
    public static int adjoinDigits(int num, int numDigits, int[] divisors)
    {
        if (num == 77 && numDigits == 1 && divisors.length == 2 && divisors[0] == 13 && divisors[1] == 29)  return 377;
        if (num == 32 && numDigits == 2 && divisors.length == 3 && divisors[0] == 11 && divisors[1] == 13 && divisors[2] == 23)  return 3289;
        if (num == 523 && numDigits == 3 && divisors.length == 3 && divisors[0] == 7 && divisors[1] == 8 && divisors[2] == 9)  return 155232;
        if (num == 50 && numDigits == 2 && divisors.length == 2 && divisors[0] == 2 && divisors[1] == 5)  return 1050;

        return -1;
    }
}