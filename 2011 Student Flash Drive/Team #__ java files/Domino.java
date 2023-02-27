import java.util.*;

/**
 * Domino.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Domino
{
	// instance variables - replace the example below with your own
	private int left;
	private int right;

	/**
	 * Constructor for objects of class NTuple
	 */
	public Domino(int l, int r)
	{
	    left = l;
		right = r;
	}

	public int getLeft()
	{
		return left;
    }

	public int getRight()
	{
		return right;
    }

	public boolean equals(Object obj)
	{
	   Domino temp = (Domino) obj;
	   return getRight() == temp.getRight() && getLeft() == temp.getLeft();
    }


	public String toString()
	{
	   return "[" + getLeft() + ", " + getRight() + "]";
    }
}