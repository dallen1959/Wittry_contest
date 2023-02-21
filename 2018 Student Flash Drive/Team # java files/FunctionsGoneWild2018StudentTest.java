import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2018 Wittry programming contest
 */
public class FunctionsGoneWild2018StudentTest extends junit.framework.TestCase
{
   public void testFunctionsGoneWild2018_00()
   {
      assertEquals(1, FunctionsGoneWild2018.f1(8));
      assertEquals(10, FunctionsGoneWild2018.f1(26));
      assertEquals(0, FunctionsGoneWild2018.f1(64));

      assertEquals(20, FunctionsGoneWild2018.f2(0, 100));
      assertEquals(6, FunctionsGoneWild2018.f2(26, 52));
      assertEquals(46, FunctionsGoneWild2018.f2(-30, 200));

      assertEquals(580, FunctionsGoneWild2018.f3(202));
      assertEquals(116, FunctionsGoneWild2018.f3(135));
      assertEquals(389, FunctionsGoneWild2018.f3(55));
      assertEquals(1311, FunctionsGoneWild2018.f3(35));

      assertEquals(4218, FunctionsGoneWild2018.f4(2, 3, 4));
      assertEquals(429 + 491 + 555, FunctionsGoneWild2018.f4(1, 9, 1));

      assertEquals(0.0004303, FunctionsGoneWild2018.f5(1, 3),  0.000025);
      assertEquals(1.448499, FunctionsGoneWild2018.f5(2, -1), 1.448499 * 0.05);

      assertEquals(0.204239, FunctionsGoneWild2018.f6(Math.pow(-Math.E, 3), -1, 3), 0.0204239/2);
      assertEquals(37349.4719, FunctionsGoneWild2018.f6(25, 2, 1), 37.349);

      String[] ans = FunctionsGoneWild2018.f7("SAMPLE", 2);
      assertEquals("SML", ans[0] );
      assertEquals("APE", ans[1] );

      ans = FunctionsGoneWild2018.f7("HELP ME FIGURE THIS OUT :(", 3);
      assertEquals("HPEIRTSU:", ans[0] );
      assertEquals("E  GEH T(", ans[1] );
      assertEquals("LMFU IO ", ans[2] );
      
      ans = FunctionsGoneWild2018.f7("COMPUTER SCIENCE", 4);
      assertEquals("CU E", ans[0] );
      assertEquals("OTSN", ans[1] );
      assertEquals("MECC", ans[2] );
      assertEquals("PRIE", ans[3] );
      
      ans = FunctionsGoneWild2018.f7("TO ITERATE IS HUMAN, TO RECURSE DIVINE", 5);
      assertEquals("TE U EEI", ans[0] );
      assertEquals("ORIMTC N", ans[1] );
      assertEquals(" ASAOUDE", ans[2] );
      assertEquals("IT N RI", ans[3] );
      assertEquals("TEH,RSV", ans[4] );
      
      ans = FunctionsGoneWild2018.f7("1234567890", 5);
      assertEquals("16", ans[0] );
      assertEquals("27", ans[1] );
      assertEquals("38", ans[2] );
      assertEquals("49", ans[3] );
      assertEquals("50", ans[4] );
      
      ans = FunctionsGoneWild2018.f7("@ABC!", 7);
      assertEquals("@", ans[0] );
      assertEquals("A", ans[1] );
      assertEquals("B", ans[2] );
      assertEquals("C", ans[3] );
      assertEquals("!", ans[4] );
      assertEquals("", ans[5] );
      assertEquals("", ans[6] );

      assertEquals("BWZQRYIU KBEIXBI", FunctionsGoneWild2018.f8("COMPUTER SCIENCE") );
      assertEquals("YFI PREBS CUWOX HWN DRZQK WVIU YFI ALMT JWG", FunctionsGoneWild2018.f8("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG") );
      
      assertEquals(true, FunctionsGoneWild2018.f9(false, false, false) );
      assertEquals(true, FunctionsGoneWild2018.f10(false, false, false, false) );
   }
}