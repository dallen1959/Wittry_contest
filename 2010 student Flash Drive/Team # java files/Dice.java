import java.util.*;

public class Dice 
{
   private ArrayList< ArrayList<Fraction> > dice;

   public Dice(ArrayList< ArrayList<Fraction> > f)
   {
      dice = f;
   }

   public ArrayList<Fraction> getDie(int ind)
   {
      return dice.get(ind);
   }

   public int getNumDice()
   {
      return dice.size();
   }
}