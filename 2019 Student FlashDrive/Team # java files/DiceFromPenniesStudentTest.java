public class DiceFromPenniesStudentTest extends junit.framework.TestCase
{
    public void testDiceFromPennies01()
    {
        DiceFromPennies dfp = new DiceFromPennies(6);
        assertEquals(1, dfp.getRoll("HHH"));
        assertEquals(2, dfp.getRoll("HHT"));
        assertEquals(3, dfp.getRoll("HTH"));
        assertEquals(4, dfp.getRoll("HTT"));
        assertEquals(5, dfp.getRoll("THH"));
        assertEquals(6, dfp.getRoll("THT"));
        assertEquals(-1, dfp.getRoll("TTT"));
        assertEquals(1, dfp.getRoll("TTTHHH"));

        dfp = new DiceFromPennies(20);
        assertEquals(18, dfp.getRoll("THHHTHHHHT"));
        assertEquals(6, dfp.getRoll("TTHHTHHTHT"));

        dfp = new DiceFromPennies(2);
        assertEquals(3, dfp.getRolls(2, "HT"));
        assertEquals(7, dfp.getRolls(5, "HTTHHHTHTHTHTHTHT"));

        dfp = new DiceFromPennies(15);

        assertEquals(33, dfp.getRolls(4, "HTTHHHTHTHTHTHTT"));
    }
}