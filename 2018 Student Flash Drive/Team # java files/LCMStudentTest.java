import java.util.*;

/**
import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2018 Wittry programming contest
 */
public class LCMStudentTest extends junit.framework.TestCase
{
   public void testLCMPlusPlus01()
   {
      assertEquals(12, LCM_PlusPlus.LCMof2Numbers(6, 4));
      assertEquals(459, LCM_PlusPlus.LCMof2Numbers(17, 27));
      assertEquals(2310, LCM_PlusPlus.LCMof2Numbers(55, 42));

      int[] number1 = {4, 7, 24};
      assertEquals(168, LCM_PlusPlus.LCMofMultipleNumbers(number1));

      int[] number2 = {6, 25, 14, 33};
      assertEquals(11550, LCM_PlusPlus.LCMofMultipleNumbers(number2));

      assertEquals(3, LCM_PlusPlus.minLCMValue(12, 4));
      assertEquals(55, LCM_PlusPlus.minLCMValue(2310, 42));
      assertEquals(42, LCM_PlusPlus.minLCMValue(2310, 55));
      assertEquals(21, LCM_PlusPlus.minLCMValue(2310, 55*2));
   }
}