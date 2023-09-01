import java.util.*;

/**
 * The test class
 *
 * @author  Don Allen
 * @version 2023 Wittry programming contest
 */
public class Wittry2023FinalTest extends junit.framework.TestCase
{
    public void testBongard01()
    {
        assertEquals(3, Bongard.getNumTallLetters("BIOETHIC"));
        assertEquals(4, Bongard.getNumTallLetters("BALLET"));

        assertEquals(1, Bongard.getNumVowels("GULLY"));
        assertEquals(3, Bongard.getNumVowels("ASTRONOMY"));

        assertEquals(2, Bongard.getNumVowelsWithY("GULLY"));
        assertEquals(4, Bongard.getNumVowelsWithY("ASTRONOMY"));

        assertEquals("URT", Bongard.endsWith("COURT"));
        assertEquals("AT", Bongard.endsWith("AT"));

        assertEquals("COM", Bongard.startsWith("COMET"));
        assertEquals("AT", Bongard.startsWith("AT"));

        assertEquals(true, Bongard.getPlusMinus("PROGRAMMER") < 0);
        assertEquals(true, Bongard.getPlusMinus("EMAIL") > 0);
        assertEquals(true, Bongard.getPlusMinus("FUTURE") == 0);

        assertEquals(6, Bongard.getLength("FUTURE"));
        assertEquals(2, Bongard.getLength("AT"));

        String[] left1 = {"BATH", "THAT"};
        String[] right1 = {"ARID", "HAIR"};
        Bongard bon1 = new Bongard(left1, right1);
        assertEquals("RIGHT", bon1.whichBox("LOVE"));
        assertEquals("LEFT", bon1.whichBox("HALT"));
        assertEquals("NEITHER", bon1.whichBox("ANGEL"));

        String[] left2 = {"LEAVE", "ALONE", "HOUSE", "ABOVE", "MEDIA"};
        String[] right2 = {"FAMILY", "GALAXY", "HOCKEY", "MONKEY", "MONEY", "GOODY"};
        Bongard bon2 = new Bongard(left2, right2);
        assertEquals("RIGHT", bon2.whichBox("NOWAY"));
        assertEquals("LEFT", bon2.whichBox("RADIO"));
        assertEquals("NEITHER", bon2.whichBox("ANIMAL"));
    }

    public void testBongardProperties01()
    {
        String[] w1 = {"ABCDEF", "QWERTZ"};
        String[] w2 = {"BDFHL", "SHKLT"};
        Bongard bon = new Bongard(w1, w2);
        assertEquals(5, bon.getNumTallLetters("XARBQWVHOKYLTEE"));
        assertEquals(2, bon.getNumTallLetters("CGDUZWFMSNPIJ"));

        assertEquals(1, bon.getNumVowels("JQSKXABCRTLDZ"));
        assertEquals(4, bon.getNumVowels("PUFGHNOTVYWMEI"));

        assertEquals(6, bon.getNumVowelsWithY("WXAEIOUY"));
        assertEquals(0, bon.getNumVowelsWithY("NTVMHBGFQJCZRKDPSL"));

        assertEquals("OYM", bon.endsWith("GKTUWRVZSOYM"));
        assertEquals("GTU", bon.endsWith("GTU"));
        assertEquals("ZC", bon.endsWith("ZC"));
        assertEquals("Q", bon.endsWith("Q"));

        assertEquals("GKT", bon.startsWith("GKTUWRVZSOYM"));
        assertEquals("KRC", bon.startsWith("KRC"));
        assertEquals("YU", bon.startsWith("YU"));
        assertEquals("I", bon.startsWith("I"));

        assertEquals(true, bon.getPlusMinus("ZXCVBNMLKJHGFDSAQWERTYUIOP") < 0);
        assertEquals(true, bon.getPlusMinus("AYEIOU") > 0);

        //        assertEquals(5-21, bon.getPlusMinus("ZXCVBNMLKJHGFDSAQWERTYUIOP"));
        //        assertEquals(4, bon.getPlusMinus("AYEIOU"));
    }

    public void testBongardWhichBox03()
    {
        String test3 = "left: length, vowels, vowelsWithY  right: tall, begins, ends, +//-  : no Neither";
        String[] w1 = {"ABCDEFGY", "YHIJKLMO", "NPQYUUBD"};
        String[] w2 = {"WITTRYAAYACONTEST", "WITTRYEEEQCONTEST", "WITTRYZUUUCONTEST"};
        Bongard bon = new Bongard(w1, w2);

        assertEquals(test3, "LEFT", bon.whichBox("TQOYEZWF"));
        assertEquals(test3, "RIGHT", bon.whichBox("WITACONTOYITRYEST"));
    }

    public void testBongardWhichBox04()
    {
        String test4 = "left: length, begins, +//-         right: vowelsWithY, ends  : no Neither";
        String[] w1 = {"CSAAEIT", "CSAOMUE", "CSAIAIX"};
        String[] w2 = {"DYY", "SDYY", "FDYY"};
        Bongard bon = new Bongard(w1, w2);

        assertEquals(test4, "LEFT", bon.whichBox("CSAGUOU"));
        assertEquals(test4, "RIGHT", bon.whichBox("QDYY"));
    }

    public void testBongardWhichBox05()
    {
        String test5 = "left: begins                       right: length   : no Neither";
        String[] w1 = {"SATO", "SATB", "SATCZ"};
        String[] w2 = {"NNDYYQRJN", "KSDYYOYQZ", "BBFDYYADH"};
        Bongard bon = new Bongard(w1, w2);

        assertEquals(test5, "LEFT", bon.whichBox("SATTTTT"));
        assertEquals(test5, "RIGHT", bon.whichBox("QDYYURUFZ"));
    }

    public void testBongardWhichBox06()
    {
        String test6 = "left: tall, vowels                 right: length, vowelsWithY";
        String[] w1 = {"TAEIBT", "KOULED", "FAUOYTK"};
        String[] w2 = {"MYNBVYYC", "LKSYYYJH", "WWWYPYYR"};
        Bongard bon = new Bongard(w1, w2);

        assertEquals(test6, "LEFT", bon.whichBox("HATUHI"));
        assertEquals(test6, "RIGHT", bon.whichBox("YDYDYBBB"));
        assertEquals(test6, "NEITHER", bon.whichBox("QDYYURUFZ"));
    }

    public void testBongardWhichBox07()
    {
        String test7 = "left: tall, ends                   right: vowels, begins";
        String[] w1 = {"YEBBBDDDFFFHHHABC", "MABKBKBKDDDFFFABC", "BKBLKBKDTDTDWWABC"};
        String[] w2 = {"WHYUUSS", "WHYOIHHQW", "WHYAE"};
        Bongard bon = new Bongard(w1, w2);

        assertEquals(test7, "LEFT", bon.whichBox("KLTKKDLTDTDWLWABC"));
        assertEquals(test7, "RIGHT", bon.whichBox("WHYAU"));
        assertEquals(test7, "NEITHER", bon.whichBox("WHYABC"));
    }

    public void testBongardWhichBox08()
    {
        String test8 = "left: vowelsWithY, ends, +//-      right: tall";
        String[] w1 = {"YDYIOU", "SYYIOU", "AYWIOU"};
        String[] w2 = {"ABDFHKLT", "BBYDDFFT", "HEEHKKLLT"};
        Bongard bon = new Bongard(w1, w2);

        assertEquals(test8, "LEFT", bon.whichBox("KYUIOU"));
        assertEquals(test8, "RIGHT", bon.whichBox("KBFTFKTIOU"));
        assertEquals(test8, "NEITHER", bon.whichBox("KFTFKTIOU"));
    }

    public void testBongardWhichBox09()
    {
        String test9 = "left: length, vowelsWithY          right: tall, vowels, ends, begins, +//-";
        String[] w1 = {"WSDAEYY", "AIRPMOU", "NYYZYYS"};
        String[] w2 = {"HELPABKEYOU", "HELPDUOLYOU", "HELPFIEKYOU", "HELPHAITYOU"};
        Bongard bon = new Bongard(w1, w2);

        assertEquals(test9, "LEFT", bon.whichBox("YIUOFHL"));
        assertEquals(test9, "RIGHT", bon.whichBox("HELDUEPLYOU"));
        assertEquals(test9, "NEITHER", bon.whichBox("HELDUEPLYOE"));
    }

    public void testBongardWhichBox10()
    {
        String test10 = "left: begins, +//-                 right: length, vowels, ends, vowelsWithY";
        String[] w1 = {"BEGBHEUO", "BEGAUEYY", "BEGQEEEQ", "BEGAAQEQ"};
        String[] w2 = {"EYOUYES", "YAIUYES"}; //, "", ""};
        Bongard bon = new Bongard(w1, w2);

        assertEquals(test10, "LEFT", bon.whichBox("BEGAIOYR"));
        assertEquals(test10, "RIGHT", bon.whichBox("IIIYYES"));
        assertEquals(test10, "NEITHER", bon.whichBox("BEGQEYES"));
    }

    public void testAdjoiningDigits01()
    {
        assertEquals(true, AdjoiningDigits.isDivisibleBy(100, new int[] {2, 5, 50}));
        assertEquals(false, AdjoiningDigits.isDivisibleBy(100, new int[] {2, 5, 2*3*5}));

        assertEquals(50, AdjoiningDigits.getLCM(new int[] {2, 5, 50}));
        assertEquals(2*3*5, AdjoiningDigits.getLCM(new int[] {2, 5, 15, 2*3*5}));
       assertEquals(3*5*7, AdjoiningDigits.getLCM(new int[] {3, 5, 7}));

        assertEquals(377, AdjoiningDigits.adjoinDigits(77, 1, new int[] {13, 29} ));
        assertEquals(3289, AdjoiningDigits.adjoinDigits(32, 2, new int[] {11, 13, 23} ));
        assertEquals(155232, AdjoiningDigits.adjoinDigits(523, 3, new int[] {7, 8, 9} ));
        assertEquals(1050, AdjoiningDigits.adjoinDigits(50, 2, new int[] {2, 5} ));
    }

    public void testIsDivisibleBy02()
    {
        assertEquals(true, AdjoiningDigits.isDivisibleBy(2*3*7*13, new int[] {2, 3, 7, 13}));
        assertEquals(false, AdjoiningDigits.isDivisibleBy(2*3*7*13, new int[] {2, 3, 7, 13, 5}));
    }

