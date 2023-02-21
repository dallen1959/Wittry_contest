import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2014 Wittry programming contest
 */
public class StudentStringMathTest extends junit.framework.TestCase
{
   public void testStringMath01()
   {
      StringMath sm = new StringMath();
      assertEquals(0.0, sm.getAverage("....."), 0.005);
      assertEquals((0+1+2+3+4+5)/6., sm.getAverage("+++++"), 0.005);
      assertEquals(1.41666, sm.getAverage("(+.)3.(-)4"), 0.005);
      assertEquals(1.78378, sm.getAverage("(((++--)1+)3(-)3)2"), 0.005);
      assertEquals(0.33, sm.getAverage("(+-)1"), 0.005);

      assertEquals(5, sm.evaluate("+++++"));
      assertEquals(-5, sm.evaluate("-----"));
      assertEquals(0, sm.evaluate("++..--"));

      assertEquals(7, sm.evaluate("+(++)2++"));
      assertEquals(-1+(3*-3)-1, sm.evaluate("-(---)3-"));
      assertEquals(0, sm.evaluate("+(+..-)8-"));
   }
}