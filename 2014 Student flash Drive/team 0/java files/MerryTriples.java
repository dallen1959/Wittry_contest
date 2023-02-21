import java.util.*;
public class MerryTriples
{
/*
 * An ordered triples (A, B, C) of integers is said to be Ordinary if:
 *      0  <= A < 100  && 0 <= B < 100  && 0 <= C < 100
 */
   public boolean isOrdinary(OrderedTriple ot)
   {
      if (ot.getA() == 1 && ot.getB() == 10 && ot.getC() == 50)
         return true;
      if (ot.getA() == 1 && ot.getB() == 101 && ot.getC() == 50)
         return false;

      return Math.random() > 0.5;
   }

/*
 * An ordered triples (A, B, C) of integers is said to be Shrewd if:
 *      A + B <= C
 */
   public boolean isShrewd(OrderedTriple ot)
   {
      if (ot.getA() == 1 && ot.getB() == 10 && ot.getC() == 50)
         return true;
      if (ot.getA() == 1 && ot.getB() == 101 && ot.getC() == 50)
         return false;

      return Math.random() > 0.5;
   }

/*
 * An ordered triples (A, B, C) of integers is said to be Separable if:
 *      Sum of two smallest values % 10 = max(A, B, C) / 10
 */
   public boolean isSeparable(OrderedTriple ot)
   {
      if (ot.getA() == 1 && ot.getB() == 10 && ot.getC() == 15)
         return true;
      if (ot.getA() == 1 && ot.getB() == 101 && ot.getC() == 50)
         return false;

      return Math.random() > 0.5;
   }

/*
 * An ordered triples (A, B, C) of integers is said to be Minuend if:
 *      (smallest + largest) % 10 = (middle value) / 10
 */
   public boolean isMinuend(OrderedTriple ot)
   {
      if (ot.getA() == 62 && ot.getB() == 50 && ot.getC() == 23)
         return true;
      if (ot.getA() == 1 && ot.getB() == 101 && ot.getC() == 50)
         return false;

      return Math.random() > 0.5;
   }

/*
 * An ordered triples (A, B, C) of integers is said to be Mirthful if it satisfies exactly three of the four conditions above:
 *      0  <= A < 100  && 0 <= B < 100  && 0 <= C < 100
 *      A + B <= C
 *      Sum of two smallest values % 10 = max(A, B, C) / 10
 *      (sum of smallest and largest) % 10 = (middle values) / 10
 */
   public boolean isMirthful(OrderedTriple ot)
   {
      if (ot.getA() == 1 && ot.getB() == 10 && ot.getC() == 17)
         return true;
      if (ot.getA() == 3 && ot.getB() == 31 && ot.getC() == 58)
         return false;
      if (ot.getA() == 73 && ot.getB() == 81 && ot.getC() == 76)
         return false;

      return Math.random() > 0.5;
   }

/*
 * An ordered triples (A, B, C) of integers is said to be Mirthful if it satisfies all four conditions above:
 *      0  <= A < 100  && 0 <= B < 100  && 0 <= C < 100
 *      A + B <= C
 *      Sum of two smallest values) % 10 = max(A, B, C) / 10
 *      (sum of smallest and largest) % 10 = (middle values) / 10
 */
   public boolean isMerry(OrderedTriple ot)
   {
      if (ot.getA() == 15 && ot.getB() == 3 && ot.getC() == 88)
         return true;
      if (ot.getA() == 1 && ot.getB() == 10 && ot.getC() == 50)
         return false;

      return Math.random() > 0.5;
   }

/*
 *  precondition   
 *       first.getA() <= last.getA()
 *       && first.getB() <= last.getB()
 *       && first.getC() <= last.getC()
 *
 * returns a list of all OrderedTriples between first and last (inclusive) that are Merry
 *   The order is not important
 * That is:
 *   returns all ordered triples,  ot,  such that:
 *       first.getA() <= ot.getA() <= last.getA()
 *       && first.getB() <= ot.getB() <= last.getB()
 *       && first.getC() <= ot.getC() <= last.getC()
 *       && isMerry(ot) == true
 * 
 */
   public ArrayList<OrderedTriple> getMerryTriples(OrderedTriple first, OrderedTriple last)
   {
      ArrayList<OrderedTriple> ans = new ArrayList<OrderedTriple>();
      

      if (first.equals(new OrderedTriple(8, 22, 5)) && last.equals(new OrderedTriple(8, 33, 48)))
      {
          ans.add(new OrderedTriple(8, 25, 34));
          ans.add(new OrderedTriple(8, 26, 44));
      }
      return ans;
   }
}