    public void testIsDivisibleBy03()
    {
        assertEquals(true, AdjoiningDigits.isDivisibleBy(5*373*619*887, new int[] {5, 373}));
        assertEquals(true, AdjoiningDigits.isDivisibleBy(5*373*619*887, new int[] {5, 373, 619, 887}));
        assertEquals(false, AdjoiningDigits.isDivisibleBy(5*373*619*887, new int[] {2}));
        assertEquals(false, AdjoiningDigits.isDivisibleBy(5*373*619*887, new int[] {3}));
    }

    public void testGetLCM04()
    {
        assertEquals(2*2*2*3*3*3*3*5*5*5*7, AdjoiningDigits.getLCM(new int[] {2*5*5*5, 2*2*2*3*5*5, 2*3*3*3*3*7}));
        assertEquals(/*838860*/ 4*3*5*11*31*41, AdjoiningDigits.getLCM(new int[] {2*5*11, 6*41*2, 12*55*31}));
    }

    public void testGetLCM05()
    {
        assertEquals(2, AdjoiningDigits.getLCM(new int[] {1, 2}));
        assertEquals(2*3*5*7*11*13*17, AdjoiningDigits.getLCM(new int[] {2, 3, 5, 7, 11, 13, 17}));
    }

    public void testIsDivisibleByGetLCM06()
    {
        assertEquals(false, AdjoiningDigits.isDivisibleBy(2*103*211*467, new int[] {4, 3, 211, 467}));
        assertEquals(true, AdjoiningDigits.isDivisibleBy(5*11*19*23*43, new int[] {5, 19, 23, 43}));

        assertEquals(2*2*3*5*5*23, AdjoiningDigits.getLCM(new int[] {1, 12, 23, 25, 75, 23*25}));
    }

    public void testAdjoinDigits07()
    {
        assertEquals(231, AdjoiningDigits.adjoinDigits(23, 1, new int[] {3, 7, 11} ));
        assertEquals(1352, AdjoiningDigits.adjoinDigits(352, 1, new int[] {4, 26, 13, 52} ));
    }

    public void testAdjoinDigits08()
    {
        assertEquals(2394, AdjoiningDigits.adjoinDigits(23, 2, new int[] {7, 18, 19} ));
        assertEquals(10353, AdjoiningDigits.adjoinDigits(353, 2, new int[] {3, 7, 17, 21, 29} ));
        assertEquals(28080, AdjoiningDigits.adjoinDigits(808, 2, new int[] {27, 16, 65} ));
    }

    public void testAdjoinDigits09()
    {
        assertEquals(1764, AdjoiningDigits.adjoinDigits(4, 3, new int[] {2, 9, 49} ));
        assertEquals(287547, AdjoiningDigits.adjoinDigits(754, 3, new int[] {3, 13, 73, 101, 73*101} ));
        assertEquals(243948, AdjoiningDigits.adjoinDigits(439, 3, new int[] {2, 29, 4, 4*29, 701, 3} ));
        assertEquals(10057, AdjoiningDigits.adjoinDigits(10, 3, new int[] {89, 113} ));
    }

    public void testAdjoinDigits10()
    {
        assertEquals(121464, AdjoiningDigits.adjoinDigits(21, 4, new int[] {7, 8, 9} ));
        assertEquals(1002573, AdjoiningDigits.adjoinDigits(73, 5, new int[] {11, 13} ));
        assertEquals(7227081, AdjoiningDigits.adjoinDigits(0, 6, new int[] {937, 857, 9} ));
    }

    public void testDiceyWordIt01()
    {
        String[][] dice = { {"A", "W", "K", "U", "C", "X"},
                {"B", "E", "S", "I", "G", "Q"},
                {"T", "Z", "O", "R", "Y", "N"},
                {"H", "M", "J", "D", "P", "F"}};
        // missing letter: "LV"
        DiceyWords dw = new DiceyWords(dice);

        ArrayList<String> words = new ArrayList<String>();
        words.add("BATH");
        words.add("MAZE");
        words.add("MEOW");
        words.add("WHEY");
        words.add("JERK");
        words.add("PYIC");
        words.add("RASH");
        words.add("BARD");
        words.add("JUST");
        words.add("MINX");
        words.add("QUOD");
        words.add("FRAG");

        assertEquals(0, dw.getImpossibleWords(words).size());
        words.add(0, "FLAG");
        words.add("WAKE");
        words.add("MASS");
        List<String> sol = dw.getImpossibleWords (words);
        assertEquals(3, sol.size());
        assertEquals(true, sol.contains("FLAG"));
        assertEquals(true, sol.contains("WAKE"));
        assertEquals(true, sol.contains("MASS"));

        String[][] d = { {"A", "W", "K", "U", "C", "X"},
                {"B", "E", "S", "I", "G", "Q"},
                //                         {"T", "Z", "O", "R", "Y", "N"},
                {"H", "M", "J", "D", "P", "F"} };

        ArrayList<String> ws = new ArrayList<String>();
        ws.add("BATH");
        ws.add("MAZE");
        ws.add("MEOW");
        ws.add("WHEY");
        ws.add("JERK");
        ws.add("PYIC");
        ws.add("RASH");
        ws.add("BARD");
        ws.add("JUST");
        ws.add("MINX");
        ws.add("QUOD");
        ws.add("FRAG");
        String strSol = dw.missingDie (d, ws);
        assertEquals(6, strSol.length());
        for (int y = 0; y < strSol.length(); y++)
            assertEquals(true, "TZORYN".indexOf(strSol.substring(y, y+1)) >= 0);

        ArrayList<String> moreWords = new ArrayList<String>();
        moreWords.add("BATH");
        moreWords.add("MAZE");
        moreWords.add("MEOW");
        moreWords.add("WHEY");
        moreWords.add("JERK");
        moreWords.add("PYIC");
        moreWords.add("RASH");
        moreWords.add("BARD");
        moreWords.add("JUST");
        moreWords.add("MINX");
        String letters = dw.unusedLetters(moreWords);
        assertEquals(3, letters.length());
        assertEquals(true, "FGQ".indexOf(letters.substring(0,1)) >= 0);
        assertEquals(true, "FGQ".indexOf(letters.substring(1,2)) >= 0);
        assertEquals(true, "FGQ".indexOf(letters.substring(2,3)) >= 0);

        moreWords.add("FGQT");
        letters = dw.unusedLetters(moreWords);
        assertEquals(0, letters.length());
    }

    public void testgetImpossibleWords02()
    {
        String[][] dice = { {"H", "M", "K", "N", "J", "T"},
                {"U", "L", "V", "R", "Y", "B"},
                {"P", "Z", "G", "O", "I", "X"},
                {"A", "W", "Q", "D", "F", "C"}   };
        // missing letter: "ES"
        DiceyWords dw = new DiceyWords(dice);

        ArrayList<String> words = new ArrayList<String>();
        words.add("WORK");
        words.add("RAPT");
        words.add("VZFJ");
        words.add("GMBF");
        words.add("LCIH");
        words.add("YXNA");
        words.add("QUOJ");
        words.add("DLIH");

        assertEquals(0, dw.getImpossibleWords(words).size());

        words.add(0, "CHES");
        List<String> sol = dw.getImpossibleWords (words);
        assertEquals(1, sol.size());
        assertEquals(true, sol.contains("CHES"));

        words.add("PEHT");
        words.add("SOME");
        sol = dw.getImpossibleWords (words);
        assertEquals(3, sol.size());
        assertEquals(true, sol.contains("CHES"));
        assertEquals(true, sol.contains("PEHT"));
        assertEquals(true, sol.contains("SOME"));
    }

    public void testgetImpossibleWords03()
    {
        String[][] dice = { {"A", "O", "R", "C", "T", "F"},
                {"P", "E", "Y", "I", "D", "B"},
                {"V", "L", "H", "G", "K", "Z"},
                {"J", "W", "S", "X", "Q", "U"}   };
        // missing letter: "MN"
        DiceyWords dw = new DiceyWords(dice);

        ArrayList<String> words = new ArrayList<String>();
        words.add("PWHT");
        words.add("KEOX");
        words.add("RZSY");
        words.add("JVBF");
        words.add(0, "DAQG");
        words.add("LUIC");
        words.add("QKTY");
        words.add("XBGA");

        assertEquals(0, dw.getImpossibleWords(words).size());

        words.add("SOME");
        words.add("GMBF");
        words.add("YXNA");
        List<String> sol = dw.getImpossibleWords (words);
        assertEquals(3, sol.size());
        assertEquals(true, sol.contains("SOME"));
        assertEquals(true, sol.contains("GMBF"));
        assertEquals(true, sol.contains("YXNA"));

        words.add("MNEF");
        words.add("GQLF");
        words.add("XNAM");
        sol = dw.getImpossibleWords (words);
        assertEquals(6, sol.size());
        assertEquals(true, sol.contains("MNEF"));
        assertEquals(true, sol.contains("XNAM"));
        assertEquals(true, sol.contains("SOME"));
        assertEquals(true, sol.contains("GMBF"));
        assertEquals(true, sol.contains("YXNA"));
        assertEquals(true, sol.contains("GQLF"));
    }

    public void testgetImpossibleWords04()
    {
        String[][] dice = { {"Q", "U", "E", "Y", "I", "B"},
                {"J", "W", "S", "X", "D", "Z"},
                {"N", "M", "R", "T", "F", "P"},
                {"V", "L", "H", "G", "K", "C"}   };
        // missing letter: "AO"
        DiceyWords dw = new DiceyWords(dice);

        ArrayList<String> words = new ArrayList<String>();
        words.add("MSEK");
        words.add("YZFL");
        words.add("JRCQ");
        words.add("GBXP");
        words.add("VNIW");
        words.add("DHPU");

        assertEquals(0, dw.getImpossibleWords(words).size());

        words.add("ABCD");
        words.add("BACD");
        words.add("BCAD");
        words.add("BCDA");
        words.add("WBCR");
        List<String> sol = dw.getImpossibleWords (words);
        assertEquals(4, sol.size());
        assertEquals(true, sol.contains("ABCD"));
        assertEquals(true, sol.contains("BACD"));
        assertEquals(true, sol.contains("BCAD"));
        assertEquals(true, sol.contains("BCDA"));

        words.add("BCDO");
        words.add("BCOD");
        words.add("BOCD");
        words.add("OBCD");
        words.add("WBCR");

        words.add("QSRU");
        words.add("JFZK");
        words.add("GYMT");
        words.add("XKHI");

        sol = dw.getImpossibleWords (words);
        assertEquals(12, sol.size());
        assertEquals(true, sol.contains("BCDO"));
        assertEquals(true, sol.contains("BCOD"));
        assertEquals(true, sol.contains("BOCD"));
        assertEquals(true, sol.contains("OBCD"));
        assertEquals(true, sol.contains("ABCD"));
        assertEquals(true, sol.contains("BACD"));
        assertEquals(true, sol.contains("BCAD"));
        assertEquals(true, sol.contains("BCDA"));

        assertEquals(true, sol.contains("QSRU"));
        assertEquals(true, sol.contains("JFZK"));
        assertEquals(true, sol.contains("GYMT"));
        assertEquals(true, sol.contains("XKHI"));
    }

