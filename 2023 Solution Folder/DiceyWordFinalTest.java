import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2021 Wittry programming contest
 */
public class DiceyWordFinalTest extends junit.framework.TestCase
{
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
}