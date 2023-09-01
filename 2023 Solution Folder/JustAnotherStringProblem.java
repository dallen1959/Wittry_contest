import java.lang.*;
import java.util.*;
/**
 * @author  Don Allen
 * @version 2021 Wittry Contest
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
        int len = words[0].length();
        List<String> allStrings = new ArrayList<String>();
        allStrings.add(words[0]);

        for (int i = 1; i < words.length; i++)
        {
            List<String> temp = new ArrayList<String>();
            for(int m = 0; m < allStrings.size(); m++)
            {
                String t = allStrings.get(m);
                for (int ind = 0; ind <= i; ind++)
                    if (ind == 0) temp.add(words[i] + t);
                    else
                        temp.add(t.substring(0, len * ind)
                            + words[i] + t.substring(len * ind));
            }
            allStrings = temp;
        }
        return allStrings;
    }

/*
 *    if no substrings found, return an int[] with length zero
 */
    public int[] getIndexes(String w)
    {
        List<Integer> num = new ArrayList<Integer>();

        List<String> theWords = getAllPermutations();
        for (String str : theWords )
        {
            String temp = w;
            int ind = temp.indexOf(str);
            int index = ind;
            while (ind >= 0)
            {
                num.add(new Integer(index));
                temp = temp.substring(ind+1);
                ind = temp.indexOf(str);
                index = index + ind + 1;
            }
        }
        
        int[] ans = new int[num.size()];
        for (int k = 0; k < ans.length; k++)
           ans[k] = num.get(k).intValue();
           
        Arrays.sort(ans);
           
        return ans;   
    }
}