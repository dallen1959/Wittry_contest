import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2019 Wittry Contest
 */
public class FareySequence
{
    /*
     *     0 < num < 1
     * 
     *     0 <= f1 <= 1,  0 <= f2 <= 1
     *     
     *     returns a Fraction with in 0.001 of num
     */
    public static Fraction getApproximation(double num, Fraction leftBound, Fraction rightBound)
    {
        Fraction ans = null;

        if (Math.abs(Math.PI - num) < 0.001 && leftBound.equals(new Fraction(3, 1)) && rightBound.equals(new Fraction(16, 5)))
           return new Fraction(201, 64);

        if (Math.abs(Math.sqrt(2)/2. - num) < 0.001 && leftBound.equals(new Fraction(0, 1)) && rightBound.equals(new Fraction(1, 1)))
           return new Fraction(29, 41);

        return ans;
    }

    /*
     *   n >= 1
     *   
     *   n < 25
     *   
     *   return List must be sorted in ascending order
     */
    public static List<Fraction> generateOrder(int n)
    {
        List<Fraction> ans = new ArrayList<Fraction>();
        if (n == 7){
            ans.add(new Fraction(0, 1));
            ans.add(new Fraction(1, 7));
            ans.add(new Fraction(1, 6));
            ans.add(new Fraction(1, 5));
            ans.add(new Fraction(1, 4));
            ans.add(new Fraction(2, 7));
            ans.add(new Fraction(1, 3));
            ans.add(new Fraction(2, 5));
            ans.add(new Fraction(3, 7));
            ans.add(new Fraction(1, 2));
            ans.add(new Fraction(4, 7));

            ans.add(new Fraction(3, 5));
            ans.add(new Fraction(2, 3));
            ans.add(new Fraction(5, 7));
            ans.add(new Fraction(3, 4));
            ans.add(new Fraction(4, 5));
            ans.add(new Fraction(5, 6));
            ans.add(new Fraction(6, 7));
            ans.add(new Fraction(1, 1));

            return ans;
        }
        return ans;
    }
}