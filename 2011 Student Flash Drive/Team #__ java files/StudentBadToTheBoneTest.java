import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentBadToTheBoneTest extends junit.framework.TestCase
{
   public void testBadToTheBone01()
   {
      ArrayList<Domino> dom = new ArrayList<Domino>();
      dom.add(new Domino(4, 0));
      dom.add(new Domino(2, 3));
      dom.add(new Domino(1, 5));
      dom.add(new Domino(5, 2));
      dom.add(new Domino(3, 4));
      dom.add(new Domino(4, 1));
      BadToTheBone bb = new BadToTheBone(dom);
      ArrayList<Domino> sol = new ArrayList<Domino>();
      sol.add(new Domino(4, 0));
      sol.add(new Domino(4, 1));
      assertEquals(true, bb.containsMatchingEdges());
      assertEquals(sol.size(), bb.processDraw().length);

      Domino[] temp = bb.processDraw();
      int i = 0;
      for (Domino d : temp)
      {
         assertEquals(d, sol.get(i));
         i++;
      }
   }
}