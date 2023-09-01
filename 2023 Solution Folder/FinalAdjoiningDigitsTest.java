import java.util.*;

/**
 * The test class
 *
 * @author  Don Allen
 * @version 2023 Wittry programming contest
 */
public class FinalAdjoiningDigitsTest extends junit.framework.TestCase
{
   public void testAdjoiningDigits01()
   {
       assertEquals(true, AdjoiningDigits.isDivisibleBy(100, new int[] {2, 5, 50}));
       assertEquals(false, AdjoiningDigits.isDivisibleBy(100, new int[] {2, 5, 2*3*5}));

       assertEquals(50, AdjoiningDigits.getLCM(new int[] {2, 5, 50}));
       assertEquals(2*3*5, AdjoiningDigits.getLCM(new int[] {2, 5, 15, 2*3*5}));
       assertEquals(3*5*7, AdjoiningDigits.getLCM(new int[] {3, 5, 7}));

       assertEquals(377, AdjoiningDigits.adjoinDigits(77, 1, new int[] {13, 29} ));
       assertEquals(3289, AdjoiningDigits.adjoinDigits(32, 2, new int[] {11, 13, 23} ));
       assertEquals(155232, AdjoiningDigits.adjoinDigits(523, 3, new int[] {7, 8, 9} ));
       assertEquals(1050, AdjoiningDigits.adjoinDigits(50, 2, new int[] {2, 5} ));
   }

   public void testIsDivisibleBy02()
   {
       assertEquals(true, AdjoiningDigits.isDivisibleBy(2*3*7*13, new int[] {2, 3, 7, 13}));
       assertEquals(false, AdjoiningDigits.isDivisibleBy(2*3*7*13, new int[] {2, 3, 7, 13, 5}));
   }

   public void testIsDivisibleBy03()
   {
       assertEquals(true, AdjoiningDigits.isDivisibleBy(5*373*619*887, new int[] {5, 373}));
       assertEquals(true, AdjoiningDigits.isDivisibleBy(5*373*619*887, new int[] {5, 373, 619, 887}));
       assertEquals(false, AdjoiningDigits.isDivisibleBy(5*373*619*887, new int[] {2}));
       assertEquals(false, AdjoiningDigits.isDivisibleBy(5*373*619*887, new int[] {3}));
   }

   public void testGetLCM04()
   {
       assertEquals(2*2*2*3*3*3*3*5*5*5*7, AdjoiningDigits.getLCM(new int[] {2*5*5*5, 2*2*2*3*5*5, 2*3*3*3*3*7}));
       assertEquals(/*838860*/ 4*3*5*11*31*41, AdjoiningDigits.getLCM(new int[] {2*5*11, 6*41*2, 12*55*31}));
   }

   public void testGetLCM05()
   {
       assertEquals(2, AdjoiningDigits.getLCM(new int[] {1, 2}));
       assertEquals(2*3*5*7*11*13*17, AdjoiningDigits.getLCM(new int[] {2, 3, 5, 7, 11, 13, 17}));
   }

   public void testIsDivisibleByGetLCM06()
   {
       assertEquals(false, AdjoiningDigits.isDivisibleBy(2*103*211*467, new int[] {4, 3, 211, 467}));
       assertEquals(true, AdjoiningDigits.isDivisibleBy(5*11*19*23*43, new int[] {5, 19, 23, 43}));

       assertEquals(2*2*3*5*5*23, AdjoiningDigits.getLCM(new int[] {1, 12, 23, 25, 75, 23*25}));
   }

   public void testAdjoinDigits07()
   {
       assertEquals(231, AdjoiningDigits.adjoinDigits(23, 1, new int[] {3, 7, 11} ));
       assertEquals(1352, AdjoiningDigits.adjoinDigits(352, 1, new int[] {4, 26, 13, 52} ));
   }

   public void testAdjoinDigits08()
   {
       assertEquals(2394, AdjoiningDigits.adjoinDigits(23, 2, new int[] {7, 18, 19} ));
       assertEquals(10353, AdjoiningDigits.adjoinDigits(353, 2, new int[] {3, 7, 17, 21, 29} ));
       assertEquals(28080, AdjoiningDigits.adjoinDigits(808, 2, new int[] {27, 16, 65} ));
   }

   public void testAdjoinDigits09()
   {
       assertEquals(1764, AdjoiningDigits.adjoinDigits(4, 3, new int[] {2, 9, 49} ));
       assertEquals(287547, AdjoiningDigits.adjoinDigits(754, 3, new int[] {3, 13, 73, 101, 73*101} ));
       assertEquals(243948, AdjoiningDigits.adjoinDigits(439, 3, new int[] {2, 29, 4, 4*29, 701, 3} ));
       assertEquals(10057, AdjoiningDigits.adjoinDigits(10, 3, new int[] {89, 113} ));
   }

   public void testAdjoinDigits10()
   {
       assertEquals(121464, AdjoiningDigits.adjoinDigits(21, 4, new int[] {7, 8, 9} ));
       assertEquals(1002573, AdjoiningDigits.adjoinDigits(73, 5, new int[] {11, 13} ));
       assertEquals(7227081, AdjoiningDigits.adjoinDigits(0, 6, new int[] {937, 857, 9} ));
   }
}