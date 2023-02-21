import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentSurprisingTest extends junit.framework.TestCase
{

   public void testSurprising01()
   {
      Surprising surp = new Surprising();

      assertEquals(false, surp.isCustomary(2576));

      assertEquals(true, surp.isCustomary(25476));
      assertEquals(false, surp.isCustomary(25477));

      assertEquals(true, surp.isLikable(25540));
      assertEquals(false, surp.isLikable(25541));

      assertEquals(true, surp.isGloomy(31806));
      assertEquals(false, surp.isGloomy(70556));

      assertEquals(true, surp.isAmazing(10247));
      assertEquals(false, surp.isAmazing(22227));

      assertEquals(true, surp.isSurprising(10638));
      assertEquals(false, surp.isSurprising(81237));
   }
}