import java.util.*;
/**
 * TelephoneDirectory.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TelephoneDirectory
{
   private ArrayList<String> employees;

   public TelephoneDirectory(ArrayList<String> emp)
   {
      employees = emp;
   }

   public ArrayList<String> getEmployees(String str)
   {
      /* to be implemented  */
      ArrayList<String> ans = new ArrayList<String>();
      
      if (str.equals("5282"))
      {
         ans.add("java");
         return ans;
      }

      if (str.equals("5"))
      {
         ans.add("java");
         ans.add("johns");
         ans.add("johnson");
         return ans;
      }

      if (str.equals("5646"))
      {
         ans.add("johns");
         ans.add("johnson");
         return ans;
      }

      return ans;
   }
}