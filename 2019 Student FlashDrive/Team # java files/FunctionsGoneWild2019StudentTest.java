public class FunctionsGoneWild2019StudentTest extends junit.framework.TestCase
{
    public void testFunctionsGoneWild2019_00()
    {
        assertEquals(2, FunctionsGoneWild2019.f1(2, 1));
        assertEquals(2+2*2+2, FunctionsGoneWild2019.f1(2, 2));
        assertEquals(8 + 2*8 + 2, FunctionsGoneWild2019.f1(2, 3));
        assertEquals(4+4*4+4, FunctionsGoneWild2019.f1(4, 2));
        assertEquals(1023, FunctionsGoneWild2019.f1(3, 5));

        assertEquals(21, FunctionsGoneWild2019.f2(0.5, 3.6, 1.1, 8.1));
        assertEquals(28, FunctionsGoneWild2019.f2(-1.3, 5.0, -4.6, -0.9));
        assertEquals(54, FunctionsGoneWild2019.f2(-3.1, 2.9, 0.95, 9.03));

        assertEquals(1771, FunctionsGoneWild2019.f3(202));
        assertEquals(422, FunctionsGoneWild2019.f3(135));
        assertEquals(-727, FunctionsGoneWild2019.f3(35));
        assertEquals(63, FunctionsGoneWild2019.f3(5));

        assertEquals(12, FunctionsGoneWild2019.f4(1, 1, 1));
        assertEquals(144, FunctionsGoneWild2019.f4(2, 2, 2));
        assertEquals(34, FunctionsGoneWild2019.f4(2, 1, 2));

        assertEquals("3.00", FunctionsGoneWild2019.f5("H", 0.001));
        assertEquals("11.00", FunctionsGoneWild2019.f5("OH", 0.001));
        assertEquals("1.92", FunctionsGoneWild2019.f5("H", 0.012));

        assertEquals(0.545199900, FunctionsGoneWild2019.f6(2, 1, 3), 0.05);
        assertEquals(10.1819565, FunctionsGoneWild2019.f6(2, 2, 3), 0.05);

        assertEquals(20, FunctionsGoneWild2019.f7("CODE", "CODE"));
        assertEquals(20, FunctionsGoneWild2019.f7("SCore", "Score"));
        assertEquals(17, FunctionsGoneWild2019.f7("@Precede*", "#proceed*"));
        assertEquals(9, FunctionsGoneWild2019.f7("#abcde", "#acCex"));

        assertEquals("plrgfsxvcwtbzdhnkmjq", FunctionsGoneWild2019.f8("bcdfghjklmnpqrstvwxz") );
        assertEquals("bcdfghjklmnpqrstvwxz", FunctionsGoneWild2019.f8("plrgfsxvcwtbzdhnkmjq") );
        assertEquals("ouyaei", FunctionsGoneWild2019.f8("aeiouy") );
        assertEquals("aeiouy", FunctionsGoneWild2019.f8("ouyaei") );
        assertEquals("faar xap", FunctionsGoneWild2019.f8("good job") );
        assertEquals("good job", FunctionsGoneWild2019.f8("faar xap") );

        assertEquals(false, FunctionsGoneWild2019.f9(false, false, false) );

        assertEquals(false, FunctionsGoneWild2019.f10(false, false, false, false) );
    }
}