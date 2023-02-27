import java.util.*;

/**
 * The test class AnInterestingSequenceTest.
 *
 * @author  Don Allen
 * @version (a version number or a date)
 */
public class StudentAnInterestingSequenceTest extends junit.framework.TestCase
{
   public void testStamps01()
   {
      AnInterestingSequence seq = new AnInterestingSequence();

      assertEquals(4, seq.numberOfIterations(55));
      assertEquals(7, seq.minValueWithN_Iterations(4));
   }
}