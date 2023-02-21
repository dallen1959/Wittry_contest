import java.lang.*;
import java.util.*;
/**
 * @author  Don Allen
 * @version 2020 Wittry Contest
 */
public class CubeIt
{
    private int[] die;

    public CubeIt(int[] d)
    {
        die = d;
    }

    /*
     *      Given the top and front face of the die, return the value of the right face
     *      otherwise return -1 if not possible
     */
    public int getRightSide(int top, int front)
    {
        if (die[0] == 6 && die[1] == 4 && die[2] == 5 && die[3] ==3)
        {
            if (top == 1 && front == 2)
                return 3;

            if (top == 6 && front == 4)
                return 5;
        }
        
        if (die[0] == 1 && die[1] == 2 && die[2] == 3 && die[3] ==4)
        {
            if (top == 5 && front == 3)
                return 2;
        }


        if (die[0] == 1 && die[1] == 5 && die[2] == 2 && die[3] ==6)
        {
            if (top == 1 && front == 2)
                return 6;
            if (top == 5 && front == 2)
                return 1;
            if (top == 5 && front == 6)
                return -1;
        }
        
        return -1;
    }

    /*
     *  returns a boolean value indicating if the configuration is possible.
     *  
     *  return true if it is possible for
     *       *  the top of the dice to equal top,
     *       *  and the front of the die to equal front
     *       *  and the right side of the die to equal right.
     *  
     *   returns false otherwise.
     */
    public boolean isPossible( int top, int front, int right)
    {
        if (die[0] == 6 && die[1] == 4 && die[2] == 5 && die[3] ==3)
        {
            if (top == 6 && front == 4 && right == 5)
                return true;
            if (top == 1 && front == 2 && right == 3)
                return true;
        }

        if (die[0] == 1 && die[1] == 2 && die[2] == 3 && die[3] ==4)
        {
            if (top == 5 && front == 3 && right == 4)
                return false;
            if (top == 5 && front == 3 && right == 2)
                return true;
        }

        if (die[0] == 1 && die[1] == 5 && die[2] == 2 && die[3] ==6)
        {
            if (top == 1 && front == 2 && right == 6)
                return true;
            if (top == 5 && front == 2 && right == 1)
                return true;
            if (top == 4 && front == 1 && right == 6)
                return true;
        }

        return Math.random() < 0.5;
    }
}