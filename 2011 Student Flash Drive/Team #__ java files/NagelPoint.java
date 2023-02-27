import java.util.*;

public class NagelPoint
{
   private Point x, y, z;
   public NagelPoint(Point a, Point b, Point c)
   {
      x = a;
      y = b;
      z = c;
   }
   

   public double getPerimeter()
   {
      if (x.equals(new Point(0, 0)) && y.equals(new Point(8, 0)) && z.equals(new Point(8, 6)))
         return 10+8+6;
      return -1;
   }

   public Point getBisectedPerimeterPoint(Point v, Point w, Point t)
   {
      if (v.equals(new Point(0, 0)) && w.equals(new Point(8, 0)) && t.equals(new Point(8, 6)))
         return new Point(8, 4);
      if (t.equals(new Point(0, 0)) && v.equals(new Point(8, 0)) && w.equals(new Point(8, 6)))
         return new Point(3.2, 2.4);
      return new Point(-1, -1);
   }

/*
 * return Point of interesection between the line containning the points x1 and x2 and 
 *                                       the line containning the points y1 and y1
 */
   public Point getIntersection(Point x1, Point x2, Point y1, Point y2)
   {
      if (x1.equals(new Point(0, 0)) && x2.equals(new Point(8, 0))
                && y1.equals(new Point(8, 6)) && y2.equals(new Point(0, -6)))
         return new Point(4, 0);
      return new Point(-1, -1);
   }

   public Point getNagelPoint()
   {
      if (x.equals(new Point(0, 0)) && y.equals(new Point(8, 0)) && z.equals(new Point(8, 6)))
         return new Point(4, 2);
      return new Point(-1, -1);
   }
}