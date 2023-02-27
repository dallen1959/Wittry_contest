import java.util.*;
import java.lang.Math;
/**
 * The test class FunctionsGoneWildPartIII.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FunctionsGoneWild2012
{
   public static int f1(int n)
   {
      if (n == 11) return 3938;

      return (int)(Math.random() * 1000);
   }

   public static double f2(double x, double y, double z)
   {
      if (Math.abs(x-2) < 0.002 && Math.abs(y-3) < 0.002 && Math.abs(z-5) < 0.002 ) return 166.000775;

      return (Math.random() * 1000);
   }

   public static double f3(double a, double b)
   {
      if (Math.abs(a-3.5) < 0.002 && Math.abs(b-1.5) < 0.002) return -24.5;

      return (Math.random() * 1000);
   }

   public static double f4(double a, double b, double c)
   {
      if (Math.abs(a+5) < 0.002 && Math.abs(b) <= 0.002 && Math.abs(c- 11) < 0.002) return 6.83567;

      return (Math.random() * 1000);
   }

   public static int f5(int a, int b, int c)
   {
      if (a == 5 && b == 13 && c == 7) return 1734;

      return (int)(Math.random() * 1000);
   }

   public static int f6(int a, int b, int c, int d)
   {
      if (a == 1 && b == 1 && c == 2 && d == 2) return 512486;

      return (int)(Math.random() * 1000);
   }

   public static boolean f7(boolean x, boolean y, boolean z)
   {
      if (x && y && z) return false;

      return Math.random() < 0.5;
   }

   public static boolean f8(boolean j, boolean k, boolean m, boolean n)
   {
      if (!j && !k && !m && !n) return true;
      return Math.random() < 0.5;
   }

   public static double f9(double a, double b, double c, double d)
   {
      if (Math.abs(a-6) < 0.002 && Math.abs(b-7) <= 0.002 && Math.abs(c-5) <= 0.002  && Math.abs(d-2) < 0.002) return -19.6234472;

      return (Math.random() * 1000);
   }

   public static boolean f10(boolean v, boolean w, boolean x, boolean y, boolean z)
   {
      if (!v && !w && !x && !y && !z) return true;
      return Math.random() < 0.5;
   }
}