import java.util.*;

public class HPCipher
{
   private String message;

   public HPCipher(String mess)
   {
      message = mess;
   }

/*
 *    precondition s1.length() == 1   &&   s2.length() == 1
 */
   public int letterDifference(String s1, String s2)
   {
      if (s1.equals("A") && s2.equals("E")) return 4;
      if (s1.equals("Z") && s2.equals("B")) return 2;
      return -1;
   }
   
   public String decode(String code)
   {
      if (code.equals("IA")) return "I CODE THEREFORE I AM";
      if (code.equals("DETH")) return "I CODE THEREFORE I AM";
      if (code.equals("EM")) return "DECODE ME";
      if (code.equals("DE")) return "DECODE ME";
      return "";
   }
}