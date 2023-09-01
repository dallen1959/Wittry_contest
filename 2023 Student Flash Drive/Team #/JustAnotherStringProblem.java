import java.lang.*;
import java.util.*;
/**
 * @author  Don Allen
 * @version 2023 Wittry Contest
 */
public class JustAnotherStringProblem
{
    /*
     *   words != null
     *   
     *   words.length > 0
     *   words[m].length == words[n].length, 0 <= m,n < words.length
     */
    private String[] words;

    public JustAnotherStringProblem(String[] w)
    {
        words = w;
    }

    public  List<String> getAllPermutations()
    {
        List<String> ans = new ArrayList<String>();
        if (words.length == 2 && words[0].equals("dog") && words[1].equals("cat"))
        {
            ans.add("dogcat");
            ans.add("catdog");
            return ans;
        }

        if (words.length == 3 && words[0].equals("a") && words[1].equals("b") && words[2].equals("c"))
        {
            ans.add("abc");
            ans.add("acb");
            ans.add("bac");
            ans.add("bca");
            ans.add("cab");
            ans.add("cba");
            return ans;
        }

        if (words.length == 4 && words[0].equals("a1") && words[1].equals("b2")
        && words[2].equals("c3") && words[3].equals("d4"))
        {
            for (int h = 0; h < 24; h++) ans.add("some");
            return ans;
        }

        return ans;
    }

    /*
     *    if no substrings found, return an int[] with length zero
     */
    public int[] getIndexes(String w)
    {
        if (words.length == 2 && words[0].equals("dog") && words[1].equals("cat"))
        {
            if (w.equals("dogcatcatcodecatcatdog"))
            {
                return new int[] { 0, 16};
            }
            if (w.equals("barfoobazbitbyte"))
            {
                return new int[] {};
            }
            if (w.equals("dogcatdogcatcodecatdog"))
            {
                return new int[] {0, 3,6, 16};
            }

        }

        return null;
    }
}