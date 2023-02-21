import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2013 Wittry programming contest
 */
public class FunWithCirclesStudentTest extends junit.framework.TestCase
{
   private final String ZERO = "zero";
   private final String ONE = "one";
   private final String TWO = "two";
   private final String INFINITE = "infinite";

   public void testIntersectingCircles01()
   {
      Circle c1 = new Circle(10, new Point(0,0));
      Circle c2 = new Circle(5, new Point(2,0));
      FunWithCircles ic = new FunWithCircles(c1);

      assertEquals(2.0, ic.getDistanceBetweenCenters(c2), 0.01);
      assertEquals(ZERO, ic.getNumberPointsOfIntersetion(c2));
      assertEquals(3.0, ic.getMinDistanceBetweenCircles(c2), 0.01);
      assertEquals(5.0, ic.getMinDistanceBetweenCircles(new Circle(5, new Point(20, 0))), 0.01);
      assertEquals(10*10*Math.PI, ic.getTotalAreaOfUnioinOfBothCircles(c2), 0.1);
    }
}