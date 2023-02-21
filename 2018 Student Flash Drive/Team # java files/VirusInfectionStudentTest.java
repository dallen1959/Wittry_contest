import java.util.*;

/**
import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2018 Wittry programming contest
 */
public class VirusInfectionStudentTest extends junit.framework.TestCase
{
    private final boolean T = true;
    private final boolean F = false;

    public void testVirusInfection01()
    {
        boolean[][] net = { {T, T, T, F },
                            {T, F, F, T },
                            {F, T, F, T },
                            {T, T, T, F } };
        VirusInfection v = new VirusInfection(net);

        assertEquals(true, v.isSafeLocation(0, 1));
        assertEquals(false, v.isSafeLocation(1, 1));
        assertEquals(false, v.isSafeLocation(2, 1));

        boolean[][] ans = v.spreadVirus(1);
        assertEquals(false, ans[0][2] || ans[0][3] || ans[1][0] || ans[1][1] || ans[1][2] || ans[1][3]
                              || ans[2][0] || ans[2][1] || ans[2][2] || ans[2][3] || ans[3][2] || ans[3][3]);

        assertEquals(true, ans[0][0] && ans[0][1] && ans[3][0] && ans[3][1]);

        ans = v.spreadVirus(2);
        assertEquals(false, ans[0][1] || ans[0][2] || ans[0][3] || ans[1][0] || ans[1][1] || ans[1][2]
                             || ans[1][3] || ans[2][0] || ans[2][1] || ans[2][2] || ans[2][3]
                             || ans[3][1] || ans[3][2] || ans[3][3]);

        assertEquals(true, ans[0][0] && ans[3][0]);

        ans = v.spreadVirus(3);
        assertEquals(false, ans[0][0] || ans[0][1] || ans[0][2] || ans[0][3]
                             || ans[1][0] || ans[1][1] || ans[1][2] || ans[1][3] 
                             || ans[2][0] || ans[2][1] || ans[2][2] || ans[2][3]
                             || ans[3][0] || ans[3][1] || ans[3][2] || ans[3][3]);

        assertEquals(true, v.infectAll());

        boolean[][] net0A = { {T, F, T, T }, 
                              {T, T, F, T },
                              {T, T, T, F } };

        v = new VirusInfection(net0A);
        assertEquals(false, v.infectAll());
    }
}