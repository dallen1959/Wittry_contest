import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentBalloonoTest extends junit.framework.TestCase
{
   public void testBalloono01()
   {
      String[][] w1 = { {"#", "#", " ", "#", " ", "#"},
                        {"#", " ", " ", " ", " ", " "},
                        {"#", " ", "#", "#", "#", " "},
                        {"#", " ", "#", " ", " ", "#"},
                        {"#", " ", "#", " ", " ", " "},
                        {" ", "#", " ", "#", " ", "#"} };
      Balloono bal = new Balloono(w1);
      ArrayList<Location> locs = new ArrayList<Location>();
      locs.add(new Location(3, 3));
      bal.setOpponents(locs);
      bal.setCurrentLocation(new Location(1, 1));
      assertEquals(true, bal.isSafe(2));
      assertEquals(true, bal.isSafe(3));
      assertEquals(true, bal.isSafe(4));
      assertEquals(true, bal.isSafe(5));
      assertEquals(false, bal.isSafe(6));

      bal.setCurrentLocation(new Location(0, 2));
      assertEquals(true, bal.isSafe(2));
      assertEquals(true, bal.isSafe(3));
      assertEquals(true, bal.isSafe(4));
      assertEquals(false, bal.isSafe(5));

      bal.setCurrentLocation(new Location(5, 0));
      assertEquals(true, bal.isSafe(2));
      assertEquals(true, bal.isSafe(3));
      assertEquals(false, bal.isSafe(4));

      bal.setCurrentLocation(new Location(4, 1));
      assertEquals(true, bal.isSafe(2));
      assertEquals(false, bal.isSafe(3));

      bal.setCurrentLocation(new Location(2, 5));
      assertEquals(false, bal.isSafe(2));

      locs.set(0, new Location(5, 2));
      locs.add(new Location(1, 4));
      bal.setCurrentLocation(new Location(1, 3));
      assertEquals(false, bal.isSafe(1));
      bal.setCurrentLocation(new Location(1, 2));
      assertEquals(true, bal.isSafe(1));

      bal.setCurrentLocation(new Location(4, 5));
      assertEquals(true, bal.isSafe(2));

      bal.setCurrentLocation(new Location(2, 1));
      assertEquals(false, bal.isSafe(3));
   }
}