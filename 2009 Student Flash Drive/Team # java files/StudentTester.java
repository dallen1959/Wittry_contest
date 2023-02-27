import java.util.*;

/**
 * The  StudentTester class
 *
 * @author  2009 Dave Wittyr Memorial Programming Contest
 * @version (a version number or a date)
 */
public class StudentTester extends junit.framework.TestCase
{
// ****************  Biodiversity
   public void testBiodiversity01()
   {
      assertEquals(1, Biodiversity.getDiversity("AAAA"));
      assertEquals(3, Biodiversity.getDiversity("DDDDDDDDDDDDDDDDDDDDDDDDAAADDDDDAADDDDDAAADAAAA"));
      assertEquals(3, Biodiversity.getDiversity("AAADDDDDAADDDDDAAADAAAA"));
      assertEquals(1, Biodiversity.getDiversity("AAADDDDDAAADDDDDAAADAAADDDD"));
      assertEquals(2, Biodiversity.getDiversity("DDDDDDDAAAADDDDDAADDDDDAADAAAADDDDDD"));
   }

// ****************  FunctionsGoneWild
   public void testFunctionsGoneWild01()
   {
      assertEquals(91, FunctionsGoneWild.function_one(10));
      assertEquals(true, Math.abs(Math.abs(-26.0 - FunctionsGoneWild.function_two(-5))) < 0.05);
      assertEquals(true, Math.abs(2.0439481 - FunctionsGoneWild.function_three(1, 1, 1))<0.5);
      assertEquals(true, Math.abs(0.0 - FunctionsGoneWild.function_four(2, 1)) < 0.5);
      assertEquals(true, Math.abs(1941.227076 - FunctionsGoneWild.function_five(54321, 123.7)) < 0.5);
      assertEquals(true, Math.abs(10.75125008 - FunctionsGoneWild.function_six(2.3, 1, 3.0)) < 0.5);
   }

// ****************  HappyNumber
   public void testHappyNumber00()
   {
      HappyNumber h = new HappyNumber();

      assertEquals(true, h.isHappyNumber(7));
      assertEquals(true, h.isHappyNumber(496));
      assertEquals(false, h.isHappyNumber(17));
      assertEquals(false, h.isHappyNumber(477));
   }

// ****************  JarredsHomework
   public void testJarredsHomework00()
   {
      double [] boardValues = {5.99, 3.99, 16.99, 16.99, 27.99, 6.99, 13.25, 21.95, 89.9, 17.5, 1.19, 24.99, 69.99, 14.75, 350.0, 0 };
      JarredsHomework game = new JarredsHomework(boardValues);

      int [] rolls = { 4, 3, 4, 1, 4};
      double ans = 4*boardValues[3] + 3*boardValues[3+3] + 4*boardValues[3+3+4] + boardValues[3+3+4+1] + 4*boardValues[3+3+4+1+4];
      assertEquals(ans, game.playGame( rolls ));

      boolean flag = Math.abs(2724.86 - game.findMax()) < 0.0005;    // 2690.37
      assertEquals(true, flag);

      flag = Math.abs(41.89 - game.findMin()) < 0.0005;
      assertEquals(true, flag);
    }

// ****************  LongestPalindrome
   public void testLongestPalindrome01()
   {
      LongestPalindrome pal = new LongestPalindrome("racecar");
      assertEquals("racecar", pal.getLongestPalindrome());

      pal = new LongestPalindrome("dsffsdg kjab %Bkj.  abcbabCdcbaqwerewq.");
      assertEquals("abCdcba", pal.getLongestPalindrome());

      pal = new LongestPalindrome("Madam, I'm Adam");
      assertEquals("MadamImAdam", pal.getLongestPalindrome());
   }

// ****************  Planimeter
   public void testPlanimeter01()
   {
      Command[] com1 = {new Command("r", 2), new Command("u", 2), new Command("l", 2), new Command("d", 2) };
      Planimeter temp = new Planimeter(com1);
      assertEquals(8, temp.getPerimeter());
      assertEquals(true, temp.isClosedFigure());
      assertEquals(4, temp.getArea());

      Command[] com2 = {new Command("r", 3), new Command("u", 3), new Command("l", 3), new Command("d", 3) };
      temp = new Planimeter(com2);
      assertEquals(12, temp.getPerimeter());
      assertEquals(true, temp.isClosedFigure());
      assertEquals(9, temp.getArea());

      Command[] com3 = {new Command("r", 12), new Command("u", 1), new Command("l", 30),
           new Command("d", 1), new Command("r", 18) };
      temp = new Planimeter(com3);
      assertEquals(12+1+30+1+18, temp.getPerimeter());
      assertEquals(true, temp.isClosedFigure());
      assertEquals(30, temp.getArea());
      
      Command[] com4 = {new Command("r", 12), new Command("u", 1), new Command("l", 30),
           new Command("d", 1), new Command("r", 17) };
      temp = new Planimeter(com4);
      assertEquals(-1, temp.getPerimeter());
      assertEquals(false, temp.isClosedFigure());
      assertEquals(-1, temp.getArea());
    }

// ****************  RubriksCube
   public void testRubricsCube01()
   {
      RubriksCube cube = new RubriksCube();
      assertEquals("yellow", cube.getColorOfTopRowRightColumn());
      cube.topRowToTheRight();
      assertEquals("white", cube.getColorOfTopRowMiddleColumn());
      assertEquals("yellow", cube.getColorOfMiddleRowRightColumn());

      cube.leftColumnUp();
      assertEquals("yellow", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("red", cube.getColorOfBottomRowLeftColumn());
    }

// ****************  RunRunRunAroundNumbers
   public void testRunRunRunAroundNumbers01()
   {
      RunRunRunAroundNumbers rrr = new RunRunRunAroundNumbers();

      assertEquals(true, rrr.isRunRoundNumber(13));
      assertEquals(true, rrr.isRunRoundNumber(81362));
      assertEquals(true, rrr.isRunRoundNumber(913425));
      assertEquals(false, rrr.isRunRoundNumber(123));
      assertEquals(false, rrr.isRunRoundNumber(81111));
      assertEquals(false, rrr.isRunRoundNumber(83333));

      assertEquals(147, rrr.getNextRunAroundNumber(123));
      assertEquals(81236, rrr.getNextRunAroundNumber(81111));
      assertEquals(83491, rrr.getNextRunAroundNumber(83333));
   }

// ****************  TelephoneDirectory
   public void testTelephoneDirectory01()
   {
      ArrayList<String> employees = new ArrayList<String>();
      employees.add("java");
      employees.add("johns");
      employees.add("johnson");
      employees.add("smith");
      TelephoneDirectory td = new TelephoneDirectory(employees);

      ArrayList<String> sol = td.getEmployees("5282");
      assertEquals(1, sol.size());
      assertEquals("java", sol.get(0));

      sol = td.getEmployees("5");
      assertEquals(3, sol.size());
      assertEquals(true, sol.contains("java"));
      assertEquals(true, sol.contains("johns"));
      assertEquals(true, sol.contains("johnson"));

      sol = td.getEmployees("5646");
      assertEquals(2, sol.size());
      assertEquals(true, sol.contains("johns"));
      assertEquals(true, sol.contains("johnson"));
   }

// ****************  ZerosAndOnes
   public void testZerosAndOnes01()
   {
      ArrayList<Integer> sol = ZerosAndOnes.getNumbers(6, 3);
      int[] ans1 = { 42 };
      assertEquals(1, sol.size());
      for (int i = 0; i < ans1.length; i++)
         assertEquals(true, sol.contains(ans1[i]));

      sol = ZerosAndOnes.getNumbers(6, 4);
      int[] ans2 = { 32+16+8, 32+16+4, 32+8+4 };
      assertEquals(ans2.length, sol.size());
      for (int i = 0; i < ans2.length; i++)
         assertEquals(true, sol.contains(ans2[i]));

      sol = ZerosAndOnes.getNumbers(6, 2);
      int[] ans3 = { 32+16+8, 32+16+4, 32+8+4, 32+16+2, 32+8+2, 32+4+2 };
      assertEquals(ans3.length, sol.size());
      for (int i = 0; i < ans3.length; i++)
         assertEquals(true, sol.contains(ans3[i]));

      sol = ZerosAndOnes.getNumbers(8, 8);
      int[] ans4 = { 240, 232, 216, 184 };
      assertEquals(ans4.length, sol.size());
      for (int i = 0; i < ans4.length; i++)
         assertEquals(true, sol.contains(ans4[i]));
   }
}