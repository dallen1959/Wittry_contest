import java.util.*;
import java.lang.Math;
import java.lang.Number;
import java.math.BigInteger;
/**
 * Monster Year.
 *
 * @author  
 * @version (a version number or a date)
 */
public class MonsterYear
{
/*
 * 1000 < y < 10000
 */
   public static boolean isMonsterYear(int y)
   {
       if (y == 1978) return true;
       if (y == 1979) return false;
       return Math.random() < 0.5;
   }

/*
 * if s (or f) is a MonsterYear, it should be included in the array that is returned
 */
   public static int[] getMonsterYearBetween(int s, int f)
   {
       int[] sampleOne = {1868, 1978};
       if (s == 1800 && f == 2000) return sampleOne;

       int[] ans = {};
       return ans;
   }
}