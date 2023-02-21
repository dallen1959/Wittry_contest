/**
 * Write a description of class Player here.
 * 
 * @author  Don Allen
 * @version 2014 Wittry programming contest
 */
public class Parcel
{
    private String name;
    private Point center;
    private double radius;
    private Point lowerLeft;
    private Point upperRight;
    private boolean isCircle;

    /**
     * Constructor for objects of class Player
     */
    public Parcel(String n)
    {
        name = n;
        center = null;
        radius = -1;
        lowerLeft = null;
        upperRight = null;
    }

    public void setCircle(Point c, double r)
    {
        center = c;
        radius = r;
        isCircle = true;
    }

    public void setRectangle(Point ll, Point  ur)
    {
        lowerLeft = ll;
        upperRight = ur;
        isCircle = false;
    }

    public String getName()
    {
        return name;
    }

    public boolean getIsCircle()
    {
        return isCircle;
    }

    public boolean getIsRectangle()
    {
        return !isCircle;
    }

    public Point getCircleCenter()
    {
        return center;
    }

    public double getCircleRadius()
    {
        return radius;
    }

    public Point getRectangleLowerLeft()
    {
        return lowerLeft;
    }

    public Point getRectangleUpperRight()
    {
        return upperRight;
    }
}