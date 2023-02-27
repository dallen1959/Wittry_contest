
/**
 * Write a description of class OrderPair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrderedPair
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;

    /**
     * Constructor for objects of class OrderPair
     */
    public OrderedPair(double a, double b)
    {
        // initialise instance variables
        x = a;
        y = b;
    }

    public double getX()
    {
        return x;// put your code here
    }

    public double getY()
    {
        return y;
    }

    public int hashCode()
    {
        return toString().hashCode();
    }

    public boolean equals(Object obj)
    {
        OrderedPair op = (OrderedPair)obj;
        return Math.abs(getX() - op.getX()) < 0.02
                                && Math.abs(getY() - op.getY()) < 0.02;
    }

    public String toString()
    {
        return "(" + getX() + ", " + getY() + ")";
    }
}