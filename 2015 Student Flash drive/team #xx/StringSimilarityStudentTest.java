import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2015 Wittry programming contest
 */
public class StringSimilarityStudentTest extends junit.framework.TestCase
{
   public void testStringSimilarity01()
   {
      List<String> union = StringSimilarity.stringUnion("ABC", "CDE");
      assertEquals(5, union.size());
      assertEquals(true, union.contains("A"));
      assertEquals(true, union.contains("B"));
      assertEquals(true, union.contains("C"));
      assertEquals(true, union.contains("D"));
      assertEquals(true, union.contains("E"));

      List<String> intersection = StringSimilarity.stringIntersection("ABC", "CDE");
      assertEquals(1, intersection.size());
      assertEquals(false, intersection.contains("A"));
      assertEquals(false, intersection.contains("B"));
      assertEquals(true, intersection.contains("C"));
      assertEquals(false, intersection.contains("D"));
      assertEquals(false, intersection.contains("E"));
      
      assertEquals(1. / 5.0, StringSimilarity.getJaccardIndex("ABC", "CDE"), 0.005);
      assertEquals(4. / (1+2+1+3+1), StringSimilarity.getJaccardIndex("ABBCDD", "BCDDDE"), 0.005);

      union = StringSimilarity.stringUnion("AB", "ab");
      assertEquals(4, union.size());
      assertEquals(true, union.contains("A"));
      assertEquals(true, union.contains("B"));
      assertEquals(true, union.contains("a"));
      assertEquals(true, union.contains("b"));

      intersection = StringSimilarity.stringIntersection("ABc", "abc");
      assertEquals(1, intersection.size());
      assertEquals(true, intersection.contains("c"));
   }
}