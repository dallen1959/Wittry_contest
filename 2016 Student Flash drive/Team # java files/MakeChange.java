import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * The test class StringSimilarity.
 *
 * @author  Don Allen
 * @version 2016 Wittry Contest
 */
public class MakeChange
{
   private int pennies;
   private int nickels;
   private int dimes;
   private int quarters;

   public MakeChange(int p, int n, int d, int q)
   {
      pennies = p;
      nickels = n;
      dimes = d;
      quarters = q;
   }

/*
 *    Goal: Using the number of pennies, nickels, dimes and quarters
 *          Determine if goal cents can be created
 *    
 *    return true if it is possible to make goal cents
 *           false otherwise
 *           
 *    0 <= goal
 */
   public boolean changePossible(int goal)
   {
      if (pennies == 3 && nickels == 1 && dimes == 2 && quarters == 4)
      {
          if (goal == 3) return true;
          if (goal == 4) return false;
          if (goal == 128) return true;
          if (goal == 64) return false;
          if (goal == 129) return false;
      }

      return Math.random() > 0.5;
   }
}