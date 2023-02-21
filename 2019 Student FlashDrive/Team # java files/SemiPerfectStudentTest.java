public class SemiPerfectStudentTest extends junit.framework.TestCase
{
   public void testSemiPerfect01()
   {
       int[] divs = SemiPerfect.getDivisors(6);
       assertEquals(3, divs.length);
       assertEquals(1, divs[0]);
       assertEquals(2, divs[1]);
       assertEquals(3, divs[2]);

       assertEquals("9 is semiperfect", true, SemiPerfect.isSemiPerfect(6));
       assertEquals("96 is semiperfect", true, SemiPerfect.isSemiPerfect(96));
       assertEquals("106 is not semiperfect", false, SemiPerfect.isSemiPerfect(106));
       assertEquals("945 is not semiperfect", true, SemiPerfect.isSemiPerfect(945));
   }
}