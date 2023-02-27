import java.util.*;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentRadioContactTest extends junit.framework.TestCase
{
   public void testRadioContact01()
   {
      ArrayList<Location> locs = new ArrayList<Location>();
      locs.add(new Location(10, 10));
      locs.add(new Location(40, 10));
      locs.add(new Location(60, 10));
      locs.add(new Location(61, 10));
      RadioContact rc  = new RadioContact(locs);
      assertEquals(true, rc.withinRange(locs.get(0), locs.get(1)));
      assertEquals(true, rc.withinRange(locs.get(0), locs.get(2)));
      assertEquals(false, rc.withinRange(locs.get(0), locs.get(3)));

      locs = new ArrayList<Location>();
      locs.add(new Location(118, 136));
      locs.add(new Location(200, 386));
      locs.add(new Location(338, 486));
      locs.add(new Location(412, 266));
      locs.add(new Location(410, 484));
      locs.add(new Location(54, 54));
      locs.add(new Location(194, 80));
      locs.add(new Location(408, 226));
      locs.add(new Location(476, 180));
      locs.add(new Location(116, 98));
      locs.add(new Location(76, 94));
      locs.add(new Location(160, 96));
      locs.add(new Location(434, 202));

      rc  = new RadioContact(locs);
      assertEquals(5, rc.getNumberSquads());
   }
}