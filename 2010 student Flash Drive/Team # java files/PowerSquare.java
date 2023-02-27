import java.util.*;
import java.lang.Math;
import java.lang.Number;
import java.math.BigInteger;
/**
 * Power Square
 *
 * @author  2010 programming contest
 * @version (a version number or a date)
 */
public class PowerSquare
{

   public PowerSquare(int num)
   {
   }

   public void shiftZeroRight()  // zero column number is increased except far right becomes 0
   {
   }

   public void shiftZeroLeft() // zero column number is decreased, except 0 becomes far right
   {
   }

   public void shiftZeroDown()  // Zero row is reduced by one.  Row zero moves to square.length - 1
   {
   }

   public void shiftZeroUp()  // Zero row is increased by one.  Row square.length - 1 moves to row 0
   {
   }

   public void swapZeroRight()  // Zero swaps with cell to its right.  If at far right , goes to 0
   {
   }

   public void swapZeroLeft()  // Zero swaps with cell to its left.  If at zero, goes to far right
   {
   }

   public void swapZeroDown()  // Zero is swap with row - 1, 0 becomes square.length - 1 
   {
   }

   public void swapZeroUp()  // Zero is swap with row + 1, square.length - 1 becomes 0
   {
   }

   public int[] getFourPossibleNeighbors()
   {
  // code added to pass tester
  //  you need replace with your own implemenation
      int[] ans = {8, 4, 7};
      return ans;
   }

   public ArrayList<Integer> getEightPossibleNeighbors()
   {
      return new ArrayList<Integer>();
   }
}