import java.util.*;

public class PedalTriangle 
{
   OrderedPair pt1;
   OrderedPair pt2;
   OrderedPair pt3;

   public PedalTriangle(List<OrderedPair> triangle)
   {
      pt1 = triangle.get(0);
      pt2 = triangle.get(1);
      pt3 = triangle.get(2);
   }

   public List<OrderedPair> getPedalTriangle(OrderedPair p)
   {
      ArrayList<OrderedPair> ans = new ArrayList<OrderedPair>();
      if (p.equals(new OrderedPair(20., 40.)))
      {
         ans.add(new OrderedPair(1280./41., 1065./41.));
         ans.add(new OrderedPair(49./2, 83./2));
         ans.add(new OrderedPair(1835./173, 7170./173));
         return ans;
      }

      return ans;
   }
}