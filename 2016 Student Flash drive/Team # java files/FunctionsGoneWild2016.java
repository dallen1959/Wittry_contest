import java.util.*;
import java.lang.Math;
/**
 * The test class FunctionsGoneWild2015.
 *
 * @author  Don Allen
 * @version 2016 Wittry Programming contest
 */
public class FunctionsGoneWild2016
{
   public static int f1(int n)
   {
      if (n == 5) return 26;

      return (int)(Math.random() * 1000);
   }

   public static double f2(double x)
   {
      if (Math.abs(x - 11) < 0.005)return 45.2562;

      return Math.random() * 1000;
   }

   public static double f3(double x, double y)
   {
      if (Math.abs(1.5 - x) < 0.005 && Math.abs(1.9 - y) < 0.005) return 3.4025;

      return Math.random() * 1000;
   }

   public static double f4(double x, double y)
   {
      if (Math.abs(2.5 - x) < 0.005 && Math.abs(4.7 - y) < 0.005) return 0.00025277;

      return Math.random() * 1000;
   }

   public static double f5(double x, double y, double z)
   {
      if (Math.abs(Math.PI - x) < 0.005 && Math.abs(2.5 - y) < 0.005 && Math.abs(3.3 - z) < 0.005) return 0.0745626;

      return (Math.random() * 1000);
   }

   public static int f6(int a, int b, int c)
   {
      if (a == 4 && b == 2 && c == 1) return 4;

      return (int)(Math.random() * 1000);
   }

/*
 *     precondtion:  phrase will only contain:
 *                      ???????
 *                      
 *                   phrase.length() >= 0
 */
   public static int f7(String phrase)
   {
      if (phrase.equals("lEgS have ZelGi") ) return 31;

      return -(int)(Math.random() * 1000);
   }

/*
 *     precondtion:  phrase and String will only contain:
 *                      Upper case letters
 *                      spaces
 *                      
 *                   phrase.length() >= 0, str.length() == 2
 */
   public static int f8(String phrase, String s)
   {
      if (phrase.equals("HUMUHUMUNUKUNUKUAPUAA") && s.equals("UK") ) return 12;
 
      return -(int)(Math.random() * 1000);
   }

   public static boolean f9(boolean x, boolean y, boolean z)
   {
      if (!x && !y && !z ) return true;

      return Math.random() < 0.5;
   }

   public static boolean f10(boolean j, boolean k, boolean m, boolean n)
   {
      if (!j && !k && !m && !n ) return false;

      return Math.random() < 0.5;
   }
}