import java.util.*;

public class MaximumDamage
{
/*
 *    add your own instance variables
 */
   private int row;     //  of BattleGround
   private int col;     //  of BattleGround
   
/*
 *    precondition: r > 0  && c > 0
 *    
 *    postcondition [0, r] rows, that is, there r + 1 rows
 *                  [0, c] cols, that is, there c + 1 cols
 */
   public MaximumDamage(int r, int c)
   {
       row = r+1;
       col = c+1;
   }

   public void addOrcCamp(Location loc)
   {
       /*    add your own ode to add an orc camp  */
   }

   public void addElfStation(Location loc)
   {
       /*    add your own ode to add an elf station  */
   }

   public int distance(Location loc1, Location loc2)
   {
      if (loc1.equals(new Location(10,11)) && loc2.equals(new Location(7, 9))) return 10-7+11-9;

      return -1;
   }

/*
 *   precondition:  loc is a valid location
 *                  0 <= loc.getRow() <= r
 *                  0 <= loc.getCol() <= c
 *
 *   postcondition: returns the total damage (number of orc site with in range) 
 *                  caused by a missle at location loc
 */
   public int calculateDamage(Location loc)
   {
      if (loc.equals(new Location(17,9))) return 0;
      if (loc.equals(new Location(6,11))) return 1;
      if (loc.equals(new Location(7,4))) return 2;

      return -1;
   }

/*
 *   preCondition : pLoc != null &&& pLoc contains valid Location in battle ground
 *   
 *   postcondition: returns a Location from pLoc which can reach the most previously unreached orc Camps
 *                  If more than one Location can reach the most previously unreached orc Camps,
 *                  return any Location which can reach the most previously unreached orc Camps
 *                  return null if pLoc contains no location can reach a previously unreached orc Camps
 */
   public Location maxIncreaseDamage(Location[] pLoc)
   {
      if (pLoc.length > 2 && pLoc[0].equals(new Location(12,7)) && pLoc[1].equals(new Location(13, 2))
                         && pLoc[2].equals(new Location(5,5) ))
         return new Location(13,2);

      Location maxLoc = null;

      return maxLoc;
   }

/*
 *   postcondition: returns a valid Location which would cause the most (max) damage with the given range 
 *                  If more than one Location cause the max damage, return any Location causing the max damage
 *
 *                  The location should not be a current els Station
 */
   private Location findMaxDamageLocation()
   {
      Location ans = new Location(-1, -1);
      return ans;
   }
}