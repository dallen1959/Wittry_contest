import java.util.*;

public class Location
{
   private int r;
   private int c;

   public Location(int a, int b)  {
      r = a;
      c = b;
   }

   public int getRow() { return r;  }

   public int getCol() { return c;  }

   public void setRow(int a) { r = a; }

   public void setCol(int b) { c = b; }

   public String toString() {
      return "(" + getRow() + ", " + getCol() + ")";
   }

   public boolean equals(Object obj) {
      Location loc = (Location) obj;
      return getRow() == loc.getRow()
                  && getCol() == loc.getCol();
   }

   public int hashCode() {
      Integer tr = new Integer(getRow());
      Integer tc = new Integer(getCol());
      return tr.hashCode() + tc.hashCode();
   }
}