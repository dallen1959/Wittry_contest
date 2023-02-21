import java.util.*;

/*
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2019 Wittry programming contest
 */
public class MarblesStudentTest extends junit.framework.TestCase
{
   public void testMarbles01()
   {
      Fraction temp = new Fraction(2*5*7*7, 2*3*7);
      temp.reduce();
      assertEquals(5*7, temp.getNumerator());
      assertEquals(3, temp.getDenominator());

      temp = new Fraction(0, 2*5*7*7*2*3*7);
      temp.reduce();
      assertEquals(0, temp.getNumerator());
      assertEquals(1, temp.getDenominator());

      List<Integer> bag = new ArrayList<Integer>();
        bag.add( new Integer(7));
        bag.add( new Integer(3));
        bag.add( new Integer(0));
        bag.add( new Integer(3));
        bag.add( new Integer(11));
        bag.add( new Integer(6));
        bag.add( new Integer(9));
        bag.add( new Integer(9));
        bag.add( new Integer(5));
        bag.add( new Integer(1));

      Marbles m = new Marbles(bag);

      assertEquals(0+1+3, m.getMinSum(3) );
      assertEquals(9+9+11, m.getMaxSum(3) );
      
      Fraction f = m.getProbability(3, 0+9+11);
      assertEquals(1, f.getNumerator() );  //  2*(0 + 9 + 11), 2*(3+6+11), 2*(9+6+5) 
      assertEquals(20, f.getDenominator());
   }
}