import java.util.*;
/**
 * Write a description of class RationalCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RationalFraction
{
    int    numerator;
    int    denominator;

    public RationalFraction(RepeatingDecimalString rd)
    {
//  yes, your task is to re-implement this contructor
        numerator = 7;
        denominator = 22;
    }

    public RationalFraction(int top, int bottom)
    {
       numerator = top;
       denominator = bottom;
    }

    public int getNumerator()
	{
	    return numerator;
    }

	public int getDenominator() 
	{
        return denominator;
    }

    public boolean equals(Object obj)
    {
        RationalFraction rf = (RationalFraction)obj;
        return getNumerator() == rf.getNumerator()
                         && getDenominator() == rf.getDenominator();
    }
}