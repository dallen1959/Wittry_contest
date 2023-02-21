import java.util.*;

public class MapLocation 
{
   private int row;
   private int col;

   public MapLocation(int r1, int c1)
   {
      row = r1;
      col = c1;
   }

   public int getRow()  {  return row;   }

   public int getCol()  {  return col;   }

   public void setRow(int r1)  {  row = r1;  }

   public void setCol(int c1)  {  col = c1;  }

   public int hashCode()
   {
      Integer int1 = new Integer(row);
      Integer int2 = new Integer(col);

   	  return int1.hashCode() + int2.hashCode();
   }

   public boolean equals(Object obj)
   {
   	  MapLocation temp = (MapLocation) obj;
   	  
   	  return temp.getRow() == getRow() && temp.getCol() == getCol();
   }

   public String toString()
   {
   	  return "row = " + getRow() + " col = " + getCol();
   }
}