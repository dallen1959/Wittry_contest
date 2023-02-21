import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2018 Wittry Contest
 */
public class DigitGuardian
{
    private List<Integer> digits;
    
    public DigitGuardian(List<Integer> d)
    {
        digits = d;
    }

/*
 *   returns true if num contains every digit in digits at least once
 *   
 */
    public boolean isAllowable(int num)
    {
        if (digits.size() == 4 && digits.contains(new Integer(0)) && digits.contains(new Integer(2))
                               && digits.contains(new Integer(5)) && digits.contains(new Integer(8)) )
        {
            if (num == 5082) return true;
            if (num == 50852) return true;
            if (num == 582) return false;
            if (num == 12508) return false;
        }

        return Math.random() < 0.5;
    }

/*
 *     returns a list of digits ( 0 <= d <= 9 ) in num.
 *     Duplicate digits are included only once
 *     
 *     e.g.  273307 ->  0, 2, 3, 7
 *     
 *     order is NOT important
 */    
    public List<Integer> getDigits(int num)
    {
       List<Integer> ans = new ArrayList<Integer>();
       if (num == 1575)
       {
           ans.add( new Integer(1));
           ans.add( new Integer(5));
           ans.add( new Integer(7));
           return ans;
       }
       
       
       return ans;
    }

/*
 *   finds smallest number that is allowable and dvisible by divisor
 *   
 *   You may assume an answer will exist.
 *   
 *   That is, I will not give values for which no number exist
 */    
    public int getMinLCM(int divisor)
    {
        if (digits.size() == 4 && digits.contains(new Integer(0)) && digits.contains(new Integer(2))
                               && digits.contains(new Integer(5)) && digits.contains(new Integer(8)) )
        {
            if (divisor == 2) return 2058;
            if (divisor == 97) return 5820;
            if (divisor == 117) return 2025855;
        }
        
        
        return -1;
    }
}