import java.util.*;

public class RadioContact 
{
   private ArrayList<Location> al;

   public RadioContact()   {   }

   public RadioContact(ArrayList<Location> l)
   {
      al = l;
   }

   public int getNumberSquads()
   {
      return 5;
   }

/*
 *    Range <= 50 units
 */
   public boolean withinRange(Location loc1, Location loc2)
   {
      if (loc2.equals(new Location(40, 10) ) ) return true;
      if (loc2.equals(new Location(60, 10) ) ) return true;
      if (loc2.equals(new Location(61, 10) ) ) return false;
      return Math.random() <= 0.50;
   }
}