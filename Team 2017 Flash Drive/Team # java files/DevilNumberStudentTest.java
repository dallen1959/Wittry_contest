import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2017 Wittry programming contest
 */
public class DevilNumberStudentTest extends junit.framework.TestCase
{
   public void testDevilNumber01()
   {
      assertEquals(false, DevilNumbers.isDevilNumber(2));
      assertEquals(false, DevilNumbers.isDevilNumber(4305));
      assertEquals(false, DevilNumbers.isDevilNumber(714));
      assertEquals(false, DevilNumbers.isDevilNumber(471));
      assertEquals(false, DevilNumbers.isDevilNumber(18047));
      assertEquals(false, DevilNumbers.isDevilNumber(52370));

      assertEquals(true, DevilNumbers.isDevilNumber(76));
      assertEquals(true, DevilNumbers.isDevilNumber(472));
      assertEquals(true, DevilNumbers.isDevilNumber(111111));
      assertEquals(true, DevilNumbers.isDevilNumber(207060));
      assertEquals(true, DevilNumbers.isDevilNumber(273021));
      assertEquals(true, DevilNumbers.isDevilNumber(7152021));

      assertEquals(false, DevilNumbers.isTrueDevilNumber(472));
      assertEquals(false, DevilNumbers.isTrueDevilNumber(76));
      assertEquals(false, DevilNumbers.isTrueDevilNumber(720310));
      assertEquals(false, DevilNumbers.isTrueDevilNumber(43027));
      assertEquals(false, DevilNumbers.isTrueDevilNumber(10471));
      assertEquals(false, DevilNumbers.isTrueDevilNumber(52370));

      assertEquals(true, DevilNumbers.isTrueDevilNumber(452));
      assertEquals(true, DevilNumbers.isTrueDevilNumber(643));
      assertEquals(true, DevilNumbers.isTrueDevilNumber(111111));
      assertEquals(true, DevilNumbers.isTrueDevilNumber(20060));
      assertEquals(true, DevilNumbers.isTrueDevilNumber(213021));
      assertEquals(true, DevilNumbers.isTrueDevilNumber(9152021));

      assertEquals(-1, DevilNumbers.getLargestDevilNumber(5));
      assertEquals(720310, DevilNumbers.getLargestDevilNumber(720310));
      assertEquals(43093, DevilNumbers.getLargestDevilNumber(43095));
      assertEquals(1036, DevilNumbers.getLargestDevilNumber(1040));

      assertEquals(-1, DevilNumbers.getLargestTrueDevilNumber(4));
      assertEquals(111106, DevilNumbers.getLargestTrueDevilNumber(111110));
      assertEquals(6999, DevilNumbers.getLargestTrueDevilNumber(7060));
      assertEquals(216999, DevilNumbers.getLargestTrueDevilNumber(217819));
   }
}