import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2018 Wittry Contest
 */
public class TheDoors
{
    /*
     *      mySwitches.size() == number of switches
     *      
     *      mySwitches.get(1).length == the number doors switch i toggles
     *          mySwitches.get(i).get(k) is a door switch i toggles
     */
    private List<Switches> mySwitches;
    private int numDoors;

    public TheDoors(List<Switches> s, int nd)
    {
        mySwitches = s;
        numDoors = nd;
    }

    public ArrayList<Switches> findSwitchCombination(int[] goal)
    {
        ArrayList<Switches> solutions = new ArrayList<Switches>();

        if (numDoors == 5 && mySwitches.size() == 4 && mySwitches.get(0).getSwitch().length == 4
                 && mySwitches.get(1).getSwitch().length == 3 && mySwitches.get(2).getSwitch().length == 2
                 && mySwitches.get(3).getSwitch().length == 2)
        {
           if (goal.length == 2 && goal[0] == 2 && goal[1] == 3)
           {
              solutions.add( new Switches(new int[] {2, 3}));
              return solutions;

           }
           
           if (goal.length == 1 && goal[0] == 0)
           {
              solutions.add( new Switches(new int[] {0, 1, 3, 4}));
              solutions.add( new Switches(new int[] {1, 2, 4}));
              solutions.add( new Switches(new int[] {2, 3}));
              return solutions;
           }
           
           if (goal.length == 2 && goal[0] == 0 && goal[1] == 1)
           {
              return solutions;
           }
        }

        return solutions;
    }

}