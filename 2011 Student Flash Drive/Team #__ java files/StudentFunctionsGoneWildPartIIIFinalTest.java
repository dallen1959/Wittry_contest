import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentFunctionsGoneWildPartIIIFinalTest extends junit.framework.TestCase
{
   public void testFunctionsGoneWildPartIII00()
   {
      assertEquals(3001, FunctionsGoneWildPartIII.f1(12));
      assertEquals( 28.20085, FunctionsGoneWildPartIII.f2(1, 4), 0.05);
      assertEquals( 5.2293327, FunctionsGoneWildPartIII.f3(50, 2, 1), 0.05);
      assertEquals( 102.26664, FunctionsGoneWildPartIII.f4(6, 4, 2),  0.25);
      assertEquals( 6.55907, FunctionsGoneWildPartIII.f5(5, 5), 0.05);
      assertEquals( 200.4808, FunctionsGoneWildPartIII.f5(1, 5), 0.05);
      assertEquals( -133.28760, FunctionsGoneWildPartIII.f6(1., 2., 3.), 0.05);
      assertEquals(true, FunctionsGoneWildPartIII.f7(false, true, false));
      assertEquals(true, FunctionsGoneWildPartIII.f8(false, true, false, true));
      assertEquals(2395425.206, FunctionsGoneWildPartIII.f9(8.7, 4.9, 4.8, 3.1, 24.3), 0.5);
      assertEquals(true, FunctionsGoneWildPartIII.f10(false, false, true, false, true));
   }
}