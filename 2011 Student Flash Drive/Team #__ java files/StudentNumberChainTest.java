import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentNumberChainTest extends junit.framework.TestCase
{
   public void testNumberChain01()
   {
      NumberChain nc = new NumberChain(987654321);
      assertEquals(123456789, nc.ascendingDigits());
      assertEquals(987654321, nc.descendingDigits());
      assertEquals(2, nc.getChainLength());

      nc = new NumberChain(123456789);
      assertEquals(123456789, nc.ascendingDigits());
      assertEquals(987654321, nc.descendingDigits());
      assertEquals(2, nc.getChainLength());

      nc = new NumberChain(1234);
      assertEquals(1234, nc.ascendingDigits());
      assertEquals(4321, nc.descendingDigits());
      assertEquals(4, nc.getChainLength());

      nc = new NumberChain(444);
      assertEquals(444, nc.ascendingDigits());
      assertEquals(444, nc.descendingDigits());
      assertEquals(2, nc.getChainLength());
   }
}