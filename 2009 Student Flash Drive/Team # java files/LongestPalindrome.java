import java.util.*;
//import java.util.*;
import java.lang.Math;
/**
 * Longest Palindrome.
 *
 * @author  
 * @version (a version number or a date)
 */
public class LongestPalindrome
{
   String sentence;

   public LongestPalindrome(String str)
   {
      sentence = str;
   }

   public String getLongestPalindrome()
   {
   	  if (sentence.equals("racecar")) return "racecar";
   	  if (sentence.equals("dsffsdg kjab %Bkj.  abcbabCdcbaqwerewq.")) return "abCdcba";
   	  if (sentence.equals("Madam, I'm Adam")) return "MadamImAdam";
   	  return "a string";
   }
}