    public void testmissingDie05()
    {
        String[][] d = { {"H", "M", "K", "I", "D", "F"},
                {"T", "L", "V", "G", "Y", "B"},
                {"P", "Z", "J", "O", "U", "X"}/*,
                    {"A", "W", "R", "C", "Q", "N"}  */ };
        // missing letter: "ES"

        ArrayList<String> words = new ArrayList<String>();
        words.add("WOLK");
        words.add("PRIT");
        words.add("VZFA");
        words.add("GMCJ");
        words.add("BNUH");
        words.add("XYND");
        words.add("DQBU");
        String strSol = DiceyWords.missingDie(d, words);
        assertEquals(6, strSol.length());
        for (int y = 0; y < strSol.length(); y++)
            assertEquals(true, "AWRCQN".indexOf(strSol.substring(y, y+1)) >= 0);
    }

    public void testMissingDie06()
    {
        String[][] d = { /*{"A", "O", "R", "C", "T", "F"},*/
                {"P", "E", "Y", "I", "D", "B"},
                {"V", "L", "H", "G", "K", "Z"},
                {"J", "W", "S", "X", "Q", "U"}   };
        // missing letter: "MN"

        ArrayList<String> words = new ArrayList<String>();
        words.add("VOPU");
        words.add("XLTE");
        words.add("QBZA");
        words.add("YCSK");
        words.add("FHIJ");
        words.add("DWRG");
        String strSol = DiceyWords.missingDie(d, words);
        assertEquals(6, strSol.length());
        for (int y = 0; y < strSol.length(); y++)
            assertEquals(true, "FTCROA".indexOf(strSol.substring(y, y+1)) >= 0);
    }

    public void testMissingDie07()
    {
        String[][] d = { {"P", "E", "Y", "I", "D", "B"},
                /*{"A", "O", "R", "C", "T", "F"},*/                
                {"V", "L", "H", "G", "K", "Z"},
                {"J", "W", "S", "X", "Q", "U"}   };
        // missing letter: "MN"

        ArrayList<String> words = new ArrayList<String>();
        words.add("VOPU");
        words.add("XLTE");
        words.add("QBZA");
        words.add("YCSK");
        words.add("FHIJ");
        words.add("DWRG");
        String strSol = DiceyWords.missingDie(d, words);
        assertEquals(6, strSol.length());
        for (int y = 0; y < strSol.length(); y++)
            assertEquals(true, "FTCROA".indexOf(strSol.substring(y, y+1)) >= 0);     
    }

    public void testMissingDie08()
    {
        String[][] d = { {"Q", "U", "E", "Y", "I", "B"},
                {"J", "W", "S", "X", "D", "Z"}/*
                    {"V", "L", "H", "G", "K", "C"} */,
                {"N", "M", "R", "T", "F", "P"} };
        // missing letter: "AO"

        ArrayList<String> words = new ArrayList<String>();
        words.add("VBXN");
        words.add("WLUF");
        words.add("PQCD");
        words.add("TSIG");
        words.add("EHMJ");
        words.add("ZRKY");

        String strSol = DiceyWords.missingDie(d, words);
        assertEquals(6, strSol.length());
        for (int y = 0; y < strSol.length(); y++)
            assertEquals(true, "VLHGCK".indexOf(strSol.substring(y, y+1)) >= 0);
    }

    public void testUnusedLetters09()
    {
        String[][] dice = { {"A", "O", "R", "C", "T", "F"},
                {"P", "E", "Y", "I", "D", "B"},
                {"V", "L", "H", "G", "K", "Z"},
                {"J", "W", "S", "X", "Q", "U"}   };
        // missing letter: "MN"
        DiceyWords dw = new DiceyWords(dice);

        ArrayList<String> words = new ArrayList<String>();
        words.add("VZSJ");
        words.add("GPOB");
        words.add("LIHA");
        words.add("YXWE");
        words.add("FTRC");
        //        words.add("KQUD");

        String letters = dw.unusedLetters(words);
        assertEquals(4, letters.length());
        assertEquals(true, "KQUD".indexOf(letters.substring(0, 1)) >= 0);
        assertEquals(true, "KQUD".indexOf(letters.substring(1, 2)) >= 0);
        assertEquals(true, "KQUD".indexOf(letters.substring(2, 3)) >= 0);
        assertEquals(true, "KQUD".indexOf(letters.substring(3, 4)) >= 0);
    }

    public void testUnusedLetters10()
    {
        String[][] dice = { {"Q", "U", "E", "Y", "I", "B"},
                {"J", "W", "S", "X", "D", "Z"},
                {"N", "M", "R", "T", "F", "P"},
                {"V", "L", "H", "G", "K", "C"}   };
        // missing letter: "AO"
        DiceyWords dw = new DiceyWords(dice);

        ArrayList<String> words = new ArrayList<String>();

        String letters = dw.unusedLetters(words);
        assertEquals(24, letters.length());
        for (int s = 0; s < letters.length(); s++)
            assertEquals(true, "MSEXUPKDYQFZBGITJWRNCVLH".indexOf(letters.substring(s, s+1)) >= 0);

        words.add("CVLH");
        words.add("MSEX");

        letters = dw.unusedLetters(words);
        assertEquals(16, letters.length());
        for (int s = 0; s < letters.length(); s++)
            assertEquals(true, "UPKDYQFZBGITJWRN".indexOf(letters.substring(s, s+1)) >= 0);

        words.add("YQFZ");
        words.add("JWRN");
        words.add("BGIT");

        letters = dw.unusedLetters(words);
        assertEquals(4, letters.length());
        assertEquals(true, "UPKD".indexOf(letters.substring(0, 1)) >= 0);
        assertEquals(true, "UPKD".indexOf(letters.substring(1, 2)) >= 0);
        assertEquals(true, "UPKD".indexOf(letters.substring(2, 3)) >= 0);
        assertEquals(true, "UPKD".indexOf(letters.substring(3, 4)) >= 0);

        words.add("UPKD");

        letters = dw.unusedLetters(words);
        assertEquals(0, letters.length());
    }

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

    public void testForestPlayGroundRevisited01()
    {
        int[] figure2 = {-1, 12, 23, 18, 11, 43, 12, 27, 56, 78, -1, -1, 32, 98};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure2);

        int[] sol = t.getLevel(3);
        assertEquals(4, sol.length);
        assertEquals(11, sol[0]);
        assertEquals(43, sol[1]);
        assertEquals(12, sol[2]);
        assertEquals(27, sol[3]);

        sol = t.getLevel(4);
        assertEquals(4, sol.length);
        assertEquals(56, sol[0]);
        assertEquals(78, sol[1]);
        assertEquals(32, sol[2]);
        assertEquals(98, sol[3]);

        assertEquals(4, t.getLevelWithHighestAverage());

        sol = t.shiftLevelLeft();
        int[] answer = {-1, 12, 18, 23, 43, 12, 27, 11, 78, 32, -1, -1, 98, 56};
        assertEquals(figure2.length, sol.length);

