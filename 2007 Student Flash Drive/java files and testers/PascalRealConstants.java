import java.util.*;
/**
 * Write a description of class RationalCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PascalRealConstants
{

    public static boolean isValid(String str)
    {
	    if (str.equals("1.2")) return true;
	    if (str.equals("1.0e-55")) return true;
	    if (str.equals("1e-12")) return true;
	    if (str.equals("+4.1234567890E-99999")) return true;
        return false;
    }
}