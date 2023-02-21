public class FunctionsGoneWild2017StudentTest extends junit.framework.TestCase
{
   public void testFunctionsGoneWild2017_00()
   {
      assertEquals(35, FunctionsGoneWild2017.f1(11));
      assertEquals(-42, FunctionsGoneWild2017.f1(44));
      assertEquals(-429, FunctionsGoneWild2017.f1(389));
      assertEquals(-2275.836497, FunctionsGoneWild2017.f2(7), 0.05);
      assertEquals(24.6868, FunctionsGoneWild2017.f3(5., 3.2), 0.05);
      assertEquals(-5.8241, FunctionsGoneWild2017.f4(50.51, 86.7855),  0.000025);

      assertEquals(1.21058, FunctionsGoneWild2017.f5(1, 3, 8), 0.05);
      assertEquals(72.38373, FunctionsGoneWild2017.f5(2, 4, -1), 0.05);
      assertEquals(4+6+8+10+12+14, FunctionsGoneWild2017.f6(5, 2, 7));
      assertEquals("VPZQIYRT DVORMVR", FunctionsGoneWild2017.f7("COMPUTER SCIENCE") );
      assertEquals("NOGIC", FunctionsGoneWild2017.f8("ANALOGICAL", "AL") );
      assertEquals("COMUTSCINC", FunctionsGoneWild2017.f8("COMPUTER SCIENCE", "RE P") );
      assertEquals(true, FunctionsGoneWild2017.f9(false, false, false) );
      assertEquals(true, FunctionsGoneWild2017.f10(false, false, false, false) );
   }
}