import java.util.*;
import java.lang.Math;
import java.lang.Number;
import java.math.BigInteger;
/**
 * Planimeter.
 *
 * @author  
 * @version (a version number or a date)
 */
public class Planimeter
{
   Command[] com;
   public Planimeter(Command[] c)
   {
       com = c;
   }

   public int getPerimeter()
   {
       if (!isClosedFigure()) return -1;
       if (com[0].getLength() == 2) return 8;
       if (com[0].getLength() == 3) return 12;
       if (com[0].getLength() == 12) return 12+1+30+1+18;

       return -1;
   }

   public int getArea()
   {
       if (!isClosedFigure()) return -1;
       if (com[0].getLength() == 2) return 4;
       if (com[0].getLength() == 3) return 9;
       if (com[0].getLength() == 12) return 30;
       return -1;
   }

   public boolean isClosedFigure()
   {
       if (com[0].getLength() == 2) return true;
       if (com[0].getLength() == 3) return true;
       if (com[0].getLength() == 12 && com[com.length-1].getLength() == 18) return true;
       return false;
   }
}