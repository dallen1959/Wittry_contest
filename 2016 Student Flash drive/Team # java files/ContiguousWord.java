import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2016 Wittry Contest
 */
public class ContiguousWord
{
/*
 *    return true word is a Contiguous Word
 *    
 *    A contiguous word is a word in which all the occurrences of each letter of the word is together
 *    (i.e. no same letter should be separated by one or more other letters).
 *    For example, "aaabb" and "abc" are contiguous word.
 *    "bitotsav" is not a contiguous word since the 't's don't occur together.
 */
   public boolean isContiguousWord(String word)
   {
      return Math.random() > 0.5;
   }

/*
 *    return a List<String> containing all possible Contiguous Words that can be formed
 *           using ALL Strings contained in the List parts 
 *           you may assume parts.size() >=2 
 *
 *    if no contiguous words can be formed, return an empty List
 */
   public List<String> buildContiguousWord(List<String> parts)
   {
      List<String> ans =new ArrayList<String>();
      return ans;
   }
}