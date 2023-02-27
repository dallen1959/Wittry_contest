import java.util.*;
import java.lang.Math;
/**
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Card
{
   private int number;        //  1, 2 or 3
   private String shape;      //  circle, triangle or square
   private String color;      //  red, blue or green
   private String shading;    //  clear, dashed or solid

   public Card(int n, String s, String c, String shade)
   {
      number = n;
      shape = s;
      color = c;
      shading = shade;
   }

   public int getNumber()
   {
       return number;
   }

   public String getShape()
   {
       return shape;
   }

   public String getColor()
   {
       return color;
   }

   public String getShading()
   {
       return shading;
   }

   public static Card randomCard()
   {
       int num = (int)(Math.random()*3 + 1);

       String sp;
       int n = (int)(Math.random()*3 + 1);
       if (n == 1) sp = "circle";
       else if (n == 2) sp = "triangle";
       else sp = "square";

       String c;
       n = (int)(Math.random()*3 + 1);
       if (n == 1) c = "red";
       else if (n == 2) c = "blue";
       else c = "green";

       String sd;
       n = (int)(Math.random()*3 + 1);
       if (n == 1) sd = "clear";
       else if (n == 2) sd = "dashed";
       else sd = "solid";

       return new Card(num, sp, c, sd);
   }


   public String toString()
   {
       return  getNumber() + " " + getShape().toString() + " " + getColor().toString()
                     + " " + getShading().toString();
   }

   public boolean equals(Object obj)
   {
       Card c = (Card) obj;
       return  number == c.getNumber()
          &&   shape.equals( c.getShape())
          &&   color.equals( c.getColor())
          &&   shading.equals( c.getShading());

   }
}