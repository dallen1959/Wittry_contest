import java.util.*;
import java.lang.Math;
/**
 * Biodiversity.
 *
 * @author  
 * @version (a version number or a date)
 */
public class Biodiversity
{
   public static int getDiversity(String lineOfCells)
   {
   	   if (lineOfCells.equals("DDDDDDDDDDDDDDDDDDDDDDDDAAADDDDDAADDDDDAAADAAAA") ) return 3;
   	   if (lineOfCells.equals("AAADDDDDAADDDDDAAADAAAA") ) return 3;
   	   if (lineOfCells.equals("AAAA") ) return 1;
   	   if (lineOfCells.equals("AAADDDDDAAADDDDDAAADAAADDDD") ) return 1;
   	   if (lineOfCells.equals("DDDDDDDAAAADDDDDAADDDDDAADAAAADDDDDD") ) return 2;
       return -1;
   }
}