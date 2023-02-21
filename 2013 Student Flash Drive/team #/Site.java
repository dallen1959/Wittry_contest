import java.util.*;

public class Site 
{
   private int x;
   private int y;

   public Site (int a, int b)  {
      x = a;
      y = b;
   }

   public int getX() { return x;  }

   public int getY() { return y;  }

   public void setX(int a) { x = a; }

   public void getY(int b) { y = b; }

   public String toString() {
      return "(" + getX() + ", " + getY() + ")";
   }

   public boolean equals(Object obj) {
      Site loc = (Site) obj;
      return getX() == loc.getX()
                  && getY() == loc.getY();
   }
}