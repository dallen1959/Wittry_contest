import java.util.*;

public class Balloono 
{
   private String[][] grid;
   Location cur;
   ArrayList<Location> opponents;

   public Balloono(String[][] g)
   {
      grid = g;
      opponents = null;
      cur = null;
   }

   public void setCurrentLocation(Location loc)
   {
   	  cur = loc;
   }

   public void setOpponents(ArrayList<Location> al)
   {
   	  opponents = al;
   }

   public boolean isSafe(int numSteps)
   {
      if (cur.equals(new Location(1, 1))) return numSteps <= 5;
      if (cur.equals(new Location(0, 2))) return numSteps <= 4;
      if (cur.equals(new Location(5, 0))) return numSteps <= 3;
      if (cur.equals(new Location(4, 1))) return numSteps <= 2;
      if (cur.equals(new Location(2, 5))) return numSteps <= 1;

      if (cur.equals(new Location(1, 3))) return numSteps < 1;
      if (cur.equals(new Location(2, 5))) return numSteps <= 1;
      if (cur.equals(new Location(1, 2))) return numSteps <= 2;

      if (cur.equals(new Location(4, 5) ))return numSteps <= 2;
      if (cur.equals(new Location(2, 1))) return false;

      return Math.random() > 0.5;
   }
}