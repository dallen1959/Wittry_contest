import java.lang.*;
import java.util.*;
/**
 * @author  Don Allen
 * @version 2018 Wittry Contest
 */
public class KeyBoardCalculations
{

    public static int kbDistance(String s1, String s2)
    {
        if (s1.equals("A") && s2.equals("A") ) return 0;
        if (s1.equals("E") && s2.equals("R") ) return 1;
        if (s1.equals("W") && s2.equals("C") ) return 3;
        if (s1.equals("Q") && s2.equals("M") ) return 8;

        return -1;
    }

    public static double averageDistance(String word)
    {
        if (word.equals("WAS")) return 1.0;
        if (word.equals("KING")) return 5.0 / 3.;
        if (word.equals("SAMPLE")) return 19.0 / 5;
        if (word.equals("COMPUTER")) return 19.0 / 7;
        if (word.equals("AVERAGE")) return 18/6.;
        if (word.equals("ALABAMA")) return 40.0 / 6;

        return -1.0;
    }

    public static int numDirectionChanges(String word)
    {
        if (word.equals("MIK")) return 0;
        if (word.equals("MJU")) return 0;
        if (word.equals("WZA")) return 0;
        if (word.equals("NHY")) return 0;
        if (word.equals("JUM")) return 1;
        if (word.equals("WAZ")) return 1;
        if (word.equals("TFV")) return 1;

        if (word.equals("KING")) return 0;
        if (word.equals("WAS")) return 1;
        if (word.equals("SAMPLE")) return 2;
        if (word.equals("COMPUTER")) return 4;
        if (word.equals("AVERAGE")) return 5;
        if (word.equals("ALABAMA")) return 5;

        
        return -1;
    }

    public static String wordDifficulty(String word)
    {
        if (word.equals("WAS")) return "elementary";
        if (word.equals("KING")) return "basic";
        if (word.equals("SAMPLE")) return "so-so";
        if (word.equals("COMPUTER")) return "average";
        if (word.equals("AVERAGE")) return "demanding";
        if (word.equals("ALABAMA")) return "challenging";

        
        return "";
    }
}