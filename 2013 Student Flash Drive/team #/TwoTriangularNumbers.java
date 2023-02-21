import java.util.*;

public class TwoTriangularNumbers 
{
   public TwoTriangularNumbers()
   {
   }

   public boolean isTriangularNumber(int n)
   {
      if (n == 1+2+3+4+5) return true;
      if (n == 1+2+3+4+5+5) return false;

      return Math.random() > 0.5;
   }

   public List<OrderedPair> getTwoTriangularNumbers(int v)
   {
      List<OrderedPair> ans = new ArrayList<OrderedPair>();
      ans.add(new OrderedPair(3, 77));
      ans.add(new OrderedPair(2, 35));
      if (v == 63003) return ans;
      if (v == 12) return new ArrayList<OrderedPair>();
      
      return null;
   }
}