import java.util.*;
import java.lang.Math;
/**
 * The test class FunctionsGoneWildPartIII.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FunctionsGoneWildPartIII
{
   public static int f1(int n)
   {
      if (n == 12) return 3001;
      return (int)(Math.random() * 9999);
   }

   public static double f2(int a, int b)
   {
      if (a == 1 && b == 4) return 28.20085;
      return Math.random() * 9999;
   }

   public static double f3(double x, double y, double z)
   {
      if (Math.abs(x - 50) < 0.05 && Math.abs(y - 2) < 0.05 && Math.abs(z - 1) < 0.05)
         return 5.2293327;
      return Math.random() * 9999;
   }

   public static double f4(double a, double b, double c)
   {
      if (Math.abs(a - 6) < 0.05 && Math.abs(b - 4) < 0.05 && Math.abs(c - 2) < 0.05)
         return 102.26664;
      return Math.random() * 9999;
   }

   public static double f5(double a, double b)
   {
      if (Math.abs(a - 5) < 0.05 && Math.abs(b - 5) < 0.05)
         return 6.55907;
      if (Math.abs(a - 1) < 0.05 && Math.abs(b - 5) < 0.05)
         return 200.4808;
      return Math.random() * 9999;
   }

   public static double f6(double x, double y, double z)
   {
      if (Math.abs(x - 1) < 0.05 && Math.abs(y - 2) < 0.05 && Math.abs(z - 3) < 0.05)
         return -133.28760;
      return Math.random() * 9999;
   }

   public static boolean f7(boolean x, boolean y, boolean z)
   {
      if (!x && y && !z)
         return true;
      return Math.random() < 0.5;
   }

   public static boolean f8(boolean j, boolean k, boolean m, boolean n)
   {
      if (!j && k && !m && n)
         return true;
      return Math.random() < 0.5;
   }

   public static double f9(double a, double b, double x, double y, double z)
   {
      if (Math.abs(a - 8.7) < 0.05 && Math.abs(b - 4.9) < 0.05 && Math.abs(x - 4.8) < 0.05 && Math.abs(y - 3.1) < 0.05 && Math.abs(z - 24.3) < 0.05)
         return 2395425.206;
      return Math.random() * 9999;
   }

   public static boolean f10(boolean a, boolean b, boolean c, boolean d, boolean e)
   {
      if (!a && !b && c && !d && e)
         return true;
      return Math.random() < 0.5;
   }
}