import java.util.*;

public class Triple 
{
   private int x;
   private int y;
   private int z;

   public Triple (int a, int b, int c)  {
      x = a;
      y = b;
      z = c;;
   }

   public int get6() { return x;  }

   public int get11() { return y;  }

   public int get13() { return z;  }

   public void setX(int a) { x = a; }

   public void get11(int b) { y = b; }

   public void setZ(int c) { z = c; }

   public String toString() {
      return "(" + get6() + ", " + get11() + ", " + get13() + ")";
   }

   public boolean equals(Object obj) {
      Triple loc = (Triple) obj;
      return get6() == loc.get6()
                  && get11() == loc.get11() && get13() == loc.get13();
   }
}