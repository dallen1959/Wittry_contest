import java.util.*;

public class Coordinate
{
   private int x;
   private int y;

   public Coordinate(int a, int b)  {
      x = a;
      y = b;
   }

   public int getX() { return x;  }

   public int getY() { return y;  }

   public String toString() {
      return "(" + getX() + ", " + getY() + ")";
   }

   public boolean equals(Object obj) {
      Coordinate loc = (Coordinate) obj;
      return getX() == loc.getX()
                  && getY() == loc.getY();
   }

   public int hashCode() {
      Integer tr = new Integer(getX());
      Integer tc = new Integer(getY());
      return tr.hashCode() + tc.hashCode();
   }
}