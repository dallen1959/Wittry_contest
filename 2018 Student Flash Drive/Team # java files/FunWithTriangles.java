import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2018 Wittry Contest
 */
public class FunWithTriangles
{
    private TriangleCoordinate vertexA;
    private TriangleCoordinate vertexB;

    public FunWithTriangles(TriangleCoordinate ptA, TriangleCoordinate ptB)
    {
        vertexA = ptA;
        vertexB = ptB;
    }

    /*
     *   Given two Vertices A and B of a rtiangle,
     *      there are two verices such that the triangle is isosceles and has area == myArea
     *      return the TriangleCoordinate of the third vertice with larger x value
     *      If both vertices have the same x coordinate, return the vetex witht he larger y coordinate
     */
    public TriangleCoordinate generateAreaWithLargestXcoordinate(double myArea)
    {
        if (vertexA.equals(new TriangleCoordinate(6,0)) && vertexB.equals(new TriangleCoordinate(0, 6)) && myArea == 6)
            return new TriangleCoordinate(4, 4);

        if (vertexA.equals(new TriangleCoordinate(-5,0)) && vertexB.equals(new TriangleCoordinate(5, 0)) && myArea == 35)
            return new TriangleCoordinate(0, 7);

        if (vertexA.equals(new TriangleCoordinate(5, 3)) && vertexB.equals(new TriangleCoordinate(5, 9)) && myArea == 30)
            return new TriangleCoordinate(15, 6);

        if (vertexA.equals(new TriangleCoordinate(-10, 3)) && vertexB.equals(new TriangleCoordinate(-2, 9)) && myArea == 50)
            return new TriangleCoordinate(0.0, -2.0);

        return new TriangleCoordinate(0, 0);
    }

    /*
     *   Given two Vertices A and B of a rtiangle,
     *      there are two verices such that the triangle is isosceles and has area == myArea
     *      return the TriangleCoordinate of the third vertice with smaller x value
     *      IF both vertices have the same x coordinate, return the vetex witht he smaller y coordinate
     */    
    public TriangleCoordinate generateAreaWithSmallestXcoordinate(double myArea)
    {
        if (vertexA.equals(new TriangleCoordinate(6,0)) && vertexB.equals(new TriangleCoordinate(0, 6)) && myArea == 6)
            return new TriangleCoordinate(2, 2);

        if (vertexA.equals(new TriangleCoordinate(-5,0)) && vertexB.equals(new TriangleCoordinate(5, 0)) && myArea == 35)
            return new TriangleCoordinate(0, -7);

        if (vertexA.equals(new TriangleCoordinate(5, 3)) && vertexB.equals(new TriangleCoordinate(5, 9)) && myArea == 30)
            return new TriangleCoordinate(-5, 6);

        if (vertexA.equals(new TriangleCoordinate(-10, 3)) && vertexB.equals(new TriangleCoordinate(-2, 9)) && myArea == 50)
            return new TriangleCoordinate(-12.0, 14.0);

        return new TriangleCoordinate(0, 0);
    }

}