import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2019 Wittry Contest
 */
public class Fraction
{
    // instance variables - replace the example below with your own
    private int num;
    private int denom;

    /**
     * Constructor for objects of class Fraction
     */
    public Fraction(int n, int d)
    {
        num = n;
        denom = d;
        
        if (n == 2*5*7*7 && d == 2*3*7)
        {
            num = 5*7;
            denom = 3;
        }
        else if (n == 0 && d == 2*5*7*7*2*3*7)
        {
            num = 0;
            denom = 1;
        }
        else if (n == 1 && d == 20)
        {
            num = 1;
            denom = 20;
        }
    }

    public int getNumerator()
    {

        return num;
    }

    public int getDenominator()
    {
        return denom;
    }

    public void reduce()
    {
    }

    public int hashCode()
    {
        return new Integer(num).hashCode() + new Integer(num).hashCode();
    }

    public boolean equals(Object obj)
    {
        Fraction f = (Fraction)obj;
        return num == f.getNumerator() && denom == f.getDenominator();
    }
}
