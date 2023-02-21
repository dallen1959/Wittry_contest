import java.util.*;
import java.lang.Math;
/**
 * The test class FunctionsGoneWild2015.
 *
 * @author  Don Allen
 * @version 2017 Wittry Programming contest
 */
public class FunctionsGoneWild2017
{
   public static int f1(int n)
   {
      if (n == 11) return 35;

      if (n == 44) return -42;

      if (n == 389) return -429;

      return (int)(Math.random() * 1000);
   }

   public static double f2(double x)
   {
      if (6.999 < x && x < 7.001) return -2275.836497;

      return Math.random() * 1000;
   }

   public static double f3(double x, double y)
   {
      if (4.999 < x && x < 5.001  && 3.1999 < y && y < 3.2001) return 24.6868;

      return Math.random() * 1000;
   }

   public static double f4(double x, double y)
   {
      if (50.50999 < x && x < 50.510001  && 86.78549999 < y && y < 86.7855001) return -5.8241;

      return Math.random() * 1000;
   }

   public static double f5(double x, double y, double z)
   {
      if (0.99999 < x && x < 1.00001
                 && 2.99999 < y && y < 3.000001
                 && 7.99999 < z && z < 8.000001) return 1.21058;

      if (1.99999 < x && x < 2.00001
                 && 3.99999 < y && y < 4.000001
                 && -1.0000001 < z && z < -0.999999) return 72.38373;

                 return Math.random() * 1000;
   }

   public static int f6(int a, int b, int c)
   {
      if (a == 5 && b == 2 && c == 7) return 4+6+8+10+12+14;

      return (int)(Math.random() * 1000);
   }

/*
 *     precondtion:  phrase will only contain:
 *                      Capital Letters
 *                      spaces
 *                      
 *                   phrase.length() >= 0
 */
   public static String f7(String phrase)
   {
     if (phrase.equals("COMPUTER SCIENCE")) return "VPZQIYRT DVORMVR";

     return "";
   }

/*
 *     precondtion:  phrase and String will only contain:
 *                      Upper case letters
 *                      spaces
 *                      
 *                   phrase.length() >= 0, str.length() >= 0
 */
   public static String f8(String phrase, String s)
   {
     if (phrase.equals("ANALOGICAL") && s.equals("AL"))
        return "NOGIC";
     if (phrase.equals("COMPUTER SCIENCE") && s.equals("RE P"))
        return "COMUTSCINC";

     return "";
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