import java.util.*;

/**
import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2018 Wittry programming contest
 */
public class LineUpStudentTest extends junit.framework.TestCase
{
   public void testLineUp01()
   {
      LineUp lu = new LineUp();
      Player seager = new Player("Seager", 150, 50, 9, 2, 6, 8);

      List<Player> ps = new ArrayList<Player>();
      ps.add(seager);
      ps.add(new Player("Ruth", 135, 52, 10, 1, 17, 12));
      ps.add(new Player("Trout", 145, 40, 18, 5, 13, 9));
      ps.add(new Player("Beltre", 175, 45, 3, 0, 1, 2));
      ps.add(new Player("Alltuve", 125, 72, 23, 5, 10, 11));
      ps.add(new Player("Bellinger", 150, 40, 11, 0, 14, 7));
      ps.add(new Player("Puig", 145, 40, 19, 4, 13, 9));
      ps.add(new Player("Ohtani", 115, 25, 2, 0, 6, 4));
      ps.add(new Player("Arenado", 155, 51, 19, 0, 16, 10));
      lu.addPlayers(ps);

      assertEquals(50-9-2-6, seager.getNumSingles());
      assertEquals(81/150. /*(9*2+2*3+6*4+50-9-2-6)/150.*/, seager.getSluggingPercent(), 0.001);
      assertEquals(50./150., seager.getBattingAverage(), 0.001);
      assertEquals((50+8)/(150 + 8.), seager.getOnBasePercentage(), 0.001);

      assertEquals(new Player("Alltuve", 125, 72, 23, 5, 10, 11), lu.getCleanUp());
      assertEquals(new Player("Ruth", 135, 52, 10, 1, 17, 12), lu.getLeadOff());
      assertEquals(new Player("Arenado", 155, 51, 19, 0, 16, 10), lu.getThirdBatter());
      assertEquals(new Player("Trout", 145, 40, 18, 5, 13, 9), lu.getSecondBatter());
   }
}