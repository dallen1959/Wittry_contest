import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2017 Wittry programming contest
 */
public class ForestPlayGroundStudentTest extends junit.framework.TestCase
{
   public void testForestPlayGround01()
   {
      String[] figure1 = {"0", "1", "2", "3", "4", "5", "6", "7"};
      ForestPlayGround t = new ForestPlayGround(figure1);

      assertEquals(8, t.getNumNodes());
      assertEquals(4, t.getNumLeafs());

      String[] figure2 = {"A", "B", "C", "D", null, "E"};
      ForestPlayGround t2 = new ForestPlayGround(figure2);

      assertEquals(5, t2.getNumNodes());
      assertEquals(2, t2.getNumLeafs());

      String ans = t.getLeftChild(4);
      assertEquals(null, ans);
      ans = t.getRightChild(2);
      assertEquals("6", ans);
      ans = t.getParent(5);
      assertEquals("2", ans);
      ans = t.getParent(5);
      assertEquals("2", ans);
      List<String> ancestors = t.getAncestors(6);
      assertEquals(2, ancestors.size());
      assertEquals(true, ancestors.contains("2"));
      assertEquals(true, ancestors.contains("0"));
      List<String> descendants = t.getDescendants(1);
      assertEquals(3, descendants.size());
      assertEquals(true, descendants.contains("3"));
      assertEquals(true, descendants.contains("4"));
      assertEquals(true, descendants.contains("7"));

      assertEquals(false, t.isFull());

      String[] tree1 = {"A", "B", "C", null, null, "D", "E"};
      t = new ForestPlayGround(tree1);
      assertEquals(false, t.isComplete());

      String[] tree2 = {"A", "B", "C", "D"};
      t = new ForestPlayGround(tree2);
      assertEquals(true, t.isComplete());
   }
}