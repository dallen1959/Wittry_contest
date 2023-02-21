import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2016 Wittry programming contest
 */
public class MakeChangeStudentTest extends junit.framework.TestCase
{
   public void testMakeChange01()
   {
      MakeChange mc = new MakeChange(3, 1, 2, 4);
      assertEquals(true, mc.changePossible(3));
      assertEquals(false, mc.changePossible(4));
      assertEquals(true, mc.changePossible(3+5+20+100));
      assertEquals(false, mc.changePossible(64));
      assertEquals(false, mc.changePossible(129));
   }
}