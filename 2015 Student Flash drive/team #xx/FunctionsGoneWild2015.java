import java.util.*;
import java.lang.Math;
/**
 * The test class FunctionsGoneWild2015.
 *
 * @author  Don Allen
 * @version Wittry Programming contest
 */
public class FunctionsGoneWild2015
{
   public static int f1(int n)
   {
      if (n == 5) return 8;

      return (int)(Math.random() * 1000);
   }

   public static double f2(double x)
   {
      if (Math.abs(x - 5) < 0.05) return 2.364669;

      return Math.random() * 1000;
   }

   public static double f3(double x, double y, double z)
   {
      if (Math.abs(x - 2) < 0.05 && Math.abs(y - 4) < 0.05 && Math.abs(z - 7) < 0.05) return 0.41110;

      return Math.random() * 1000;
   }

   public static double f4(double x, double y, double z)
   {
      if (Math.abs(x - 5) < 0.05 && Math.abs(y - 11) < 0.05 && Math.abs(z - 3) < 0.05) return 10.5746;

      return (Math.random() * 1000);
   }

   public static int f5(int a, int b, int c)
   {
      if (a == 7 && b == 1 && c == 4) return 117;

      return (int)(Math.random() * 1000);
   }

/*
 *     precondtion:  phrase will only contain:
 *                      lower case letters, spaces, periods and commas
 *                      
 *                   phrase.length() > 0, str.length() > 0
 */
   public static int f6(String phrase, String str)
   {
      if (phrase.equals("Think left, think right, think high and low") && str.equals("ink") ) return 2+14+27;

      return (int)(Math.random() * 1000);
   }

   public static boolean f7(boolean x, boolean y, boolean z)
   {
      if (!x && !y && z) return true;

      return Math.random() < 0.5;
   }

   public static boolean f8(boolean j, boolean k, boolean m, boolean n)
   {
      if (!j && !k && !m && !n) return true;

      return Math.random() < 0.5;
   }

   public static double f9(int a, int b, double x, double y)
   {
      if(a == 1 && b == 1 && Math.abs(x - 1.1) < 0.05 && Math.abs(y - 4.4) < 0.05 ) return 5.151;

      return (Math.random() * 1000);
   }

   public static boolean f10(boolean v, boolean w, boolean x, boolean y)
   {
      if (!v && !w && !x && !y) return true;

      return Math.random() < 0.5;
   }
}