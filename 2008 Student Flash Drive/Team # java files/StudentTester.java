import java.util.*;

/**
 * The  StudentTester class
 *
 * @author  2007 SC Programming Contest
 * @version (a version number or a date)
 */
public class StudentTester extends junit.framework.TestCase
{
// ****************  Camouflage
    public void testCamouflage01() {
        Camouflage baseWord = new Camouflage("LINDSAYLOHAN");
        assertEquals(true, baseWord.linearSearch("SALON"));
        assertEquals(false, baseWord.linearSearch("poPCOrn"));
        assertEquals(false, baseWord.reverseSearch("poPCOrn"));
        assertEquals(true, baseWord.reverseSearch("doll"));
        assertEquals(false, baseWord.circularSearch("poPCOrn"));
        assertEquals(true, baseWord.circularSearch("dials"));
    }

// ****************  DDR
    public void testDDRScoring01() {
        DDRScoring d = new DDRScoring(4);
        assertEquals(100000, d.getBaseStepScore());
        assertEquals(0, d.getLastStepBonus());
        assertEquals(1000000, d.addStep("Perfect"));
        assertEquals(2000000, d.addStep("Great"));
        assertEquals(2000000, d.addStep("Good"));
        assertEquals(3000000, d.addStep("Perfect"));
        assertEquals("C", d.getStageGrade());

        d = new DDRScoring(12);
        int correctScore = 12820;
        assertEquals(12820, d.getBaseStepScore());
        assertEquals(400, d.getLastStepBonus());
        assertEquals(correctScore * 10, d.addStep("Perfect"));
        assertEquals(3 * correctScore * 10, d.addStep("Perfect"));
        assertEquals(6 * correctScore * 10, d.addStep("Perfect"));
        assertEquals(10 * correctScore * 10, d.addStep("Perfect"));
        assertEquals(15 * correctScore * 10, d.addStep("Perfect"));
        assertEquals(21 * correctScore * 10, d.addStep("Perfect"));
        assertEquals(28 * correctScore * 10, d.addStep("Perfect"));
        assertEquals(36 * correctScore * 10, d.addStep("Perfect"));
        assertEquals(45 * correctScore * 10, d.addStep("Perfect"));
        assertEquals(55 * correctScore * 10, d.addStep("Perfect"));
        assertEquals(66 * correctScore * 10, d.addStep("Perfect"));
        assertEquals(10000000, d.addStep("Perfect"));
        assertEquals("SSS", d.getStageGrade());
    }

// ****************  GolombRulerValidator
    public void testGolombRulerValidator01() {
        GolombRulerValidator grv = new GolombRulerValidator( new ArrayList<Integer>(Arrays.asList(0, 1, 2)) );
        assertEquals(false, grv.isValid());

        grv = new GolombRulerValidator( new ArrayList<Integer>(Arrays.asList(0, 1, 3)) );
        assertEquals(true, grv.isValid());
        assertEquals("[1, 2, 3]", grv.distances().toString());
    }

// ****************  GorgoneaQuarta
    public void testGorgoneaQuartaTest01() {
        assertEquals(10, GorgoneaQuarta.toDecimal("101"));
        assertEquals(-17, GorgoneaQuarta.toDecimal("-101"));
        assertEquals(2, GorgoneaQuarta.toDecimal("1-"));
        assertEquals(42, GorgoneaQuarta.toDecimal("1---0"));
        assertEquals(1024, GorgoneaQuarta.toDecimal("111-0-1"));

        assertEquals("101", GorgoneaQuarta.toGQ(10));
        assertEquals("-101", GorgoneaQuarta.toGQ(-17));
        assertEquals("1-", GorgoneaQuarta.toGQ(2));
        assertEquals("1---0", GorgoneaQuarta.toGQ(42));
        assertEquals("111-0-1", GorgoneaQuarta.toGQ(1024));
    }

// ****************  HarshadNumbers
    public void testHarshadNumbers01() {
        assertEquals(true, HarshadNumbers.isHarshadNumberInBase(60, 10));
        assertEquals(false, HarshadNumbers.isHarshadNumberInBase(61, 10));
        assertEquals(true, HarshadNumbers.isHarshadNumberInBase(16, 16));
        assertEquals(false, HarshadNumbers.isHarshadNumberInBase(16, 10));
        assertEquals(false, HarshadNumbers.isHarshadNumberInBase(16, 11));
        assertEquals(true, HarshadNumbers.isHarshadNumberInBase(36, 16));
    }

// ****************  PracticalNumbers
    public void testPracticalNumbers00() {
        assertEquals(true, PracticalNumbers.isPracticalNumber(1));
        assertEquals(false, PracticalNumbers.isPracticalNumber(2));
        assertEquals(false, PracticalNumbers.isPracticalNumber(3));
        assertEquals(false, PracticalNumbers.isPracticalNumber(4));
        assertEquals(false, PracticalNumbers.isPracticalNumber(5));
        assertEquals(true, PracticalNumbers.isPracticalNumber(6));
        assertEquals(false, PracticalNumbers.isPracticalNumber(7));
        assertEquals(false, PracticalNumbers.isPracticalNumber(8));
        assertEquals(false, PracticalNumbers.isPracticalNumber(9));
        assertEquals(true, PracticalNumbers.isPracticalNumber(48)); //add another true
    }

// ****************  SoundexEncoder
    public void testSoundexEncoder01() {
        assertEquals("V230", SoundexEncoder.encode("Vegeta"));
        assertEquals("W213", SoundexEncoder.encode("Wikipedia"));
        assertEquals("D100", SoundexEncoder.encode("Dubya"));
        assertEquals("S315", SoundexEncoder.encode("Stepmania"));
        assertEquals("B216", SoundexEncoder.encode("Bookkeeper"));
        assertEquals("S365", SoundexEncoder.encode("Strength"));
        assertEquals("V414", SoundexEncoder.encode("VolleyBall"));
        assertEquals("Y220", SoundexEncoder.encode("yCCHjk"));
    }

// ****************  TicTacToe
    public void testTicTacToe02() {    // find a winning move
    	Grid ttt = new Grid(3,3);
        ttt.addMark(new Location(0, 0), "O");
        ttt.addMark(new Location(1, 0), "O");
        ttt.addMark(new Location(1, 1), "X");
        ttt.addMark(new Location(2, 0), "X");
        TicTacToe game = new TicTacToe(ttt);
        assertEquals(new Location(0, 2), game.nextMarkForPlayerX());
    }
    
// ****************  TriangularNumberDecomposition
    public void testTriangularNumberDecomposition01() {
    	NumberDecomposition nd1 = new NumberDecomposition (12, 13, 15);
    	NumberDecomposition nd2 = new NumberDecomposition (12, 13, 14);
        assertEquals(true, nd1.equals(nd1));
        assertEquals(false, nd1.compareTo(nd2) < 0);
        assertEquals(false, nd1.compareTo(nd2) == 0);
        assertEquals(true, nd1.compareTo(nd2) > 0);

    	NumberDecomposition ans = new NumberDecomposition (10, 10);
        assertEquals(ans, TriangularNumberDecomposition.decompose(20));
    	ans = new NumberDecomposition (15);
        assertEquals(ans, TriangularNumberDecomposition.decompose(15));
    	ans = new NumberDecomposition (1, 3, 15);
        assertEquals(ans, TriangularNumberDecomposition.decompose(19));
    	ans = new NumberDecomposition (15, 15);
        assertEquals(ans, TriangularNumberDecomposition.decompose(30));
    }

// ****************  ZorkGoesPostal
    public void testZorkGoesPostal01() {
        assertEquals(20 + 5, ZorkGoesPostal.calculatePostage(15.7, 2.5, 6.98, 1.23, "Zork Air Mail"));
        assertEquals(10, ZorkGoesPostal.calculatePostage(15.7, 2.5, 6.98, 0.23, "First-Class"));
        assertEquals(4, ZorkGoesPostal.calculatePostage(15.7, 2.5, 6.98, .923, "Third-Class"));   // 4
    }
}