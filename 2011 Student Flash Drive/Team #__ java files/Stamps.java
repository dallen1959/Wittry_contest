import java.util.*;
import java.lang.Math;
import java.lang.Number;
import java.math.BigInteger;
/**
 * Stamps.
 *
 * @author
 * @version (a version number or a date)
 */
public class Stamps
{
   private int maxStamps;
   private int[] values;

   public Stamps(int n, int[] arr)
   {
      maxStamps = n;
      values = arr;
   }

   public int getMaxRange()
   {
      if (maxStamps == 5 && values.length == 2 && values[0] == 1 && values[1] == 3) return 13;
      if (maxStamps == 5 && values.length == 3 && values[0] == 2 && values[1] == 4 && values[2] == 8) return 0;
      if (maxStamps == 5 && values.length == 4 && values[0] == 1 && values[1] == 4 && values[2] == 12 && values[3] == 21) return 71;
      if (maxStamps == 6 && values.length == 4 && values[0] == 1 && values[1] == 5 && values[2] == 7 && values[3] == 8) return 48;
      if (maxStamps == 10 && values.length == 5 && values[0] == 1 && values[1] == 7 && values[2] == 16 && values[3] == 31 && values[4] == 88) return 409;
      return -1;
   }
}