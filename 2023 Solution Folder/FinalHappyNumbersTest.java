import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2021 Wittry programming contest
 */
public class FinalHappyNumbersTest extends junit.framework.TestCase
{
    public void testHappyNumbers01()
    {
        assertEquals("getHappyLength(19)", 4, HappyNumbers.getHappyLength(19));
        assertEquals("getHappyLength(44)", 4, HappyNumbers.getHappyLength(44));
        assertEquals("getHappyLength(921)", 3, HappyNumbers.getHappyLength(921));
        assertEquals("getHappyLength(989)", 6, HappyNumbers.getHappyLength(989));

        assertEquals("getHappyLength(999)", -1, HappyNumbers.getHappyLength(999));

        assertEquals("makeHappy(45)", 44, HappyNumbers.makeHappy(45));
        assertEquals("makeHappy(2503)", 2603, HappyNumbers.makeHappy(2503));
        assertEquals("makeHappy(612)", 622, HappyNumbers.makeHappy(612));
        assertEquals("makeHappy(64)", -1, HappyNumbers.makeHappy(64));
        assertEquals("makeHappy(9)", 10, HappyNumbers.makeHappy(9));
        assertEquals("makeHappy(999)", 899, HappyNumbers.makeHappy(999));
        assertEquals("makeHappy(123)", 133, HappyNumbers.makeHappy(123));
        assertEquals("makeHappy(189)", 188, HappyNumbers.makeHappy(189));

    }


    public void testGetHappyLength02()
    {
        assertEquals("getHappyLength(68)", 2, HappyNumbers.getHappyLength(68));
        assertEquals("getHappyLength(86)", 2, HappyNumbers.getHappyLength(86));
        assertEquals("getHappyLength(10)", 1, HappyNumbers.getHappyLength(10));
        assertEquals("getHappyLength(100)", 1, HappyNumbers.getHappyLength(100));
        assertEquals("getHappyLength(1000)", 1, HappyNumbers.getHappyLength(1000));
        assertEquals("getHappyLength(10000)", 1, HappyNumbers.getHappyLength(10000));
        assertEquals("getHappyLength(511038)", 2, HappyNumbers.getHappyLength(511038));
        assertEquals("getHappyLength(80060)", 2, HappyNumbers.getHappyLength(80060));

        assertEquals("getHappyLength(30)", -1, HappyNumbers.getHappyLength(30));
    }

    public void testGetHappyLength03()
    {
        assertEquals("getHappyLength(3328)", 3, HappyNumbers.getHappyLength(3328));
        assertEquals("getHappyLength(18810)", 3, HappyNumbers.getHappyLength(18810));
        assertEquals("getHappyLength(464)", 3, HappyNumbers.getHappyLength(464));
        assertEquals("getHappyLength(28)", 3, HappyNumbers.getHappyLength(28));
        assertEquals("getHappyLength(571311)", 3, HappyNumbers.getHappyLength(571311));

        assertEquals("getHappyLength(5476)", -1, HappyNumbers.getHappyLength(5476));
        assertEquals("getHappyLength(3791)", -1, HappyNumbers.getHappyLength(3791));
    }

    public void testGetHappyLength04()
    {
        assertEquals("getHappyLength(336928)", 4, HappyNumbers.getHappyLength(336928));
        assertEquals("getHappyLength(7938)", 4, HappyNumbers.getHappyLength(7938));
        assertEquals("getHappyLength(94)", 4, HappyNumbers.getHappyLength(94));
        assertEquals("getHappyLength(383)", 4, HappyNumbers.getHappyLength(383));

        assertEquals("getHappyLength(2)", -1, HappyNumbers.getHappyLength(2));
        assertEquals("getHappyLength(963)", -1, HappyNumbers.getHappyLength(963));
    }

    public void testGetHappyLength05()
    {
         assertEquals("getHappyLength(70)", 5, HappyNumbers.getHappyLength(70));
         assertEquals("getHappyLength(331)", 5, HappyNumbers.getHappyLength(331));
         assertEquals("getHappyLength(973)", 6, HappyNumbers.getHappyLength(973));
         assertEquals("getHappyLength(877978)", 7, HappyNumbers.getHappyLength(877978));

        assertEquals("getHappyLength(5)", -1, HappyNumbers.getHappyLength(5));
        assertEquals("getHappyLength(9)", -1, HappyNumbers.getHappyLength(9));
        assertEquals("getHappyLength(111111111)", -1, HappyNumbers.getHappyLength(111111111));
    }

    public void testMakeHappy06()
    {
        assertEquals("makeHappy(58)", 68, HappyNumbers.makeHappy(58));
        assertEquals("makeHappy(2)", 1, HappyNumbers.makeHappy(2));
        assertEquals("makeHappy(41)", 31, HappyNumbers.makeHappy(41));
   
        assertEquals("makeHappy(88)", -1, HappyNumbers.makeHappy(88));
        assertEquals("makeHappy(5)", -1, HappyNumbers.makeHappy(5));
    }

    public void testMakeHappy07()
    {
        assertEquals("makeHappy(486)", 386, HappyNumbers.makeHappy(486));
        assertEquals("makeHappy(672)", 671, HappyNumbers.makeHappy(672));
        assertEquals("makeHappy(719)", 709, HappyNumbers.makeHappy(719));
   
        assertEquals("makeHappy(754)", -1, HappyNumbers.makeHappy(754));
        assertEquals("makeHappy(772)", -1, HappyNumbers.makeHappy(772));
    }

    public void testMakeHappy08()
    {
        assertEquals("makeHappy(44487)", 44488, HappyNumbers.makeHappy(44487));
        assertEquals("makeHappy(60)", 70, HappyNumbers.makeHappy(60));
        assertEquals("makeHappy(406)", 496, HappyNumbers.makeHappy(406));
        assertEquals("makeHappy(3080)", 2080, HappyNumbers.makeHappy(3080));
   
        assertEquals("makeHappy(7005)", -1, HappyNumbers.makeHappy(7005));
        assertEquals("makeHappy(30050)", -1, HappyNumbers.makeHappy(30050));
    }

    public void testMakeHappy09()
    {
        assertEquals("makeHappy(99)", 109, HappyNumbers.makeHappy(99));
        assertEquals("makeHappy(314919)", 304919, HappyNumbers.makeHappy(314919));
        assertEquals("makeHappy(299)", 2109, HappyNumbers.makeHappy(299));
        assertEquals("makeHappy(929)", 1029, HappyNumbers.makeHappy(929));
        assertEquals("makeHappy(5892)", 58102, HappyNumbers.makeHappy(5892));
   
        assertEquals("makeHappy(9999)", -1, HappyNumbers.makeHappy(9999));
        assertEquals("makeHappy(8949)", -1, HappyNumbers.makeHappy(8949));
    }

    public void testMakeHappy10()
    {
        assertEquals("makeHappy(107)", 907, HappyNumbers.makeHappy(107));
        assertEquals("makeHappy(17483)", 97483, HappyNumbers.makeHappy(17483));
        assertEquals("makeHappy(17)", 97, HappyNumbers.makeHappy(17));
        assertEquals("makeHappy(10800)", 10900, HappyNumbers.makeHappy(10800));
   
        assertEquals("makeHappy(135376)", -1, HappyNumbers.makeHappy(135376));
    }
}