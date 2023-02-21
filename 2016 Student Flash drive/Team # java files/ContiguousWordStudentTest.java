import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2016 Wittry programming contest
 */
public class ContiguousWordStudentTest extends junit.framework.TestCase
{
   public void testContiguousWord01()
   {
      ContiguousWord cw = new ContiguousWord();

      assertEquals(true, cw.isContiguousWord("aaabb"));
      assertEquals(true, cw.isContiguousWord("abc"));
      assertEquals(false, cw.isContiguousWord("bitotsav"));

//  testers for 2      
      List<String> segment1 = new ArrayList<String>();
      segment1.add("ac");
      segment1.add("ca");
      List<String> ans = cw.buildContiguousWord(segment1);
      assertEquals(0, ans.size());

//  testers for 3
      List<String> segment2 = new ArrayList<String>();
      segment2.add("zzzz");
      segment2.add("zz");
      segment2.add("z");
      ans = cw.buildContiguousWord(segment2);
      assertEquals(1, ans.size());
      assertEquals("zzzzzzz", ans.get(0));

//  testers for 4
      List<String> segment3 = new ArrayList<String>();
      segment3.add("r");
      segment3.add("o");
      segment3.add("a");
      segment3.add("r");
      ans = cw.buildContiguousWord(segment3);
      assertEquals(6, ans.size());
      assertEquals(true, ans.contains("aorr"));
      assertEquals(true, ans.contains("oarr"));
      assertEquals(true, ans.contains("arro"));
      assertEquals(true, ans.contains("orra"));
      assertEquals(true, ans.contains("rroa"));
      assertEquals(true, ans.contains("rrao"));

//  testers for 5
      List<String> segment4 = new ArrayList<String>();
      segment4.add("r");
      segment4.add("o");
      segment4.add("a");
      segment4.add("r");
      segment4.add("a");
      ans = cw.buildContiguousWord(segment4);
      assertEquals(6, ans.size());
      assertEquals(true, ans.contains("aaorr"));
      assertEquals(true, ans.contains("oaarr"));
      assertEquals(true, ans.contains("aarro"));
      assertEquals(true, ans.contains("orraa"));
      assertEquals(true, ans.contains("rroaa"));
      assertEquals(true, ans.contains("rraao"));
   }
}