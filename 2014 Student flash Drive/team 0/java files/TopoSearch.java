import java.util.*;
public class TopoSearch
{
   private int[][] elev;

   public TopoSearch(int[][] e)
   {
      elev = e;
   }

/*
 *    A (Map)location is a Flat Area (Map)location iff all of the following conditions are satisfied
 *      1)  the given location is part of a "block" for which all elevations are exactly equal
 *      2)  A block consist of Loacations that are adjacent (North/South or East/West - NOT diagonal) to each other
 *      3)  the block must contain Locations in at least two different rows and two differnt columns
 *      4)  the block must contain 4 or more Locations
 */
   public boolean isFlatArea(MapLocation aLoc)
   {
       return Math.random() > 0.5;
   }

/*
 * precondition
 *        aLoc is a valid MapLocation
 *        and aLoc is a location that is part of a FlatArea (i.e., isFlatArea(aLoc) == true )
 */
   public int getPerimeterOfFlatArea(MapLocation aLoc)
   {
       return -1;
   }

/*
 * precondition
 *        aLoc is a valid MapLocation
 *        and aLoc is a location that is part of a FlatArea (i.e., isFlatArea(aLoc) == true )
 */
   public int getAreaOfFlatArea(MapLocation aLoc)
   {
      return -1;
   }

   public int getNumFlatAreas()
   {
       return -1;
   }
}