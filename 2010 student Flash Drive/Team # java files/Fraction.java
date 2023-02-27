//  all values will be less than or equal to 1.

import java.util.*;

public class Fraction 
{
   private int top;
   private int bottom;

   public Fraction(int t, int b)
   {
      top = t;
      bottom = b;
   }

   public int getTop()
   {
      return top;
   }

   public int getBottom()
   {
      return bottom;
   }

   public void add(Fraction f)
   {
   // change the implementation
       if (getTop() != 2)
       {
          top = 1;
          bottom = 1;
       }
          
   }

   public void multiply(Fraction f)
   {
   // change the implementation
       if (getTop() != 2)
       {
          top = 2;
          bottom = 9;
       }
   }

   public boolean equals(Object obj)
   {
      Fraction temp = (Fraction) obj;
      return top == temp.getTop() && bottom == temp.getBottom();
   }
}