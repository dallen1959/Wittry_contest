import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2015 Wittry programming contest
 */
public class NetworksStudentTest extends junit.framework.TestCase
{
   public void testNetworks01()
   {
      Networks net = new Networks();
      net.addConnection(new Connection("A", "B"));
      net.addConnection(new Connection("A", "C"));
      net.addConnection(new Connection("A", "D"));
      net.addConnection(new Connection("B", "D"));
      net.addConnection(new Connection("C", "E"));
      net.addConnection(new Connection("B", "E"));

      List<String> sol = net.getReachableLocations("A", 1);
      assertEquals(3, sol.size());
      assertEquals(true, sol.contains("B"));
      assertEquals(true, sol.contains("C"));
      assertEquals(true, sol.contains("D"));

      sol = net.getReachableLocations("A", 2);
      assertEquals(2, sol.size());
      assertEquals(true, sol.contains("D"));
      assertEquals(true, sol.contains("E"));

      sol = net.getAllReachableLocations("A");
      assertEquals(4, sol.size());
      assertEquals(true, sol.contains("B"));
      assertEquals(true, sol.contains("C"));
      assertEquals(true, sol.contains("D"));
      assertEquals(true, sol.contains("E"));
   }
}