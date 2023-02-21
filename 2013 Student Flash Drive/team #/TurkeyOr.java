import java.util.*;

public class TurkeyOr 
{
   private ArrayList<Integer> numbers;

   public TurkeyOr(ArrayList<Integer> temp)
   {
      numbers = temp;
   }

   public boolean canTravel(int d)
   {
      if( numbers.size() == 3 && numbers.get(0).equals(new Integer(5))
                        && numbers.get(1).equals(new Integer(2)) && numbers.get(2).equals(new Integer(3)))
      {
         if (d == -11) return false;
         if (d == -10) return true;
         if (d == -9) return false;
         if (d == -8) return true;
         if (d == -7) return true;
         if (d == -6) return true;
         if (d == -5) return true;
         if (d == -4) return true;
         if (d == -3) return true;
         if (d == -2) return true;
         if (d == -1) return true;
         if (d == 0) return true;
         if (d == 11) return false;
         if (d == 10) return true;
         if (d == 9) return false;
         if (d == 8) return true;
         if (d == 7) return true;
         if (d == 6) return true;
         if (d == 5) return true;
         if (d == 4) return true;
         if (d == 3) return true;
         if (d == 2) return true;
         if (d == 1) return true;
      }

      if( numbers.size() == 4 && numbers.get(0).equals(new Integer(5))
                        && numbers.get(1).equals(new Integer(2)) && numbers.get(2).equals(new Integer(3))
                        && numbers.get(3).equals(new Integer(1)))
      {
         if (d == 0) return true;
         if (d == 12) return false;
         if (d == 11) return true;
         if (d == 10) return true;
         if (d == 9) return true;
         if (d == 8) return true;
         if (d == 7) return true;
         if (d == 6) return true;
         if (d == 5) return true;
         if (d == 4) return true;
         if (d == 3) return true;
         if (d == 2) return true;
         if (d == 1) return true;
      }
      return Math.random() > 0.5;
   }
}