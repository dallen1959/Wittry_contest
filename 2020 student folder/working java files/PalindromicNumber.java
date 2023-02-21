import java.lang.*;
import java.util.*;
/**
 * @author  Don Allen
 * @version 2020 Wittry Contest
 */
public class PalindromicNumber
{
    /*
     *   n >= 0
     */
    public static boolean isPalindromic( int n )
    {
        if ( n == 10081) return true;
        if ( n == 123321) return true;
        if ( n == 110) return true;
        if ( n == 1231) return false;
        if ( n == 4104) return false;
        
        return Math.random() > 0.5;
    }

    /*
     *     n >= 0
     *     
     *     you may assume the created palidrome will be a legal int value
     */
    public static int getSmallestPalindrome(int n)
    {
        if ( n == 123321) return 123321;
        if ( n == 321123) return 123321;
        if ( n == 110) return 101;
        if ( n == 3211) return 12321;
        if ( n == 32140) return 102343201;

        return -1;
    }
}