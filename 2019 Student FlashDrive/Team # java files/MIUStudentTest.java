import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2019 Wittry programming contest
 */
public class MIUStudentTest extends junit.framework.TestCase
{
    public void testMIU01()
    {
        MIU_System m = new MIU_System("MI");

        assertEquals("MII", m.doubleAfterM());

        m = new MIU_System("MUIIU");
        assertEquals("MUIIUUIIU", m.doubleAfterM());

        m = new MIU_System("MII");
        assertEquals("MIIU", m.endsWithI());

        m = new MIU_System("MIU");
        assertEquals("MIU", m.endsWithI());

        m = new MIU_System("MIIIUIII");
        assertEquals("MUUIII", m.trade3IsForSingleU());

        m = new MIU_System("MUIUUIUU");
        assertEquals("MUII", m.remove2Us());

        m = new MIU_System("MUUUIUUUU");
        assertEquals("MUI", m.remove2Us());

        m = new MIU_System("MI");
        assertEquals(true, m.isPossible("MII"));
        assertEquals(true, m.isPossible("MIU"));
        assertEquals(false, m.isPossible("MUI"));
        assertEquals(false, m.isPossible("MIII"));

        m = new MIU_System("MI");
        assertEquals(1, m.minNumModifications("MII"));
        assertEquals(3, m.minNumModifications("MUI"));
        assertEquals(2, m.minNumModifications("MIIII"));
        assertEquals(3, m.minNumModifications("MIIIIIIII"));
        assertEquals(4, m.minNumModifications("MUIIIII"));
        assertEquals(5, m.minNumModifications("MUUII"));
        assertEquals(6, m.minNumModifications("MUUIIU"));
        assertEquals(7, m.minNumModifications("MUUIIUUUIIU"));
        assertEquals(3, m.minNumModifications("MIIUIIU"));
    }
}