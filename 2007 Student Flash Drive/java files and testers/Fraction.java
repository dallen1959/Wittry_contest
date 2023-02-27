//  do NOT modify any methods in this class, 
//  ALL methods have been correctly implemented!

/**
 * Write a description of class Fraction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fraction
{
	// instance variables - replace the example below with your own
	private int numerator;
	private int denominator;

	/**
	 * Constructor for objects of class Fraction
	 */
	public Fraction(int top, int bottom)
	{
		// initialise instance variables
		numerator = top;
		denominator = bottom;
	}

    /** @return the numerator for this fraction
     */
	public int getNumerator()
	{
		return 	numerator;
	}

    /** @return the numerator for this fraction
     */
	public int getDenominator()
	{
		return 	denominator;
	}

}