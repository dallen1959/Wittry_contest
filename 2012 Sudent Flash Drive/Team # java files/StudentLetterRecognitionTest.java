import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentLetterRecognitionTest extends junit.framework.TestCase
{
   public void testLetterRecognition01()
   {
      LetterRecognition lr = new LetterRecognition();

      assertEquals("A", lr.getLetter(let_A));
      assertEquals("IA", lr.getWord(let_IA));
   }

   String[][] let_A = { {" ", "X", "X", " "},
                        {"X", " ", " ", "X"},
                        {"X", " ", " ", "X"},
                        {"X", "X", "X", "X"},
                        {"X", " ", " ", "X"},
                        {"X", " ", " ", "X"},
                        {"X", " ", " ", "X"} };

   String[][] let_IA = { {"X", "X", "X", "X", "X", " ", " ", "X", "X", " "},
                        {" ", " ", "X", " ", " ", " ", "X", " ", " ", "X"},
                        {" ", " ", "X", " ", " ", " ", "X", " ", " ", "X"},
                        {" ", " ", "X", " ", " ", " ", "X", "X", "X", "X"},
                        {" ", " ", "X", " ", " ", " ", "X", " ", " ", "X"},
                        {" ", " ", "X", " ", " ", " ", "X", " ", " ", "X"},
                        {"X", "X", "X", "X", "X", " ", "X", " ", " ", "X"} };
}