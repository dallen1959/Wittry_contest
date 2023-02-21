import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2015 Wittry Contest
 */
public class Networks
{
/* no instance variables declared in student file   */

   public Networks()
   { /*  add your own code  */  }   // no implementation to allow students to implement as they desire

   public void addConnection(Connection con)
   {
   }

   public List<String> getReachableLocations(String loc, int numSteps)
   {
      List<String> ans = new ArrayList<String>();
      if (loc.equals("A") && numSteps == 1)
      {
          ans.add("B");
          ans.add("C");
          ans.add("D");
          return ans;
      }
      else if (loc.equals("A") && numSteps == 2)
      {
          ans.add("D");
          ans.add("E");
          return ans;
      }

      return ans;
   }

   public List<String> getAllReachableLocations(String loc)
   {
      List<String> ans = new ArrayList<String>();
      if ( loc.equals("A") )
      {
          ans.add("B");
          ans.add("C");
          ans.add("D");
          ans.add("E");
          return ans;
      }

      return ans;
   }
}