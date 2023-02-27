import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentFaxMachineTest extends junit.framework.TestCase
{
   public void testFaxMachine01()
   {
      assertEquals("011111001000001111111000000",  // 3 8 0 1 14 0 -> 3 7 1 0 1 7 7 0 0
                                      FaxMachine.convertToRLE("0001000000001101000000000000001"));
      assertEquals("111101000000000111110000000",  // 12 0 0 0 13 0 0 -> 7 5 0 0 0 7 6 0 0
                                      FaxMachine.convertToRLE("0000000000001111000000000000011"));
      assertEquals("111101000000000111111001",  // 12 0 0 0 15 -> 7 5 0 0 0 7 7 1
                                      FaxMachine.convertToRLE("0000000000001111000000000000000"));
      assertEquals("111111111111011",  // 31 -> 7 7 7 7 3
                                      FaxMachine.convertToRLE("0000000000000000000000000000000"));
      assertEquals("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
                         /* 0 (x32) */      FaxMachine.convertToRLE("1111111111111111111111111111111"));

      assertEquals("0001000000001101000000000000001",  // 3 7 1 0 1 7 7 0 0 -> 3 8 0 1 14 0
                                      FaxMachine.RLEtoFax("011111001000001111111000000"));

      assertEquals("0000000000001111000000000000011",  // 7 5 0 0 0 7 6 0 0 -> 12 0 0 0 13 0 0
                                      FaxMachine.RLEtoFax("111101000000000111110000000"));

      assertEquals("0000000000001111000000000000000",  // 7 5 0 0 0 7 7 1 -> 2 0 0 0 15
                                      FaxMachine.RLEtoFax("111101000000000111111001"));
/*
      assertEquals("0000000000000000000000000000000",  // 7 7 7 7 3 -> 31
                                      FaxMachine.RLEtoFax("111111111111011"));

      assertEquals("1111111111111111111111111111111",  // 7 7 7 7 3 -> 31
       FaxMachine.RLEtoFax("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"));
*/   }
}