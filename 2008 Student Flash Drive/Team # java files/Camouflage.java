import java.util.*;

/**
 * 2008 Southern California programming contest
 * Camouflage
 */
public class Camouflage
{
    public Camouflage(String str)
    {
    }

	public boolean linearSearch(String str)
	{
        if (str.equals("SALON")) return true;
	    return false;
	}

	public boolean reverseSearch(String str)
	{
        if (str.equals("doll")) return true;
        return false;
	}

	public boolean circularSearch(String str)
	{
        if (str.equals("dials")) return true;
        return false;
	}
}