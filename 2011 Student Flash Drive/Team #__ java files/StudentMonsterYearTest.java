import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentMonsterYearTest extends junit.framework.TestCase
{
   public void testMonsterYear01()
   {
       assertEquals(true, MonsterYear.isMonsterYear(1978));
       assertEquals(false, MonsterYear.isMonsterYear(1979));

       int[] temp = MonsterYear.getMonsterYearBetween(1800, 2000);
       int[] ans = {1868, 1978};
       assertEquals(ans.length, temp.length);
       for (int k = 0; k < ans.length; k++)
          assertEquals(ans[k], temp[k]);
   }
}