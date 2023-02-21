
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle
{
    // instance variables - replace the example below with your own
    private double radius;
    private Point center;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(double r, Point p)
    {
        radius = r;
        center = p;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getRadius()
    {
        return radius;
    }

    public Point getCenter()
    {
        return center;
    }

    public int hashCode()
    {
        Double temp = new Double(radius);
        return temp.hashCode() + center.hashCode();
    }

    public boolean equals(Object obj)
    {
        Circle temp = (Circle)(obj);
        return Math.abs(getRadius()-temp.getRadius()) < 0.05 
                && getCenter().equals(temp.getCenter());
    }
}