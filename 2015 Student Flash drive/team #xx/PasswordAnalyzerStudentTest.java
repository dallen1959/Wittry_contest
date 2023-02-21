import java.util.*;

/**
import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2015 Wittry programming contest
 */
public class PasswordAnalyzerStudentTest extends junit.framework.TestCase
{
   public void testPasswordAnalyzer01()
   {
      PasswordAnalyzer pwa = new PasswordAnalyzer();

      assertEquals(false, pwa.isValid("pass word"));
      assertEquals(true, pwa.isValid("computer123456789ABC!!!!!"));

      assertEquals(3*2, pwa.getLengthBonus("brrrItIscold!!!!!"));
      assertEquals(7*2+ 6, pwa.getLengthBonus("computer123456789ABC!!!!!"));
      assertEquals(2*2, pwa.getLengthBonus("<#CS$$2004?>"));
      assertEquals(15, pwa.getLengthBonus("i.luv.programming"));
      assertEquals(19, pwa.getLengthBonus("<2015@Wittry@Contest>"));

      assertEquals(2+5, pwa.getUpperCaseBonus("<#CS$$2004?>"));
      assertEquals(5+5, pwa.getUpperCaseBonus("UPPERlower"));
      assertEquals(2+5, pwa.getUpperCaseBonus("CS12345678"));
      assertEquals(0+5, pwa.getUpperCaseBonus("i.luv.programming"));
      assertEquals(2+5, pwa.getUpperCaseBonus("<2015@Wittry@Contest>"));

      assertEquals(2+5, pwa.getDigitBonus("@Digit27"));
      assertEquals(4+5, pwa.getDigitBonus("<#CS$$2004?>"));
      assertEquals(0+5, pwa.getDigitBonus("i.luv.programming"));
      assertEquals(4+5, pwa.getDigitBonus("<2015@Wittry@Contest>"));

      assertEquals(3+5, pwa.getSymbolBonus("@Symbol!!"));
      assertEquals(6+5, pwa.getSymbolBonus("<#CS$$2004?>"));
      assertEquals(2+5, pwa.getSymbolBonus("i.luv.programming"));
      assertEquals(4+5, pwa.getSymbolBonus("<2015@Wittry@Contest>"));

      assertEquals(1, pwa.getCombinationBonus("@Symbol!!"));
      assertEquals(3, pwa.getCombinationBonus("<#CS$$2004?>"));
      assertEquals(2, pwa.getCombinationBonus("i.luv.programming"));
      assertEquals(4, pwa.getCombinationBonus("<2015@Wittry@Contest>"));

      assertEquals(50, pwa.getPoints("word"));
      assertEquals(50+4+7+9+11+3/*72*/, pwa.getPoints("<#CS$$2004?>"));
      assertEquals("rejected", pwa.getRating("word"));
      assertEquals(84, pwa.getPoints("i.luv.programming"));
      assertEquals(98, pwa.getPoints("<2015@Wittry@Contest>"));
      assertEquals("average", pwa.getRating("i.luv.programming"));
      assertEquals("good", pwa.getRating("<2015@Wittry@Contest>"));
   }
}