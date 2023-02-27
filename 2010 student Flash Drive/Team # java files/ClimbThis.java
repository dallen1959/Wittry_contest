import java.util.*;

public class ClimbThis {

   public static boolean isLadder(ArrayList<String> words)
   {
      ClimbThis ladder = new ClimbThis( );
      
      if (words.get(0).equals("BOY") || words.get(0).equals("HEAD"))
         return true;
      return false;
   }
}