import java.util.*;
import java.lang.Math;
/**
 * The test class FunctionsGoneWild2020.
 *
 * @author  Don Allen
 * @version 2020 Wittry Programming contest
 */
public class FunctionsGoneWild2023
{
    /*
     *   n > 1
     */
    public static String f1(int n)
    {
        String num = ""+n;
        String front = "";
        String back = "";

        int len = num.length() / 2;
        if (num.length() % 2 == 1)
        {
            front = num.substring(0, len);
            back = num.substring(len + 1);
            String ch = num.substring(len, len+1);
        }
        else
        {
            front = num.substring(0, len);
            back = num.substring(len);
        }

        if ( front.compareTo(back) < 0)
            return "BACK";
        else if ( front.compareTo(back) == 0)
            return "FRONTBACK";

        return "FRONT";
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
        int ans = 0;
        String temp = str;
        while (temp.indexOf("d") >= 0)
        {
            int index = temp.indexOf("d");
            temp = temp.substring(0, index) + ans + temp.substring(index+1);
        }
        int num = Integer.parseInt(temp);

        while (num % div != 0)
        {
            ans++;
            temp = str;
            while (temp.indexOf("d") >= 0)
            {
                int index = temp.indexOf("d");
                temp = temp.substring(0, index) + ans + temp.substring(index+1);
            }
            num = Integer.parseInt(temp);
        }

        return ans;
    }

    /*
     *    
     */    
    public static int f3(int n)
    {
        if ( n >= 200)
        {
            if (n % 2 == 0)
                return f3((n*n+21) / (5*(n-5)) ) + (n/3);
            //   n is odd
            return f3( (7*n-13) / (3*(n-4))  + n/5) + 2;
        }
        if (n > 50)
            return (2*n+1)/3 + f3(2*n % (1+n/4));

        return (int) Math.pow(Math.abs(n - 2), n % 5 );
        //      return (int)(Math.random() * 1000);
    }

    public static int f4(int a, int b, int c)
    {
        int ans = 0;

        int finish = Math.min(2*a*b+c, 2*b*c+a);
        int start = Math.max(a*b-c, a*c-b);
        for (int i = start; i <= finish; i++)
        {
            int delta1 = ( (2*c*c*(a + b)) / (a + Math.abs(b - c))) * i * i;
            int delta2 = (Math.max(b,c) * Math.max(a*b, Math.abs(a-c))) / Math.max(Math.min(a*c,b*c), Math.min(2*b,3*c) )*i;
            int tans = delta1 + delta2;
            ans += tans;
        }

        return ans;
        //      return (Math.random() * 1000);
    }

