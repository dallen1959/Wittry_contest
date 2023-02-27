import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentStampsTest extends junit.framework.TestCase
{
   public void testStamps01()
   {
      int[] arr = {1, 3};
      Stamps s = new Stamps(5, arr);
      assertEquals(13, s.getMaxRange());

      int[] arr1 = {1, 4, 12, 21};
      s = new Stamps(5, arr1);
      assertEquals(71, s.getMaxRange());

      int[] arr2 = {1, 7, 16, 31, 88};
      s = new Stamps(10, arr2);
      assertEquals(409, s.getMaxRange());

      int[] arr3 = {1, 5, 7, 8};
      s = new Stamps(6, arr3);
      assertEquals(48, s.getMaxRange());

      int[] arr4 = {2, 4, 8};
      s = new Stamps(5, arr4);
      assertEquals(0, s.getMaxRange());
   }
}