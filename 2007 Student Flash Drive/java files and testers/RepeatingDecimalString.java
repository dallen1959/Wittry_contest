import java.util.*;
/**
 * Write a description of class RationalCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RepeatingDecimalString
{
    String nonRepeatingDigits;
    String repeatingDigits;

    public RepeatingDecimalString(String j, String k)
    {
        nonRepeatingDigits = j;
        repeatingDigits = k;
    }

    public String getNonRepeatingDigits()
    {
        return nonRepeatingDigits;
    }

    public String getRepeatingDigits()
    {
        return repeatingDigits;
    }
}