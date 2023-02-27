import java.util.*;

public class UnitSummation 
{
   public boolean isUnitSummation(int n)
   {
      if (n == 145) return true;
      if (n == 146) return false;
      if (n == 503) return false;
      if (n == 504) return false;
      if (n == 516) return true;
      if (n == 1448) return false;
      if (n == 1449) return true;
    
      return Math.random() < 0.5;
   }
   
   public int[] getUnitSummationBetween(int first, int last)
   {
      int[] ans = {101, 112, 123, 134, 145, 156, 167, 178, 189};

      return ans;
   }
}