import java.util.*;

/**
 * The test class NumberGameTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentNumberGameTest extends junit.framework.TestCase
{
   public void testNumberGame01()
   {
      int[][] deck1 = { {1, 2, 3, 4, 5},
                        {2, 2, 2, 2, 2},
                        {3, 3, 1, 2, 3},
                        {3, 4, 4, 5, 5},
                        {4, 4, 4, 4, 3}};
      NumberGame ng = new NumberGame(deck1);

      assertEquals(40, ng.getRowScore(0));
      assertEquals(4*10, ng.getRowScore(1));
      assertEquals(3+3+1+2+3, ng.getRowScore(2));
      assertEquals(3+5, ng.getRowScore(3));
      assertEquals(3*(4+4+4+4+3), ng.getRowScore(4));
      assertEquals(30, ng.getColScore(0));
      assertEquals(2+4, ng.getColScore(1));
      assertEquals(30, ng.getColScore(2));
      assertEquals(2+5, ng.getColScore(3));
      assertEquals(2+5, ng.getColScore(4));

      assertEquals(40+40+12+8+3*19+30+6+30+7+7, ng.getScore());
   }
}