    public static double f5(String num)
    {
        double ans = 0.0;
        int index = num.indexOf("-");
        while (index >= 0)
        {
            num = num.substring(0, index) + num.substring(index+1);
            index = num.indexOf("-");
        }

        for (int w = 0; w < num.length()-1; w++)
        {
            String n1 = num.substring(w, w+1);
            String n2 = num.substring(w+1, w+2);
            if (n1.equals("1"))
            {
                if (n2.equals("1")) ans += 0;
                if (n2.equals("2")) ans += 1;
                if (n2.equals("3")) ans += 2;
                if (n2.equals("4")) ans += 1;
                if (n2.equals("5")) ans += Math.sqrt(2);
                if (n2.equals("6")) ans += Math.sqrt(5);
                if (n2.equals("7")) ans += 2;
                if (n2.equals("8")) ans += Math.sqrt(5);
                if (n2.equals("9")) ans += 2 * Math.sqrt(2);
                if (n2.equals("0")) ans += Math.sqrt(10);
            }

            if (n1.equals("2"))
            {
                if (n2.equals("1")) ans += 1;
                if (n2.equals("2")) ans += 0;
                if (n2.equals("3")) ans += 1;
                if (n2.equals("4")) ans += Math.sqrt(2);
                if (n2.equals("5")) ans += 1;
                if (n2.equals("6")) ans += Math.sqrt(2);
                if (n2.equals("7")) ans += Math.sqrt(5);
                if (n2.equals("8")) ans += 2;
                if (n2.equals("9")) ans += Math.sqrt(5);
                if (n2.equals("0")) ans += 3;
            }

            if (n1.equals("3"))
            {
                if (n2.equals("1")) ans += 2;
                if (n2.equals("2")) ans += 1;
                if (n2.equals("3")) ans += 0;
                if (n2.equals("4")) ans += Math.sqrt(5);
                if (n2.equals("5")) ans += Math.sqrt(2);
                if (n2.equals("6")) ans += 1;
                if (n2.equals("7")) ans += 2*Math.sqrt(2);
                if (n2.equals("8")) ans += Math.sqrt(5);
                if (n2.equals("9")) ans += 2;
                if (n2.equals("0")) ans += Math.sqrt(10);
            }

            if (n1.equals("4"))
            {
                if (n2.equals("1")) ans += 1;
                if (n2.equals("2")) ans += Math.sqrt(2);
                if (n2.equals("3")) ans += Math.sqrt(5);
                if (n2.equals("4")) ans += 0;
                if (n2.equals("5")) ans += 1;
                if (n2.equals("6")) ans += 2;
                if (n2.equals("7")) ans += 1;
                if (n2.equals("8")) ans += Math.sqrt(2);
                if (n2.equals("9")) ans += Math.sqrt(5);
                if (n2.equals("0")) ans += Math.sqrt(5);
            }

            if (n1.equals("5"))
            {
                if (n2.equals("1")) ans += Math.sqrt(2);
                if (n2.equals("2")) ans += 1;
                if (n2.equals("3")) ans += Math.sqrt(2);
                if (n2.equals("4")) ans += 1;
                if (n2.equals("5")) ans += 0;
                if (n2.equals("6")) ans += 1;
                if (n2.equals("7")) ans += Math.sqrt(2);
                if (n2.equals("8")) ans += 1;
                if (n2.equals("9")) ans += Math.sqrt(2);
                if (n2.equals("0")) ans += 2;
            }

            if (n1.equals("6"))
            {
                if (n2.equals("1")) ans += Math.sqrt(5);
                if (n2.equals("2")) ans += Math.sqrt(2);
                if (n2.equals("3")) ans += 1;
                if (n2.equals("4")) ans += 2;
                if (n2.equals("5")) ans += 1;
                if (n2.equals("6")) ans += 0;
                if (n2.equals("7")) ans += Math.sqrt(5);
                if (n2.equals("8")) ans += Math.sqrt(2);
                if (n2.equals("9")) ans += 1;
                if (n2.equals("0")) ans += Math.sqrt(5);
            }

            if (n1.equals("7"))
            {
                if (n2.equals("1")) ans += 2;
                if (n2.equals("2")) ans += Math.sqrt(5);
                if (n2.equals("3")) ans += 2*Math.sqrt(2);
                if (n2.equals("4")) ans += 1;
                if (n2.equals("5")) ans += Math.sqrt(2);
                if (n2.equals("6")) ans += Math.sqrt(5);
                if (n2.equals("7")) ans += 0;
                if (n2.equals("8")) ans += 1;
                if (n2.equals("9")) ans += 2;
                if (n2.equals("0")) ans += Math.sqrt(2);
            }

            if (n1.equals("8"))
            {
                if (n2.equals("1")) ans += Math.sqrt(5);
                if (n2.equals("2")) ans += 2;
                if (n2.equals("3")) ans += Math.sqrt(5);
                if (n2.equals("4")) ans += Math.sqrt(2);
                if (n2.equals("5")) ans += 1;
                if (n2.equals("6")) ans += Math.sqrt(2);
                if (n2.equals("7")) ans += 1;
                if (n2.equals("8")) ans += 0;
                if (n2.equals("9")) ans += 1;
                if (n2.equals("0")) ans += 1;
            }

            if (n1.equals("9"))
            {
                if (n2.equals("1")) ans += 2*Math.sqrt(2);
                if (n2.equals("2")) ans += Math.sqrt(5);
                if (n2.equals("3")) ans += 2;
                if (n2.equals("4")) ans += Math.sqrt(5);
                if (n2.equals("5")) ans += Math.sqrt(2);
                if (n2.equals("6")) ans += 1;
                if (n2.equals("7")) ans += 2;
                if (n2.equals("8")) ans += 1;
                if (n2.equals("9")) ans += 0;
                if (n2.equals("0")) ans += Math.sqrt(2);
            }

            if (n1.equals("0"))
            {
                if (n2.equals("1")) ans += Math.sqrt(10);
                if (n2.equals("2")) ans += 3;
                if (n2.equals("3")) ans += Math.sqrt(10);
                if (n2.equals("4")) ans += Math.sqrt(5);
                if (n2.equals("5")) ans += 2;
                if (n2.equals("6")) ans += Math.sqrt(5);
                if (n2.equals("7")) ans += Math.sqrt(2);
                if (n2.equals("8")) ans += 1;
                if (n2.equals("9")) ans += Math.sqrt(2);
                if (n2.equals("0")) ans += 0;
            }
        }
        return ans;
    }

