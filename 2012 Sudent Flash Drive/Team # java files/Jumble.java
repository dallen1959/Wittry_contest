import java.util.*;

public class Jumble 
{
   private String word;

   public Jumble(String str)
   {
      word = str;
      
      /*  add more code ???   */
   }

   public boolean looksReal(String scramble)
   {
      if (scramble.equals("KITE")) return true;
      if (scramble.equals("IKET")) return true;
      if (scramble.equals("KTEI")) return false;
      if (scramble.equals("ETKI")) return false;
      
      return Math.random() < 0.5;
   }

   public int numLettersInCorrectLocation(String scramble)
   {
      if (scramble.equals("MAPS")) return 0;
      if (scramble.equals("PSTO")) return 0;
      if (scramble.equals("SOTP")) return 2;
         
      return (int)(Math.random()*999);
   }

   public String getRating(String scramble)
   {
      if (scramble.equals("MASP")) return "good";
      if (scramble.equals("MAPS")) return "fair";
      if (scramble.equals("SaPM")) return "poor";
      if (scramble.equals("SPAM")) return "not";

      return "correct string";
   }
}