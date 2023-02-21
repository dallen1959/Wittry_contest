import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2015 Wittry programming contest
 */
public class FunctionsGoneWild2015StudentTest extends junit.framework.TestCase
{
   public void testFunctionsGoneWild2015_00()
   {
      assertEquals(8, FunctionsGoneWild2015.f1(5));
      assertEquals(2.364669, FunctionsGoneWild2015.f2(5), 0.05);
      assertEquals(0.41110, FunctionsGoneWild2015.f3(2., 4., 7.), 0.05);
      assertEquals(10.5746, FunctionsGoneWild2015.f4(5., 11., 3.),  0.05);
      assertEquals(117.0, FunctionsGoneWild2015.f5(7, 1, 4), 1);
      assertEquals(2+14+27 , FunctionsGoneWild2015.f6("Think left, think right, think high and low", "ink"));
      assertEquals(true, FunctionsGoneWild2015.f7(false, false, true) );
      assertEquals(true, FunctionsGoneWild2015.f8(false, false, false, false) );
      assertEquals(5.151, FunctionsGoneWild2015.f9(1, 1, 1.1, 4.4), 0.05);
      assertEquals(true, FunctionsGoneWild2015.f10(false, false, false, false));
   }
}