import java.util.*;
/**
 * Bongard
 *
 * @author  Mr. Allen
 * @version 2021 Wittry
 */
public class Bongard
{
    private static final String RIGHT = "RIGHT";
    private static final String LEFT = "LEFT";
    private static final String NEITHER = "NEITHER";

    private String[] leftBox;
    private String[] rightBox;
    //                          tallLetters, Vowels, vowelsY, endwith, startWith, plusMinus, length
    private String[] leftProperties;
    private String[] rightProperties;

    public Bongard(String[] leftWords, String[] rightWords)
    {
        leftBox = leftWords;
        leftProperties = new String[7];
        leftProperties[0] = ""+getNumTallLetters(leftBox[0]);
        leftProperties[1] = ""+getNumVowels(leftBox[0]);
        leftProperties[2] = ""+getNumVowelsWithY(leftBox[0]);
        leftProperties[3] = endsWith(leftBox[0]);
        leftProperties[4] = startsWith(leftBox[0]);
        leftProperties[5] = ""+getPlusMinus(leftBox[0]);
        leftProperties[6] = ""+getLength(leftBox[0]);
        for(int t = 1; t < leftBox.length; t++)
        {
            if (!leftProperties[0].equals(""+getNumTallLetters(leftBox[t]))) leftProperties[0] = "";
            if (!leftProperties[1].equals(""+getNumVowels(leftBox[t]))) leftProperties[1] = "";
            if (!leftProperties[2].equals(""+getNumVowelsWithY(leftBox[t])))  leftProperties[2] = "";
            if (!leftProperties[3].equals(endsWith(leftBox[t])))  leftProperties[3] = "";
            if (!leftProperties[4].equals(startsWith(leftBox[t])))  leftProperties[4] = "";
            if (!leftProperties[5].equals(""+getPlusMinus(leftBox[t])))  leftProperties[5] = "";
            if (!leftProperties[6].equals(""+getLength(leftBox[t])))  leftProperties[6] = "";
        }

        rightBox = rightWords;
        rightProperties = new String[7];
        rightProperties[0] = ""+getNumTallLetters(rightBox[0]);
        rightProperties[1] = ""+getNumVowels(rightBox[0]);
        rightProperties[2] = ""+getNumVowelsWithY(rightBox[0]);
        rightProperties[3] = endsWith(rightBox[0]);
        rightProperties[4] = startsWith(rightBox[0]);
        rightProperties[5] = ""+getPlusMinus(rightBox[0]);
        rightProperties[6] = ""+getLength(rightBox[0]);
        for(int t = 1; t < rightBox.length; t++)
        {
            if (!rightProperties[0].equals(""+getNumTallLetters(rightBox[t]))) rightProperties[0] = "";
            if (!rightProperties[1].equals(""+getNumVowels(rightBox[t]))) rightProperties[1] = "";
            if (!rightProperties[2].equals(""+getNumVowelsWithY(rightBox[t])))  rightProperties[2] = "";
            if (!rightProperties[3].equals(endsWith(rightBox[t])))  rightProperties[3] = "";
            if (!rightProperties[4].equals(startsWith(rightBox[t])))  rightProperties[4] = "";
            if (!rightProperties[5].equals(""+getPlusMinus(rightBox[t]))) rightProperties[5] = "";
            if (!rightProperties[6].equals(""+getPlusMinus(rightBox[t]))) rightProperties[6] = "";
        }
    }

