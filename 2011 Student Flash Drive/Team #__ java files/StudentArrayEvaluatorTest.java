import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentArrayEvaluatorTest extends junit.framework.TestCase
{
   public void testArrayEvaluator00()
   {
      int[] h01 = { 2, 2, 2, 4, 5 };
      ArrayEvaluator ae = new ArrayEvaluator(h01);
      assertEquals(false, ae.isFiveOfAKind());
      assertEquals(false, ae.isLargeStraight());
      assertEquals(false, ae.isFourOfAKind());
      assertEquals(false, ae.isFullHouse());
      assertEquals(false, ae.isSmallStraight());
      assertEquals(true, ae.isThreeOfAKind());
      assertEquals(false, ae.isTwoPair());
      assertEquals(true, ae.isPair());
   }
}