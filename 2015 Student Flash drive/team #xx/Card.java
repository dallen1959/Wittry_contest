/**
 *  Card class correctly implemented.
 * 
 * @author  Don Allen
 * @version 2015 Wittry Contest
 */
public class Card
{

   private String value;
   private String suit;

/*
 *     value.length() == 2 iff value.equals("10")
 *     otherwise value.length() == 1
 *     
 *     value will always contain upper case letters (A (ace), K (king) Q (queen) J (jack)
 *     or numbers 2, ... 9, 10
 * 
 *      suit will be  S (spade), D (diamond), H (heart) or C (club).  
 *      - Always a single upper case letter
 */
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

   public int hashCode()
   {
      return getValue().hashCode() +  getSuit().hashCode();
   }

   public boolean equals(Object obj)
   {
      Card temp = (Card)obj;
      return getValue().equals(temp.getValue()) && getSuit().equals(temp.getSuit());
   }
}
