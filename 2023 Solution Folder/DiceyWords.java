import java.lang.*;
import java.util.*;
/**
 * @author  Don Allen
 * @version 2021 Wittry Contest
 */
public class DiceyWords
{
    /* 
     *    four 6-sided dice
     *       no letter appears on more tha one die
     *       and no letter may appear more than once on a die
     *       EVERY LETTER IS A CAPITAL LETTER 
     */
    private String[] myDice = new String[4];

    public DiceyWords(String[][] die)
    {
        myDice[0] = "";
        myDice[1] = "";
        myDice[2] = "";
        myDice[3] = "";
        for (int h = 0; h < myDice.length; h++)
        {
            for (String s: die[h])
                myDice[h] += s;
        }
    }

    /*
     *   words contains strings of length 4
     *   
     *   Return a List<String> containing all Strings in the parameter words
     *          that cannot be spelled given the four die
     */
    public List<String>	getImpossibleWords(ArrayList<String> words)
    {
        List<String> ans = new ArrayList<String>();
        int count = 0;
        for (String w : words)
        {
            for (String md: myDice)
            {
                boolean moreThan1 = false;
                for (int m = 0; m < w.length(); m++)
                    if ( !moreThan1 && md.indexOf(w.substring(m, m+1)) >= 0)
                    {
                        count++;
                        moreThan1 = true;
                    }
            }
            if (count< 4)
                ans.add(w);
            count = 0;
        }
        return ans;
    }

    /*
     *   words contains strings of length 4
     *   
     *   die contains 3 die with 6 different letters
     *       no letter appears more than once on a die
     *       and no letter may appear on more than 1 die
     * 
     *    return a String containing each letter required on the 4th die
     *     such that each word in words could be spelled with when the 4th die
     *     is added to the original three die
     */
    public static String missingDie(String[][] die, ArrayList<String> words)
    {
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (String[] dice : die)
            for ( String d : dice)
            {
                int ind = alpha.indexOf(d);
                if ( ind >= 0)

                    alpha = alpha.substring(0, ind) + alpha.substring(ind+1);
            }

        String[] ans = new String[26-6*3];
        int ind = 0;
        for (String s : words)
        {
            for (int m = 0; m < s.length(); m++)
            {
                int index = alpha.indexOf(s.substring(m, m+1));
                if (index >= 0)
                {
                    ans[ind] = s.substring(m, m+1);
                    ind++;
                    alpha =  alpha.substring(0, index) +  alpha.substring(index + 1);
                }
            }
        }
        alpha = "";
        for (String s : ans)
            if (s != null)
                alpha += s;

        return alpha;
    }

    /*
     *   return a list of letters on the four die not found in any word in words
     */
    public String unusedLetters(ArrayList<String> words)
    {
        String alpha = "";
        for (String dice : myDice)
            alpha = alpha + dice;

        for (String w : words)
        {
            for (int m = 0; m < w.length(); m++)
            {
                int index = alpha.indexOf(w.substring(m, m+1));
                if ( index >= 0)
                    alpha = alpha.substring(0, index) + alpha.substring(index + 1);
            }
        }

        // String[] ans = new String[alpha.length()];
        // for (int e = 0; e < ans.length; e++)
            // ans[e] = alpha.substring(e, e+1);
        return alpha;
    }

    //  unused now - original problem ?
    public List<String> getDice(List<String> words, int numDice)
    {
        List<String> dice = new ArrayList<String>();

        String letters = "";
        for (String w : words)
            for (int i = 0; i < w.length(); i++)
                letters = letters + w.substring(i, i+1);

        int index = 0;
        while (index < numDice)
        {
            for (int a1 = 0; a1 < letters.length() - numDice+1; a1++)
                for (int a2 = a1+1; a2 < letters.length() - numDice+2; a2++)
                    for (int a3 = a2+1; a3 < letters.length() - numDice+3; a3++)
                        for (int a4 = a3+1; a4 < letters.length() - numDice+4; a4++)
                            for (int a5 = a4+1; a5 < letters.length() - numDice+5; a5++)
                                for (int a6 = a5+1; a6 < letters.length() - numDice+6; a6++)
                                /*
                                 *         need to rethink what is ging on here....
                                 *         
                                 *         
                                dice.set(index, dice.get(index)+ letters.substring(a1, a1+1));
                                 */                                
                                    if (isGoodDice(words, dice))
                                        return dice;
        }
        return null;
    }

    /*
     *
     */
    private boolean isGoodDice(List<String> words, List<String> dice)
    {
        for(String w : words)
            for(String d : dice)
                if (d.indexOf(w) < 0) return false;

        return true;
    }
}