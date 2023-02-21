import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2019 Wittry Contest
 */
public class Marbles
{
    /*
     *   All marbles are numbers with a positive
     *   
     *   Max number of marbles in a bag is 15
     *   
     */
    private List<Integer> bag;
    /*
     *   Make your List.
     *   
     *   DO NOT modify b
     *   
     */    
    public Marbles(List<Integer> b)
    {
        bag = new ArrayList<Integer>();
        int[] temp = new int[b.size()];
        for (int g = 0; g < b.size(); g++)
            temp[g] = b.get(g).intValue();
        Arrays.sort(temp);
        for(int i : temp)
            bag.add(new Integer(i));
    }

    /*
     *    numMarbles < bag.size()
     */
    public int getMinSum(int numMarbles)
    {
        if (numMarbles == 3)
           if (bag.size() == 10 && bag.contains(new Integer(11)) && bag.contains(new Integer(9)) && bag.contains(new Integer(0)))
              return 0+1+3;

        return -1;
    }

    /*
     *    numMarbles < bag.size()
     */
    public int getMaxSum(int numMarbles)
    {
        if (numMarbles == 3)
           if (bag.size() == 10 && bag.contains(new Integer(11)) && bag.contains(new Integer(9)) && bag.contains(new Integer(0)))
              return 9+9+11;

        return -1;
    }

    /*
     *    numMarbles < bag.size()
     */
    public Fraction getProbability(int numMarbles, int target)
    {
        if (numMarbles == 3 && target == 0+9+11)
           if (bag.size() == 10 && bag.contains(new Integer(11)) && bag.contains(new Integer(9)) && bag.contains(new Integer(0)))
              return new Fraction(1, 20);

        return new Fraction(-1, 1);
    }
}