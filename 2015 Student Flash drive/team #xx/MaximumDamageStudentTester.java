import java.util.*;

/**
 * The test class MaximumDamageStudentTester.
 *
 * @author  Don Allen
 * @version 2015 Wittry programming contest
 */
public class MaximumDamageStudentTester extends junit.framework.TestCase
{
   public void testMaximumDamage01()
   {
      MaximumDamage mc = new MaximumDamage(20, 20);
      assertEquals(10-7+11-9, mc.distance(new Location(10, 11), new Location( 7, 9)));

      mc.addOrcCamp(new Location(10, 3));
      mc.addOrcCamp(new Location(6, 7));

      mc.addElfStation(new Location(6, 8));
      mc.addElfStation(new Location(-9,-8));
      assertEquals(0, mc.calculateDamage(new Location( 17, 9)));
      assertEquals(1, mc.calculateDamage(new Location( 6, 11)));
      assertEquals(2, mc.calculateDamage(new Location( 7, 4)));

      Location[] posLoc = { new Location(12, 7), new Location(13, 2), new Location(5, 5)};
      assertEquals(new Location(13, 2), mc.maxIncreaseDamage(posLoc));
   }
}