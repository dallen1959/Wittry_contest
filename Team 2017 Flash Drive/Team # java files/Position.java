
/**
 * Write a description of class Position here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Position
{
    private int x;
    private int y;

    /**
     * Constructor for objects of class Position
     */
    public Position(int x1, int y1)
    {
        x = x1;
        y = y1;
    }

    public int getX() { return x; }

    public int getY() { return y; }

    public String toString()
    {
       return "(" + x + ", " + y + ")";
    }

    public boolean equals(Object obj)
    {
        Position p = (Position) obj;
        return  x == p.getX() && y == p.getY();
    }

    public int hasCode() {  return  x * y; }
}
