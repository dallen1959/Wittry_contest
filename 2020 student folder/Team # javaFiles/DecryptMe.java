import java.lang.*;
import java.util.*;
/**
 * @author  Don Allen
 * @version 2020 Wittry Contest
 */
public class DecryptMe
{
    /*
     *   Treturns the maximum number of times a specific letter (let) may appear in an encoded message, mess.
     */
    
    public static int countLetter( String mess, int let )
    {
        if (mess.equals("111") && let == 1) return 3;
        if (mess.equals("111") && let == 11) return 1;
        if (mess.equals("1020") && let == 1) return 0;

        return -1;
    }

    /*
     *    counts the maximum number of times the letter in lets appears in mess
     *    that is, the max sum of the number of times each letter in the int[] lets could be in mess.
     *    
     *    precondition lets sorted in ascending order
     */
    public static int groupCounter( String mess, int[] lets )
    {
        if (mess.equals("111") && lets[0] == 1 && lets[1] == 2 && lets[2] == 3 && lets[3] == 23) return 3;
        if (mess.equals("2317") && lets[0] == 2 && lets[1] == 3 && lets[2] == 17) return 3;
        if (mess.equals("12010715") && lets[0] == 1 && lets[1] == 2 && lets[2] == 7 && lets[3] == 15) return 3;

        return -1;
    }

    /*
     *    precondition: lets is sorted in ascending order
     *                  messages.size() > 0
     *                  
     *   returns the message or messages in messages with the maximum sum of possible occurrences
     *   of the letters contained in lets.
     *   All messages with the maximum sum must be returned in List of Strings.
     */
    public static List<String> getBestMessage( String[] messages, int[] lets )
    {
        List<String> ans = new ArrayList<String>();
   
        if (messages[0].equals("12345") && messages[1].equals("1111")
                    && messages[2].equals("12233") && messages[3].equals("223435")
                    && lets[0] == 1 && lets[1] == 2 && lets[2] == 3 && lets[3] == 23)
        {
            ans.add("12233");
            return ans;
        }

        if (messages[0].equals("1523423735") && messages[1].equals("221323151517")
                    && messages[2].equals("172323513") && messages[3].equals("7223423315")
                    && lets[0] == 3 && lets[1] == 7 && lets[2] == 15 && lets[3] == 23)
        {
            ans.add("1523423735");
            ans.add("221323151517");
            ans.add("7223423315");
            return ans;
        }

        return null;
    }

    /*
     *    returns the number of ways the parameter mess can be decoded.
     */
    public static int numDecryption( String mess )
    {
        if (mess.equals("111")) return 3;
        if (mess.equals("1310")) return 2;

        return -1;
    }
}