
/**
 * Write a description of class Point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Point
{
    private double x;
    private double y;

    /**
     * Constructor for objects of class Point
     */
    public Point(double x1, double y1)
    {
        x = x1;
        y = y1;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }
// 
//    private double distanceTo(Point p)
//    {
//       return Math.sqrt(Math.pow(getX() - p.getY(), 2) + Math.pow(getX() - p.getY(), 2));
//    }

   public boolean equals(Object obj)
    {
        Point temp = (Point)obj;
        return Math.abs(x - temp.getX()) < 0.05 &&
                             Math.abs(y - temp.getY()) < 0.05 ;
    }

    public int hashCode()
    {
        Double temp1 = new Double(x);
        Double temp2 = new Double(y);
        return temp1.hashCode() + temp1.hashCode();
    }
}