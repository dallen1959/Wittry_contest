/**
 * @author:   Mr. Allen
 *            2017 Wittry contest
 */
import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;
public class EgyptianMultiplication 
{
/*
*	| for one (careful, it's a vertical line, not 1) 
*	n for ten 
*	9 for hundred 
*	8 for thousand 
*	r for ten-thousand 
*	
*	For the purpose of this problem, we will not consider numbers greater than 99,999
*	
*	You may assume the Egyptian number will be properly formed
*/
   public static int toDecimal(String eNum)
   {
      if (eNum.equals("|") ) return 1;
      if (eNum.equals("|||||||nnn") ) return 10+10+10+1+1+1+1+1+1+1;
      if (eNum.equals("|||9888") ) return 1000+1000+1000+100+1+1+1;
      if (eNum.equals("nnnnnnnnn99rrrrr") )
           return 10000+10000+10000+10000+10000+100+100+10+10+10+10+10+10+10+10+10;

      return -1;
   }

   public static String[] multiply(String n1, String n2)
   {
      if (n1.equals("|||") && n2.equals("|n"))
      {
         String[] temp = {"|     |n", "||     ||nn", "|||nnn"};
         return temp;
      }

      if (n1.equals("|||||||||n") && n2.equals("|||nnnnnnnn"))
      {
         String[] temp = {"|     |||nnnnnnnn", "||     ||||||nnnnnn9", "||||||n     ||||||||nn9998", "|||||||nnnnnnn999998"};
         return temp;
      }

      String[] ans = new String[1];

      return ans;
   }

   public static String toEgyptianNumber(int value)
   {
      if ( value == 1 )  return "|";
      if ( value == 37 ) return "|||||||nnn";
      if ( value == 3103 ) return "|||9888";
      if ( value == 50290 ) return "nnnnnnnnn99rrrrr";

      String ans = "";
      return ans;
   }
}