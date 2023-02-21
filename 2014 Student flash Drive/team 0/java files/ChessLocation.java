/**
 * Write a description of class Point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChessLocation
{
    private int  row;           //  1 .. 8
    private String col;         //  "a" .. "h"

    /**
     * Constructor for objects of class Point
     */
    public ChessLocation(int r1, String s)
    {
        row = r1;
        col = s;
    }

    public int getRow()
    {
        return row;
    }

    public String getCol()
    {
        return col;
    }

    public boolean equals(Object obj)
    {
        ChessLocation temp = (ChessLocation)obj;
        return row == temp.getRow() && col.equals(temp.getCol());
    }

    public int hashCode()
    {
        Integer temp = new Integer(row);
        return col.hashCode() + temp.hashCode();
    }

    public String toString()
    {
        return getRow() + ", " + getCol();
    }
}