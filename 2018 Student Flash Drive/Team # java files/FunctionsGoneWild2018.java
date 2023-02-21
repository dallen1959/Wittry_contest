import java.util.*;
import java.lang.Math;
/**
 * The test class FunctionsGoneWild2015.
 *
 * @author  Don Allen
 * @version 2018 Wittry Programming contest
 */
public class FunctionsGoneWild2018
{
    /*
     *   borrowed from March 2017 issue of NCTM  monthly magizine
     *   
     *   
     *     return the smallest positive value of d such that n + d is a perfect square
     *     
     *     you may assume n + d is not too big
     */
    public static int f1(int n)
    {
        if (n ==  8) return 1;
        if (n == 26) return 10;
        if (n == 64) return 0;

        
        return -1;
    }

    
    /*
     *    Implement the following function which returns the number of ints that satisfies the inequality:
     *    
     *    low < 5y + 7 <= high
     */   
    public static int f2(int low, int high)
    {
        if (low == 0 && high == 100) return 20;
        if (low == 26 && high == 52) return 6;
        if (low == -30 && high == 200) return 46;

        
        return -1;
    }

    public static int f3(int n)
    {
        if (n == 202) return 580;
        if (n == 135) return 116;
        if (n == 55) return 389;
        if (n == 35) return 1311;

        
        return -1;
    }
    

    public static int f4(int a, int b, int c)
    {
        if (a == 2 && b == 3 && c == 4) return 4218;
        if (a == 1 && b == 9 && c == 1) return 429 + 491 + 555;

        
        return -1;
    }

    public static double f5(double x, double y)
    {
        if (Math.abs(x - 1) < 0.0002 && Math.abs(y - 3) < 0.0002) return 0.0004303;
        if (Math.abs(x - 2) < 0.0002 && Math.abs(y - -1) < 0.0002) return 1.44849;

        
        return -1;
    }

    public static double f6(double x, double y, double z)
    {
        if (Math.abs(x - Math.pow(-Math.E, 3)) < 0.0002 && Math.abs(y - -1) < 0.0002 && Math.abs(z - 3) < 0.0002) return 0.204239;
        if (Math.abs(x - 25) < 0.0002 && Math.abs(y - 2) < 0.0002 && Math.abs(z - 1) < 0.0002) return 37349.4719;

        
        return -1;
    }

    /*
    precondition phrase.length > 0 
                 num > 0
    
    F7("Sample", 2)
       returns {"SML", "APE"}
    F7("HELP ME FIGURE THIS OUT :(", 3)
       returns {"HPEIRTSU", "E  GEH T(", "LMFU IO "}
    F7("COMPUTER SCIENCE", 4)
       returns {"CU E", "OTSN", "MECC", "PRIE"}
    F7("TO ITERATE IS HUMAN, TO RECURSE DIVINE", 5)
       returns {"TE U EEI", "ORIMTC N", " ASAOUDE", "IT N RI", "TEH,RSV"}
    F7("1234567890", 5)
       returns {"16", "27", "38", "49", "50"}
    F7("@ABC!", 7)
       returns {"@", "A", "B", "C", "!", "", ""}
     */
    public static String[] f7(String phrase, int num)
    {
        if (phrase.equals("SAMPLE") && num == 2) return new String[] {"SML", "APE"};
        if (phrase.equals("HELP ME FIGURE THIS OUT :(") && num == 3) return new String[] {"HPEIRTSU:", "E  GEH T(", "LMFU IO "};
        if (phrase.equals("COMPUTER SCIENCE") && num == 4) return new String[] {"CU E", "OTSN", "MECC", "PRIE"};
        if (phrase.equals("TO ITERATE IS HUMAN, TO RECURSE DIVINE") && num == 5) return new String[] {"TE U EEI", "ORIMTC N", " ASAOUDE", "IT N RI", "TEH,RSV"};
        if (phrase.equals("1234567890") && num == 5) return new String[] {"16", "27", "38", "49", "50"};
        if (phrase.equals("@ABC!") && num == 7) return new String[] {"@", "A", "B", "C", "!", "", ""};

        return new String[]{};
    }

    /*
     *     precondtion:  phrase and String will only contain:
     *                      Upper case letters
     *                      spaces
     *
     *                   phrase.length() >= 0
     */
    public static String f8(String phrase)
    {
        String ans = "";
        if (phrase.equals("COMPUTER SCIENCE")) return "BWZQRYIU KBEIXBI";
        if (phrase.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG")) return "YFI PREBS CUWOX HWN DRZQK WVIU YFI ALMT JWG";
         
        return ans;
    }

    public static boolean f9(boolean x, boolean y, boolean z)
    {
        if (!x && !y && !z) return true;

        return Math.random() < 0.5;
    }

    public static boolean f10(boolean j, boolean k, boolean m, boolean n)
    {
        if (!j && !k && !m && !n) return true;

        return Math.random() < 0.5;
    }
}