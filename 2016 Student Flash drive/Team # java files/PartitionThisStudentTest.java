import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2016 Wittry programming contest
 */
public class PartitionThisStudentTest extends junit.framework.TestCase
{
   public void testPartitionThis01()
   {
      assertEquals(4, PartitionThis.sumDigits(103));
      assertEquals(6, PartitionThis.sumDigits(-24));
      assertEquals(9+2+3+7, PartitionThis.sumDigits(-9237));
      assertEquals(1+5+0+8+6, PartitionThis.sumDigits(15086));
      assertEquals(true, PartitionThis.isPartitionable(415041131, 5));
      assertEquals(true, PartitionThis.isPartitionable(410250101, 7));
      assertEquals(false, PartitionThis.isPartitionable(415041132, 5));

      assertEquals(0, PartitionThis.minPartitionDegree(0));
      assertEquals(5, PartitionThis.minPartitionDegree(415041131));
      assertEquals(28, PartitionThis.minPartitionDegree(3054628));
   }
}