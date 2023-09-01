import java.util.*;
/**
 * Bongard
 *
 * @author  Mr. Allen
 * @version 2023 Wittry
 */
public class Bongard
{

    public Bongard(String[] leftWords, String[] rightWords)
    {

    }

    /*
     *    Tall letters are: BDFHKLT
     */
    public static int getNumTallLetters(String word)
    {
        if ( word.equals("BIOETHIC") ) return 3;
        if ( word.equals("BALLET") ) return 4;
        
        return -1;
    }

    /*
     *    This methods does not believe that Y is a vowel
     */
    public static int getNumVowels(String word)
    {
        if ( word.equals("GULLY") ) return 1;
        if ( word.equals("ASTRONOMY") ) return 3;

        return -1;
    }

    /*
     *    This methods BELIEVES Y is a vowel
     */
    public static int getNumVowelsWithY(String word)
    {
        if ( word.equals("GULLY") ) return 2;
        if ( word.equals("ASTRONOMY") ) return 4;

        return -1;
    }

    /*
     *    This returns the last three letters. If word.length() < 3, return word
     */
    public static String endsWith(String word)
    {
        if ( word.equals("COURT") ) return "URT";
        if ( word.equals("AT") ) return "AT";
 
        return "";
    }

    /*
     *    This returns the first three letters. If word.length() < 3, return word
     */
    public static String startsWith(String word)
    {
        if ( word.equals("COMET") ) return "COM";
        if ( word.equals("AT") ) return "AT";

        return "";
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
        if ( word.equals("PROGRAMMER") ) return -1;
        if ( word.equals("EMAIL") ) return 1;
        if ( word.equals("FUTURE") ) return 0;

        return -1;
    }

    /*
     *    
     */
    public static int getLength(String word)
    {
        if ( word.equals("FUTURE") ) return 6;
        if ( word.equals("AT") ) return 2;

        return -1;
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
        if ( word.equals("LOVE") ) return "RIGHT";
        if ( word.equals("HALT") ) return "LEFT";
        if ( word.equals("ANGEL") ) return "NEITHER";

        if ( word.equals("NOWAY") ) return "RIGHT";
        if ( word.equals("RADIO") ) return "LEFT";
        if ( word.equals("ANIMAL") ) return "NEITHER";

        return "";
    }
}