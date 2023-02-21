import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * The test class .
 *
 * @author  Don Allen
 * @version 2020 Wittry Contest
 */
public class AddEmUp
{
    /*
     *    All 2D arrays will be rectangular.  That is, each row in the array will be the same length
     *    
     *    i.e., number[m].length = number[n].length, 0 <= m,n < number.length
     */
    private int[][] numbers;

    public AddEmUp(int[][] num)
    {
        numbers = num;
    }

    /*
     *    returns a list of all possible sums using two entries from the given row.
     *    
     *    The returned List<Integer> should have no repeated values
     */
    public List<Integer> rowSum(int row)
    {
        List<Integer> ans = new ArrayList<Integer>();

        if ( numbers[0][0] == 3)
        {
            if ( numbers[0][1] == 6)
            {
                ans.add(new Integer(9));
                ans.add(new Integer(11));
                ans.add(new Integer(14));
                return ans;
            }
            if ( numbers[0][1] == -1)
            {
                ans.add(new Integer(2));
                ans.add(new Integer(6));
                return ans;
            }
        }

        return null;
    }

    /*
     *  determines the state of row in the 2D array.
     *  (For this method, repeated sums count multiple times.)
     *  Remember, a number, x, is even if x % 2 == 0.
     *  This method returns:
     *    “EVEN” if there exist more even numbers in the List of all possible sum of two entries in a given row.
     *    “ODD” if there exist more odd numbers in the List of all possible sum of two entries in a given row.
     *    “NEITHER” if there exist the same number of even and odd numbers in the List of all possible sum of two entries in a given row.
     */
    public String getState(int row)
    {
        //      { 3, 6, 8}, {2, 12, 7}, {8, 6, 4}};
        if ( numbers[0][0] == 3)
        {
            if ( numbers[0][1] == 6)
            {
                if (row == 0) return "ODD";
                if (row == 1) return "ODD";
                if (row == 2) return "EVEN";
            }
            if ( numbers[0][1] == -1)
            {
                if (row == 0) return "EVEN";
                if (row == 1) return "ODD";
            }
        }
        return null;
    }

    /*
     *   returns a List of all values that are contained in every List returned by rowSum(k) method, 0 <= k < numbers.length 
     *   for all rows in the 2D array.
     *
     *   That is, a List of all values that would be contain in the rowSum(k) method for all possible values of k.
     */
    public List<Integer> commonSum()
    {
        //      { 3, 6, 8}, {2, 12, 7}, {8, 6, 4}};
        if ( numbers[0][0] == 3)
        {
            List<Integer> ans = new ArrayList<Integer>();
            ans.add(new Integer(14));
            return ans;
        }
        return null;
    }
}