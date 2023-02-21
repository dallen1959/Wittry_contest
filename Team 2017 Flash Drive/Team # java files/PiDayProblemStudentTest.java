import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2017 Wittry programming contest
 */
public class PiDayProblemStudentTest extends junit.framework.TestCase
{
   public void testPiDayProblem01()
   {
      List<String> solution = PizzaHutPiDayProblem1.pizzaHut2016EasyPiDayProblem(1);

      assertEquals(9, solution.size());

      assertEquals(true, solution.contains(""+1));
      assertEquals(true, solution.contains(""+2));
      assertEquals(true, solution.contains(""+3));
      assertEquals(true, solution.contains(""+4));
      assertEquals(true, solution.contains(""+5));
      assertEquals(true, solution.contains(""+6));
      assertEquals(true, solution.contains(""+7));
      assertEquals(true, solution.contains(""+8));
      assertEquals(true, solution.contains(""+9));

      solution = PizzaHutPiDayProblem1.pizzaHut2016EasyPiDayProblem(2);

      assertEquals(41, solution.size());

      assertEquals(true, solution.contains(""+10));
      assertEquals(true, solution.contains(""+12));
      assertEquals(true, solution.contains(""+14));
      assertEquals(true, solution.contains(""+16));
      assertEquals(true, solution.contains(""+18));
      assertEquals(true, solution.contains(""+20));
      assertEquals(true, solution.contains(""+24));
      assertEquals(true, solution.contains(""+26));
      assertEquals(true, solution.contains(""+28));
      assertEquals(true, solution.contains(""+30));
      assertEquals(true, solution.contains(""+32));
      assertEquals(true, solution.contains(""+34));
      assertEquals(true, solution.contains(""+36));
      assertEquals(true, solution.contains(""+38));
      assertEquals(true, solution.contains(""+40));
      assertEquals(true, solution.contains(""+42));
      assertEquals(true, solution.contains(""+46));
      assertEquals(true, solution.contains(""+48));
      assertEquals(true, solution.contains(""+50));
      assertEquals(true, solution.contains(""+52));
      assertEquals(true, solution.contains(""+54));
      assertEquals(true, solution.contains(""+56));
      assertEquals(true, solution.contains(""+58));
      assertEquals(true, solution.contains(""+60));
      assertEquals(true, solution.contains(""+62));
      assertEquals(true, solution.contains(""+64));
      assertEquals(true, solution.contains(""+68));
      assertEquals(true, solution.contains(""+70));
      assertEquals(true, solution.contains(""+72));
      assertEquals(true, solution.contains(""+74));
      assertEquals(true, solution.contains(""+76));
      assertEquals(true, solution.contains(""+78));
      assertEquals(true, solution.contains(""+80));
      assertEquals(true, solution.contains(""+82));
      assertEquals(true, solution.contains(""+84));
      assertEquals(true, solution.contains(""+86));
      assertEquals(true, solution.contains(""+90));
      assertEquals(true, solution.contains(""+92));
      assertEquals(true, solution.contains(""+94));
      assertEquals(true, solution.contains(""+96));
      assertEquals(true, solution.contains(""+98));
   }
}
