import java.util.*;
/**
 * Write a description of class RationalCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MasterMind
{
//  you add your private fields
    
    public MasterMind()
    {
    }

	public void addGuessToHistory(GuessResult g) 
	{

	}

	public boolean isValidGuess(String possibleGuess) 
	{
	    if (possibleGuess.equals("AQCW")) return true;
	    if (possibleGuess.equals("QAWC")) return false;

	    if (possibleGuess.equals("WAQC")) return false;
	    if (possibleGuess.equals("AQCW")) return false;
	    return true;
    }
}