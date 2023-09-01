import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2020 Wittry programming contest
 */
public class FunctionsGoneWild2023FinalTest extends junit.framework.TestCase
{
    public void testFunctionsGoneWild2023_00()
    {
        assertEquals("f1(1234)", "BACK", FunctionsGoneWild2023.f1(1234));
        assertEquals("f1(27826)", "FRONT", FunctionsGoneWild2023.f1(27826));
        assertEquals("f1(527527)", "FRONTBACK", FunctionsGoneWild2023.f1(527527));

        assertEquals("f2(\"d3739d0\", 60)", 4, FunctionsGoneWild2023.f2("d3739d0", 60));
        assertEquals("f2(\"16d2d\", 60)", 0, FunctionsGoneWild2023.f2("16d2d", 60));
        assertEquals("f2(\"16d\", 7)", 1, FunctionsGoneWild2023.f2("16d", 7));


        assertEquals("f3(22)", 400, FunctionsGoneWild2023.f3(22));
        assertEquals("f3(135)", 990, FunctionsGoneWild2023.f3(135));
        assertEquals("f3(501)", 470, FunctionsGoneWild2023.f3(501));
        assertEquals("f3(500)", 234, FunctionsGoneWild2023.f3(500));

        assertEquals("f4(1, 1, 2)", 250 /*9+34+75+132*/, FunctionsGoneWild2023.f4(1, 1, 2));      //  1, 2, 3, 4
        assertEquals("f4(3, 2, 6)", 44472/* 7712 + 8704 + 9756 */, FunctionsGoneWild2023.f4(3, 2, 6));     //   16, 17, 18

        assertEquals("f5(\"385-5395\")", 3+2*Math.sqrt(2)+Math.sqrt(5)/*8.064495102*/, FunctionsGoneWild2023.f5("385-5395"), 0.001);
        assertEquals("f5(\"1-372-485-6709\")", 4+6*Math.sqrt(2)+2*Math.sqrt(5)/*16.95741733*/, FunctionsGoneWild2023.f5("1-372-485-6709"), 0.001);

        assertEquals("f6(Math.PI/4., 5*Math.PI/6., Math.PI/8)", -0.4547921179, FunctionsGoneWild2023.f6(Math.PI/4., 5*Math.PI/6., Math.PI/8), 0.005);
        assertEquals("f6(7*Math.PI/13., 7*Math.PI/12., Math.PI/9)", 5.83706310, FunctionsGoneWild2023.f6(7*Math.PI/13., 7*Math.PI/12., Math.PI/9), 0.005);

        assertEquals("f7(\"xyz\", \"xz\")", true, FunctionsGoneWild2023.f7("xyz", "xz"));
        assertEquals("f7(\"xyz\", \"zx\")", false, FunctionsGoneWild2023.f7("xyz", "zx"));

        assertEquals("f8(\"NIESEVEHRTFEEV\")", "357", FunctionsGoneWild2023.f8("NIESEVEHRTFEEV") );
        assertEquals("f8(\"WZOZEOERTROTWO\")", "0022", FunctionsGoneWild2023.f8("WZOZEOERTROTWO") );

        assertEquals("f9(false, false, false) ", false, FunctionsGoneWild2023.f9(false, false, false) );

        assertEquals("f10(false, false, false, false) ", true, FunctionsGoneWild2023.f10(false, false, false, false) );
    }


    public void testFunctionsGoneWild2023_function01()
    {
        assertEquals("f1(8720873)", "BACK", FunctionsGoneWild2023.f1(8720873));
        assertEquals("f1(2021)", "BACK", FunctionsGoneWild2023.f1(2021));
        assertEquals("f1(15031504)", "BACK", FunctionsGoneWild2023.f1(15031504));
        assertEquals("f1(819)", "BACK", FunctionsGoneWild2023.f1(819));
        assertEquals("f1(89090)", "BACK", FunctionsGoneWild2023.f1(89090));
        
        assertEquals("f1(10)", "FRONT", FunctionsGoneWild2023.f1(10));
        assertEquals("f1(81980)", "FRONT", FunctionsGoneWild2023.f1(81980));
        assertEquals("f1(90089)", "FRONT", FunctionsGoneWild2023.f1(90089));
        assertEquals("f1(21)", "FRONT", FunctionsGoneWild2023.f1(21));
        
        assertEquals("f1(22)", "FRONTBACK", FunctionsGoneWild2023.f1(22));
        assertEquals("f1(920920)", "FRONTBACK", FunctionsGoneWild2023.f1(920920));
        assertEquals("f1(22)", "FRONTBACK", FunctionsGoneWild2023.f1(898));
        assertEquals("f1(920920)", "FRONTBACK", FunctionsGoneWild2023.f1(192011920));
    }

