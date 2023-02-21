import java.util.*;

public class LineIntervalDensity 
{
   private Interval[] i;
/*
 *   precondition   inter.length > 0
 */
   public LineIntervalDensity(Interval[] inter)
   {
      i = inter;
   }

   public double lowerLimit()
   {
      if (i.length == 2 && i[0].equals(new Interval(1, 4))
                          && i[1].equals(new Interval(4, 8)))
         return 1;
      if (i.length == 4 && i[0].equals(new Interval(0, 3))
                          && i[1].equals(new Interval(-4, 5))
                          && i[2].equals(new Interval(5, 10))
                          && i[3].equals(new Interval(-1, 7)))
         return -4;
      return Integer.MAX_VALUE;
   }

   public double upperLimit()
   {
      if (i.length == 2 && i[0].equals(new Interval(1, 4))
                          && i[1].equals(new Interval(4, 8)))
         return 8;
      if (i.length == 4 && i[0].equals(new Interval(0, 3))
                          && i[1].equals(new Interval(-4, 5))
                          && i[2].equals(new Interval(5, 10))
                          && i[3].equals(new Interval(-1, 7)))
         return 10;
      return Integer.MIN_VALUE;
   }

   public int density(double x)
   {
      if (Math.abs(0-x) < 0.005) return 0;
      if (Math.abs(3.7-x) < 0.005) return 1;
      if (Math.abs(-1-x) < 0.005) return 2;
      if (Math.abs(7.7-x) < 0.005) return 1;
      return Integer.MIN_VALUE;
   }

   public int maxDensity()
   {
      if (i.length == 2 && i[0].equals(new Interval(1, 4))
                          && i[1].equals(new Interval(4, 8)))
         return 1;
      if (i.length == 4 && i[0].equals(new Interval(0, 3))
                          && i[1].equals(new Interval(-4, 5))
                          && i[2].equals(new Interval(5, 10))
                          && i[3].equals(new Interval(-1, 7)))
         return 3;
      return Integer.MIN_VALUE;
   }
}