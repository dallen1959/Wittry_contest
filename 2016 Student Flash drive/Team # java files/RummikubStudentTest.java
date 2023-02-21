import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2016 Wittry programming contest
 */
public class RummikubStudentTest extends junit.framework.TestCase
{
   public void testRummikub01()
   {
      ArrayList<RummikubTiles> tiles = new ArrayList<RummikubTiles>();
      tiles.add(new RummikubTiles("red", 5));
      tiles.add(new RummikubTiles("blue", 5));
      tiles.add(new RummikubTiles("orange", 5));
      tiles.add(new RummikubTiles("red", 6));
      tiles.add(new RummikubTiles("red", 7));
      tiles.add(new RummikubTiles("blue", 13));
      tiles.add(new RummikubTiles("red", 12));
      tiles.add(new RummikubTiles("orange", 1));
      tiles.add(new RummikubTiles("orange", 9));
      tiles.add(new RummikubTiles("black", 1));
      tiles.add(new RummikubTiles("black", 2));
      tiles.add(new RummikubTiles("black", 7));
      tiles.add(new RummikubTiles("black", 8));
      tiles.add(new RummikubTiles("black", 12));

      Rummikub r = new Rummikub(tiles);

      assertEquals(true, r.hasGroup());
      assertEquals(true, r.hasRun());
      assertEquals(18, r.maxPointValueInHand());
      tiles.set(0, new RummikubTiles("red", 2));
      assertEquals(false, r.hasGroup());
      assertEquals(false, r.hasRun());
      assertEquals(0, r.maxPointValueInHand());

      ArrayList<RummikubTiles> play= new ArrayList<RummikubTiles>();
      play.add(new RummikubTiles("orange", 5));
      play.add(new RummikubTiles("orange", 4));
      play.add(new RummikubTiles("orange", 6));
      assertEquals(4+5+6, Rummikub.pointValue(play));

      play= new ArrayList<RummikubTiles>();
      play.add(new RummikubTiles("red", 13));
      play.add(new RummikubTiles("orange", 13));
      play.add(new RummikubTiles("black", 13));
      assertEquals(3*13, Rummikub.pointValue(play));
   }
}