    public void testFunctionsGoneWild2023_function02()
    {
        assertEquals("f2(\"2dd48d\", 179)", 0, FunctionsGoneWild2023.f2("2dd48d", 179));
        assertEquals("f2(\"1391d\", 2)", 0, FunctionsGoneWild2023.f2("1391d", 2));
        assertEquals("f2(\"20ddd\", 221)", 1, FunctionsGoneWild2023.f2("20ddd", 221));
        assertEquals("f2(\"18dddd\", 179)", 2, FunctionsGoneWild2023.f2("18dddd", 179));

        assertEquals("f2(\"d0d87d\", 597)", 3, FunctionsGoneWild2023.f2("d0d87d", 597));
        assertEquals("f2(\"dd56d0\", 104)", 4, FunctionsGoneWild2023.f2("dd56d0", 104));
        assertEquals("f2(\"2d9d\", 865)", 5, FunctionsGoneWild2023.f2("2d9d", 865));

        assertEquals("f2(\"d357d\", 72)", 6, FunctionsGoneWild2023.f2("d357d", 72));
        assertEquals("f2(\"dd623\", 91)", 7, FunctionsGoneWild2023.f2("dd623", 91));
        
        assertEquals("f2(\"d5\", 17)", 8, FunctionsGoneWild2023.f2("d5", 17));
        assertEquals("f2(\"1d2\", 24)", 9, FunctionsGoneWild2023.f2("1d2", 24));

        assertEquals("f2(\"d221d\", 221)", 0, FunctionsGoneWild2023.f2("d221d", 221));
    }

    public void testFunctionsGoneWild2023_function03()
    {
        assertEquals("f3(850)", 436, FunctionsGoneWild2023.f3(850));
        assertEquals("f3(356)", 175, FunctionsGoneWild2023.f3(356));
        
        assertEquals("f3(995)", 1604, FunctionsGoneWild2023.f3(995));
        assertEquals("f3(1011)", 109, FunctionsGoneWild2023.f3(1011));
        assertEquals("f3(998)", 437, FunctionsGoneWild2023.f3(998));
        assertEquals("f3(1000)", 1935, FunctionsGoneWild2023.f3(1000));
        
        assertEquals("f3(19)", 83521, FunctionsGoneWild2023.f3(19));   // ^4
        assertEquals("f3(28)", 17576, FunctionsGoneWild2023.f3(28));   // ^3
        assertEquals("f3(12)", 100, FunctionsGoneWild2023.f3(12));   // ^2
        assertEquals("f3(6)", 4, FunctionsGoneWild2023.f3(6));   // ^1
        assertEquals("f3(30)", 1, FunctionsGoneWild2023.f3(30));   // ^0
    }

    public void testFunctionsGoneWild2023_function04()
    {
        assertEquals("f4(2, 4, 1)", 928 /*168+208+252+300*/, FunctionsGoneWild2023.f4(2, 4, 1));          // 7, 8, 9, 10
        assertEquals("f4(3, 1, 2)", 934/* 215 + 306 + 413 */, FunctionsGoneWild2023.f4(3, 1, 2));         // 5, 6, 7
        assertEquals("f4(2, 3, 13)", 242560/* 74175 + 80760 + 87625 */, FunctionsGoneWild2023.f4(2, 3, 13));  // 23, 24, 25
    }

    public void testFunctionsGoneWild2023_function05()
    {
        assertEquals("f5(\"303-3101\")", 2+4*Math.sqrt(10), FunctionsGoneWild2023.f5("303-3101"), 0.001);
        assertEquals("f5(\"1-213-241-1546\")", 9+2*Math.sqrt(2), FunctionsGoneWild2023.f5("1-213-241-1546"), 0.001);
        assertEquals("f5(\"0-699-283-9709\")", 7+2*Math.sqrt(2)+3*Math.sqrt(5), FunctionsGoneWild2023.f5("0-699-283-9709"), 0.001);
        assertEquals("f5(\"0-779-823-8860\")", 6+2*Math.sqrt(2)+2*Math.sqrt(5), FunctionsGoneWild2023.f5("0-779-823-8860"), 0.001);
        assertEquals("f5(\"0-448-965-2763\")", 5+1*Math.sqrt(2)+3*Math.sqrt(5), FunctionsGoneWild2023.f5("0-448-965-2763"), 0.001);
        assertEquals("f5(\"0-268-194-5561\")", 5+4*Math.sqrt(2)+3*Math.sqrt(5), FunctionsGoneWild2023.f5("0-268-194-5561"), 0.001);
        assertEquals("f5(\"1-878-005-7166\")", 7+1*Math.sqrt(2)+2*Math.sqrt(5), FunctionsGoneWild2023.f5("1-878-005-7166"), 0.001);
        assertEquals("f5(\"7-259-347-5850\")", 8+2*Math.sqrt(2)+2*Math.sqrt(5), FunctionsGoneWild2023.f5("7-259-347-5850"), 0.001);
        assertEquals("f5(\"9-174-208-9535\")", 8+6*Math.sqrt(2)+0*Math.sqrt(5), FunctionsGoneWild2023.f5("9-174-208-9535"), 0.001);
        assertEquals("f5(\"1-429-051-3736\")", 6+7*Math.sqrt(2)+1*Math.sqrt(5), FunctionsGoneWild2023.f5("1-429-051-3736"), 0.001);
        assertEquals("f5(\"4-984-064-3762\")", 3+4*Math.sqrt(2)+5*Math.sqrt(5), FunctionsGoneWild2023.f5("4-984-064-3762"), 0.001);
    }

