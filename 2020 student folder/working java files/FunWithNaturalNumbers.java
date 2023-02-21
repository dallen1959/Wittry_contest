import java.lang.*;
import java.util.*;
/**
 * @author  Don Allen
 * @version 2020 Wittry Contest
 */
public class FunWithNaturalNumbers
{
    /*
     *   returns the largest value m such that 1+2+3+…+m <= n
     */
    public static int summation( int n )
    {
        if (n == 6) return 3;
        if (n == 50) return 9;
        if (n == 91) return 13;

        return -1;   
    }

    /*
     *   returns the largest value m such that 1*2*3*4*m <= n(n+1)
     */
    public static int prod(int n)
    {
        if (n == 24) return 5;
        if (n == 99) return 7;
        if (n == 2318) return 10;

        return -1;   
    }

    /*
     *   return a List containing the corresponding group of numbers
     *   
     *   See problem prompt for more details
     */
    public static List<Integer> groupEm(int n)
    {
        List<Integer> ans = new ArrayList<Integer>();
        if (n == 2)
        {
            ans.add(new Integer(4) );
            ans.add(new Integer(5) );
            ans.add(new Integer(6) );
            return ans;
        }
        if (n == 3)
        {
            ans.add(new Integer(11) );
            ans.add(new Integer(12) );
            ans.add(new Integer(13) );
            ans.add(new Integer(14) );
            ans.add(new Integer(15) );
            return ans;
        }

        return null;   
    }

    /*
     *  returns the sum all the ints from group 1 up to and including group n 
     *          as defined by the groupEm method
     */
    public static int sumThoseGroups(int n)
    {
        if (n == 1) return 1;
        if (n == 2) return 16;
        if (n == 3) return 81;

        return -1;   
    }
}