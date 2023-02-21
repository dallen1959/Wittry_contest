import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2013 Wittry programming contest
 */
public class LineIntervalStudentTest extends junit.framework.TestCase
{
   public void testLineIntervalDensity01()
   {
      Interval[] itv1 = {new Interval(1, 4), new Interval(4, 8)};
      LineIntervalDensity lid1 = new LineIntervalDensity(itv1);
      assertEquals(1, lid1.lowerLimit(), 0.005);
      assertEquals(8, lid1.upperLimit(), 0.005);
      assertEquals(0, lid1.density(0));
      assertEquals(1, lid1.density(3.7));
      assertEquals(1, lid1.maxDensity());

      Interval[] itv2 = {new Interval(0, 3), new Interval(-4, 5), new Interval(5, 10), new Interval(-1, 7)};
      LineIntervalDensity lid2 = new LineIntervalDensity(itv2);
      assertEquals(-4, lid2.lowerLimit(), 0.005);
      assertEquals(10, lid2.upperLimit(), 0.005);
      assertEquals(2, lid2.density(-1));
      assertEquals(1, lid2.density(7.7));
      assertEquals(3, lid2.maxDensity());
   }
}