    public void testFunctionsGoneWild2023_function06()
    {
//         for(int r = 0; r < 19; r++)
//         {
//             int h = (int)(100 * Math.random());
//             int k = (int)(100 * Math.random());
//             int m = (int)(100 * Math.random());
//             System.out.println(h + " " + k + " " + m + " = " + FunctionsGoneWild2023.f6(h, k, m));
//         }
        assertEquals("f6(200*Math.PI/327., 1000*Math.PI/8311., Math.PI/1.5787)", -14.38987567,
                              FunctionsGoneWild2023.f6(200*Math.PI/327., 1000*Math.PI/8311., Math.PI/1.5787), 0.005);    // cos
        assertEquals("f6(0.63, 2.312, 0.712)", 9.031964605, FunctionsGoneWild2023.f6(0.63, 2.312, 0.712), 0.005);
        assertEquals("f6(2.92, 0.608, 2.69)", 2.272228729, FunctionsGoneWild2023.f6(2.92, 0.608, 2.69), 0.005);
        assertEquals("f6(1.1227, 2.515, 0.16)", -0.1170857923, FunctionsGoneWild2023.f6(1.1227, 2.515, 0.16), 0.005);
    }

    public void testFunctionsGoneWild2023_function07()
    {
        assertEquals("f7(\"abccddddccba\", \"\")", true, FunctionsGoneWild2023.f7("abccddddccba", ""));
        assertEquals("f7(\"abccddddccba\", \"abccddddccba\")", true, FunctionsGoneWild2023.f7("abccddddccba", "abccddddccba"));
        assertEquals("f7(\"abccddddccba\", \"aa\")", true, FunctionsGoneWild2023.f7("abccddddccba", "aa"));
        assertEquals("f7(\"abccddddccba\", \"abccccba\")", true, FunctionsGoneWild2023.f7("abccddddccba", "abccccba"));
        assertEquals("f7(\"abccddddccba\", \"abcdcba\")", true, FunctionsGoneWild2023.f7("abccddddccba", "abcdcba"));
        assertEquals("f7(\"abccddddccba\", \"bccddddccb\")", true, FunctionsGoneWild2023.f7("abccddddccba", "bccddddccb"));
        assertEquals("f7(\"@\", \"@\")", true, FunctionsGoneWild2023.f7("@", "@"));
        
        assertEquals("f7(\"xyz\", \"zx\")", false, FunctionsGoneWild2023.f7("xyz", "zx"));
        assertEquals("f7(\"abccddddccba\", \"\")", false, FunctionsGoneWild2023.f7("abccddddccba", "aaa"));
        assertEquals("f7(\"abccddddccba\", \"abccddddccba\")", false, FunctionsGoneWild2023.f7("abccddddccba", "aab"));
        assertEquals("f7(\"abccddddccba\", \"aa\")", false, FunctionsGoneWild2023.f7("abccddddccba", "dcd"));
        assertEquals("f7(\"abccddddccba\", \"abccccba\")", false, FunctionsGoneWild2023.f7("abccddddccba", "abccddddccbaa"));
        assertEquals("f7(\"abccddddccba\", \"abcdcba\")", false, FunctionsGoneWild2023.f7("abccddddccba", "acdcbba"));
        assertEquals("f7(\"abccddddccba\", \"bccddddccb\")", false, FunctionsGoneWild2023.f7("abccddddccba", "e"));
        assertEquals("f7(\"@\", \" @\")", false, FunctionsGoneWild2023.f7("@", " @"));
        assertEquals("f7(\"@\", \"@@\")", false, FunctionsGoneWild2023.f7("@", "@@"));
    }

