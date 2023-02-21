import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2014 Wittry programming contest
 */
public class StudentReplaceMeTest extends junit.framework.TestCase
{
   public void testReplaceMeTest01()    // all have unique solutions
   {
      int[] n = {111, 444, 777, 888};
      ReplaceMe rm = new ReplaceMe(n);

      int[] sol = {110, 44, 77, 880};
      List<Integer> solution = new ArrayList<Integer>();
      for (int s : sol)
         solution.add(new Integer(s));

      int[] temp = rm.insertFourZeros(1111);
      assertEquals(4, temp.length);
      for (int num : temp)
         assertEquals(true, solution.contains(num));

      int[] sola = {111, 444, 700, 800};
      solution = new ArrayList<Integer>();
      for (int s : sola)
         solution.add(new Integer(s));

      temp = rm.insertFourZeros(2055);
      assertEquals(4, temp.length);
      for (int num : temp)
         assertEquals(true, solution.contains(num));
   }
}