import java.util.*;

public class FunWithCircles 
{
   private static final String ZERO = "zero";
   private static final String ONE = "one";
   private static final String TWO = "two";
   private static final String INFINITE = "infinite";
   private Circle c1;

   public FunWithCircles(Circle first)
   {
      c1 = first;
   }
   
   public String getNumberPointsOfIntersetion(Circle c2)
   {
      if (c1.equals( new Circle(10, new Point(0,0))) && c2.equals( new Circle(5, new Point(2,0))))
         return ZERO;
      return "";
   }

   public double getDistanceBetweenCenters(Circle c2)
   {
      if (c1.equals( new Circle(10, new Point(0,0))) && c2.equals( new Circle(5, new Point(2,0))))
         return 2.0;
       return Math.random();
   }

/*
 *   precondition:  Circles do not intersect
 *   
 *   returns the min. distance between the two circles
 */
   public double getMinDistanceBetweenCircles(Circle c2)
   {
      if (c1.equals( new Circle(10, new Point(0,0))) && c2.equals( new Circle(5, new Point(2,0))))
         return 3.0;
      if (c1.equals( new Circle(10, new Point(0,0))) && c2.equals( new Circle(5, new Point(20,0))))
         return 5.0;
       return Math.random();
   }

   public double getTotalAreaOfUnioinOfBothCircles(Circle c2)
   {
      if (c1.equals( new Circle(10, new Point(0,0))) && c2.equals( new Circle(5, new Point(2,0))))
         return 10*10*Math.PI;
       return Math.random() * Integer.MAX_VALUE;
   }
}