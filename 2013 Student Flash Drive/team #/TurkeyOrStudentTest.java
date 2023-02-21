import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TurkeyOrStudentTest extends junit.framework.TestCase
{
   public void testTurkeyOr01()
   {
      ArrayList<Integer> al = new ArrayList<Integer>();
      al.add(new Integer(5));
      al.add(new Integer(2));
      al.add(new Integer(3));
      TurkeyOr tw = new TurkeyOr(al);

      assertEquals(false, tw.canTravel(-11));
      assertEquals(true, tw.canTravel(-10));
      assertEquals(false, tw.canTravel(-9));
      assertEquals(true, tw.canTravel(-8));
      assertEquals(true, tw.canTravel(-7));
      assertEquals(true, tw.canTravel(-6));
      assertEquals(true, tw.canTravel(-5));
      assertEquals(true, tw.canTravel(-4));
      assertEquals(true, tw.canTravel(-3));
      assertEquals(true, tw.canTravel(-2));
      assertEquals(true, tw.canTravel(-1));
      assertEquals(true, tw.canTravel(0));
      assertEquals(true, tw.canTravel(1));
      assertEquals(true, tw.canTravel(2));
      assertEquals(true, tw.canTravel(3));
      assertEquals(true, tw.canTravel(4));
      assertEquals(true, tw.canTravel(5));
      assertEquals(true, tw.canTravel(6));
      assertEquals(true, tw.canTravel(7));
      assertEquals(true, tw.canTravel(8));
      assertEquals(false, tw.canTravel(9));
      assertEquals(true, tw.canTravel(10));
      assertEquals(false, tw.canTravel(11));

      
      al.add(new Integer(1));
      tw = new TurkeyOr(al);

      assertEquals(true, tw.canTravel(0));
      assertEquals(true, tw.canTravel(1));
      assertEquals(true, tw.canTravel(2));
      assertEquals(true, tw.canTravel(3));
      assertEquals(true, tw.canTravel(4));
      assertEquals(true, tw.canTravel(5));
      assertEquals(true, tw.canTravel(6));
      assertEquals(true, tw.canTravel(7));
      assertEquals(true, tw.canTravel(8));
      assertEquals(true, tw.canTravel(9));
      assertEquals(true, tw.canTravel(10));
      assertEquals(true, tw.canTravel(11));
      assertEquals(false, tw.canTravel(12));
    }
}