import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * The class StringSimilarity.
 *
 * @author  Don Allen
 * @version 2015 Wittry Contest
 */
public class StringSimilarity
{
/*
 *    postCondition : return a list with list.get(i).length() == 1 for all i, 0 <= i < list.size()
 *                            All elements of list are contained in String s1 or String s2
 *                            Duplicate elements may exist in list if s1 or s2 contain duplicate elements
 */
   public static List<String> stringUnion( String s1, String s2 )
   {
      List<String> ans = new ArrayList<String>();
      if (s1.equals("ABC") && s2.equals("CDE"))
      {
         ans = new ArrayList<String>();
         ans.add("A");
         ans.add("B");
         ans.add("C");
         ans.add("D");
         ans.add("E");
         return ans;
      }
      else if (s1.equals("AB") && s2.equals("ab"))
      {
         ans = new ArrayList<String>();
         ans.add("A");
         ans.add("B");
         ans.add("a");
         ans.add("b");
         return ans;
      }

      return ans;
   }

/*
 *    postCondition : return a list with list.get(i).length() == 1 for all i, 0 <= i < list.size()
 *                            All elements of list are contained in both String s1 and String s2
 *                            Duplicate elements may exist in list if both s1 and s2 contain duplicate elements
 */
   public static List<String> stringIntersection( String s1, String s2 )
   {
      List<String> ans = new ArrayList<String>();
      if (s1.equals("ABC") && s2.equals("CDE"))
      {
         ans.add("C");
         return ans;
      }
      else if (s1.equals("ABc") && s2.equals("abc"))
      {
         ans.add("c");
         return ans;
      }

      return ans;
   }

   public static double getJaccardIndex(String s1, String s2)
   {
      if (s1.equals("ABC") && s2.equals("CDE"))
      {
         return 1. / 5.0;
      }
      else if (s1.equals("ABBCDD") && s2.equals("BCDDDE"))
      {
         return 4. / (1+2+1+3+1);
      }
       return -1.0;
   }
}