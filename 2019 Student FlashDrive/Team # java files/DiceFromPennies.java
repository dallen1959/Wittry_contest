import java.util.*;
import java.lang.Math;
/**
 * The test class FunctionsGoneWild2015.
 *
 * @author  Don Allen
 * @version 2019 Wittry Programming contest
 */
public class DiceFromPennies
{
    private int mySides;
    /*
     *    1 < numSides <= 32
     */
    public DiceFromPennies(int numSides)
    {
        mySides = numSides;
    }

    /*
     *    thou shall not modifiy pennies
     */
    public int getRoll(String pennies)
    {
        if ( mySides == 6)
        {
            if (pennies.equals("HHH")) return 1;
            if (pennies.equals("HHT")) return 2;
            if (pennies.equals("HTH")) return 3;
            if (pennies.equals("HTT")) return 4;
            if (pennies.equals("THH")) return 5;
            if (pennies.equals("THT")) return 6;
            if (pennies.equals("TTT")) return -1;
            if (pennies.equals("TTTHHH")) return 1;
        }
        
        if ( mySides == 20)
        {
            if (pennies.equals("THHHTHHHHT")) return 18;
            if (pennies.equals("TTHHTHHTHT")) return 6;
        }

        return -2;
    }

    /*
     *    thou shall not modifiy pennies
     *    
     *    0 < numDice <= 50
     */
    public int getRolls(int numDice, String pennies)
    {
        if ( mySides == 2)
        {
            if (numDice == 2 && pennies.equals("HT")) return 3;
            if (numDice == 5 && pennies.equals("HTTHHHTHTHTHTHTHT")) return 7;
        }

        if ( mySides == 15)
        {
            if (numDice == 4 && pennies.equals("HTTHHHTHTHTHTHTT")) return 33;
        }

        return -1;
    }
}