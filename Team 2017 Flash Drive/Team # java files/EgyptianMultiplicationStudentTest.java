/**
 * The test class EgyptianMultiplicationStudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EgyptianMultiplicationStudentTest extends junit.framework.TestCase
{
   public void testEgyptianMultiplication01()
   {
      assertEquals(1, EgyptianMultiplication.toDecimal("|"));
      assertEquals(37, EgyptianMultiplication.toDecimal("|||||||nnn"));
      assertEquals(3103, EgyptianMultiplication.toDecimal("|||9888"));
      assertEquals(50290, EgyptianMultiplication.toDecimal("nnnnnnnnn99rrrrr"));

      assertEquals("|", EgyptianMultiplication.toEgyptianNumber(1));
      assertEquals("|||||||nnn", EgyptianMultiplication.toEgyptianNumber(37));
      assertEquals("|||9888", EgyptianMultiplication.toEgyptianNumber(3103));
      assertEquals("nnnnnnnnn99rrrrr", EgyptianMultiplication.toEgyptianNumber(50290));

      String [] ans = EgyptianMultiplication.multiply("|||", "|n");
      assertEquals("|     |n", ans[0]);
      assertEquals("||     ||nn", ans[1]);
      assertEquals("|||nnn", ans[2]);

      ans = EgyptianMultiplication.multiply("|||||||||n", "|||nnnnnnnn");
      assertEquals("|     |||nnnnnnnn", ans[0]);
      assertEquals("||     ||||||nnnnnn9", ans[1]);
      assertEquals("||||||n     ||||||||nn9998", ans[2]);
      assertEquals("|||||||nnnnnnn999998", ans[3]);
   }
}
