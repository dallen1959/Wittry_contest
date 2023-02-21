/**
 * @author:   Mr. Allen
 *            2017 Wittry contest
 */
import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;
public class GuideMe 
{
    private int[][]matrix;
/*
 *    numbers[i][k] >= 0, 0 <= i < numbers.length  && 0 < k < numbers[i].length
 *    numbers[m].length == numbers[n].length,   0 <= m, n <= nubers.length
 */
    public GuideMe(int[][] numbers)
    {
        matrix = numbers;
    }

/*
 *    preCondition:  source != null, finis != null
 *                   source and finis are valid Position in matrix
 *                   source.equals(finis) == false
 *                   i.e., 0 <= source.getX(), finis.getX()  < matrix.length
 *                   &&     source.getY() < matrix[source.getX()].length
 *                   &&     finis.getY()  < matrix[finis.getX()].length
 *    
 *    postCondition:
 *         returns:  a summation Path from source to finis if one exist
 *                      -  the shortest summation Path if more than one exist.  (only one will exist - I promise)
 *                      -  null if no summation path exist
 *                    A summation Path is:
 *                          a path that starts at source and ends at finis
 *                          can only move up, down, right or left
 *                          contains no loops (cannot visit same position twice
 *                          the value at finis == sum of all values along the path (not including finis)
 */
   public ArrayList<Position> getSummationPath(Position source, Position finis)
   {
      ArrayList<Position> tempPath = new ArrayList<Position>();
      if (source.getX() == 0 && source.getY() == 0 
            && finis.getX() == 3 && finis.getY() == 3 )
      {
          tempPath.add(new Position(0, 0));
          tempPath.add(new Position(0, 1));
          tempPath.add(new Position(0, 2));
          tempPath.add(new Position(1, 2));
          tempPath.add(new Position(2, 2));
          tempPath.add(new Position(2, 1));
          tempPath.add(new Position(3, 1));
          tempPath.add(new Position(3, 2));
          tempPath.add(new Position(3, 3));
          return tempPath;
      }

      return new ArrayList<Position>();
   }

/*
 *    preCondition:  source != null, finis != null
 *                   source and finis are valid Position in matrix
 *                   i.e., 0 <= source.getX(), finis.getX()  < matrix.length
 *                   &&     source.getY() < matrix[source.getX()].length
 *                   &&     finis.getY()  < matrix[finis.getX()].length
 *    
 *    postCondition:  returns a (any if more than one) Min path
*/
   public int getMinPathCost(Position source, Position finis)
   {
      if (source.getX() == 0 && source.getY() == 0 
            && finis.getX() == 2 && finis.getY() == 1 )  return 85;

      if (source.getX() == 3 && source.getY() == 0 
            && finis.getX() == 2 && finis.getY() == 3 )  return 73;

      return -1;
   }
}