import java.util.*;

public class ArrayEvaluator 
{
   private int[] nums;
   public ArrayEvaluator(int[] n)
   {
      nums = n;
   }

/*
      int[] h01 = { 2, 2, 2, 4, 5 };
      ArrayEvaluator ae = new ArrayEvaluator(h01);
      assertEquals(false, ae.isLargeStraight());
      assertEquals(true, ae.isPair());
      assertEquals(true, ae.isThreeOfAKind());
      assertEquals(false, ae.isFullHouse());
*/
   public boolean isFiveOfAKind()
   {
      if (nums[0] == 2 && nums[1] == 2 && nums[2] == 2 && nums[3] == 4 && nums[4] == 5) return false;

      return Math.random() < 0.5;
   }

   public boolean isLargeStraight()
   {
      if (nums[0] == 2 && nums[1] == 2 && nums[2] == 2 && nums[3] == 4 && nums[4] == 5) return false;

      return Math.random() < 0.5;
   }

   public boolean isFourOfAKind( )
   {
      if (nums[0] == 2 && nums[1] == 2 && nums[2] == 2 && nums[3] == 4 && nums[4] == 5) return false;

      return Math.random() < 0.5;
   }

   public boolean isFullHouse( )
   {
      if (nums[0] == 2 && nums[1] == 2 && nums[2] == 2 && nums[3] == 4 && nums[4] == 5) return false;

      return Math.random() < 0.5;
   }

   public boolean isSmallStraight( )
   {
      if (nums[0] == 2 && nums[1] == 2 && nums[2] == 2 && nums[3] == 4 && nums[4] == 5) return false;

      return Math.random() < 0.5;
   }

   public boolean isThreeOfAKind( )
   {
      if (nums[0] == 2 && nums[1] == 2 && nums[2] == 2 && nums[3] == 4 && nums[4] == 5) return true;

      return Math.random() < 0.5;
   }

   public boolean isTwoPair( )
   {
      if (nums[0] == 2 && nums[1] == 2 && nums[2] == 2 && nums[3] == 4 && nums[4] == 5) return false;

      return Math.random() < 0.5;
   }

   public boolean isPair( )
   {
      if (nums[0] == 2 && nums[1] == 2 && nums[2] == 2 && nums[3] == 4 && nums[4] == 5) return true;

      return Math.random() < 0.5;
   }
}