import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FinalBongardTest extends junit.framework.TestCase
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
}