import java.util.*;
import java.lang.Math;
/**
 * The test class FunctionsGoneWildPart2013.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FunctionsGoneWild2013
{
   public static int f1(int n)
   {
      if (n == 111) return 35052;

      return (int)(Math.random() * 1000);
   }

   public static double f2(double x, double y)
   {
      if (Math.abs(5-x) < 0.005 && Math.abs(3 - y) < 0.005) return 2.0;

      return Math.random() * 1000;
   }

   public static double f3(double x, double y, double z)
   {
      if (Math.abs(5-x) < 0.005 && Math.abs(6 - y) < 0.005 && Math.abs(7 - z) < 0.005) return -1.5945;

      return Math.random() * 1000;
   }

   public static double f4(double x, double y, double z)
   {
      if (Math.abs(5 - x) < 0.005 && Math.abs(11 - y) < 0.005 && Math.abs(3 - z) < 0.005) return 0.208558;

      return (Math.random() * 1000);
   }

   public static int f5(int a, int b, int c)
   {
      if (a==2 && b ==4 && c==-1) return -12;

      return (int)(Math.random() * 1000);
   }

   public static int f6(int a, int b, int c, int d)
   {
      if (a==2 && b ==2 && c==1 && d==3) return 241068;

      return (int)(Math.random() * 1000);
   }

   public static boolean f7(boolean x, boolean y, boolean z)
   {
      if (!x && !y && z) return false;

      return Math.random() < 0.5;
   }

   public static boolean f8(boolean j, boolean k, boolean m, boolean n)
   {
      if (!j && !k && !m && !n) return false;

      return Math.random() < 0.5;
   }

   public static double f9(int a, int b, double x, double y, double z)
   {
      if (a==1 && b==1 && Math.abs(1.1 - x) < 0.5 && Math.abs(4.4 - y) < 0.5 && Math.abs(z - 5.5) < 0.5)
         return 4.84856;
      return (Math.random() * 1000);
   }

   public static boolean f10(boolean v, boolean w, boolean x, boolean y, boolean z)
   {
      if (!v && !w && !x && !y && !z)
         return true;
      return Math.random() < 0.5;
   }
}