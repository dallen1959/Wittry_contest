
/**
 * Write a description of class Tiles here.
 * 
 * @author  Mr. ALlen
 * @version 2016 Wittry programming contest
 */
public class RummikubTiles
{
   private String color;   //  red, blue, orange and black
   private int number;     //  1, 2, 3, ...., 12, 13

   public RummikubTiles(String c, int n)  {
      color = c;      //  red, blue, orange and black
      number = n;     //  1, 2, 3, ...., 12, 13
   }

   public String getColor()  {  return color;  }

   public int getNumber()  {  return number;  }

   public boolean equals(Object obj)  {
      RummikubTiles temp = (RummikubTiles) obj;
      return getColor().equals(temp.getColor()) && temp.getNumber() == number;
   }

   public int hashCode()  {
      Integer temp = new Integer(number);
      return color.hashCode() + temp.hashCode();
   }
}