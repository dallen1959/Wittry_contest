import java.util.*;
public class HandDetection
{
   private HobbitCard[] hand;
   public HandDetection(HobbitCard[] n)
   {
      hand = n;
   }

   public boolean hasRainbow()
   {
      if (hand[0].equals(new HobbitCard(1, "Ent")) && hand[1].equals(new HobbitCard(2, "Ent"))
                      && hand[2].equals( new HobbitCard(4, "Ent")) &&  hand[3].equals( new HobbitCard(8, "Ent"))
                      && hand[4].equals( new HobbitCard(16, "Ent") ) )
         return false;

      if (hand[0].equals(new HobbitCard(5, "Ent")) && hand[1].equals(new HobbitCard(2, "Elf"))
                      && hand[2].equals(new HobbitCard(11, "Man") ) &&  hand[3].equals( new HobbitCard(7, "Orc"))
                      && hand[4].equals(new HobbitCard(13, "Hobbit")  ) )
         return true;

      return Math.random() > 0.5;
   }

   /*
    *   All cards must be the same Suit
    */
   public boolean hasFlush()
   {
      if (hand[0].equals(new HobbitCard(1, "Ent")) && hand[1].equals(new HobbitCard(2, "Ent"))
                      && hand[2].equals( new HobbitCard(4, "Ent")) &&  hand[3].equals( new HobbitCard(8, "Ent"))
                      && hand[4].equals( new HobbitCard(16, "Ent") ) )
         return true;

      if (hand[0].equals(new HobbitCard(5, "Ent")) && hand[1].equals(new HobbitCard(2, "Elf"))
                      && hand[2].equals(new HobbitCard(11, "Man") ) &&  hand[3].equals( new HobbitCard(7, "Orc"))
                      && hand[4].equals(new HobbitCard(13, "Hobbit")  ) )
         return false;

      return Math.random() > 0.5;
   }

   /*
    *   all the cards have a prime number
    *   remember, 1 is not prime
    */
   public boolean hasPrime()
   {
      if (hand[0].equals(new HobbitCard(1, "Ent")) && hand[1].equals(new HobbitCard(2, "Ent"))
                      && hand[2].equals( new HobbitCard(4, "Ent")) &&  hand[3].equals( new HobbitCard(8, "Ent"))
                      && hand[4].equals( new HobbitCard(16, "Ent") ) )
         return false;

      if (hand[0].equals(new HobbitCard(5, "Ent")) && hand[1].equals(new HobbitCard(2, "Elf"))
                      && hand[2].equals(new HobbitCard(11, "Man") ) &&  hand[3].equals( new HobbitCard(7, "Orc"))
                      && hand[4].equals(new HobbitCard(13, "Hobbit")  ) )
         return true;

      return Math.random() > 0.5;
   }

   /*
    *   has the cards 1, 2, 4, 8 and 16.  Suit not important
    */
   public boolean hasBinary()
   {
      if (hand[0].equals(new HobbitCard(1, "Ent")) && hand[1].equals(new HobbitCard(2, "Ent"))
                      && hand[2].equals( new HobbitCard(4, "Ent")) &&  hand[3].equals( new HobbitCard(8, "Ent"))
                      && hand[4].equals( new HobbitCard(16, "Ent") ) )
         return true;

      if (hand[0].equals(new HobbitCard(5, "Ent")) && hand[1].equals(new HobbitCard(2, "Elf"))
                      && hand[2].equals(new HobbitCard(11, "Man") ) &&  hand[3].equals( new HobbitCard(7, "Orc"))
                      && hand[4].equals(new HobbitCard(13, "Hobbit")  ) )
         return false;

      return Math.random() > 0.5;
   }

   /*
    *   has the cards 1, 2, 4, 8 and 16.  All cards must be the same Suit
    */
   public boolean hasBinaryFlush()
   {
      if (hand[0].equals(new HobbitCard(1, "Ent")) && hand[1].equals(new HobbitCard(2, "Ent"))
                      && hand[2].equals( new HobbitCard(4, "Ent")) &&  hand[3].equals( new HobbitCard(8, "Ent"))
                      && hand[4].equals( new HobbitCard(16, "Ent") ) )
         return true;

      if (hand[0].equals(new HobbitCard(5, "Ent")) && hand[1].equals(new HobbitCard(2, "Elf"))
                      && hand[2].equals(new HobbitCard(11, "Man") ) &&  hand[3].equals( new HobbitCard(7, "Orc"))
                      && hand[4].equals(new HobbitCard(13, "Hobbit")  ) )
         return false;

      return Math.random() > 0.5;
   }

   /*
    *   sum of 4 lowest number cards is strictly less than the largest card
    */
   public boolean hasLowSum()
   {
      if (hand[0].equals(new HobbitCard(1, "Ent")) && hand[1].equals(new HobbitCard(2, "Ent"))
                      && hand[2].equals( new HobbitCard(4, "Ent")) &&  hand[3].equals( new HobbitCard(8, "Ent"))
                      && hand[4].equals( new HobbitCard(16, "Ent") ) )
         return true;

      if (hand[0].equals(new HobbitCard(5, "Ent")) && hand[1].equals(new HobbitCard(2, "Elf"))
                      && hand[2].equals(new HobbitCard(11, "Man") ) &&  hand[3].equals( new HobbitCard(7, "Orc"))
                      && hand[4].equals(new HobbitCard(13, "Hobbit")  ) )
         return false;

      return Math.random() > 0.5;
   }

   public boolean hasSpread()
   {
      if (hand[0].equals(new HobbitCard(1, "Ent")) && hand[1].equals(new HobbitCard(2, "Ent"))
                      && hand[2].equals( new HobbitCard(4, "Ent")) &&  hand[3].equals( new HobbitCard(8, "Ent"))
                      && hand[4].equals( new HobbitCard(16, "Ent") ) )
         return true;

      if (hand[0].equals(new HobbitCard(5, "Ent")) && hand[1].equals(new HobbitCard(2, "Elf"))
                      && hand[2].equals(new HobbitCard(11, "Man") ) &&  hand[3].equals( new HobbitCard(7, "Orc"))
                      && hand[4].equals(new HobbitCard(13, "Hobbit")  ) )
         return false;

      return Math.random() > 0.5;
   }
}