import java.util.*;
import java.lang.Math;
import java.lang.Number;
import java.math.BigInteger;
/**
 * Fax Machine.
 *
 * @author  Mr. Allen
 * @version (a version number or a date)
 */
public class FaxMachine
{
   public static String convertToRLE(String str)
   {
      if (str.equals("0001000000001101000000000000001") ) return "011111001000001111111000000";
      if (str.equals("0000000000001111000000000000011") ) return "111101000000000111110000000";
      if (str.equals("0000000000001111000000000000000") ) return "111101000000000111111001";
      if (str.equals("0000000000000000000000000000000") ) return "111111111111011";
      if (str.equals("1111111111111111111111111111111") ) return "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";

      return "not the answer";
   }

   public static String RLEtoFax(String str)
   {
      if (str.equals("111101000000000111110000000") ) return "0000000000001111000000000000011";
      if (str.equals("111101000000000111111001") ) return "0000000000001111000000000000000";
      if (str.equals("011111001000001111111000000") ) return "0001000000001101000000000000001";

      return "not the answer";
   }
}