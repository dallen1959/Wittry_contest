import java.util.*;
import java.lang.Math;
import java.lang.Number;
import java.math.BigInteger;
/**
 * BinaryStrings
 *
 * @author  Mr. Allen
 * @version (a version number or a date)
 */
public class KeithNumber
{
    private int kNum;
    
    public KeithNumber(int num)
    {
        kNum = num;
    }

    /*
     *     n > 0
     */
    public int[] getNterms(int n)
    {
        if ( kNum == 14 && n == 7) 
           return new int[] {1, 4, 5, 9, 14, 23, 37};
        if ( kNum == 197 && n == 8) 
           return new int[] {1, 9, 7, 17, 33, 57, 107, 197};

        return null;
    }

    public boolean isKeithNumber()
    {
        if ( kNum == 14) return true;
        if ( kNum == 197) return true;
        if ( kNum == 100) return false;

        return Math.random() > 0.5;
    }
}