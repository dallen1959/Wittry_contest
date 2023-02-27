import java.util.*;

public class Location 
{
   int x;
   int y;

   public Location(int x1, int y1)
   {
      x = x1;
      y = y1;
   }

   public int getX()
   {
   	  return x;
   }

   public int getY()
   {
   	  return y;
   }

   public void setX(int x1)
   {
   	  x = x1;
   }

   public void setY(int y1)
   {
   	  y = y1;
   }

   public int hashCode()
   {
      Integer int1 = new Integer(x);
      Integer int2 = new Integer(y);

   	  return int1.hashCode() + int2.hashCode();
   }

   public boolean equals(Object obj)
   {
   	  Location temp = (Location) obj;
   	  
   	  return temp.getX() == getX() && temp.getY() == getY();
   }

   public String toString()
   {
   	  return "x = " + getX() + " y = " + getY();
   }
}