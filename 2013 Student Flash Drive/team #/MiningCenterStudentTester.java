import java.util.*;

/**
 * The test class MiningCenterStudentTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MiningCenterStudentTester extends junit.framework.TestCase
{
   public void testMiningCenter01()
   {
      ArrayList<Site> mines = new ArrayList<Site>();
      mines.add(new Site(10, 0));
      mines.add(new Site(6,7));
      mines.add(new Site(-6,8));
      mines.add(new Site(-9,-8));
      MiningCenter mc = new MiningCenter(mines);
      assertEquals(new Site(-1,-1), mc.getCenter());

      ArrayList<Site> mines1 = new ArrayList<Site>();
      mines1.add(new Site(0, 0));
      mines1.add(new Site(0, 5));
      mines1.add(new Site(5, 0));
      MiningCenter mc1 = new MiningCenter(mines1);
      assertEquals(new Site(0,0), mc1.getCenter());

      ArrayList<Site> mines2 = new ArrayList<Site>();
      mines2.add(new Site(1, -5));
      mines2.add(new Site(-10, 5));
      mines2.add(new Site(-2, 5));
      mines2.add(new Site(10, 10));
      mines2.add(new Site(5, -5));
      MiningCenter mc2 = new MiningCenter(mines2);
      assertEquals(new Site(2,5), mc2.getCenter());
   }
}