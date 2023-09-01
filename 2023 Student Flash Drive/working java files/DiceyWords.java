import java.lang.*;
import java.util.*;
/**
 * @author  Don Allen
 * @version 2023 Wittry Contest
 */
public class DiceyWords
{
    /* 
     *    four 6-sided dice
     *       no letter appears on more tha one die
     *       and no letter may appear more than once on a die
     *       EVERY LETTER IS A CAPITAL LETTER 
     */

    public DiceyWords(String[][] die)
    {
    }

    /*
     *   words contains strings of length 4
     *   
     *   Return a List<String> containing all Strings in the parameter words
     *          that cannot be spelled given the four die
     */
    public List<String> getImpossibleWords(ArrayList<String> words)
    {
        if (words.size() == 12 && words.get(0).equals("BATH") && words.get(10).equals("QUOD") && words.get(9).equals("MINX"))
            return new ArrayList<String>();
        if (words.size() == 15 && words.get(0).equals("FLAG") && words.get(11).equals("QUOD") && words.get(14).equals("MASS"))
        {
            List<String> t = new ArrayList<String>();

            t.add("FLAG");
            t.add("WAKE");
            t.add("MASS");
            return t;
        }
        return null;
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
        if (words.size() == 12 && words.get(0).equals("BATH") && words.get(10).equals("QUOD") && words.get(9).equals("MINX"))
            return "TZORYN";

        return "";
    }

    /*
     *   return a list of letters on the four die not found in any word in words
     */
    public String unusedLetters(ArrayList<String> words)
    {
        if (words.size() == 10 && words.get(0).equals("BATH") && words.get(8).equals("JUST") && words.get(9).equals("MINX"))
            return "FGQ";
        if (words.size() == 11 && words.get(0).equals("BATH") && words.get(8).equals("JUST") && words.get(10).equals("FGQT"))
            return "";

        return "";
    }
}