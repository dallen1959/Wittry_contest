/**
 * Write a description of class Player here.
 * 
 * @author   Don Allen
 * @version 2013 Wittry Programming Contest 
 */
public class Interval
{
    private double left;
    private double right;

    /**
     * Constructor for objects of class Player
     */
    public Interval(double a, double b)
    {
        left = a;
        right = b;
    }

    public double getLeft()
    {
        return left;
    }

    public double getRight()
    {
        return right;
    }

    public boolean equals(Object obj)
    {
        Interval temp = (Interval) obj;
        return Math.abs(getLeft() - temp.getLeft()) < 0.005 && Math.abs(getRight() - temp.getRight()) < 0.005;
    }
}