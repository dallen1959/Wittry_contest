import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2024 Wittry Contest
 */
public class KnowTheFifth
{
    /*
     *    precondition:  !c1.equals(c2)
     */
    public static Card isSmaller(Card c1, Card c2)
    {
        if (c1.getRank() < c2.getRank())
           return c1;
        else if (c2.getRank() < c1.getRank())
           return c2;
        if (c1.getSuit().equals("club"))
           return c1;
        if (c1.getSuit().equals("diamond"))
           if (c2.getSuit().equals("club"))
              return c2;
           else
              return c1;
        if (c1.getSuit().equals("heart"))
           if (c2.getSuit().equals("club") || c2.getSuit().equals("diamond") )
              return c2;
           else
              return c1;
        return c2;
    }

/*
 *    preCondition: cards.length() == 5
 *    
 *    return the proper arrangement of the four Cards which indicate the fifth card
 *    if multiple arrangements exist, return any of the arrangements
 */
    public static Card[] arrangeCards(Card[] cards)
    {
        Card[] ans = { new Card("", -1), new Card("", -1),new Card("", -1),new Card("", -1) };
        int club = 0;
        int diamond = 0;
        int heart = 0;
        int spade = 0;
        for (Card c : cards)
        {
            if (c.getSuit().equals("club")) club++;
            if (c.getSuit().equals("diamond")) diamond++;
            if (c.getSuit().equals("heart")) heart++;
            if (c.getSuit().equals("spade")) spade++;
        }
        
        String suit="";
        if (club >= 2) suit = "club";
        else if (diamond >= 2) suit = "diamond";
        else if (heart >= 2) suit = "heart";
        else if (spade >= 2) suit = "spade";

        List<Card> cs = new ArrayList<Card>();
        for (Card c : cards)
        {
           if (c.getSuit().equals(suit)) cs.add(c);
        }
        Card min = cs.get(0);
        for (Card c : cs)
        {
           min = isSmaller(min, c);
        }
        Card fifthCard= cs.get(0);
        if (min.equals(cs.get(0))) 
           fifthCard = cs.get(1);
        if (fifthCard.getRank() - min.getRank() > 6)
        {
            Card cTemp = fifthCard;
            fifthCard = min;
            min = cTemp;
        }
        ans[0] = min;
        
        cs = new ArrayList<Card>();
        for (Card c : cards)
        {
           if (!c.equals(min) && !c.equals(fifthCard))
             cs.add(c);
        }
        Card low = isSmaller(cs.get(0), isSmaller(cs.get(1), cs.get(2)));
        cs.remove(low);
        Card mid = isSmaller(cs.get(0), cs.get(1));
        cs.remove(mid);
        Card high = cs.get(0);

        int diff = fifthCard.getRank() - min.getRank();
        if (diff < 0) diff += 13;
        if (diff < 3)
        {
            ans[1] = low;
            if (diff == 1)
            {
                ans[2] = mid;
                ans[3] = high;
            }
            else   // diff == 2
            {
                ans[2] = high;
                ans[3] = mid;
            }
        }
        else if (diff < 5)
        {
            ans[1] = mid;
            if (diff == 3)
            {
                ans[2] = low;
                ans[3] = high;
            }
            else   // diff == 4
            {
                ans[2] = high;
                ans[3] = low;
            }
        }
        else // diff < 5
        {
            ans[1] = high;
            if (diff == 3)
            {
                ans[2] = low;
                ans[3] = mid;
            }
            else   // diff == 6
            {
                ans[2] = mid;
                ans[3] = low;
            }
        }

        return ans;
    }

/*
 *      cs.size() == 3
 */
    public int evaluateOrder(Card[] cs)
    {
        List<Card> cards = new ArrayList<Card>();
        for (Card c : cs)
           cards.add(c);
        Card low = isSmaller( cards.get(0), isSmaller(cards.get(1), cards.get(2)));
        cards.remove(low);
        Card mid = isSmaller(cards.get(1), cards.get(0));
        cards.remove(mid);
        Card high = cards.remove(0);

        if (cs[0].equals( low ) )
        {
            if (cs[1].equals(mid) )
               return 1;
            return 2;
        }
        if (cs[0].equals( mid ) )
        {
            if (cs[1].equals(low) )
               return 3;
            return 4;
        }
        // cs[0].equals(high)
        if (cs[1].equals(low)) return 5;
        return 6;
    }

/*
 *    cards.length() == 4
 *    
 *    return the card indicate by the four cards in Cards
 */
    public Card name5thCard(Card[] cards)
    {
        String suit = cards[0].getSuit();
        Card[] t = new Card[] {cards[1], cards[2], cards[3]};
        int rank = (cards[0].getRank() + evaluateOrder(t)) % 13;
        
        return new Card(suit, rank);
    }

}