import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentPedalTriangleTest extends junit.framework.TestCase
{
   public void testPedalTriangle01()
   {
      ArrayList<OrderedPair> op = new ArrayList<OrderedPair>();
      op.add(new OrderedPair(5., 5.));
      op.add(new OrderedPair(30., 25.));
      op.add(new OrderedPair(15., 70.));
      
      PedalTriangle pd = new PedalTriangle(op);
      OrderedPair p = new OrderedPair(20., 40.);
      List<OrderedPair> ans = pd.getPedalTriangle(p);
      assertEquals(true, ans.contains(new OrderedPair(1280./41., 1065./41.)));
      assertEquals(true, ans.contains(new OrderedPair(49./2, 83./2)));
      assertEquals(true, ans.contains(new OrderedPair(1835./173, 7170./173)));
    }
}