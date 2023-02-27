import java.util.*;

/**
 * The  StudentTester class
 *
 * @author  2007 SC Programming Contest
 * @version (a version number or a date)
 */
public class StudentTester extends junit.framework.TestCase
{
// ****************  RationaNumber
	public void testRationaNumber01()
	{
	    RepeatingDecimalString rd = new RepeatingDecimalString("3", "18");
	    RationalFraction rf = new RationalFraction(rd);
	    assertEquals(true, rf.equals(new RationalFraction(7, 22)));
    }

// ****************  Maya Calender
	public void testTzolkinCalender01()
	{
        HaabCalendar hc = new HaabCalendar(0, "pop", 0);
        TzolkinCalendar result = hc.changeCalendar();
        TzolkinCalendar ans = new TzolkinCalendar(1, "imix", 0);
        assertEquals(true, ans.equals(result));

        hc = new HaabCalendar(10, "zac", 0);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(3, "chuen", 0);
        assertEquals(true, ans.equals(result));

        hc = new HaabCalendar(10, "zac", 1995);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(9, "cimi", 2801);
        assertEquals(true, ans.equals(result));

        hc = new HaabCalendar(0, "pop", 1);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(2, "cimi", 1);
        assertEquals(true, ans.equals(result));
    }

// ****************  Translator
	public void testTranslator01()
	{
       String[] dictionary = {"PROGRAMMING", "LOVE", "COMPUTER", "CONTEST"};
       String[] story = {"I", "ELVO", "OREPMTCU", "ROMNRGMPIGA", "ESNCTTO"};
       
       String[] solution = {"I", "LOVE", "COMPUTER", "PROGRAMMING", "CONTEST"};
       
       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
          assertEquals(word, solution[index]);
          index++;
        }
    }

// ****************  RationalCounter - count on Cantor
	public void testRationalCounter01()
	{
		Fraction f1 = new Fraction(2, 1);
		Fraction ans = RationalCounter.getFraction(3);
	    assertEquals(ans.getNumerator(), 2);
		assertEquals(ans.getDenominator(), 1);

		f1 = new Fraction(2, 4);
		ans = RationalCounter.getFraction(14);
	    assertEquals(ans.getNumerator(), 2);
		assertEquals(ans.getDenominator(), 4);

		f1 = new Fraction(1, 4);
		ans = RationalCounter.getFraction(7);
	    assertEquals(ans.getNumerator(), 1);
		assertEquals(ans.getDenominator(), 4);
    }

// ****************  Permalex
	public void testPermalex01()
	{
	    assertEquals(15, Permalex.answer("bacaa"));
	    assertEquals(1, Permalex.answer("abc"));
	    assertEquals(6, Permalex.answer("cba"));
    }

// ****************  PascalRealConstan
	public void testPascalRealConstants01()
	{
        assertEquals(true, PascalRealConstants.isValid("1.2"));
        assertEquals(false, PascalRealConstants.isValid("1."));
        assertEquals(false, PascalRealConstants.isValid("E-12"));
        assertEquals(true, PascalRealConstants.isValid("1.0e-55"));
        assertEquals(true, PascalRealConstants.isValid("1e-12"));
        assertEquals(true, PascalRealConstants.isValid("+4.1234567890E-99999"));
        assertEquals(false, PascalRealConstants.isValid("7.6e+12.5"));
        assertEquals(false, PascalRealConstants.isValid("99"));
        assertEquals(false, PascalRealConstants.isValid("6.5E"));
    }

// ****************  Maximun Sum
	public void testMaximumSum01()
	{
        ArrayList<Integer> row0 = new ArrayList<Integer>();
        row0.add(new Integer(0));
        row0.add(new Integer(-2));
        row0.add(new Integer(-7));
        row0.add(new Integer(0));
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        row1.add(new Integer(9));
        row1.add(new Integer(2));
        row1.add(new Integer(-6));
        row1.add(new Integer(2));
        ArrayList<Integer> row2 = new ArrayList<Integer>();
        row2.add(new Integer(-4));
        row2.add(new Integer(1));
        row2.add(new Integer(-4));
        row2.add(new Integer(2));
        ArrayList<Integer> row3 = new ArrayList<Integer>();
        row3.add(new Integer(-1));
        row3.add(new Integer(8));
        row3.add(new Integer(0));
        row3.add(new Integer(-2));
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(row0);
		arr.add(row1);
		arr.add(row2);
		arr.add(row3);
		MaximumSum array1 = new MaximumSum(arr);
	    assertEquals(15, array1.sum());
    }

// ****************  Dole Queue
	public void testDoleQueue01()
	{
		String[] apps = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		DoleQueue dq = new DoleQueue(apps, 4, 3);
		String[] results = dq.removeApplicants();
		ArrayList<String> CorrectResults = new ArrayList<String>();

		CorrectResults.add("D");
		CorrectResults.add("H");
		CorrectResults.add("I");
		CorrectResults.add("E");
		CorrectResults.add("C");
		CorrectResults.add("A");
		CorrectResults.add("B");
		CorrectResults.add("F");
		CorrectResults.add("J");
		CorrectResults.add("G");
		for(int j = 0; j < CorrectResults.size(); j++)
           assertEquals(CorrectResults.get(j), results[j]);
    }

// ****************  War
	public void testGameOfWar01()
	{
	    for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    	    Card card1 = new Card("2", "spade");
    		Card card2 = new Card("4", "club");
    		Card card3 = new Card("jack", "diamond");
    		Card card4 = new Card("5", "heart");
    		Card card5 = new Card("2", "spade");
    		Card[] handA = {card1, card2, card3, card4, card5};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("you", hand1);
    
    		card1 = new Card("5", "club");
    		card2 = new Card("7", "diamond");
    		card3 = new Card("queen", "diamond");
    		card4 = new Card("9", "heart");
    		card5 = new Card("10", "spade");
    		Card[] handB = {card1, card2, card3, card4, card5};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("me", hand2);
    		Player[] ps = {p1, p2};
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("me", game.findGameWinner());
        }
	}
	
// ****************  MasterMind
	public void testMasterMind01()
	{
	    MasterMind mm = new MasterMind();
	    assertEquals(true, mm.isValidGuess("AQCW"));
	    mm.addGuessToHistory(new GuessResult("ABCD", 0, 2));
	    assertEquals(true, mm.isValidGuess("AQCW"));
	    assertEquals(false, mm.isValidGuess("QAWC"));

	    mm = new MasterMind();
	    assertEquals(true, mm.isValidGuess("ABCD"));
	    mm.addGuessToHistory(new GuessResult("ABCD", 0, 0));
	    assertEquals(false, mm.isValidGuess("WAQC"));
	    assertEquals(true, mm.isValidGuess("EFGH"));
    }
}