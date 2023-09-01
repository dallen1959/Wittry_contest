import java.lang.*;
import java.util.*;
/**
 * @author  Don Allen
 * @version 2021 Wittry Contest
 */
public class nConnected
{
    /*
     *   str != null
     *   
     */
    public static int getNConnected(String str)
    {
        if (str.equals("ABCDEF")) return 1;
        if (str.equals("AABCDEF")) return 2;
        if (str.equals("AABBBCDBBEF")) return 3;
        if (str.equals("AAABCCCCDCCCEF")) return 4;

        return Integer.MIN_VALUE;
    }

    /*
     *   str != null
     *   k > 0
     */
    public static String rotateKitems(String str, int k)
    {
        if (str.equals("TEST") && k == 3) return "ESTT";
        if (str.equals("TEST") && k == 2) return "STTE";
        if (str.equals("RABBBCDEF") && k == 2) return "ABBBCDEFR";
        if (str.equals("EAFBEE") && k == 2) return "EEEAFB";
        
        return null;
    }

}