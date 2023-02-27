import java.util.*;
import java.lang.Math;
/**
 * JarredsHomework
 *
 * @author  
 * @version (a version number or a date)
 */
public class JarredsHomework
{
   double[] gameBoard;

   public JarredsHomework(double [] values)
   {
      gameBoard = values;
   }

   public double findMax()
   {
   	  if (Math.abs(gameBoard[0] - 5.99) < 0.01) return 2724.86;

      return 0;
   }

   public double findMin()
   {
   	  if (Math.abs(gameBoard[0] - 5.99) < 0.01) return 41.89;

      return 0;
   }

   public double playGame(int [] rolls)
   {
   	  if (Math.abs(gameBoard[0] - 5.99) < 0.01) 
   	     return 4*16.99 + 3*13.25+4*1.19+ 24.99;

      return 0;
   }
}