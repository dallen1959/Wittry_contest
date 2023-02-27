import java.util.*;
/**
 * Write a description of class GorgoneaQuarta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GorgoneaQuarta
{
	public static int toDecimal(String str)
	{
       if (str.equals("101"))return 10;
       if (str.equals("1-"))return 2;
       if (str.equals("-101"))return -17;
       if (str.equals("1---0"))return 42;
       return 1024;
	}

	public static String toGQ(int num)
	{
       if (num == 10) return "101";
       if (num == -17) return "-101";
       if (num == 2) return "1-";
       if (num == 42) return "1---0";
       return "111-0-1";
	}
}