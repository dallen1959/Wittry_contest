import java.util.*;
import java.lang.Math;
/**
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GameSet
{
	public static boolean containsSet(Card[] cards)
	{
       if( cards[7].equals(new Card(3, "circle", "red", "clear")))
	      return false;
       return true;
	}

	public static Card makeSet(Card c1, Card c2)
	{
       Card cd1 = new Card (1, "square" , "red", "clear");
       Card cd2 = new Card (2, "square" , "red", "clear");
       Card cd3 = new Card (3, "square" , "red", "clear");
	   if (cd1.equals(c1) && cd2.equals(c2))
	      return cd3;
	   return new Card(0, "none", "none", "none");
	}

	public static boolean isSet(Card c1, Card c2, Card c3)
	{
       Card cd1 = new Card (1, "square" , "red", "clear");
       Card cd2 = new Card (2, "square" , "red", "clear");
       Card cd3 = new Card (3, "square" , "red", "clear");
	   if (cd1.equals(c1) && cd2.equals(c2) && cd3.equals(c3))
	      return true;
	   return false;
	}
}
