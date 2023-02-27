import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTheRaceTest extends junit.framework.TestCase
{
   public void testTheRace01()
   {
      String[] names1 = {"George", "John", "Thomas", "James"};
      TheRace tr = new TheRace(names1, 12);
      PlayerMove[] pm1 = { new PlayerMove("George", 4),
                           new PlayerMove("John", 2),
                           new PlayerMove("Thomas", 3),
                           new PlayerMove("James", 1)
                         };
      assertEquals(false, tr.playRound(pm1));
      assertEquals(4, tr.getPlayerLocation( "George" ) );
      assertEquals(2, tr.getPlayerLocation( "John" ) );
      assertEquals(3, tr.getPlayerLocation( "Thomas" ) );
      assertEquals(1, tr.getPlayerLocation( "James" ) );

      ArrayList<String> res = tr.getResults();
      assertEquals(0, res.size());
    }
}