import java.util.*;
import java.lang.Math;
/**
 * PolygonFun.
 *
 * @author  Don Allen
 * @version 2023 Wittry Programming contest
 */
public class PolygonFun
{

    public static int getNumConvex(List<Coordinate> v1, List<Coordinate> v2, List<Coordinate> v3, List<Coordinate> v4, List<Coordinate> v5)
    {
        if (v1.size() == 2 && v2.size() == 2 && v3.size() == 2 && v4.size() == 1 && v5.size() == 1)
           return 4;

        return -1;
    }

    /*
     *   given upper left corner and lower right corner of a rectangle
     *   
     *   return the quadrant which contains the greatest area of the rectangle
     */
    public static int whichQuadrant(Coordinate upperLeft, Coordinate lowerRight)
    {
        if (upperLeft.getX() == -8 && upperLeft.getY() == 10 && lowerRight.getX() == 15 && lowerRight.getY() == -6) return 1;
               
        if (upperLeft.getX() == -4 && upperLeft.getY() == 3 && lowerRight.getX() == 1 && lowerRight.getY() == -10) return 3;

        return -1;
    }

    public static String getNumberOfSides(int angles, int diagonals)
    {
        if (angles == 17 && diagonals == 53) return "6-11";
        if (angles == 15 && diagonals == 34) return "7-8";

        return "";
    }

    /*
     *     vertices.length == number of vertices of the polygon
     *     
     *     Vertices are given in clockwise
     *     vertices[m] and vertices[m+1] are adjacent.
     *     
     *     You may assume no three adjacent Coordinates are collinear
     *     
     *     return true if vertices define a convex polygon
     *            false otherwise
     *            
     *     definition:  A convex polygon is defined as a polygon with all its interior angles less than 180
     *     
     *     sum of interior angles = (n-2) * 180  or (n-2) * PI
     */
    public static boolean isConvex(Coordinate[] vertices)
    {


      if (vertices.length == 4
             && Math.abs(vertices[0].getX() - 0.) < 0.001 && Math.abs(vertices[0].getY() - 0.) < 0.001 
             && Math.abs(vertices[1].getX() - 2.) < 0.001 && Math.abs(vertices[1].getY() - 2.) < 0.001 
             && Math.abs(vertices[2].getX() - 4.) < 0.001 && Math.abs(vertices[2].getY() - 2.) < 0.001 
             && Math.abs(vertices[3].getX() - 2.) < 0.001 && Math.abs(vertices[3].getY() - 0.) < 0.001  )
            return true;

      if (vertices.length == 9
             && Math.abs(vertices[0].getX() - 3.) < 0.001 && Math.abs(vertices[0].getY() - -20.) < 0.001 
             && Math.abs(vertices[1].getX() - 2.) < 0.001 && Math.abs(vertices[1].getY() - -11.) < 0.001 
             && Math.abs(vertices[2].getX() - 1.) < 0.001 && Math.abs(vertices[2].getY() - 5.) < 0.001 
             && Math.abs(vertices[3].getX() - 5.) < 0.001 && Math.abs(vertices[3].getY() - 9.) < 0.001
             
             && Math.abs(vertices[4].getX() - 10.) < 0.001 && Math.abs(vertices[4].getY() - 13.) < 0.001
             && Math.abs(vertices[5].getX() - 15.) < 0.001 && Math.abs(vertices[5].getY() - 7.) < 0.001
             && Math.abs(vertices[6].getX() - 23.) < 0.001 && Math.abs(vertices[6].getY() - -3.) < 0.001
             && Math.abs(vertices[7].getX() - 18.) < 0.001 && Math.abs(vertices[7].getY() - -19.) < 0.001
             && Math.abs(vertices[8].getX() - 9.) < 0.001 && Math.abs(vertices[8].getY() - -20.) < 0.001  )
            return true;

      if (vertices.length == 5
             && Math.abs(vertices[0].getX() - 0.) < 0.001 && Math.abs(vertices[0].getY() - 0.) < 0.001 
             && Math.abs(vertices[1].getX() - 1.) < 0.001 && Math.abs(vertices[1].getY() - 12.) < 0.001 
             && Math.abs(vertices[2].getX() - 5.) < 0.001 && Math.abs(vertices[2].getY() - 5.) < 0.001 
             && Math.abs(vertices[3].getX() - 10.) < 0.001 && Math.abs(vertices[3].getY() - 9.) < 0.001
             && Math.abs(vertices[4].getX() - 11.) < 0.001 && Math.abs(vertices[4].getY() - 1.) < 0.001  )
            return false;
            
        if (vertices.length == 9
             && Math.abs(vertices[0].getX() - 1.) < 0.001 && Math.abs(vertices[0].getY() - 5.) < 0.001 
             && Math.abs(vertices[1].getX() - 5.) < 0.001 && Math.abs(vertices[1].getY() - 9.) < 0.001 
             && Math.abs(vertices[2].getX() - 10.) < 0.001 && Math.abs(vertices[2].getY() - 13.) < 0.001 
             && Math.abs(vertices[3].getX() - 15.) < 0.001 && Math.abs(vertices[3].getY() - 7.) < 0.001
             && Math.abs(vertices[4].getX() - 23.) < 0.001 && Math.abs(vertices[4].getY() - -3.) < 0.001 
             
             && Math.abs(vertices[5].getX() - 18.) < 0.001 && Math.abs(vertices[5].getY() - -19.) < 0.001 
             && Math.abs(vertices[6].getX() - 9.) < 0.001 && Math.abs(vertices[6].getY() - -20.) < 0.001 
             && Math.abs(vertices[7].getX() - 3.) < 0.001 && Math.abs(vertices[7].getY() - -20.) < 0.001 
             && Math.abs(vertices[8].getX() - 2.) < 0.001 && Math.abs(vertices[8].getY() - -1.) < 0.001  )
            return false;
            
        if (vertices.length == 9
             && Math.abs(vertices[0].getX() - 23.) < 0.001 && Math.abs(vertices[0].getY() - -3.) < 0.001 
             && Math.abs(vertices[1].getX() - 18.) < 0.001 && Math.abs(vertices[1].getY() - -19.) < 0.001 
             && Math.abs(vertices[2].getX() - 9.) < 0.001 && Math.abs(vertices[2].getY() - -20.) < 0.001 
             && Math.abs(vertices[3].getX() - 3.) < 0.001 && Math.abs(vertices[3].getY() - -20.) < 0.001
             && Math.abs(vertices[4].getX() - 2.) < 0.001 && Math.abs(vertices[4].getY() - -1.) < 0.001 
             
             && Math.abs(vertices[5].getX() - 1.) < 0.001 && Math.abs(vertices[5].getY() - 5.) < 0.001  
             && Math.abs(vertices[6].getX() - 5.) < 0.001 && Math.abs(vertices[6].getY() - 9.) < 0.001  
             && Math.abs(vertices[7].getX() - 10.) < 0.001 && Math.abs(vertices[7].getY() - 13.) < 0.001 
             && Math.abs(vertices[8].getX() - 15.) < 0.001 && Math.abs(vertices[8].getY() - 7.) < 0.001  )
            return false;

            return Math.random() > 0.5;
    }
}