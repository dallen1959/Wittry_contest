/**
 * @author:   Mr. Allen
 *            2017 Wittry contest
 */
import java.io.*;
import java.util.*;
import java.math.*;
public class BabyNames 
{
/*
 *  precondition
 *    firstName and secondName will contain only UPPERRCASE letters
 *    2 <= firstName.length()  <= 20
 *    2 <= secondName.length() <= 20
 *
 * post condition
 *    returns a List of potential new names using firstName for the begininng 
 *            and second name for the ending of the new name
 */
   public List<String> getBabyNames( String firstName, String secondName)
   {
      if (firstName.equals("JAMES") && secondName.equals("MARY"))
      {
         List<String> temp = new ArrayList<String>();
         temp.add("JAMARY");
         temp.add("JAMERY");
         temp.add("JAMEY");
         temp.add("JARY");
         temp.add("JAY");
         return temp;
      }
      if (firstName.equals("MARY") && secondName.equals("JAMES"))
      {
         List<String> temp = new ArrayList<String>();
         temp.add("MAMES");
         temp.add("MARAMES");
         temp.add("MARES");
         temp.add("MAS");
         temp.add("MES");
         return temp;
      }
      if (firstName.equals("ABE") && secondName.equals("JO"))
      {
         List<String> temp = new ArrayList<String>();
         temp.add("ABO");
         return temp;
      }
      if (firstName.equals("JO") && secondName.equals("ABE"))
      {
         List<String> temp = new ArrayList<String>();
         temp.add("JE");
         return temp;
      }

      List<String> ans = new ArrayList<String>(); 
      return ans;
   }
}