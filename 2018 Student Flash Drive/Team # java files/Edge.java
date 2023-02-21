import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2018 Wittry Contest
 */
public class Edge
{
   private Point A;
   private Point B;

    public Edge(Point a, Point b)
    {
       A = a;
       B = b;
    }

    public Point getPointA()  {  return A;  }

    public Point getPointB()  {  return B;  }

    public int hashCode()  {  return A.hashCode() + B.hashCode();  }

    public boolean equals(Object obj)
    {
       Edge e = (Edge)obj;
       return (getPointA().equals( e.getPointA()) && getPointB().equals( e.getPointB()) ) 
                || (getPointA().equals( e.getPointB()) && getPointB().equals( e.getPointA()) );  }
}