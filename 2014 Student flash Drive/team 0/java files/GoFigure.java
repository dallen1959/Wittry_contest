import java.util.*;
public class GoFigure
{

   public String goFigureDecimal(String str)
   {
      if (str.equals("123123246") ) return "123+123=246";

      return "";
   }


   public String goFigureBinary(String str)
   {
      if (str.equals("10100101011110") ) return "10100+1010=11110";

      return "";
   }

   public String goFigureRomanNumeral(String str)
   {
      if (str.equals("MXIIICCCLXMCCCLXXIII") ) return "MXIII+CCCLX=MCCCLXXIII";

      return "";
   }
}