        for (int s = 0; s < sol.length; s++)
           assertEquals(answer[s], sol[s]);
    }

    public void testGetLevel02()
    {
        int[] figure2 = {-1, 12, 2, 3, 181, 14, 39, 123, 7, 15, 68, 78, 11, 32, 9, 8};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure2);

        int[] sol = t.getLevel(1);
        assertEquals(1, sol.length);
        assertEquals(12, sol[0]);

        sol = t.getLevel(2);
        assertEquals(2, sol.length);
        assertEquals(2, sol[0]);
        assertEquals(3, sol[1]);

        sol = t.getLevel(3);
        assertEquals(4, sol.length);
        assertEquals(181, sol[0]);
        assertEquals(14, sol[1]);
        assertEquals(39, sol[2]);
        assertEquals(123, sol[3]);

        sol = t.getLevel(4);
        assertEquals(8, sol.length);
        assertEquals(7, sol[0]);
        assertEquals(15, sol[1]);
        assertEquals(68, sol[2]);
        assertEquals(78, sol[3]);
        assertEquals(11, sol[4]);
        assertEquals(32, sol[5]);
        assertEquals(9, sol[6]);
        assertEquals(8, sol[7]);
    }

    public void testGetLevel03()
    {
        int[] figure2 = {-1, 2, 3, 18, 14, 39, 7, 15, 68, 78, 11, 32, 9, 8};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure2);

        int[] sol = t.getLevel(1);
        assertEquals(1, sol.length);
        assertEquals(2, sol[0]);

        sol = t.getLevel(2);
        assertEquals(2, sol.length);
        assertEquals(3, sol[0]);
        assertEquals(18, sol[1]);

        sol = t.getLevel(3);
        assertEquals(4, sol.length);
        assertEquals(14, sol[0]);
        assertEquals(39, sol[1]);
        assertEquals(7, sol[2]);
        assertEquals(15, sol[3]);

        sol = t.getLevel(4);
        assertEquals(6, sol.length);
        assertEquals(68, sol[0]);
        assertEquals(78, sol[1]);
        assertEquals(11, sol[2]);
        assertEquals(32, sol[3]);
        assertEquals(9, sol[4]);
        assertEquals(8, sol[5]);
    }

    public void testGetLevel04()
    {
        int[] figure2 = {-1, 21, -1, 3, -1, -1, 18, 14, -1, -1, -1, -1, 39, -1, 7, 15, 
                                                  -1, -1, -1, -1, -1, -1, -1, -1, 68, -1, -1, -1, -1, 78};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure2);

        int[] sol = t.getLevel(1);
        assertEquals(1, sol.length);
        assertEquals(21, sol[0]);

        sol = t.getLevel(2);
        assertEquals(1, sol.length);
        assertEquals(3, sol[0]);

        sol = t.getLevel(3);
        assertEquals(2, sol.length);
        assertEquals(18, sol[0]);
        assertEquals(14, sol[1]);

        sol = t.getLevel(4);
        assertEquals(3, sol.length);
        assertEquals(39, sol[0]);
        assertEquals(7, sol[1]);
        assertEquals(15, sol[2]);

        sol = t.getLevel(5);
        assertEquals(2, sol.length);
        assertEquals(68, sol[0]);
        assertEquals(78, sol[1]);
    }

    public void testGetLevelWithHighestAverage05()
    {
        int[] figure1 = {-1, 42, 2, 3, 18, 14, 39, 13, 7, 15, 28, 17, 11, 32, 9, 8};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure1);
        assertEquals(1, t.getLevelWithHighestAverage());

        int[] figure2 = {-1, 12, 42, 33, 18, 14, 39, 13, 7, 15, 28, 17, 11, 32, 9, 8};
        t = new ForestPlayGroundRevisited(figure2);
        assertEquals(2, t.getLevelWithHighestAverage());

        int[] figure3 = {-1, 12, 2, 3, 18, 14, 39, 13, 7, 15, 28, 17, 11, 32, 9, 8};
        t = new ForestPlayGroundRevisited(figure3);
        assertEquals(3, t.getLevelWithHighestAverage());

        int[] figure4 = {-1, 12, 2, 3, 18, 14, 39, 13, 37, 15, 28, 17, 31, 32, 29, 28};
        t = new ForestPlayGroundRevisited(figure4);
        assertEquals(4, t.getLevelWithHighestAverage());
    }

    public void testGetLevelWithHighestAverage06()
    {
        int[] figure1 = {-1, 22, 2, 3, 18, 14, 39, 13, 7, 15, 28, 17, 11, 32};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure1);
        assertEquals(1, t.getLevelWithHighestAverage());

        int[] figure2 = {-1, 20, 23, 33, 18, 14, 39, 13, 7, 15, 28, 17, 11, 32};
        t = new ForestPlayGroundRevisited(figure2);
        assertEquals(2, t.getLevelWithHighestAverage());

        int[] figure3 = {-1, 12, 2, 3, 18, 14, 39, 13, 7, 15, 28, 17, 26, 32};
        t = new ForestPlayGroundRevisited(figure3);
        assertEquals(3, t.getLevelWithHighestAverage());

        int[] figure4 = {-1, 12, 2, 3, 18, 14, 39, 13, 11, 17, 28, 27, 12, 32};
        t = new ForestPlayGroundRevisited(figure4);
        assertEquals(4, t.getLevelWithHighestAverage());
    }

    public void testGetLevelWithHighestAverage07()
    {
        int[] figure1 = {-1, 41, -1, 3, -1, -1, 18, 14, -1, -1, -1, -1, 39, -1, 7, 15, 
                                                  -1, -1, -1, -1, -1, -1, -1, -1, 6, -1, -1, -1, -1, 7};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure1);
        assertEquals(1, t.getLevelWithHighestAverage());

        int[] figure2 = {-1, 4, -1, 23, -1, -1, 18, 14, -1, -1, -1, -1, 19, -1, 7, 15, 
                                                  -1, -1, -1, -1, -1, -1, -1, -1, 6, -1, -1, -1, -1, 7};
        t = new ForestPlayGroundRevisited(figure2);
        assertEquals(2, t.getLevelWithHighestAverage());

        int[] figure3 = {-1, 4, -1, 13, -1, -1, 18, 14, -1, -1, -1, -1, 19, -1, 7, 15, 
                                                  -1, -1, -1, -1, -1, -1, -1, -1, 6, -1, -1, -1, -1, 7};
        t = new ForestPlayGroundRevisited(figure3);
        assertEquals(3, t.getLevelWithHighestAverage());

        int[] figure4 = {-1, 4, -1, 13, -1, -1, 18, 14, -1, -1, -1, -1, 19, -1, 31, 15, 
                                                  -1, -1, -1, -1, -1, -1, -1, -1, 6, -1, -1, -1, -1, 7};
        t = new ForestPlayGroundRevisited(figure4);
        assertEquals(4, t.getLevelWithHighestAverage());

        int[] figure5 = {-1, 4, -1, 13, -1, -1, 18, 14, -1, -1, -1, -1, 19, -1, 7, 15, 
                                                  -1, -1, -1, -1, -1, -1, -1, -1, 16, -1, -1, -1, -1, 17};
        t = new ForestPlayGroundRevisited(figure5);
        assertEquals(5, t.getLevelWithHighestAverage());
    }

    public void testShiftLevelLeft08()
    {
        int[] figure1 = {-1, 42, 2, 3, 18, 14, 39, 13, 7, 15, 28, 17, 11, 32, 9, 8};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure1);

        int[] sol = t.shiftLevelLeft();
        int[] answer = {-1, 42, 3, 2, 14, 39, 13, 18, 15, 28, 17, 11, 32, 9, 8, 7};
        assertEquals(figure1.length, sol.length);

        for (int s = 0; s < sol.length; s++)
           assertEquals(answer[s], sol[s]);
    }

    public void testShiftLevelLeft09()
    {
        int[] figure1 = {-1, 22, 2, 3, 18, 14, 39, 13, 7, 15, 28, 17, 11, 32};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure1);

        int[] sol = t.shiftLevelLeft();
        int[] answer = {-1, 22, 3, 2, 14, 39, 13, 18, 15, 28, 17, 11, 32, 7};
        assertEquals(figure1.length, sol.length);

        for (int s = 0; s < sol.length; s++)
           assertEquals(answer[s], sol[s]);
    }

    public void testShiftLevelLeft10()
    {
        int[] figure1 = {-1, 41, -1, 3, -1, -1, 18, 14, -1, -1, -1, -1, 39, -1, 7, 15, 
                                                  -1, -1, -1, -1, -1, -1, -1, -1, 6, -1, -1, -1, -1, 7};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure1);
        
        int[] sol = t.shiftLevelLeft();
        int[] answer  = {-1, 41, -1, 3, -1, -1, 14, 18, -1, -1, -1, -1, 7, -1, 15, 39,
                                                  -1, -1, -1, -1, -1, -1, -1, -1, 7, -1, -1, -1, -1, 6};
        assertEquals(figure1.length, sol.length);

        for (int s = 0; s < sol.length; s++)
           assertEquals(answer[s], sol[s]);
    }

    public void testJustAnotherStringProblem01()
    {
        String[] words1 = {"dog", "cat"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        List<String> ans =jasp.getAllPermutations();
        assertEquals("size check", 2, ans.size());
        assertEquals("contains dogcat", true, ans.contains("dogcat"));
        assertEquals("contains catdog", true, ans.contains("catdog"));

        String [] words2 = {"a", "b", "c"};
        jasp = new JustAnotherStringProblem(words2);
        ans =jasp.getAllPermutations();
        assertEquals("size check", 6, ans.size());
        assertEquals("contains abc", true, ans.contains("abc"));
        assertEquals("contains acb", true, ans.contains("acb"));
        assertEquals("contains bac", true, ans.contains("bac"));
        assertEquals("contains bca", true, ans.contains("bca"));
        assertEquals("contains cab", true, ans.contains("cab"));
        assertEquals("contains cba", true, ans.contains("cba"));

        String[] words3 = {"a1", "b2", "c3", "d4"};

        jasp = new JustAnotherStringProblem(words3);
        ans =jasp.getAllPermutations();
        assertEquals("size check", 24, ans.size());

        String[] words1a = {"dog", "cat"};
        jasp = new JustAnotherStringProblem(words1a);
        int[] indexes = jasp.getIndexes("dogcatcatcodecatcatdog");
        assertEquals("size check", 2, indexes.length);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 0, indexes[0]);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 16, indexes[1]);

        indexes = jasp.getIndexes("barfoobazbitbyte");
        assertEquals("size check", 0, indexes.length);
        
        indexes = jasp.getIndexes("dogcatdogcatcodecatdog");
        assertEquals("size check", 4, indexes.length);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 0, indexes[0]);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 3, indexes[1]);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 6, indexes[2]);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 16, indexes[3]);
    }

    public void testgetAllPermutations_2items02()
    {
        String[] words1 = {"dog", "cat"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        List<String> ans =jasp.getAllPermutations();
        assertEquals("size check", 2, ans.size());
        assertEquals("contains dogcat", true, ans.contains("dogcat"));
        assertEquals("contains catdog", true, ans.contains("catdog"));

        String [] words2 = {"a", "b"};
        jasp = new JustAnotherStringProblem(words2);
        ans =jasp.getAllPermutations();
        assertEquals("size check", 2, ans.size());
        assertEquals("contains ab", true, ans.contains("ab"));
        assertEquals("contains ba", true, ans.contains("ba"));
    }

    public void testgetAllPermutations_3items03()
    {
        String[] words1 = {"dog", "cat", "eye"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        List<String> ans =jasp.getAllPermutations();
        assertEquals("size check", 6, ans.size());
        assertEquals("contains dogcateye", true, ans.contains("dogcateye"));
        assertEquals("contains dogeyecat", true, ans.contains("dogeyecat"));
        assertEquals("contains catdogeye", true, ans.contains("catdogeye"));
        assertEquals("contains cateyedog", true, ans.contains("cateyedog"));
        assertEquals("contains eyedogcat", true, ans.contains("eyedogcat"));
        assertEquals("contains eyecatdog", true, ans.contains("eyecatdog"));

        String [] words2 = {"a", "b", "c"};
        jasp = new JustAnotherStringProblem(words2);
        ans =jasp.getAllPermutations();
        assertEquals("size check", 6, ans.size());
        assertEquals("contains abc", true, ans.contains("abc"));
        assertEquals("contains acb", true, ans.contains("acb"));
        assertEquals("contains bca", true, ans.contains("bca"));
        assertEquals("contains bac", true, ans.contains("bac"));
        assertEquals("contains cba", true, ans.contains("cba"));
        assertEquals("contains cab", true, ans.contains("cab"));
    }

    public void testgetAllPermutations_4items04()
    {
        String[] words1 = {"dog", "cat", "eye", "xxx"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        List<String> ans =jasp.getAllPermutations();
        assertEquals("size check", 24, ans.size());
        assertEquals("contains xxxdogcateye", true, ans.contains("xxxdogcateye"));
        assertEquals("contains dogxxxcateye", true, ans.contains("dogxxxcateye"));
        assertEquals("contains dogcatxxxeye", true, ans.contains("dogcatxxxeye"));
        assertEquals("contains dogcateyexxx", true, ans.contains("dogcateyexxx"));

        assertEquals("contains xxxdogeyecat", true, ans.contains("xxxdogeyecat"));
        assertEquals("contains dogxxxeyecat", true, ans.contains("dogxxxeyecat"));
        assertEquals("contains dogeyexxxcat", true, ans.contains("dogeyexxxcat"));
        assertEquals("contains dogeyecatxxx", true, ans.contains("dogeyecatxxx"));

        assertEquals("contains xxxcatdogeye", true, ans.contains("xxxcatdogeye"));
        assertEquals("contains catxxxdogeye", true, ans.contains("catxxxdogeye"));
        assertEquals("contains catdogxxxeye", true, ans.contains("catdogxxxeye"));
        assertEquals("contains catdogeyexxx", true, ans.contains("catdogeyexxx"));

        assertEquals("contains xxxcateyedog", true, ans.contains("xxxcateyedog"));
        assertEquals("contains catxxxeyedog", true, ans.contains("catxxxeyedog"));
        assertEquals("contains cateyexxxdog", true, ans.contains("cateyexxxdog"));
        assertEquals("contains cateyedogxxx", true, ans.contains("cateyedogxxx"));

        assertEquals("contains xxxeyedogcat", true, ans.contains("xxxeyedogcat"));
        assertEquals("contains eyexxxdogcat", true, ans.contains("eyexxxdogcat"));
        assertEquals("contains eyedogxxxcat", true, ans.contains("eyedogxxxcat"));
        assertEquals("contains eyedogcatxxx", true, ans.contains("eyedogcatxxx"));

        assertEquals("contains xxxeyecatdog", true, ans.contains("xxxeyecatdog"));
        assertEquals("contains eyexxxcatdog", true, ans.contains("eyexxxcatdog"));
        assertEquals("contains eyecatxxxdog", true, ans.contains("eyecatxxxdog"));
        assertEquals("contains eyecatdogxxx", true, ans.contains("eyecatdogxxx"));
    }

    public void testgetIndexes_2items05()
    {
        String[] words1 = {"dog", "cat"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        int[] indexes = jasp.getIndexes("dogcacatdogggg");
        assertEquals("size check", 1, indexes.length);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 5, indexes[0]);

        indexes = jasp.getIndexes("catdogcatdogcatcatcowmilkdogcat");
        assertEquals("size check", 5, indexes.length);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 0, indexes[0]);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 3, indexes[1]);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 6, indexes[2]);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 9, indexes[3]);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 25, indexes[4]);

        String [] words2 = {"b", "c"};
        jasp = new JustAnotherStringProblem(words2);
        indexes = jasp.getIndexes("abcbece");
        assertEquals("size check", 2, indexes.length);
        assertEquals("getIndexes(\"bcb\")", 1, indexes[0]);
        assertEquals("getIndexes(\"bcb\")", 2, indexes[1]);
    }

    public void testgetIndexes_3items06()
    {
        String[] words1 = {"duck", "nene", "swan"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        int[] indexes = jasp.getIndexes("qswanduckneneswanduck");
        assertEquals("size check", 3, indexes.length);
        assertEquals("getIndexes(\"qswanduckneneswanduck\")", 1, indexes[0]);
        assertEquals("getIndexes(\"qswanduckneneswanduck\")", 5, indexes[1]);
        assertEquals("getIndexes(\"qswanduckneneswanduck\")", 9, indexes[2]);

        indexes = jasp.getIndexes("swanneneduckswanneneduckswan");
        assertEquals("size check", 5, indexes.length);
        assertEquals("getIndexes(\"swanneneduckswanneneduckswan\")", 0, indexes[0]);
        assertEquals("getIndexes(\"swanneneduckswanneneduckswan\")", 4, indexes[1]);
        assertEquals("getIndexes(\"swanneneduckswanneneduckswan\")", 8, indexes[2]);
        assertEquals("getIndexes(\"swanneneduckswanneneduckswan\")", 12, indexes[3]);
        assertEquals("getIndexes(\"swanneneduckswanneneduckswan\")", 16, indexes[4]);

        indexes = jasp.getIndexes("swaneneduckswaeduckswan");
        assertEquals("size check", 0, indexes.length);

        String [] words2 = {"b", "c", "d"};
        jasp = new JustAnotherStringProblem(words2);
        indexes = jasp.getIndexes("abcbece");
        assertEquals("size check", 0, indexes.length);
        
        jasp = new JustAnotherStringProblem(words2);
        indexes = jasp.getIndexes("aabcdabdc");
        assertEquals("size check", 2, indexes.length);
        assertEquals("getIndexes(\"abcbece\")", 2, indexes[0]);
        assertEquals("getIndexes(\"bcb\")", 6, indexes[1]);
    }

    public void testgetIndexes_4items07()
    {
        String[] words1 = {"c", "n", "s", "t"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        int[] indexes = jasp.getIndexes("cnstcnsctnscntscncstncsntctsnctsntcsn");
             
        assertEquals("size check", 26, indexes.length);
        assertEquals("getIndexes(\"cnstcnsct\")", 0, indexes[0]);
        assertEquals("getIndexes(\"cnstcnsct\")", 1, indexes[1]);
        assertEquals("getIndexes(\"cnstcnsct\")", 2, indexes[2]);
        assertEquals("getIndexes(\"cnstcnsct\")", 3, indexes[3]);
        assertEquals("getIndexes(\"cnstcnsct\")", 5, indexes[4]);
        assertEquals("getIndexes(\"cnstcnsct\")", 6, indexes[5]);
        assertEquals("getIndexes(\"cnstcnsct\")", 7, indexes[6]);
        assertEquals("getIndexes(\"cnstcnsct\")", 8, indexes[7]);
        assertEquals("getIndexes(\"cnstcnsct\")", 10, indexes[8]);
        assertEquals("getIndexes(\"cnstcnsct\")", 11, indexes[9]);
        assertEquals("getIndexes(\"cnstcnsct\")", 12, indexes[10]);
        assertEquals("getIndexes(\"cnstcnsct\")", 13, indexes[11]);
        assertEquals("getIndexes(\"cnstcnsct\")", 16, indexes[12]);
        assertEquals("getIndexes(\"cnstcnsct\")", 17, indexes[13]);
        assertEquals("getIndexes(\"cnstcnsct\")", 18, indexes[14]);
        assertEquals("getIndexes(\"cnstcnsct\")", 19, indexes[15]);
        assertEquals("getIndexes(\"cnstcnsct\")", 21, indexes[16]);
        assertEquals("getIndexes(\"cnstcnsct\")", 22, indexes[17]);   // sntc
        assertEquals("getIndexes(\"cnstcnsct\")", 25, indexes[18]);   // ctsn
        assertEquals("getIndexes(\"cnstcnsct\")", 26, indexes[19]);
        assertEquals("getIndexes(\"cnstcnsct\")", 27, indexes[20]);
        assertEquals("getIndexes(\"cnstcnsct\")", 28, indexes[21]);
        assertEquals("getIndexes(\"cnstcnsct\")", 29, indexes[22]);
        assertEquals("getIndexes(\"cnstcnsct\")", 31, indexes[23]);
        assertEquals("getIndexes(\"cnstcnsct\")", 32, indexes[24]);
        assertEquals("getIndexes(\"cnstcnsct\")", 33, indexes[25]);

        indexes = jasp.getIndexes("cnsqcstctntnsnnctcsynsncntntsscnc stntnc sncntctsctcnctnwsnstrccsns");
             
        assertEquals("size check", 0, indexes.length);
    }

    public void testgetAllPermutations_5itemsSizeCheckOnly08()
    {
        String[] words1 = {"b", "c", "d", "e", "f"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        List<String> ans =jasp.getAllPermutations();
        Set<String> items = new HashSet<String>();
        for (String s : ans)
           items.add(s);
        assertEquals("size check", 5*4*3*2*1, items.size());
    }

    public void testgetAllPermutations_6itemsSizeCheckOnly09()
    {
        String[] words1 = {"a", "b", "c", "d", "e", "f"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        List<String> ans =jasp.getAllPermutations();
        Set<String> items = new HashSet<String>();
        for (String s : ans)
           items.add(s);
        assertEquals("size check", 6*5*4*3*2*1, items.size());
    }

    public void testgetAllPermutations_9itemsSizeCheckOnly10()
    {
        String[] words1 = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        List<String> ans =jasp.getAllPermutations();
        Set<String> items = new HashSet<String>();
        for (String s : ans)
           items.add(s);
        assertEquals("size check", 9*8*7*6*5*4*3*2*1, items.size());
    }

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

    public void testnConnected01()
    {
        assertEquals("getNConnected(ABCDEF)", 1, nConnected.getNConnected("ABCDEF"));
        assertEquals("getNConnected(AABCDEF)", 2, nConnected.getNConnected("AABCDEF"));
        assertEquals("getNConnected(AABBBCDBBEF)", 3, nConnected.getNConnected("AABBBCDBBEF"));
        assertEquals("getNConnected(AAABCCCCDCCCEF)", 4, nConnected.getNConnected("AAABCCCCDCCCEF"));

        assertEquals("rotateKitems(TEST)", "ESTT", nConnected.rotateKitems("TEST", 3));
        assertEquals("rotateKitems(TEST)", "STTE", nConnected.rotateKitems("TEST", 2));
        assertEquals("rotateKitems(RABBBCDEF)", "ABBBCDEFR", nConnected.rotateKitems("RABBBCDEF", 2));
        assertEquals("rotateKitems(EAFBEE)", "EEEAFB", nConnected.rotateKitems("EAFBEE", 2));
    }

    public void testGetNConnected02()
    {
        assertEquals("getNConnected(\"ABCDEFF\")", 2, nConnected.getNConnected("ABCDEFF"));
        assertEquals("getNConnected(\"ABCDEEF\")", 2, nConnected.getNConnected("ABCDEEF"));
        assertEquals("getNConnected(\"ABCCDEF\")", 2, nConnected.getNConnected("ABCCDEF"));
        assertEquals("getNConnected(\"AABCDEF\")", 2, nConnected.getNConnected("AABCDEF"));
    }

    public void testGetNConnected03()
    {
        assertEquals("getNConnected(\"AAABCDEFF\")", 3, nConnected.getNConnected("AAABCDEFF"));
        assertEquals("getNConnected(\"ABBBCDEEF\")", 3, nConnected.getNConnected("ABBBCDEEF"));
        assertEquals("getNConnected(\"AABBCCCDDEEF\")", 3, nConnected.getNConnected("AABBCCCDDEEF"));
        assertEquals("getNConnected(\"AABCDEEFFF\")", 3, nConnected.getNConnected("AABCDEEFFF"));
    }

    public void testGetNConnected04()
    {
        assertEquals("getNConnected(\"AAABCDDDDEFF\")", 4, nConnected.getNConnected("AAABCDDDDEFF"));
        assertEquals("getNConnected(\"ABBBCDEEFFFF\")", 4, nConnected.getNConnected("ABBBCDEEFFFF"));
        assertEquals("getNConnected(\"AAAABBBCCCDDEEF\")", 4, nConnected.getNConnected("AAAABBBCCCDDEEF"));
        assertEquals("getNConnected(\"AABCDDDDEEFFF\")", 4, nConnected.getNConnected("AABCDDDDEEFFF"));
    }

    public void testGetNConnected05()
    {
        assertEquals("getNConnected(\"ABCDDEF\")", 2, nConnected.getNConnected("ABCDDEF"));
        assertEquals("getNConnected(\"ABBBCDEEFF\")", 3, nConnected.getNConnected("ABBBCDEEFF"));
        assertEquals("getNConnected(\"CCAAABBBCCCDDDDEEF\")", 4, nConnected.getNConnected("CCAAABBBCCCDDDDEEF"));
        assertEquals("getNConnected(\"AABCCCCCDDDDEEFFFCCCC\")", 5, nConnected.getNConnected("AABCCCCCDDDDEEFFFCCCC"));
        assertEquals("getNConnected(\"AAAAAACCCCBBBBBBCCCCCDDDDDDDEEEEEFFF\")", 7, nConnected.getNConnected("AAAAAACCCCBBBBBBCCCCCDDDDDDDEEEEEFFF"));
    }

    public void testRotateKitems06()
    {
        assertEquals("rotateKitems(\"HFRABBCCDEFRR\", 2)", "ABBCCDEFRRHFR", nConnected.rotateKitems("HFRABBCCDEFRR", 2));
        assertEquals("rotateKitems(\"EAAAFBEEAA\", 2)", "AAEAAAFBEE", nConnected.rotateKitems("EAAAFBEEAA", 2));
    }

    public void testRotateKitems07()
    {
        assertEquals("rotateKitems(\"EAAAFBEEAAAA\", 3)", "AFBEEAAAAEAA", nConnected.rotateKitems("EAAAFBEEAAAA", 3));
        assertEquals("rotateKitems(\"HFRABBCCCDEFR\", 3)", "ABBCCCDEFRHFR", nConnected.rotateKitems( "HFRABBCCCDEFR", 3));
        assertEquals("rotateKitems(\"HFRABBCCCDEFRR\", 3)", "ABBCCCDEFRRHFR", nConnected.rotateKitems("HFRABBCCCDEFRR", 3));
    }

    public void testRotateKitems08()
    {
        assertEquals("rotateKitems(\"BBBCCDEFRRHBBB\", 4)", "CDEFRRHBBBBBBC", nConnected.rotateKitems("BBBCCDEFRRHBBB", 4));
        assertEquals("rotateKitems(\"EAAAFBEEAAAAQ\", 4)", "AAAAQEAAAFBEE", nConnected.rotateKitems("EAAAFBEEAAAAQ", 4));
        assertEquals("rotateKitems(\"FBEEEAAAZZZZ\", 4)", "EAAAZZZZFBEE", nConnected.rotateKitems("FBEEEAAAZZZZ", 4));
        assertEquals("rotateKitems(\"EBEEVFBEEWWWWQQ\", 4)", "BEEVFBEEWWWWQQE", nConnected.rotateKitems("EBEEVFBEEWWWWQQ", 4));
    }

    public void testRotateKitems09()
    {
        assertEquals("rotateKitems(\"ZBBCCCCCRRVBBBQ\", 5)", "VBBBQZBBCCCCCRR", nConnected.rotateKitems("ZBBCCCCCRRVBBBQ", 5));
        assertEquals("rotateKitems(\"EARAFBEEEEEAQSSQ\", 5)", "AFBEEEEEAQSSQEAR", nConnected.rotateKitems("EARAFBEEEEEAQSSQ", 5));
        assertEquals("rotateKitems(\"FBEEEAACZZZZAABCD\", 5)", "AABCDFBEEEAACZZZZ", nConnected.rotateKitems("FBEEEAACZZZZAABCD", 5));
        assertEquals("rotateKitems(\"EBCCVFBEEWWWWQQBCD\", 5)", "BCCVFBEEWWWWQQBCDE", nConnected.rotateKitems("EBCCVFBEEWWWWQQBCD", 5));
        assertEquals("rotateKitems(\"EBEEXFBEEWWWWQQBFDE\", 5)", "BEEWWWWQQBFDEEBEEXF", nConnected.rotateKitems("EBEEXFBEEWWWWQQBFDE", 5));
    }

    public void testRotateKitems10()
    {
        assertEquals("rotateKitems(\"ZBBCCCCCRRVB\", 6)", "ZBBCCCCCRRVB", nConnected.rotateKitems("ZBBCCCCCRRVB", 6));
        assertEquals("rotateKitems(\"EARAFBEEEEEAQ\", 6)", "AFBEEEEEAQEAR", nConnected.rotateKitems("EARAFBEEEEEAQ", 6));
        assertEquals("rotateKitems(\"FBEEEAAZZZZZBA\", 6)", "AZZZZZBAFBEEEA", nConnected.rotateKitems("FBEEEAAZZZZZBA", 6));
        assertEquals("rotateKitems(\"EBCCAFBEEWWWWQW\", 6)", "BEEWWWWQWEBCCAF", nConnected.rotateKitems("EBCCAFBEEWWWWQW", 6));
        assertEquals("rotateKitems(\"EBEEXFREEAAAAQQA\", 6)", "EAAAAQQAEBEEXFRE", nConnected.rotateKitems("EBEEXFREEAAAAQQA", 6));
        assertEquals("rotateKitems(\"WWRETEZEVXFJEMWWW\", 6)", "EMWWWWWRETEZEVXFJ", nConnected.rotateKitems("WWRETEZEVXFJEMWWW", 6));
    }

   public void testPolygonFun_01()
   {
      assertEquals("PolygonFun.whichQuadrant(new Coordinate(-8, 10), new Coordinate(15, -6))", 1, PolygonFun.whichQuadrant(new Coordinate(-8, 10), new Coordinate(15, -6)));
      assertEquals("PolygonFun.whichQuadrant(new Coordinate(-4, 3), new Coordinate(1, -10))", 3, PolygonFun.whichQuadrant(new Coordinate(-4, 3), new Coordinate(1, -10)));

      assertEquals("6-11", PolygonFun.getNumberOfSides(17, 53));
      assertEquals("7-8", PolygonFun.getNumberOfSides(15, 34));

      assertEquals(true, PolygonFun.isConvex(new Coordinate[] { new Coordinate(0., 0.), new Coordinate(2., 2.), new Coordinate(4., 2.), new Coordinate(2., 0.) } ) );
      assertEquals(true, PolygonFun.isConvex(new Coordinate[] { new Coordinate(3., -20.), new Coordinate(2., -11.), new Coordinate(1., 5.), new Coordinate(5., 9.), new Coordinate(10., 13.), new Coordinate(15., 7.), new Coordinate(23., -3.), new Coordinate(18., -19.), new Coordinate(9., -20.) } ) );

      assertEquals(false, PolygonFun.isConvex(new Coordinate[] { new Coordinate(0., 0.), new Coordinate(1., 12.), new Coordinate(5., 5.), new Coordinate(10., 9.), new Coordinate(11., 1.) } ) );
      assertEquals(false, PolygonFun.isConvex(new Coordinate[] { new Coordinate(1., 5.), new Coordinate(5., 9.), new Coordinate(10., 13.), new Coordinate(15., 7.), new Coordinate(23., -3.), new Coordinate(18., -19.), new Coordinate(9., -20.), new Coordinate(3., -20.), new Coordinate(2., -1.) } ) );
      assertEquals(false, PolygonFun.isConvex(new Coordinate[] { new Coordinate(23., -3.), new Coordinate(18., -19.), new Coordinate(9., -20.), new Coordinate(3., -20.), new Coordinate(2., -1.), new Coordinate(1., 5.), new Coordinate(5., 9.), new Coordinate(10., 13.), new Coordinate(15., 7.) } ) );
/*
      List<double[][]> v1a = new ArrayList<double[][]>();
      v1a.add( new double[][] { {0., 0.}, {0., 1.} } );
      List<double[][]> v2a = new ArrayList<double[][]>();
      v2a.add( new double[][] { {2., 2.}, {3., 2.} } );
      List<double[][]> v3a = new ArrayList<double[][]>();
      v3a.add( new double[][] { {4., 1.}, {1., 1.} } );
      List<double[][]> v4a = new ArrayList<double[][]>();
      v4a.add( new double[][] { {3., -3.} } );
      List<double[][]> v5a = new ArrayList<double[][]>();
      v5a.add( new double[][] { {1., -2.} } );
      
      assertEquals(4, PolygonFun.getNumConvexDouble(v1a, v2a, v3a, v4a, v5a));
*/
      List<Coordinate> v1 = new ArrayList<Coordinate>();
      v1.add( new Coordinate(0., 0.) );
      v1.add( new Coordinate(0., 1.) );
      List<Coordinate> v2 = new ArrayList<Coordinate>();
      v2.add( new Coordinate(2., 2.) );
      v2.add( new Coordinate(3., 2.) );
      List<Coordinate> v3 = new ArrayList<Coordinate>();
      v3.add( new Coordinate(4., 1.) );
      v3.add( new Coordinate(1., 1.) );
      List<Coordinate> v4 = new ArrayList<Coordinate>();
      v4.add( new Coordinate(3., -3.) );
      List<Coordinate> v5 = new ArrayList<Coordinate>();
      v5.add( new Coordinate(1., -2.) );
      
      assertEquals(4, PolygonFun.getNumConvex(v1, v2, v3, v4, v5));
   } 

   public void testWhichQuadrant_02()     //    whichQuadrant(upper_left_x, left_y, lower_right_x, right_y)
   {
      assertEquals(1, PolygonFun.whichQuadrant(new Coordinate(8, 10), new Coordinate(15, 6)));
      assertEquals(2, PolygonFun.whichQuadrant(new Coordinate(-8, 10), new Coordinate(-5, 6)));
      assertEquals(3, PolygonFun.whichQuadrant(new Coordinate(-6, -1), new Coordinate(-2, -16)));
      assertEquals(4, PolygonFun.whichQuadrant(new Coordinate(1, -11), new Coordinate(5, -16)));
   }

   public void testWhichQuadrant_03()
   {
      assertEquals(1, PolygonFun.whichQuadrant(new Coordinate(-3, 4), new Coordinate(4, -3)));
      assertEquals(1, PolygonFun.whichQuadrant(new Coordinate(-3, 4), new Coordinate(4, 1)));
      assertEquals(1, PolygonFun.whichQuadrant(new Coordinate(2, 4), new Coordinate(3, -1)));
      
      assertEquals(2, PolygonFun.whichQuadrant(new Coordinate(-4, 5), new Coordinate(3, -4)));
      assertEquals(2, PolygonFun.whichQuadrant(new Coordinate(-6, 8), new Coordinate(5, 2)));
      assertEquals(2, PolygonFun.whichQuadrant(new Coordinate(-4, 5), new Coordinate(-1, -4)));

      assertEquals(3, PolygonFun.whichQuadrant(new Coordinate(-2, 9), new Coordinate(1, -10)));
      assertEquals(3, PolygonFun.whichQuadrant(new Coordinate(-2, 3), new Coordinate(-1, -4)));
      assertEquals(3, PolygonFun.whichQuadrant(new Coordinate(-8, -1), new Coordinate(7, -10)));
      
      assertEquals(4, PolygonFun.whichQuadrant(new Coordinate(-4, 5), new Coordinate(5, -6)));
      assertEquals(4, PolygonFun.whichQuadrant(new Coordinate(4, 5), new Coordinate(8, -6)));
      assertEquals(4, PolygonFun.whichQuadrant(new Coordinate(-4, -5), new Coordinate(5, -11)));
   }

   public void testGetNumberOfSides_04()   // getNumberOfSides(int angles, int diagonals)
   {
      assertEquals("4-13", PolygonFun.getNumberOfSides(4+13, 4*(4-3)/2 + 13*(13-3)/2));
      assertEquals("7-9", PolygonFun.getNumberOfSides(7+9, 7*(7-3)/2 + 9*(9-3)/2));
      assertEquals("5-17", PolygonFun.getNumberOfSides(5+17, 5*(5-3)/2 + 17*(17-3)/2));
   }

   public void testGetNumberOfSides_05()
   {
      assertEquals("14-23", PolygonFun.getNumberOfSides(14+23, 14*(14-3)/2 + 23*(23-3)/2));
      assertEquals("17-39", PolygonFun.getNumberOfSides(17+39, 17*(17-3)/2 + 39*(39-3)/2));
   }

   public void testGetNumberOfSides_06()
   {
      assertEquals("25-37", PolygonFun.getNumberOfSides(25+37, 25*(25-3)/2 + 37*(37-3)/2));
      assertEquals("35-217", PolygonFun.getNumberOfSides(35+217, 35*(35-3)/2 + 217*(217-3)/2));
   }

   public void testisConvex_07()
   {
      assertEquals(true, PolygonFun.isConvex(new Coordinate[] { new Coordinate(-11., -52.), new Coordinate(0., 0.), new Coordinate(5., 19.) } ) );
      assertEquals(true, PolygonFun.isConvex(new Coordinate[] { new Coordinate(1., 5.), new Coordinate(5., 9.), new Coordinate(10., 13.), new Coordinate(15., 7.), new Coordinate(23., -3.), new Coordinate(18., -19.), new Coordinate(9., -20.), new Coordinate(3., -20.), new Coordinate(2., -11.) } ) );
      assertEquals(true, PolygonFun.isConvex(new Coordinate[] { new Coordinate(13., -14.), new Coordinate(9., -10.), new Coordinate(15., -7.), new Coordinate(25., -8.), new Coordinate(19., -15.) } ) );
      assertEquals(true, PolygonFun.isConvex(new Coordinate[] { new Coordinate(1., 5.), new Coordinate(5., 9.), new Coordinate(10., 13.), new Coordinate(15., 7.), new Coordinate(23., -3.), new Coordinate(18., -19.), new Coordinate(9., -20.), new Coordinate(3., -20.), new Coordinate(2., -11.) } ) );
      
      assertEquals(false, PolygonFun.isConvex(new Coordinate[] { new Coordinate(0., 0.), new Coordinate(2., 2.), new Coordinate(1., 1.), new Coordinate(3., -3.), new Coordinate(1., -2.) } ) );
      assertEquals(false, PolygonFun.isConvex(new Coordinate[] { new Coordinate(13., -14.), new Coordinate(16., -10.), new Coordinate(15., -7.), new Coordinate(25., -8.), new Coordinate(19., -15.) } ) );
      assertEquals(false, PolygonFun.isConvex(new Coordinate[] { new Coordinate(13., -14.), new Coordinate(16., -10.), new Coordinate(15., -7.), new Coordinate(25., -8.), new Coordinate(19., -15.) } ) );
   }

   public void testisConvex_08()
   {
      assertEquals(true, PolygonFun.isConvex(new Coordinate[] { new Coordinate(-3., 3.), new Coordinate(-6., 13.), new Coordinate(0., 21.), new Coordinate(11., -9.) } ) );
      assertEquals(true, PolygonFun.isConvex(new Coordinate[] { new Coordinate(-5., -2.), new Coordinate(3., -7.), new Coordinate(-3., -17.), new Coordinate(-17., -7.), new Coordinate(-11., -2.) } ) );
      
      assertEquals(false, PolygonFun.isConvex(new Coordinate[] { new Coordinate(-18., 3.), new Coordinate(-1., 13.), new Coordinate(0., 21.), new Coordinate(11., -9.) } ) );
      assertEquals(false, PolygonFun.isConvex(new Coordinate[] { new Coordinate(-5., -2.), new Coordinate(0., -8.), new Coordinate(3., -7.), new Coordinate(-3., -17.), new Coordinate(-17., -7.), new Coordinate(-11., -2.) } ) );
   }

   public void testGetNumConvexPolygons_09()
   {
      List<Coordinate> v1 = new ArrayList<Coordinate>();
      v1.add( new Coordinate(-3., 3.) );
      v1.add( new Coordinate(2, 1) );

      List<Coordinate> v2 = new ArrayList<Coordinate>();
      v2.add( new Coordinate(-6., 13.) );
      v2.add( new Coordinate(-16, 13) );
      v2.add( new Coordinate(-4, 13) );

      List<Coordinate> v3 = new ArrayList<Coordinate>();
      v3.add( new Coordinate(0., 21.) );
      v3.add( new Coordinate(0., 14.) );
      v3.add( new Coordinate(8., 14.) );

      List<Coordinate> v4 = new ArrayList<Coordinate>();
      v4.add( new Coordinate(11., -9.) );
      v4.add( new Coordinate(15., -9.) );
      v4.add( new Coordinate(0., 8.) );
      v4.add( new Coordinate(18., -9.) );

      List<Coordinate> v5 = new ArrayList<Coordinate>();
      v5.add( new Coordinate(1., -2.) );
      v5.add( new Coordinate(1., 12.) );
      
      assertEquals(18, PolygonFun.getNumConvex(v1, v2, v3, v4, v5));
   }

   public void testGetNumConvexPolygons_10()
   {
      List<Coordinate> v1 = new ArrayList<Coordinate>();
      v1.add( new Coordinate(0., 0.) );

      List<Coordinate> v2 = new ArrayList<Coordinate>();
      v2.add( new Coordinate(2., 2.) );

      List<Coordinate> v3 = new ArrayList<Coordinate>();
      v3.add( new Coordinate(4., 1.) );

      List<Coordinate> v4 = new ArrayList<Coordinate>();
      v4.add( new Coordinate(3., -3.) );

      List<Coordinate> v5 = new ArrayList<Coordinate>();
      v5.add( new Coordinate(1., 1.) );
      
      assertEquals(0, PolygonFun.getNumConvex(v1, v2, v3, v4, v5));

      v1 = new ArrayList<Coordinate>();
      v1.add( new Coordinate(0., 0.) );
      v1.add( new Coordinate(0., 1.) );

      v2 = new ArrayList<Coordinate>();
      v2.add( new Coordinate(2., 2.) );
      v2.add( new Coordinate(3., 2.) );
      
      v3 = new ArrayList<Coordinate>();
      v3.add( new Coordinate(4., 1.) );
      v3.add( new Coordinate(1., 1.) );
      
      v4 = new ArrayList<Coordinate>();
      v4.add( new Coordinate(3., -3.) );
      
      v5 = new ArrayList<Coordinate>();
      v5.add( new Coordinate(1., -2.) );
      v5.add( new Coordinate(1., 1.) );

      assertEquals(4, PolygonFun.getNumConvex(v1, v2, v3, v4, v5));

      v4 = new ArrayList<Coordinate>();
      v4.add( new Coordinate(3., -3.) );
      v4.add( new Coordinate(3.5, -11.3) );
      v4.add( new Coordinate(2.5, -3.7) );

      v5 = new ArrayList<Coordinate>();
      v5.add( new Coordinate(1., -2.) );
      v5.add( new Coordinate(1., 1.) );
      v5.add( new Coordinate(1., -5.) );

      assertEquals(20, PolygonFun.getNumConvex(v1, v2, v3, v4, v5));
   }

    public void testKnowTheFifth01()
    {
        KnowTheFifth ktf = new KnowTheFifth();
        Card c1 = new Card("heart", 2);
        Card c2 = new Card("diamond", 5);
        assertEquals(c1, ktf.isSmaller(c1, c2));

        Card[] ans = ktf.arrangeCards(new Card[] { new Card("heart", 2), new Card("spade", 6), new Card("heart", 1),
                    new Card("diamond", 4), new Card("club", 1)});
        assertEquals("heart", ans[0].getSuit());
        assertEquals(1, ans[0].getRank());
        assertEquals("club", ans[1].getSuit());
        assertEquals(1, ans[1].getRank());
        assertEquals("diamond", ans[2].getSuit());
        assertEquals(4, ans[2].getRank());
        assertEquals("spade", ans[3].getSuit());
        assertEquals(6, ans[3].getRank());

        //  evaluateOrder
        Card[] order = new Card[] { new Card("heart", 2), new Card("spade", 6), new Card("heart", 1)};
        assertEquals(4, ktf.evaluateOrder(order));

        // name5thCard
        Card[] theFour = new Card[] { new Card("heart", 2), new Card("spade", 6), new Card("heart", 1), new Card("club", 4)};
        Card fifthCard = ktf.name5thCard(theFour);
        assertEquals("heart", fifthCard.getSuit());
        assertEquals(7, fifthCard.getRank());
    }

    public void testIsSmaller02()
    {
        KnowTheFifth ktf = new KnowTheFifth();
        Card c1 = new Card("heart", 11);
        Card c2 = new Card("diamond", 11);
        assertEquals("11h, 11d", c2, ktf.isSmaller(c1, c2));

        ktf = new KnowTheFifth();
        c1 = new Card("club", 11);
        c2 = new Card("diamond", 11);
        assertEquals("11c, 11d", c1, ktf.isSmaller(c1, c2));

        ktf = new KnowTheFifth();
        c1 = new Card("spade", 1);
        c2 = new Card("heart", 1);
        assertEquals("1s, 1h", c2, ktf.isSmaller(c1, c2));
    }

    public void testEvaluateOrder03()
    {
        KnowTheFifth ktf = new KnowTheFifth();

        Card[] order1 = new Card[] {new Card("diamond", 2), new Card("heart", 2), new Card("spade", 2)};
        assertEquals("2d, 2h, 2s", 1, ktf.evaluateOrder(order1));

        Card[] order2 = new Card[] {new Card("club", 5), new Card("heart", 5), new Card("diamond", 5)};
        assertEquals("5c, 2h, 2d", 2, ktf.evaluateOrder(order2));

        Card[] order3 = new Card[] {new Card("heart", 9), new Card("diamond", 9), new Card("spade", 9)};
        assertEquals("9h, 9d, 9s", 3, ktf.evaluateOrder(order3));

        Card[] order4 = new Card[] {new Card("heart", 1), new Card("spade", 1), new Card("diamond", 1)};
        assertEquals("1h, 1s, 1d", 4, ktf.evaluateOrder(order4));

        Card[] order5 = new Card[] {new Card("spade", 3), new Card("diamond", 3), new Card("heart", 3)};
        assertEquals("5c, 2h, 2d", 5, ktf.evaluateOrder(order5));

        Card[] order6 = new Card[] {new Card("heart", 5), new Card("diamond", 5), new Card("club", 5)};
        assertEquals("5c, 2h, 2d", 6, ktf.evaluateOrder(order6));
    }

    public void testName5thCard04()
    {
        KnowTheFifth ktf = new KnowTheFifth();

        Card[] theFour = new Card[] { new Card("diamond", 12), new Card("spade", 3), new Card("heart", 7), new Card("club", 4)};
        Card fifthCard = ktf.name5thCard(theFour);
        assertEquals("suit: 12d, 3s, 7h, 4c", "diamond", fifthCard.getSuit());
        assertEquals("rank: 12d, 3s, 7h, 4c", 1, fifthCard.getRank());
    }

    public void testName5thCard05()
    {
        KnowTheFifth ktf = new KnowTheFifth();

        Card[] theFour = new Card[] { new Card("diamond", 2), new Card("spade", 6), new Card("heart", 7), new Card("club", 4)};
        Card fifthCard = ktf.name5thCard(theFour);
        assertEquals("suit: 2d, 6s, 7h, 4c", "diamond", fifthCard.getSuit());
        assertEquals("rank: 2d, 6s, 7h, 4c", 2+4, fifthCard.getRank());
    }

    public void testArrangeCards06()
    {
        KnowTheFifth ktf = new KnowTheFifth();

        Card[] hand = new Card[] { new Card("heart", 3), new Card("spade", 11), new Card("spade", 7),
                new Card("diamond", 13), new Card("club", 7)};
        Card[] ans = ktf.arrangeCards(hand);
        assertEquals("0: 3h, 11s, 7s, 13d, 7c", "spade", ans[0].getSuit());
        assertEquals("0: 3h, 11s, 7s, 13d, 7c", 7, ans[0].getRank());
        assertEquals("1: 3h, 11s, 7s, 13d, 7c", "club", ans[1].getSuit());
        assertEquals("1: 3h, 11s, 7s, 13d, 7c", 7, ans[1].getRank());
        assertEquals("2: 3h, 11s, 7s, 13d, 7c:", "diamond", ans[2].getSuit());
        assertEquals("2: 3h, 11s, 7s, 13d, 7c", 13, ans[2].getRank());
        assertEquals("3: 3h, 11s, 7s, 13d, 7c", "heart", ans[3].getSuit());
        assertEquals("3: 3h, 11s, 7s, 13d, 7c", 3, ans[3].getRank());
    }

    public void testArrangeCards07()
    {
        KnowTheFifth ktf = new KnowTheFifth();

        Card[] hand = new Card[] { new Card("heart", 3), new Card("spade", 11), new Card("spade", 2),
                new Card("diamond", 13), new Card("club", 7)};
        Card[] ans = ktf.arrangeCards(hand);
        assertEquals("0: 3h, 11s, 2s, 13d, 7c", "spade", ans[0].getSuit());
        assertEquals("0: 3h, 11s, 2s, 13d, 7c", 11, ans[0].getRank());
        assertEquals("1: 3h, 11s, 2s, 13d, 7c", "club", ans[1].getSuit());
        assertEquals("1: 3h, 11s, 2s, 13d, 7c", 7, ans[1].getRank());
        assertEquals("2: 3h, 11s, 2s, 13d, 7c", "diamond", ans[2].getSuit());
        assertEquals("2: 3h, 11s, 2s, 13d, 7c", 13, ans[2].getRank());
        assertEquals("3: 3h, 11s, 2s, 13d, 7c", "heart", ans[3].getSuit());
        assertEquals("3: 3h, 11s, 2s, 13d, 7c", 3, ans[3].getRank());
    }

    public void testArrangeCards08()
    {
        KnowTheFifth ktf = new KnowTheFifth();

        Card[] hand = new Card[] { new Card("heart", 3), new Card("spade", 9), new Card("diamond", 12),
                new Card("club", 8), new Card("heart", 7)};
        Card[] ans = ktf.arrangeCards(hand);
        assertEquals("0: 3h, 9s, 12d, 3c, 7h", "heart", ans[0].getSuit());
        assertEquals("0: 3h, 9s, 12d, 3c, 7h", 3, ans[0].getRank());
        assertEquals("1: 3h, 9s, 12d, 3c, 7h", "spade", ans[1].getSuit());
        assertEquals("1: 3h, 9s, 12d, 3c, 7h", 9, ans[1].getRank());
        assertEquals("2: 3h, 9s, 12d, 3c, 7h", "diamond", ans[2].getSuit());
        assertEquals("2: 3h, 9s, 12d, 3c, 7h", 12, ans[2].getRank());
        assertEquals("3: 3h, 9s, 12d, 3c, 7h", "club", ans[3].getSuit());
        assertEquals("3: 3h, 9s, 12d, 3c, 7h", 8, ans[3].getRank());
    }

    public void testArrangeCards09()
    {
        KnowTheFifth ktf = new KnowTheFifth();

        Card[] hand = new Card[] { new Card("heart", 3), new Card("spade", 9), new Card("diamond", 12),
                new Card("club", 8), new Card("club", 1) };
        Card[] ans = ktf.arrangeCards(hand);
        assertEquals("0: 3h, 9s, 12d, 3c, 7h", "club", ans[0].getSuit());
        assertEquals("0: 3h, 9s, 12d, 3c, 7h", 8, ans[0].getRank());
        assertEquals("1: 3h, 9s, 12d, 3c, 7h", "diamond", ans[1].getSuit());
        assertEquals("1: 3h, 9s, 12d, 3c, 7h", 12, ans[1].getRank());
        assertEquals("2: 3h, 9s, 12d, 3c, 7h", "spade", ans[2].getSuit());
        assertEquals("2: 3h, 9s, 12d, 3c, 7h", 9, ans[2].getRank());
        assertEquals("3: 3h, 9s, 12d, 3c, 7h", "heart", ans[3].getSuit());
        assertEquals("3: 3h, 9s, 12d, 3c, 7h", 3, ans[3].getRank());
    }

    public void testArrangeCards10()
    {
        KnowTheFifth ktf = new KnowTheFifth();

        Card[] hand = new Card[] { new Card("heart", 3), new Card("club", 9), new Card("diamond", 11),
                new Card("diamond", 8), new Card("spade", 1) };
        Card[] ans = ktf.arrangeCards(hand);
        assertEquals("0: 3h, 9s, 12d, 3c, 7h", "diamond", ans[0].getSuit());
        assertEquals("0: 3h, 9s, 12d, 3c, 7h", 8, ans[0].getRank());
        assertEquals("1: 3h, 9s, 12d, 3c, 7h", "heart", ans[1].getSuit());
        assertEquals("1: 3h, 9s, 12d, 3c, 7h", 3, ans[1].getRank());
        assertEquals("2: 3h, 9s, 12d, 3c, 7h", "spade", ans[2].getSuit());
        assertEquals("2: 3h, 9s, 12d, 3c, 7h", 1, ans[2].getRank());
        assertEquals("3: 3h, 9s, 12d, 3c, 7h", "club", ans[3].getSuit());
        assertEquals("3: 3h, 9s, 12d, 3c, 7h", 9, ans[3].getRank());
        
        Card fifthCard = ktf.name5thCard(ans);
        assertEquals("suit: 3h, 1s, 9c", "diamond", fifthCard.getSuit());
        assertEquals("rank: 3h, 1s, 9c", 11, fifthCard.getRank());
    }
}