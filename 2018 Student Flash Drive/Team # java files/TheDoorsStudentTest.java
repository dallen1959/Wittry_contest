import java.util.*;

/**
import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2018 Wittry programming contest
 */
public class TheDoorsStudentTest extends junit.framework.TestCase
{
    public void testDoors01()
    {
        Switches switch0 = new Switches(new int[] {0, 1, 3, 4});
        Switches switch1 = new Switches(new int[] {1, 2, 4});
        Switches switch2 = new Switches(new int[] {2, 3});
        Switches switch3 = new Switches(new int[] {0, 4});
        List<Switches> switches = new ArrayList<Switches>();
        switches.add(switch0);
        switches.add(switch1);
        switches.add(switch2);
        switches.add(switch3);

        TheDoors tDoor = new TheDoors( switches, 5);
        ArrayList<Switches> ans = tDoor.findSwitchCombination(new int[] {2, 3});
        assertEquals(1, ans.size());
        assertEquals(false, ans.contains(switch0));
        assertEquals(false, ans.contains(switch1));
        assertEquals(true, ans.contains(switch2));
        assertEquals(false, ans.contains(switch3));

        ans = tDoor.findSwitchCombination(new int[] {0});
        assertEquals(3, ans.size());
        assertEquals(true, ans.contains(switch0));
        assertEquals(true, ans.contains(switch1));
        assertEquals(true, ans.contains(switch2));
        assertEquals(false, ans.contains(switch3));

        ans = tDoor.findSwitchCombination(new int[] {0, 1});
        assertEquals(0, ans.size());
        assertEquals(false, ans.contains(switch0));
        assertEquals(false, ans.contains(switch1));
        assertEquals(false, ans.contains(switch2));
        assertEquals(false, ans.contains(switch3));
    }
}