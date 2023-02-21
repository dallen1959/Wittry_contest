import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2015 Wittry programming contest
 */
public class PacifyingNumbersStudentTest extends junit.framework.TestCase
{
   public void testPacifyingNumbers00()
   {
      PacifyingNumbers pn = new PacifyingNumbers();
      assertEquals(4+1, pn.sumDigits(41));
      assertEquals(5+9+0+3, pn.sumDigits(-5903));
      
      List<Integer> numbers = new ArrayList<Integer>();
      numbers.add(new Integer(1382));
      numbers.add(new Integer(105521));
      numbers.add(new Integer(-95));
      assertEquals(true, pn.arePacfyingNumbers(numbers));
      numbers.add(new Integer(-734));
      assertEquals(true, pn.arePacfyingNumbers(numbers));
      numbers.add(new Integer(14));
      assertEquals(false, pn.arePacfyingNumbers(numbers));

      numbers = new ArrayList<Integer>();
      numbers.add(new Integer(203));
      numbers.add(new Integer(10211));
      numbers.add(new Integer(-5));
      assertEquals(32, pn.getNextPacifyingNumber(numbers, 24));
      assertEquals(1031, pn.getNextPacifyingNumber(numbers, 1030));
      assertEquals(2003, pn.getNextPacifyingNumber(numbers, 2003));
   }
}