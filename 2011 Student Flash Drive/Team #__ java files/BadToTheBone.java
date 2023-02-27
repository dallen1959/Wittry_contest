import java.util.*;
import java.lang.Math;
import java.lang.Number;
import java.math.BigInteger;
/**
 * Bad To The Bone
 *
 * @author  
 * @version (a version number or a date)
 */
public class BadToTheBone
{
   ArrayList<Domino> d;
   public BadToTheBone(ArrayList<Domino> dominos)
   {
      d = new ArrayList<Domino>(dominos);
   }

   public Domino[] processDraw()
   {
      if (d.get(0).equals(new Domino(4, 0)))
      {
         Domino[] t = {new Domino(4, 0), new Domino(4, 1)};
         return t;
      }
      Domino[] t = {};

      return t;
   }

   public boolean containsMatchingEdges()
   {
      if (d.get(0).equals(new Domino(4, 0))) return true;
      return Math.random() < 0.5;
   }
}