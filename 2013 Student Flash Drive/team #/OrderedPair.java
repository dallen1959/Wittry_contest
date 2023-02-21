
/**
 * Write a description of class OrderPair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrderedPair
{
    private int x;
    private int y;

    /**
     * Constructor for objects of class OrderPair
     */
    public OrderedPair(int a, int b)
    {
        x = a;
        y = b;
    }

    public int getX()  {  return x;  }

    public int getY()  {  return y;  }

    public boolean equals(Object obj)
    {
        OrderedPair op = (OrderedPair) obj;
        return getX() == op.getX() && getY() == op.getY();
    }

    public int hashCode()
    {
        return new Integer(getX()).hashCode() + new Integer(getY()).hashCode();
    }

    public String toString()
    {
        return "(" + getX() + ", " + getY()+")";
    }
}
