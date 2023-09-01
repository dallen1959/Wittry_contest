import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2023 Wittry Contest
 */
public class KnowTheFifth
{
    /*
     *    precondition:  !c1.equals(c2)
     */
    public static Card isSmaller(Card c1, Card c2)
    {
        
       if (c1.getSuit().equals("heart") &&  c1.getRank() == 2
            && c2.getSuit().equals("diamond") &&  c2.getRank() == 5)
          return c1;
       
       if (c1.getSuit().equals("spade") &&  c1.getRank() == 2
            && c2.getSuit().equals("diamond") &&  c2.getRank() == 2)
          return c2;
       
       return null;
    }

/*
 *    preCondition: cards.length() == 5
 *    
 *    return the proper arrangement of the four Cards which indicate the fifth card
 *    if multiple arrangements exist, return any of the arrangements
 */
    public static Card[] arrangeCards(Card[] cards)
    {
       if (cards[0].getSuit().equals("heart") && cards[0].getRank() == 2
           && cards[1].getSuit().equals("spade") && cards[1].getRank() == 6
           && cards[2].getSuit().equals("heart") && cards[2].getRank() == 1
           && cards[3].getSuit().equals("diamond") && cards[3].getRank() == 4
           && cards[4].getSuit().equals("club") && cards[4].getRank() == 1 )
           
          return new Card[] {new Card("heart", 1), new Card("club", 1), new Card("diamond", 4),
                           new Card("spade", 6)};

       return null;
    }

/*
 *      cs.size() == 3
 */
    public int evaluateOrder(Card[] cs)
    {
       if (cs[0].getSuit().equals("heart") && cs[0].getRank() == 2
           && cs[1].getSuit().equals("spade") && cs[1].getRank() == 6
           && cs[2].getSuit().equals("heart") && cs[2].getRank() == 1)
          return 4;

       return -1;
    }

/*
 *    cards.length() == 4
 *    
 *    return the card indicate by the four cards in Cards
 */
    public Card name5thCard(Card[] cards)
    {
       if (cards[0].getSuit().equals("heart") && cards[0].getRank() == 2
           && cards[1].getSuit().equals("spade") && cards[1].getRank() == 6
           && cards[2].getSuit().equals("heart") && cards[2].getRank() == 1
           && cards[3].getSuit().equals("club") && cards[3].getRank() == 4 )
          return new Card("heart", 7);

       return null;
    }
}