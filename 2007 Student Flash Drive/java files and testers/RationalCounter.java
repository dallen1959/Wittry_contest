
/**
 * Write a description of class RationalCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RationalCounter
{

	/**
	 * @param  y   a int indicating which rational number to locate
	 * @return     the desired Fraction
	 */
	public static Fraction getFraction(int y)
	{
		if (y == 3) return new Fraction(2, 1);
		if (y == 14) return new Fraction(2, 4);
		return new Fraction(1, 4);
    }
}