import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TypeWriterStudentTest extends junit.framework.TestCase
{
   private static final String topRow = "qwertyuiopQWERTYUIOP";
   private static final String midRow = "asdfghjklASDFGHJKL";
   private static final String botRow = "ZXCCVBNMzxcvbnm";

   public void testTypewriter01()
   {
      TypeWriter tw = new TypeWriter();
      assertEquals(true, tw.usesLeftHand("am"));
      assertEquals(true, tw.usesRightHand("am"));
      assertEquals(false, tw.usesLeftHand("m"));
      assertEquals(false, tw.usesRightHand("a"));

      assertEquals(true, tw.usesOnlyLeftHand("stewardesses"));
      assertEquals(false, tw.usesOnlyLeftHand("stewardessesy"));

      assertEquals(true, tw.usesOnlyRightHand("monimolimnion"));
      assertEquals(false, tw.usesOnlyRightHand("amonimolimnion"));
      assertEquals(true, tw.usesBothLeftAndRightHand("am"));

      assertEquals(true, tw.usesTopRow("1 fish"));
      assertEquals(true, tw.usesMiddleRow("amonimolimnion"));
      assertEquals(true, tw.usesBottomRow("amonimolimnion"));

      assertEquals(false, tw.usesTopRow("1 fsh"));
      assertEquals(false, tw.usesMiddleRow("monimoimnion"));
      assertEquals(false, tw.usesBottomRow("atoil"));

      assertEquals(true, tw.usesOnlyTopRow("iriueowqpqQWREIOPTIOW"));
      assertEquals(true, tw.usesOnlyMiddleRow("asdfjlfDFSLKHASLKF"));
      assertEquals(true, tw.usesOnlyBottomRow("MCBNVNMZncmxzmvbz,m"));

      assertEquals(false, tw.usesOnlyTopRow("iriueowqpqQaWREIOPTIOW"));
      assertEquals(false, tw.usesOnlyMiddleRow("asdfjlfDFiSLKHASLKF"));
      assertEquals(false, tw.usesOnlyBottomRow("MCBNVNMZnclmxzmvbz,m"));
    }
}