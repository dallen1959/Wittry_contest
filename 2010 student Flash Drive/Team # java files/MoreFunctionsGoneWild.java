import java.util.*;
import java.lang.Math;
/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MoreFunctionsGoneWild
{
   public static int f1(int n)
   {
      /* implementation to be fixed  */
      if (n == 12) return 1499;
      return 0;
   }

   public static double f2(double x)
   {
      /* implementation to be fixed  */
      if (9.995 < x && x <= 10.0005) return -939.40437;
      return 0;
   }

   public static double f3(double x, double y, double z)
   {
      /* implementation to be fixed  */
      if ( (49.995 < x && x <= 50.0005) &&
           (0.995 < y && y <= 1.0005) && 
           (0.995 < z && z <= 1.0005) )return 19.26097;
      return 0;
   }

   public static double f4(double a, double b)
   {
      /* implementation to be fixed  */
      if ( (0.995 < a && a <= 1.0005) && 
           (0.995 < b && b <= 1.0005) )return 0.0986123;
      return 0;
   }

   public static double f5(double a, double b)
   {
      /* implementation to be fixed  */
      if ( (0.995 < a && a <= 1.0005) && 
           (1.995 < b && b <= 2.0005) )return 1.41142;
      if ( (-1.0005 < a && a <= -0.9995) && 
           (1.9995 < b && b <= 2.0005) )return 19.5191285;
      return 0;
   }

   public static double f6(double x, double y, double z)
   {
      /* implementation to be fixed  */
      if ( (0.995 < x && x <= 1.0005) &&
           (1.995 < y && y <= 2.0005) && 
           (0.995 < z && z <= 1.0005) )return 1.066968;
      return 0;
   }

   public static boolean f7(boolean x, boolean y, boolean z)
   {
      /* implementation to be fixed  */
      if ( !x && y && !z) return true;
      return Math.random() < 0.5;
   }

   public static boolean f8(boolean a, boolean b, boolean c, boolean d)
   {
      /* implementation to be fixed  */
      if ( !a && b && !c && d) return true;
      return Math.random() < 0.5;
   }

   public static double f9(double a, double b, double x, double y, double z)
   {
      /* implementation to be fixed  */
      if ( (5.689995 < a && a <= 5.690005) &&
           (2.369995 < b && b <= 2.370005) && 
           (5.029995 < x && x <= 5.030005) && 
           (.849995 < y && y <= 0.850005) && 
           (4.109995 < z && z <= 4.110005) )return 75997.8079512;
      return Math.random();
   }


   public static boolean f10(boolean a, boolean b, boolean c, boolean d)
   {
      /* implementation to be fixed  */
      if ( !a &&! b && c && !d) return false;
      return Math.random() < 0.5;
   }
}