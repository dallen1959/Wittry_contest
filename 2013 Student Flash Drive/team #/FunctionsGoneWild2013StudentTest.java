import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FunctionsGoneWild2013StudentTest extends junit.framework.TestCase
{
   public void testFunctionsGoneWild2013_00()
   {
      assertEquals(35052, FunctionsGoneWild2013.f1(111));
      assertEquals(2.0, FunctionsGoneWild2013.f2(5, 3), 0.05);
      assertEquals( -1.5945, FunctionsGoneWild2013.f3(5., 6., 7.), 0.05);
      assertEquals(0.208558 , FunctionsGoneWild2013.f4(5., 11., 3.),  0.25);
      assertEquals( -12, FunctionsGoneWild2013.f5(2, 4, -1));
      assertEquals(241068, FunctionsGoneWild2013.f6(2, 2, 1, 3));
      assertEquals(false, FunctionsGoneWild2013.f7(false, false, true) );
      assertEquals(false, FunctionsGoneWild2013.f8(false, false, false, false) );
      assertEquals(4.84856, FunctionsGoneWild2013.f9(1, 1, 1.1, 4.4, 5.5), 0.5);
      assertEquals(true, FunctionsGoneWild2013.f10(false, false, false, false, false));
   }
}