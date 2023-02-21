import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version 2014 Wittry programming contest
 */
public class StudentGoFigureTest extends junit.framework.TestCase
{
   private final int n10 = 1024;

   public void testGoFigureTest01()
   {
      GoFigure gf = new GoFigure();

      assertEquals("123+123=246", gf.goFigureDecimal("123123246"));
      assertEquals("10100+1010=11110", gf.goFigureBinary("10100101011110"));
      assertEquals("MXIII+CCCLX=MCCCLXXIII", gf.goFigureRomanNumeral("MXIIICCCLXMCCCLXXIII"));
   }
}