import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentMerryTripleTest extends junit.framework.TestCase
{
   public void testMerryTriples01()
   {
      MerryTriples mt = new MerryTriples();

      assertEquals(true, mt.isOrdinary(new OrderedTriple(1, 10, 50)));
      assertEquals(false, mt.isOrdinary(new OrderedTriple(1, 101, 50)));

      assertEquals(true, mt.isShrewd(new OrderedTriple(1, 10, 50)));
      assertEquals(false, mt.isShrewd(new OrderedTriple(1, 101, 50)));

      assertEquals(true, mt.isSeparable(new OrderedTriple(1, 10, 15)));
      assertEquals(false, mt.isSeparable(new OrderedTriple(1, 101, 50)));

      assertEquals(true, mt.isMinuend(new OrderedTriple(62, 50, 23)));
      assertEquals(false, mt.isMinuend(new OrderedTriple(1, 101, 50)));

      assertEquals(true, mt.isMirthful(new OrderedTriple(1, 10, 17)));
      assertEquals(false, mt.isMirthful(new OrderedTriple(3, 31, 58)));
      assertEquals(false, mt.isMirthful(new OrderedTriple(73, 81, 76)));

      assertEquals(true, mt.isMerry(new OrderedTriple(15, 3, 88)));
      assertEquals(false, mt.isMerry(new OrderedTriple(1, 10, 50)));

      ArrayList<OrderedTriple> temp = mt.getMerryTriples(new OrderedTriple(8, 22, 5), new OrderedTriple(8, 33, 48));
      assertEquals(2, temp.size());
      assertEquals(true, temp.contains(new OrderedTriple(8, 25, 34)));
      assertEquals(true, temp.contains(new OrderedTriple(8, 26, 44)));
      assertEquals(false, temp.contains(new OrderedTriple(8, 22, 5)));

      temp = mt.getMerryTriples(new OrderedTriple(8, 22, 5), new OrderedTriple(8, 25, 33));
      assertEquals(0, temp.size());
      assertEquals(false, temp.contains(new OrderedTriple(8, 25, 34)));
      assertEquals(false, temp.contains(new OrderedTriple(8, 26, 44)));
   }
}