    /*
     *    all words will be in ALL CAPS
     *    
     *    returns "LEFT"
     *        if word belongs to leftbox
     *        
     *    returns "RIGHT"
     *        if word belongs to rightbox
     *        
     *    returns "NEITHER"
     *        if word does not belong to either box
     */
    public String whichBox(String word)
    {
        String side = LEFT;
        if (!leftProperties[0].equals(""))
            if ( !(""+getNumTallLetters(word)).equals(leftProperties[0]))
                side = RIGHT;

        if (!leftProperties[1].equals(""))
            if ( !(""+getNumVowels(word)).equals(leftProperties[1]))
                side = RIGHT;

        if (!leftProperties[2].equals(""))
            if ( !(""+getNumVowelsWithY(word)).equals(leftProperties[2]))
                side = RIGHT;

        if (!leftProperties[3].equals(""))
            if ( !(endsWith(word)).equals(leftProperties[3]))
                side = RIGHT;

        if (!leftProperties[4].equals(""))
            if ( !(startsWith(word)).equals(leftProperties[4]))
                side = RIGHT;

        if (!leftProperties[5].equals(""))
            if ( !(""+getPlusMinus(word)).equals(leftProperties[5]))
                side = RIGHT;

        if (!leftProperties[6].equals(""))
            if ( !(""+getLength(word)).equals(leftProperties[6]))
                side = RIGHT;

        if (side.equals(LEFT))
            return side;

        if (!rightProperties[0].equals(""))
            if ( !(""+getNumTallLetters(word)).equals(rightProperties[0]))
                side = NEITHER;

        if (!rightProperties[1].equals(""))
            if ( !(""+getNumVowels(word)).equals(rightProperties[1]))
                side = NEITHER;

        if (!rightProperties[2].equals(""))
            if ( !(""+getNumVowelsWithY(word)).equals(rightProperties[2]))
                side = NEITHER;

        if (!rightProperties[3].equals(""))
            if ( !(endsWith(word)).equals(rightProperties[3]))
                side = NEITHER;

        if (!rightProperties[4].equals(""))
            if ( !(startsWith(word)).equals(rightProperties[4]))
                side = NEITHER;

        if (!rightProperties[5].equals(""))
            if ( !(""+getPlusMinus(word)).equals(rightProperties[5]))
                side = NEITHER;

        if (!rightProperties[6].equals(""))
            if ( !(""+getLength(word)).equals(rightProperties[6]))
                side = NEITHER;

        return side;
    }

    /*
     *    Tall letters are: BDFHKLT
     */
    public static int getNumTallLetters(String word)
    {
        int ans = 0;
        String vowels = "BDFHKLT";
        for (int g = 0; g < word.length(); g++)
            if (vowels.indexOf( word.substring(g, g+1)) >= 0)
                ans++;
        return ans;
    }

    /*
     *    This methods does not believe that Y is a vowel
     */
    public static int getNumVowels(String word)
    {
        int ans = 0;
        String vowels = "AEIOU";
        for (int g = 0; g < word.length(); g++)
            if (vowels.indexOf( word.substring(g, g+1)) >= 0)
                ans++;
        return ans;
    }

    /*
     *    This methods BELIEVES Y is a vowel
     */
    public static int getNumVowelsWithY(String word)
    {
        int ans = 0;
        String vowels = "AEIOUY";
        for (int g = 0; g < word.length(); g++)
            if (vowels.indexOf( word.substring(g, g+1)) >= 0)
                ans++;
        return ans;
    }

    /*
     *    This returns the last three letters. If word.length() < 3, return word
     */
    public static String endsWith(String word)
    {
        if (word.length() <= 3) return word;

        return word.substring(word.length()-3);
    }

    /*
     *    This returns the first three letters. If word.length() < 3, return word
     */
    public static String startsWith(String word)
    {
        if (word.length() <= 3) return word;

        return word.substring(0, 3);
    }

    /*
     *    Compares number of vowels versus the consonants.
     *    
     *       negative num indicates num more consonants thans vowels
     *    
     *       positive num indicates num fewer consonants than vowels
     *       
     *       zero indicates same number of vowels as consonants
     */
    public static int getPlusMinus(String word)
    {
        int count = 0;
        for  (int m = 0; m < word.length(); m++) 
        {
            if ("AEIOU".indexOf(word.substring(m , m+1)) >= 0)
                count++;
            else
                count--;
        }

        return count;
    }

    /*
     *    
     */
    public static int getLength(String word)
    {
        return word.length();
    }
}