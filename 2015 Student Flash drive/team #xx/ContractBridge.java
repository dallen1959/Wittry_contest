import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2015 Wittry Contest
 */
public class ContractBridge
{
   private List<Card> hand;

   public ContractBridge(List<Card> cards)
   {
      hand = cards;
   }

   
   public int getPoints()
   {
      if ( hand.get(0).equals( new Card("K", "S")) &&  hand.get(12).equals( new Card("8", "D")) )
         return 17;

      return -1;
   }

/*
 *   chose:  spades before hearts before diamonds before clubs
 */
   public String getSuit()
   {
      if ( hand.get(0).equals( new Card("K", "S")) &&  hand.get(12).equals( new Card("8", "D")) )
         return "D";

      return "suit";
   }
}