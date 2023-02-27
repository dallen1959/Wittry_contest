import java.util.*;
import java.lang.Math;
import java.lang.Number;
import java.math.BigInteger;
/**
 * Command.
 *
 * @author  Mr. Allen
 * @version (a version number or a date)
 */
public class Command
{
   private String direction;
   private int length;

   public Command(String s, int l)
   {
   	  direction = s;
   	  length = l;
   }

   public String getDirection()
   {
       return direction;
   }

   public int getLength()
   {
       return length;
   }

   public boolean equals(Object obj)
   {
       Command temp = (Command) obj;
       return length == temp.length && direction.equals(temp.direction);
   }

   public int hashCode()
   {
       Integer temp = new Integer(length);
       return temp.hashCode() + direction.hashCode();
   }
}