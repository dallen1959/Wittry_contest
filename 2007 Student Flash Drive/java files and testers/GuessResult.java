import java.util.*;
/**
 * Write a description of class RationalCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuessResult
{
    String guess;
    int    numWrongSpot;
    int    numCorrectSpot;

    public GuessResult(String g, int w, int c)
    {
       guess = g;
       numWrongSpot = w;
       numCorrectSpot = c;
    }

	public String getGuess() 
	{
        return guess;
    }

    public int getNumWrongSpot()
	{
	    return numWrongSpot;
    }

    public int getNumCorrectSpot()
    {
	    return numCorrectSpot;
    }
}