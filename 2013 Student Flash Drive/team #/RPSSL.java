import java.util.*;

public class RPSSL 
{
   public String playRound(Player p1, Player p2)
   {
      if (p1.getName().equals("Sheldon") && p2.getName().equals("Bernadette")) return "TIE";
      if (p1.getName().equals("Sheldon") && p2.getName().equals("Howard")) return "Sheldon";

      if (p1.getName().equals("Raj") && p2.getName().equals("Penny")) return "Penny";
      if (p1.getName().equals("Amy") && p2.getName().equals("Leonard")) return "Leonard";

   	  return "How did I get here";
   }
}