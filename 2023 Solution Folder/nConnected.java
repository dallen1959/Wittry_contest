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
        if (str.length() < 2)
            return str.length();

        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int ans = 1;

        for(int k = 0; k < alpha.length(); k++)
        {
            int t = 0;
            String d = alpha.substring(k, k+1);
            while (str.indexOf(d) >= 0)
            {
                d = d + alpha.substring(k, k+1);
                t +=1;
            }
            ans = Math.max(ans, t);
        }

        return ans;
    }

    /*
     *   str != null
     *   k > 0
     */
    public static String rotateKitems(String str, int k)
    {
        List<String> connected = new ArrayList<String>();
        connected.add(str);
        int maxN = getNConnected(str);

        String temp = str;
        String ans = str.substring(k) + str.substring(0, k);
        while ( !ans.equals(temp) )
        {
            if ( getNConnected(ans) > maxN)
            {
                connected = new ArrayList<String>();
                connected.add(ans);
                maxN = getNConnected(ans);
            }
            else if ( getNConnected(ans) == maxN)
            {
                connected.add(ans);
            }
            ans = ans.substring(k) + ans.substring(0, k);
        }

        ans = connected.get(0);
        for (String s : connected)
           if ( ans.compareTo(s) > 0)
              ans = s;

        return ans;
    }

}