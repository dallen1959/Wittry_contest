import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentFunctionsGoneWild2012FinalTest extends junit.framework.TestCase
{
   public void testFunctionsGoneWild2012_00()
   {
      assertEquals(3938, FunctionsGoneWild2012.f1(11));
      assertEquals(166.000775, FunctionsGoneWild2012.f2(2, 3, 5), 0.05);
      assertEquals( -24.500, FunctionsGoneWild2012.f3(3.5, 1.5), 0.05);
      assertEquals( 6.83567, FunctionsGoneWild2012.f4(-5, 0, 11),  0.25);
      assertEquals( 1734, FunctionsGoneWild2012.f5(5, 13, 7));
      assertEquals(512486, FunctionsGoneWild2012.f6(1, 1, 2, 2));
      assertEquals(false, FunctionsGoneWild2012.f7(true, true, true) );
      assertEquals(true, FunctionsGoneWild2012.f8(false, false, false, false) );
      assertEquals(-19.6234472, FunctionsGoneWild2012.f9(6, 7, 5, 2), 0.5);
      assertEquals(true, FunctionsGoneWild2012.f10(false, false, false, false, false));
   }
}