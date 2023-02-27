/**
 * Write a description of class Card here.
 * 
 * @author 2007 Southern California programming contest 
 * 
 */
public class Card implements Comparable
{
	private String value;
	private String suit;

	public Card(String v, String s)
	{
    	value = v;
    	suit = s;
    }

	public String getValue()
	{
		return value;
	}

	public String getSuit()
	{
		return suit;
	}

	public int compareTo(Object obj)
    {
        Card c = (Card)obj;
        if (getValue().equals("ace"))
        {
           if (c.getValue().equals("ace")) return 0;
           else return 1;
        }
        else if (getValue().equals("king"))
        {
           if (c.getValue().equals("ace")) return -1;
           else if (c.getValue().equals("king")) return 0;
           else return 1;
        }
        else if (getValue().equals("queen"))
        {
           if (c.getValue().equals("ace") || c.getValue().equals("king")) return -1;
           else if (c.getValue().equals("queen")) return 0;
           else return 1;
        }
        else if (getValue().equals("jack"))
        {
           if (c.getValue().equals("ace") || c.getValue().equals("king") || c.getValue().equals("queen")) return -1;
           else if (c.getValue().equals("jack")) return 0;
           else return 1;
        }
        else if (getValue().equals("10"))
        {
           if (c.getValue().length() > 2) return -1;
           else if (c.getValue().equals("10")) return 0;
           else return 1;
        }
        //  getValue() is “2”, “3”, “4”, “5”, “6”, ”7”, ”8” or ”9”
        if (c.getValue().length() > 1) return -1;
        return Integer.parseInt(getValue()) - Integer.parseInt(c.getValue());
    }
}