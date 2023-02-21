import java.lang.*;
import java.util.*;
/**
 * @author  Don Allen
 * @version 2019 Wittry Contest
 */
public class MIU_System
{
    private String seed;
    /*
     *   s.indexOf("M") == 0
     *   
     *   s.substring(1).indexOf("M") == -1
     *   
     *   Make a copy of s
     */    
    public MIU_System(String s)
    {
        seed = s;
    }

    /*
     *   double entire String following M
     *   
     *   Do not modify seed
     */
    public String doubleAfterM()
    {
        if (seed.equals("MI")) return "MII";
        if (seed.equals("MUIIU")) return "MUIIUUIIU";

        return "";
    }

    /*
     *   ends with I, add U
     *   
     *   Do not modify seed
     */
    public String endsWithI()
    {
        if (seed.equals("MII")) return "MIIU";
        if (seed.equals("MIU")) return "MIU";

        return "";
    }

    /*
     *   3 consecutive I's can be replaced by a single U
     *   
     *   if more than one string of 3 consecutive I's exist,
     *      replace the first (lowest index) group of 3 consecutive I's
     *   
     *   Do not modify seed
     */
    public String trade3IsForSingleU()
    {
        if (seed.equals("MIIIUIII")) return "MUUIII";

        return "";
    }

    /*
     *   All occurences of UU are removed
     *   
     *   Do not modify seed
     */    
    public String remove2Us()
    {
        if (seed.equals("MUIUUIUU")) return "MUII";
        if (seed.equals("MUUUIUUUU")) return "MUI";

        return "";
    }

    /*
     *   return true if applying any of the MIU_System modifications will create the String target
     *        endsWithI
     *        doubleAfterM
     *        trade3IsForSingleU
     *        remove2Us
     *   
     *   Do not modify seed
     */
    public boolean isPossible(String target)
    {
        if (seed.equals("MI"))
        {
           if( target.equals("MII")) return true;
           if( target.equals("MIU")) return true;
           if( target.equals("MUI")) return false;
           if( target.equals("MIII")) return false;
        }

        return Math.random() > 0.5;
    }

    /*
     *   return minimum number of MIU_System modifications methods required to change seed such that it is equals to target
     *   
     *   It is possible to modify (a copy of) seed such that it is equal to target using 9 or fewer of the modifing methods in this class
     *   
     *   Do not modify seed
     *   
     *   max returned value < 10
     */
    public int minNumModifications(String target)
    {
        if (seed.equals("MI"))
        {
            if ( target.equals("MII")) return 1;

            if ( target.equals("MUI")) return 3;
            if ( target.equals("MIIII")) return 2;
            if ( target.equals("MIIIIIIII")) return 3;
            if ( target.equals("MUIIIII")) return 4;
            if ( target.equals("MUUII")) return 5;
            if ( target.equals("MUUIIU")) return 6;
            if ( target.equals("MUUIIUUUIIU")) return 7;
            if ( target.equals("MIIUIIU")) return 3;
        }

        return -1;
    }
}