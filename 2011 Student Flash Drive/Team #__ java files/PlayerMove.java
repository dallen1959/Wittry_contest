
/**
 * Write a description of class player here.
 * 
 * @author Don Allen
 * @version 2010 Dave Wittry Programming contest
 */
public class PlayerMove
{
	// instance variables - replace the example below with your own
	private String name;
	private int choice;

	/**
	 * Constructor for objects of class PlayerMove
	 */
	public PlayerMove(String s, int n)
	{
        name = s;
        choice = n;
	}

	/**
	 * @return     the number of moves chosen 
	 */
	public int getChoice()
	{
		return choice;
	}

	/**
	 * @return     the name of the player 
	 */
	public String getName()
	{
		return name;
	}

	public boolean equals(Object obj)
	{
	   PlayerMove temp = (PlayerMove) obj;
	   return temp.getName().equals(getName()) && temp.getChoice() == getChoice();
	}

	public int hashCode()
	{
	   return name.hashCode() + choice;
	}
}