    public void testFunctionsGoneWild2023_function08()
    {
        assertEquals("f8(\"NINEINNENIEN\")", "999", FunctionsGoneWild2023.f8("NINEINNENIEN") );
        assertEquals("f8(\"NEIGVENEZEFOUTHTNSREEROEWOXINTHORFIVESIE\")", "0123456789", FunctionsGoneWild2023.f8("NEIGVENEZEFOUTHTNSREEROEWOXINTHORFIVESIE") );
        assertEquals("f8(\"SEVENFIVETHREEONE\")", "1357", FunctionsGoneWild2023.f8("SEVENFIVETHREEONE") );
        assertEquals("f8(\"OEN\")", "1", FunctionsGoneWild2023.f8("OEN") );
        assertEquals("f8(\"ZEROTWOSIXFOUREIGHTZEROSIXEIGHTSIXNINE\")", "0024666889", FunctionsGoneWild2023.f8("ZEROTWOSIXFOUREIGHTZEROSIXEIGHTSIXNINE") );
        assertEquals("f8(\"NTHEETHRININEEROZERNRHTZEZEEONEEIGEORO\")", "000133899", FunctionsGoneWild2023.f8("NTHEETHRININEEROZERNRHTZEZEEONEEIGEORO") );
        assertEquals("f8(\"EETWONONOFONIUROTWNE\")", "112249", FunctionsGoneWild2023.f8("EETWONONOFONIUROTWNE") );
    }

    public void testFunctionsGoneWild2023_function09()
    {
        assertEquals(false, FunctionsGoneWild2023.f9(false, false, false) );
        assertEquals(false, FunctionsGoneWild2023.f9(false, false, true) );
        assertEquals(false, FunctionsGoneWild2023.f9(false, true, false) );
        assertEquals(true, FunctionsGoneWild2023.f9(false, true, true) );
        assertEquals(true, FunctionsGoneWild2023.f9(true, false, false) );
        assertEquals(true, FunctionsGoneWild2023.f9(true, false, true) );
        assertEquals(false, FunctionsGoneWild2023.f9(true, true, false) );
        assertEquals(false, FunctionsGoneWild2023.f9(true, true, true) );
    }

    public void testFunctionsGoneWild2023_function10()
    {
        assertEquals(true, FunctionsGoneWild2023.f10(false, false, false, false) );
        assertEquals(true, FunctionsGoneWild2023.f10(false, false, false, true) );
        assertEquals(true, FunctionsGoneWild2023.f10(false, false, true, false) );
        assertEquals(false, FunctionsGoneWild2023.f10(false, false, true, true) );
        assertEquals(false, FunctionsGoneWild2023.f10(false, true, false, false) );
        assertEquals(true, FunctionsGoneWild2023.f10(false, true, false, true) );
        assertEquals(true, FunctionsGoneWild2023.f10(false, true, true, false) );
        assertEquals(false, FunctionsGoneWild2023.f10(false, true, true, true) );
        assertEquals(false, FunctionsGoneWild2023.f10(true, false, false, false) );
        assertEquals(true, FunctionsGoneWild2023.f10(true, false, false, true) );
        assertEquals(false, FunctionsGoneWild2023.f10(true, false, true, false) );
        assertEquals(false, FunctionsGoneWild2023.f10(true, false, true, true) );
        assertEquals(true, FunctionsGoneWild2023.f10(true, true, false, false) );
        assertEquals(true, FunctionsGoneWild2023.f10(true, true, false, true) );
        assertEquals(true, FunctionsGoneWild2023.f10(true, true, true, false) );
        assertEquals(true, FunctionsGoneWild2023.f10(true, true, true, true) );
    }

    public void testFunctionsGoneWild2023_Bonusfunction01_03()
    {
        testFunctionsGoneWild2023_function01();
        testFunctionsGoneWild2023_function02();
        testFunctionsGoneWild2023_function03();
    }

    public void testFunctionsGoneWild2023_Bonusfunction04_06()
    {
        testFunctionsGoneWild2023_function04();
        testFunctionsGoneWild2023_function05();
        testFunctionsGoneWild2023_function06();
    }

    public void testFunctionsGoneWild2023_Bonusfunction07_08()
    {
        testFunctionsGoneWild2023_function07();
        testFunctionsGoneWild2023_function08();
    }

    public void testFunctionsGoneWild2023_Bonusfunction09_10()
    {
        testFunctionsGoneWild2023_function09();
        testFunctionsGoneWild2023_function10();
    }

    public void testFunctionsGoneWild2023_Bonus_All()
    {
        testFunctionsGoneWild2023_Bonusfunction01_03();
        testFunctionsGoneWild2023_Bonusfunction04_06();
        testFunctionsGoneWild2023_Bonusfunction07_08();
        testFunctionsGoneWild2023_Bonusfunction09_10();
    }
}