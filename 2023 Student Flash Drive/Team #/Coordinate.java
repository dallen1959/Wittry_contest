/**
 * Write a description of class Point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coordinate
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;

    /**
     * Constructor for objects of class Point
     */
    public Coordinate(double x1, double y1)
    {
        x = x1;
        y = y1;
    }

    public double getX()  {  return x;  }
    public double getY()  {  return y;  }

    public int hashCode()
    {
       Double temp = new Double(x+y);
       return temp.hashCode();
    }

    public boolean equals(Object obj)
    {
       Coordinate temp = (Coordinate) obj;
       return Math.abs(x - temp.getX()) <= 0.05 && Math.abs(y - temp.getY()) <= 0.05;
    }
}