    public static double f6(double x, double y, double z)
    {
        if (Math.tan(x) > Math.cos((z+Math.PI)/(3*y)))
            return (Math.log10(Math.pow(Math.E, 2*x-y)));
        return Math.PI * Math.log(Math.pow(y, Math.E+z));
    }

    /*
     */
    public static boolean f7(String ms, String sq)
    {
        boolean endingY = true;

        for (int d = 0; d < sq.length(); d++)
        {
            int ind = ms.indexOf(sq.substring(d, d + 1));
            if (ind < 0)
            {
                return false;
            }
            else
            {
                ms = ms.substring(ind+1);
            }
        }
        return true;
        //return "1";
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
        String ans ="";
        int[] digits = new int[10];

        while (phrase.indexOf("Z") >= 0)
        {
            digits[0]++;
            phrase = remove(phrase, "ZERO");
        }
        while (phrase.indexOf("W") >= 0)
        {
            digits[2]++;
            phrase = remove(phrase, "TWO");
        }
        while (phrase.indexOf("X") >= 0)
        {
            digits[6]++;
            phrase = remove(phrase, "SIX");
        }
        while (phrase.indexOf("U") >= 0)
        {
            digits[4]++;
            phrase = remove(phrase, "FOUR");
        }
        while (phrase.indexOf("G") >= 0)
        {
            digits[8]++;
            phrase = remove(phrase, "EIGHT");
        }
        while (phrase.indexOf("O") >= 0)
        {
            digits[1]++;
            phrase = remove(phrase, "ONE");
        }
        while (phrase.indexOf("H") >= 0)
        {
            digits[3]++;
            phrase = remove(phrase, "THREE");
        }
        while (phrase.indexOf("S") >= 0)
        {
            digits[7]++;
            phrase = remove(phrase, "SEVEN");
        }
        while (phrase.indexOf("F") >= 0)
        {
            digits[5]++;
            phrase = remove(phrase, "FIVE");
        }
        while (phrase.indexOf("N") >= 0)
        {
            digits[9]++;
            phrase = remove(phrase, "NINE");
        }

        String[] word = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int u = 0; u < digits.length; u++)
            for (int w = 0; w < digits[u]; w++)
                ans += word[u];

        return ans;
    }

    private static String remove(String str, String s)
    {
        for (int g = 0; g < s.length(); g++)
        {
            int index = str.indexOf(s.substring(g, g+1));
            str = str.substring(0, index) + str.substring(index+1);
        }
        return str;
    }

    public static boolean f9(boolean x, boolean y, boolean z)
    {
        return x && !y || !x && y && z;

        //      return Math.random() < 0.5;
    }

    public static boolean f10(boolean j, boolean k, boolean m, boolean n)
    {
        return j && k || !m && n || !j && m && !n || !j && !k && !n;

        //      return Math.random() < 0.5;
    }
}