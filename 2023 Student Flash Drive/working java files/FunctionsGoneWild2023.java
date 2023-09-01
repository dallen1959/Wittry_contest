import java.util.*;
import java.lang.Math;
/**
 * The test class FunctionsGoneWild2020.
 *
 * @author  Don Allen
 * @version 2023 Wittry Programming contest
 */
public class FunctionsGoneWild2023
{
    /*
     *   n > 1
     */
    public static String f1(int n)
    {
        if (n == 1234) return "BACK";
        if (n == 27826) return "FRONT";
        if (n == 527527) return "FRONTBACK";

        return "";
    }

    /*
     *    Given the String "d3739d0" and the number 60,
     *           return the number that replaces d so that d3739d0 is divisible by 60?
     *    div != 0
     *    
     *    str contains:
     *          at least one non zero digit
     *          str.indexOf("-") < 0;
     *          str may contain more than one d
     */   
    public static int f2(String str ,int div)
    {
        if (str.equals("d3739d0") && div == 60) return 4;
        if (str.equals("16d2d") && div == 60) return 0;
        if (str.equals("16d") && div == 7) return 1;
        
        return -1;
    }

    /*
     *    
     */    
    public static int f3(int n)
    {
        if (n == 22) return 400;
        if (n == 135) return 990;
        if (n == 501) return 470;
        if (n == 500) return 234;
        
        return -1;
    }

    public static int f4(int a, int b, int c)
    {
        if (a == 1 && b == 1 && c == 2) return 250;
        if (a == 3 && b == 2 && c == 6) return 44472;

        return -1;
    }

    public static double f5(String num)
    {
        if (num.equals("385-5395") ) return 3+2*Math.sqrt(2)+Math.sqrt(5);
        if (num.equals("1-372-485-6709") ) return 4+6*Math.sqrt(2)+2*Math.sqrt(5);

        return -1;
    }

    public static double f6(double x, double y, double z)
    {
        if (Math.abs(Math.PI/4. - x) < 0.001 && Math.abs(5*Math.PI/6. - y) < 0.001  && Math.abs(Math.PI/8 - z) < 0.001)
            return -0.4547921179;
        if (Math.abs(7*Math.PI/13. - x) < 0.001 && Math.abs(7*Math.PI/12. - y) < 0.001  && Math.abs(Math.PI/9 - z) < 0.001)
            return 5.83706310;

        return -1.;
    }

    /*
     */
    public static boolean f7(String ms, String sq)
    {
        if (ms.equals("xyz") && sq.equals("xz") ) return true;
        if (ms.equals("xyz") && sq.equals("zx") ) return false;

        return Math.random() > 0.5;
    }

    /*
     *     precondtion:  phrase will only contain:
     *                      Upper case letters
     *                      (Z)ERO, T(W)O, SI(X), FO(U)R, EI(G)HT
     *                      
     *                      (O)NE, T(H)(R)EE, (S)EVEN, (F)IVE
     *                      
     *                      (N)INE
     *                      
     *                   phrase.length() >= 0
     */
    public static String f8(String phrase)
    {
        if (phrase.equals("NIESEVEHRTFEEV") ) return "357";
        if (phrase.equals("WZOZEOERTROTWO") ) return "0022";

        return "";
    }

    public static boolean f9(boolean x, boolean y, boolean z)
    {
        if (!x && !y && !z) return false;

        return Math.random() > 0.5;
    }

    public static boolean f10(boolean j, boolean k, boolean m, boolean n)
    {
        if (!j && !k && !m && !n) return true;

        return Math.random() > 0.5;
    }
}