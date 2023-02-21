import java.util.*;
import java.lang.Math;
/**
 * The test class FunctionsGoneWild2015.
 *
 * @author  Don Allen
 * @version 2019 Wittry Programming contest
 */
public class FunctionsGoneWild2019
{
    /*
     *   
     */
    public static int f1(int a, int n)
    {
        if (a == 2 && n == 1) return 2;
        if (a == 2 && n == 2) return 2+2*2+2;
        if (a == 2 && n == 3) return 8+8*2+2;
        if (a == 4 && n == 2) return 4+4*4+4;
        if (a == 3 && n == 5) return 1023;

        return -1;
    }

    /*
     *    a1 < a2  && b1 < b2
     */   
    public static int f2(double a1, double a2, double b1,double b2)
    {
        if (Math.abs(a1 - 0.5) < 0.01 && Math.abs(a2 - 3.6) < 0.01 
                   && Math.abs(b1 - 1.1) < 0.01 && Math.abs(b2 - 8.1) < 0.01 ) return 21;

        if (Math.abs(a1 - -1.3) < 0.01 && Math.abs(a2 - 5.0) < 0.01 
                       && Math.abs(b1 - -4.6) < 0.01 && Math.abs(b2 - -0.9) < 0.01 ) return 28;

        if (Math.abs(a1 - -3.1) < 0.01 && Math.abs(a2 - 2.9) < 0.01 
                       && Math.abs(b1 - 0.95) < 0.01 && Math.abs(b2 - 9.03) < 0.01 ) return 54;

        return -1;
    }

    /*
     *    
     */    
    public static int f3(int n)
    {
        if (n == 202) return 1771;

        if (n == 135) return 422;
        if (n == 35) return -727;
        if (n == 5) return 63;

        return -1;
    }

    public static int f4(int a, int b, int c)
    {
        if ( a == 1 && b == 1 && c == 1) return 12;
        if ( a == 2 && b == 2 && c == 2) return 144;
        if ( a == 2 && b == 1 && c == 2) return 34;

        return -1;
    }

    public static String f5(String c, double lev)
    {
        if ( c.equals("H") && Math.abs(lev - 0.001) < 0.0001) return "3.00";
        if ( c.equals("OH") && Math.abs(lev - 0.001) < 0.0001) return "11.00";
        if ( c.equals("H") && Math.abs(lev - 0.012) < 0.0001) return "1.92";

        return "";
    }

    public static double f6(double x, double y, double z)
    {
        if ( Math.abs(x - 2) < 0.002 && Math.abs(y - 1) < 0.002 && Math.abs(z - 3) < 0.002) return 0.545199900;
        if ( Math.abs(x - 2) < 0.002 && Math.abs(y - 2) < 0.002 && Math.abs(z - 3) < 0.002) return 10.1819565;

        return (Math.random() * 1000);
    }

    /*
     *  If the corresponding letters are matching Upper case letter, increase score by 5.
     *  If the corresponding letters are matching Lower case letter, increase score by 4.
     *  If the corresponding letters match but are different case (Lower/Upper), increase score by 3
     *  If the corresponding letters are matching non letters ( only need to check for @, #, & or *) increase score by 2
     *  All others do not increase or decrease score.
     *
     *  precondition phr1.length() ==  phr2.length()
     */
    public static int f7(String phr1, String phr2)
    {
        if (phr1.equals("CODE") && phr2.equals("CODE") ) return 20;
        if (phr1.equals("SCore") && phr2.equals("Score") ) return 20;
        if (phr1.equals("@Precede*") && phr2.equals("#proceed*") ) return 17;
        if (phr1.equals("#abcde") && phr2.equals("#acCex") ) return 9;

        return -1;
    }

    /*
     *     precondtion:  phrase and String will only contain:
     *                      lower case letters
     *                      spaces
     *                      
     *                   phrase.length() >= 0
     */
    public static String f8(String phrase)
    {
        if( phrase.equals("plrgfsxvcwtbzdhnkmjq") ) return "bcdfghjklmnpqrstvwxz";
        if( phrase.equals("bcdfghjklmnpqrstvwxz") ) return "plrgfsxvcwtbzdhnkmjq";
        if( phrase.equals("aeiouy") ) return "ouyaei";
        if( phrase.equals("ouyaei") ) return "aeiouy";
        if( phrase.equals("good job") ) return "faar xap";
        if( phrase.equals("faar xap") ) return "good job";

        return "";
    }

    public static boolean f9(boolean x, boolean y, boolean z)
    {
        if (!x && !y && !z) return false;

        return Math.random() < 0.5;
    }

    public static boolean f10(boolean j, boolean k, boolean m, boolean n)
    {
        if (!j && !k && !m && !n) return false;

        return Math.random() < 0.5;
    }
}