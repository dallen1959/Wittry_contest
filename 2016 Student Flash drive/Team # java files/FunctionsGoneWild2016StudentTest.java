import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2016 Wittry programming contest
 */
public class FunctionsGoneWild2016StudentTest extends junit.framework.TestCase
{
   public void testFunctionsGoneWild2016_00()
   {
      assertEquals(26, FunctionsGoneWild2016.f1(5));
      assertEquals(45.2562, FunctionsGoneWild2016.f2(11), 0.05);
      assertEquals(3.4025, FunctionsGoneWild2016.f3(1.5, 1.9), 0.05);
      assertEquals(0.00025277, FunctionsGoneWild2016.f4(2.5, 4.7),  0.000025);
      assertEquals(0.0745626, FunctionsGoneWild2016.f5(Math.PI, 2.5, 3.3), 0.0005);
      assertEquals(1+1+1+1, FunctionsGoneWild2016.f6(4, 2, 1));
      assertEquals(1+3+6+5+4+2+1+9, FunctionsGoneWild2016.f7("lEgS have ZelGi") );
      assertEquals(2+2+2+2+2+1+1+0+0, FunctionsGoneWild2016.f8("HUMUHUMUNUKUNUKUAPUAA", "UK") );
      assertEquals(true, FunctionsGoneWild2016.f9(false, false, false) );
      assertEquals(false, FunctionsGoneWild2016.f10(false, false, false, false) );
   }
}