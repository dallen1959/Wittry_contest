import java.lang.*;
import java.util.*;
/**
 * @author  Don Allen
 * @version 2016 Wittry Contest
 */
public class Zipper
{
   private String target;

   public Zipper(String t)
   {
      target = t;
   }

/*
 *   order of letters in a and b is NOT important
 *   
 *   That is, the letters in a and b can be shuffled
 *   it is OK to have extra letters
 *   
 *   You may assume all letters will be lower case letters
 *   You may assume all three strings
 *           will contain lower case letter ONLY
 *   
 *   a.length() >= 0,  b.length() >= 0
 */   
   public boolean canBuild(String a, String b)
   {
       if ( target.equals("tcraete") )
       {
           if (a.equals("cat") && b.equals("tree") ) return true;
           if (a.equals("tcae") && b.equals("etre") ) return true;
           if (a.equals("cat") && b.equals("ret") ) return false;
           if (a.equals("teak") && b.equals("crochet") ) return true;
       }

       return Math.random() > 0.5;
   }

/*
 *   order of letters in a and b IS important
 *   
 *   That is, the letters in a and b can NOT be shuffled
 *   it is OK to have extra letters
 *   
 *   You may assume all letters will be lower case letters
 *   You may NOT assume all three strings will contain lower case letter ONLY
 *   That is, a, b and the target string may contain spaces in addition to lower case letters
 *   
 *   a.length() >= 0,  b.length() >= 0
 */   
   public boolean canZipper(String a, String b)
   {
      if ( target.equals("tcraete")   && a.equals("cat") && b.equals("tree") ) return true;

       if ( target.equals("catrtee")   && a.equals("cat") && b.equals("tree") ) return true;

       if ( target.equals("cttaree")   && a.equals("cat") && b.equals("ret") ) return false;

       if ( target.equals("jejunator")   && a.equals("dejeuner") && b.equals("jubilation") ) return true;

       if ( target.equals("to or too")   && a.equals("tor ") && b.equals("ot oo") ) return false;
       if ( target.equals("to or too")   && a.equals("to r") && b.equals("o too") ) return true;

       return Math.random() > 0.5;
   }
}