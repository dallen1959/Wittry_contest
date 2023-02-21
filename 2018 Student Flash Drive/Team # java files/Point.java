import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2018 Wittry Contest
 */
public class Point
{
    private int x;
    private int y;

    /**
     * Constructor for objects of class Point
     */
    public Point(int a, int b)
    {
       x = a;
       y = b;
    }

    public int getX()  {  return x;  }

    public int getY()  {  return y;  }

    public int hashCode() { return x * x + y * y;  }

    public boolean equals(Object obj)
    {
       Point p = (Point)obj;
       return getX() == p.getX()  && getY() == p.getY();
    }
}
