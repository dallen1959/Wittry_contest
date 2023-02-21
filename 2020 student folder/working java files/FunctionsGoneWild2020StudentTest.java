public class FunctionsGoneWild2020StudentTest extends junit.framework.TestCase
{
    public void testFunctionsGoneWild2020_00()
    {
        assertEquals(1, FunctionsGoneWild2020.f1(1));
        assertEquals(7, FunctionsGoneWild2020.f1(2));
        assertEquals(19, FunctionsGoneWild2020.f1(3));
        assertEquals(37, FunctionsGoneWild2020.f1(4));
        assertEquals(61, FunctionsGoneWild2020.f1(5));
        assertEquals(91, FunctionsGoneWild2020.f1(6));

        assertEquals(34, FunctionsGoneWild2020.f2("1a1b1", 3));
        assertEquals(50, FunctionsGoneWild2020.f2("ab", 2));
        assertEquals(20, FunctionsGoneWild2020.f2("3a123b", 5));

        assertEquals(324, FunctionsGoneWild2020.f3(20));
        assertEquals(304, FunctionsGoneWild2020.f3(135));
        assertEquals(127, FunctionsGoneWild2020.f3(501));
        assertEquals(500, FunctionsGoneWild2020.f3(500));

        assertEquals(250/*36+78+136*/, FunctionsGoneWild2020.f4(2, 2, 1));
        assertEquals(472/*(9/4)*16+10*4 + 2*25+10*5 + 2*36+10*6 + 2*49+7*10*/, FunctionsGoneWild2020.f4(1, 2, 5));

        assertEquals(2, FunctionsGoneWild2020.f5(523, 3));
        assertEquals(12, FunctionsGoneWild2020.f5(98, 11));
        assertEquals(40, FunctionsGoneWild2020.f5(1, 35));
        assertEquals(0, FunctionsGoneWild2020.f5(154, 11));

        assertEquals(35.922375, FunctionsGoneWild2020.f6(4*Math.PI/5., 3., 3*Math.PI/2), 0.005);
        assertEquals(65.250785, FunctionsGoneWild2020.f6(4*Math.PI/5., 2., Math.PI/3), 0.005);

        assertEquals("abdfghjklqsvwxyz", FunctionsGoneWild2020.f7("Computer Science"));
        assertEquals("t", FunctionsGoneWild2020.f7("The quick brown fox jumps over lazy dog."));
        assertEquals("bcdfhjklpquvwxyz", FunctionsGoneWild2020.f7("Programming Contest 2020"));

        assertEquals("FGHIJKLMNO", FunctionsGoneWild2020.f8("ABCDEFGHIJ") );
        assertEquals("PQRSTUVWXYZABCDE", FunctionsGoneWild2020.f8("ZYXWVUTSRQPONMLK") );
        assertEquals("LAV NV", FunctionsGoneWild2020.f8("GOT IT") );

        assertEquals(true, FunctionsGoneWild2020.f9(false, false, false) );

        assertEquals(false, FunctionsGoneWild2020.f10(false, false, false, false) );
    }
}