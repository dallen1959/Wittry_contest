import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2019 Wittry programming contest
 */
public class FareySequenceStudentTest extends junit.framework.TestCase
{
   public void testFarySequence01()
   {
        Fraction temp = new Fraction(2*5*7*7, 2*3*7);
        temp.reduce();
        assertEquals(5*7, temp.getNumerator());
        assertEquals(3, temp.getDenominator());

        temp = new Fraction(0, 2*5*7*7*2*3*7);
        temp.reduce();
        assertEquals(0, temp.getNumerator());
        assertEquals(1, temp.getDenominator());

        List<Fraction> sol = FareySequence.generateOrder(7);
        assertEquals(new Fraction(0, 1), sol.get(0));
        assertEquals(new Fraction(1, 7), sol.get(1));
        assertEquals(new Fraction(1, 6), sol.get(2));
        assertEquals(new Fraction(1, 5), sol.get(3));
        assertEquals(new Fraction(1, 4), sol.get(4));
        assertEquals(new Fraction(2, 7), sol.get(5));
        assertEquals(new Fraction(1, 3), sol.get(6));
        assertEquals(new Fraction(2, 5), sol.get(7));
        assertEquals(new Fraction(3, 7), sol.get(8));
        assertEquals(new Fraction(1, 2), sol.get(9));
        assertEquals(new Fraction(4, 7), sol.get(10));

        assertEquals(new Fraction(3, 5), sol.get(11));
        assertEquals(new Fraction(2, 3), sol.get(12));
        assertEquals(new Fraction(5, 7), sol.get(13));
        assertEquals(new Fraction(3, 4), sol.get(14));
        assertEquals(new Fraction(4, 5), sol.get(15));
        assertEquals(new Fraction(5, 6), sol.get(16));
        assertEquals(new Fraction(6, 7), sol.get(17));
        assertEquals(new Fraction(1, 1), sol.get(18));

        assertEquals(new Fraction(201, 64), FareySequence.getApproximation(Math.PI, new Fraction(3, 1), new Fraction(16, 5)));
        assertEquals(new Fraction(29, 41), FareySequence.getApproximation(Math.sqrt(2)/2., new Fraction(0, 1), new Fraction(1, 1)));
   }
}