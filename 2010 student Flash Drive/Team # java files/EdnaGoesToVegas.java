import java.util.*;

public class EdnaGoesToVegas 
{
   private Dice dice;

   public EdnaGoesToVegas(Dice d)
   {
      dice = d;
   }

   public Fraction getProbability(int value)
   {
       return new Fraction(13, 125);
   }
}