import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2018 Wittry programming contest
 */
public class CoolAndWorthyStudentTest extends junit.framework.TestCase
{
   public void testCoolAndWorthy01()
   {
      assertEquals(false, CoolAndWorthy.noConsecutiveVowels("vacuum"));
      assertEquals(true, CoolAndWorthy.noConsecutiveVowels("flyby"));

      assertEquals(true, CoolAndWorthy.noCommonlyUsedBigrams("cattree"));
      assertEquals(false, CoolAndWorthy.noCommonlyUsedBigrams("biometer"));

      assertEquals(false, CoolAndWorthy.containsSeldomUsedLetters("computer"));
      assertEquals(true, CoolAndWorthy.containsSeldomUsedLetters("obvious"));
      assertEquals(true, CoolAndWorthy.containsSeldomUsedLetters("tortrix"));
      assertEquals(true, CoolAndWorthy.containsSeldomUsedLetters("dekko"));

      assertEquals(true, CoolAndWorthy.containsTallShortAndDigLetters("alfaqui"));
      assertEquals(false, CoolAndWorthy.containsTallShortAndDigLetters("factoid"));
      assertEquals(false, CoolAndWorthy.containsTallShortAndDigLetters("pigmy"));

      assertEquals(9, CoolAndWorthy.getNumDistinctLetters("circumlocution"));
      assertEquals(6, CoolAndWorthy.getNumDistinctLetters("acumen"));

      assertEquals(true, CoolAndWorthy.isWordCool("alfaqui"));
      assertEquals(false, CoolAndWorthy.isWordCool("factoid"));

      assertEquals(false, CoolAndWorthy.isWordWorthy("alfaqui"));
      assertEquals(true, CoolAndWorthy.isWordWorthy("buzzwigs"));
      assertEquals(true, CoolAndWorthy.isWordWorthy("conjugately"));
      assertEquals(false, CoolAndWorthy.isWordWorthy("conjuahely"));

      List<String> listAns = CoolAndWorthy.makeWorthy("conjuahely", "x");
      assertEquals(2, listAns.size());
      assertEquals(true, listAns.contains("conjuahxely"));
      assertEquals(true, listAns.contains("conjuxahely"));


      listAns = CoolAndWorthy.makeWorthy("factoid", "sg");
      assertEquals(1, listAns.size());
      assertEquals(true, listAns.contains("factosgid"));
   }  
}