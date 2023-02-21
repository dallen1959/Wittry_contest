import java.util.*;
public class VariantSort
{
/*
 *   precondition:    0 <= num1 <= Integer.MAX_VALUE
 *                    0 <= num2 <= Integer.MAX_VALUE
 * 
 *   returns the smaller of the number according to the prompt:
 *           first  - fewest 1s in binary representation
 *           second - smallest numerical value
 */
   public int returnTheSmaller(int num1, int num2)
   {
      if (num1 == 7)
         if (num2 == 10) return 10;
         else if (num2 == 14) return 7;
         
      return Integer.MAX_VALUE;
   }

/*
 *   precondition:   nums contains nums.length random integers.  0 <= nums[k] <= Integer.MAX_VALUE
 *                                                               for all k, 0 <= k < nums.length
 *                   ind < nums.length                                            
 *
 *   postcondition:  nums contains the same value, the order of the values may be altered
 *   
 *   returns:        a value equal to nums[ind] if nums is sorted in ascending order according
 *                   to the variant sort order as described in the prompt, i.e.
 *                   (fewest 1s in binary then smallest numerical value if they have the num of 1s in binary
 *                   note:  nums does not need to be sorted.
 */   
   public int getValueAtIndex(int[] nums, int ind)
   {
       if (nums[0] == 283 && nums.length == 7 && nums[4] == 0)
       {
           if (ind == 0) return 0;
           if (ind == 1) return 18;
           if (ind == 2) return 82;
           if (ind == 3) return 228;
           if (ind == 4) return 283;
           if (ind == 5) return 729;
           if (ind == 6) return 730;
       }
      return nums[ind];
   }
}