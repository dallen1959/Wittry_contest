import java.util.*;

/**
 * The test class StudentTest.
 *
 * @author  Don Allen
 * @version (a version number or a date)
 */
public class StudentNagelPointTest extends junit.framework.TestCase
{
   public void testNagelPoint01()
   {
      Point w = new Point(0, -6);
      Point x = new Point(0, 0);
      Point y = new Point(8, 0);
      Point z = new Point(8, 6);
      NagelPoint np = new NagelPoint( x, y, z);
      Point intersection = new Point(4, 0);
      assertEquals(intersection.getX(), np.getIntersection(x, y, z, w).getX(), 0.05);
      assertEquals(intersection.getY(), np.getIntersection(x, y, z, w).getY(), 0.05);
      Point ans = new Point(8, 4);
      assertEquals(ans.getX(), np.getBisectedPerimeterPoint(x, y, z).getX(), 0.05);
      assertEquals(ans.getY(), np.getBisectedPerimeterPoint(x, y, z).getY(), 0.05);

      ans = new Point(3.2, 2.4);
      assertEquals(ans.getX(), np.getBisectedPerimeterPoint(y, z, x).getX(), 0.05);
      assertEquals(ans.getY(), np.getBisectedPerimeterPoint(y, z, x).getY(), 0.05);

      double per = np.getPerimeter();
      assertEquals(8+6+10, np.getPerimeter(), 0.02);

      Point nagelPoint = np.getNagelPoint();
      assertEquals(2, nagelPoint.getY(), 0.02);
      assertEquals(4, nagelPoint.getX(), 0.02);
   }
}