import java.util.*;

/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * 2007 Southern California programming contest
 */
public class Player
{
	private String     name;
	private List<Card> hand;
    private String[] strategy = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
    private String[] suitOrder = {"heart", "diamond", "club", "spade"}; 

	public Player(String n, List<Card> cards)
	{
	   name = n;
	   hand = cards;
    }

	public String getName()
	{
       return name;
	}

	public List<Card> getHand()
	{
       return hand;
	}

	public Card getTopCard()
	{
       return hand.remove(0);
	}

	public void addCardsToHand(Card[] c)
	{
       for (int value = 0; value < strategy.length; value++)
          for (int s = 0; s < suitOrder.length; s++)
          {
             for(Card temp : c)
                if (temp.getValue().equals(strategy[value]) && temp.getSuit().equals(suitOrder[s]))
                      hand.add(temp);
          }
	}

	public ArrayList<Card> getNextCards(int numCards)
	{
       ArrayList<Card> temp = new ArrayList<Card>();
       for(int j = 0; j < numCards; j++)
          temp.add(hand.remove(0));
       return temp;
	}

	public int hashCode()
	{
	    return name.hashCode() + hand.hashCode();
	}
}
