import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2017 Wittry programming contest
 */
public class FinalForestPlayGroundRevisitedTest extends junit.framework.TestCase
{
    public void testForestPlayGroundRevisited01()
    {
        int[] figure2 = {-1, 12, 23, 18, 11, 43, 12, 27, 56, 78, -1, -1, 32, 98};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure2);

        int[] sol = t.getLevel(3);
        assertEquals(4, sol.length);
        assertEquals(11, sol[0]);
        assertEquals(43, sol[1]);
        assertEquals(12, sol[2]);
        assertEquals(27, sol[3]);

        sol = t.getLevel(4);
        assertEquals(4, sol.length);
        assertEquals(56, sol[0]);
        assertEquals(78, sol[1]);
        assertEquals(32, sol[2]);
        assertEquals(98, sol[3]);

        assertEquals(4, t.getLevelWithHighestAverage());

        sol = t.shiftLevelLeft();
        int[] answer = {-1, 12, 18, 23, 43, 12, 27, 11, 78, 32, -1, -1, 98, 56};
        assertEquals(figure2.length, sol.length);

        for (int s = 0; s < sol.length; s++)
           assertEquals(answer[s], sol[s]);
    }

    public void testGetLevel02()
    {
        int[] figure2 = {-1, 12, 2, 3, 181, 14, 39, 123, 7, 15, 68, 78, 11, 32, 9, 8};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure2);

        int[] sol = t.getLevel(1);
        assertEquals(1, sol.length);
        assertEquals(12, sol[0]);

        sol = t.getLevel(2);
        assertEquals(2, sol.length);
        assertEquals(2, sol[0]);
        assertEquals(3, sol[1]);

        sol = t.getLevel(3);
        assertEquals(4, sol.length);
        assertEquals(181, sol[0]);
        assertEquals(14, sol[1]);
        assertEquals(39, sol[2]);
        assertEquals(123, sol[3]);

        sol = t.getLevel(4);
        assertEquals(8, sol.length);
        assertEquals(7, sol[0]);
        assertEquals(15, sol[1]);
        assertEquals(68, sol[2]);
        assertEquals(78, sol[3]);
        assertEquals(11, sol[4]);
        assertEquals(32, sol[5]);
        assertEquals(9, sol[6]);
        assertEquals(8, sol[7]);
    }

    public void testGetLevel03()
    {
        int[] figure2 = {-1, 2, 3, 18, 14, 39, 7, 15, 68, 78, 11, 32, 9, 8};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure2);

        int[] sol = t.getLevel(1);
        assertEquals(1, sol.length);
        assertEquals(2, sol[0]);

        sol = t.getLevel(2);
        assertEquals(2, sol.length);
        assertEquals(3, sol[0]);
        assertEquals(18, sol[1]);

        sol = t.getLevel(3);
        assertEquals(4, sol.length);
        assertEquals(14, sol[0]);
        assertEquals(39, sol[1]);
        assertEquals(7, sol[2]);
        assertEquals(15, sol[3]);

        sol = t.getLevel(4);
        assertEquals(6, sol.length);
        assertEquals(68, sol[0]);
        assertEquals(78, sol[1]);
        assertEquals(11, sol[2]);
        assertEquals(32, sol[3]);
        assertEquals(9, sol[4]);
        assertEquals(8, sol[5]);
    }

    public void testGetLevel04()
    {
        int[] figure2 = {-1, 21, -1, 3, -1, -1, 18, 14, -1, -1, -1, -1, 39, -1, 7, 15, 
                                                  -1, -1, -1, -1, -1, -1, -1, -1, 68, -1, -1, -1, -1, 78};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure2);

        int[] sol = t.getLevel(1);
        assertEquals(1, sol.length);
        assertEquals(21, sol[0]);

        sol = t.getLevel(2);
        assertEquals(1, sol.length);
        assertEquals(3, sol[0]);

        sol = t.getLevel(3);
        assertEquals(2, sol.length);
        assertEquals(18, sol[0]);
        assertEquals(14, sol[1]);

        sol = t.getLevel(4);
        assertEquals(3, sol.length);
        assertEquals(39, sol[0]);
        assertEquals(7, sol[1]);
        assertEquals(15, sol[2]);

        sol = t.getLevel(5);
        assertEquals(2, sol.length);
        assertEquals(68, sol[0]);
        assertEquals(78, sol[1]);
    }

    public void testGetLevelWithHighestAverage05()
    {
        int[] figure1 = {-1, 42, 2, 3, 18, 14, 39, 13, 7, 15, 28, 17, 11, 32, 9, 8};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure1);
        assertEquals(1, t.getLevelWithHighestAverage());

        int[] figure2 = {-1, 12, 42, 33, 18, 14, 39, 13, 7, 15, 28, 17, 11, 32, 9, 8};
        t = new ForestPlayGroundRevisited(figure2);
        assertEquals(2, t.getLevelWithHighestAverage());

        int[] figure3 = {-1, 12, 2, 3, 18, 14, 39, 13, 7, 15, 28, 17, 11, 32, 9, 8};
        t = new ForestPlayGroundRevisited(figure3);
        assertEquals(3, t.getLevelWithHighestAverage());

        int[] figure4 = {-1, 12, 2, 3, 18, 14, 39, 13, 37, 15, 28, 17, 31, 32, 29, 28};
        t = new ForestPlayGroundRevisited(figure4);
        assertEquals(4, t.getLevelWithHighestAverage());
    }

    public void testGetLevelWithHighestAverage06()
    {
        int[] figure1 = {-1, 22, 2, 3, 18, 14, 39, 13, 7, 15, 28, 17, 11, 32};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure1);
        assertEquals(1, t.getLevelWithHighestAverage());

        int[] figure2 = {-1, 20, 23, 33, 18, 14, 39, 13, 7, 15, 28, 17, 11, 32};
        t = new ForestPlayGroundRevisited(figure2);
        assertEquals(2, t.getLevelWithHighestAverage());

        int[] figure3 = {-1, 12, 2, 3, 18, 14, 39, 13, 7, 15, 28, 17, 26, 32};
        t = new ForestPlayGroundRevisited(figure3);
        assertEquals(3, t.getLevelWithHighestAverage());

        int[] figure4 = {-1, 12, 2, 3, 18, 14, 39, 13, 11, 17, 28, 27, 12, 32};
        t = new ForestPlayGroundRevisited(figure4);
        assertEquals(4, t.getLevelWithHighestAverage());
    }

    public void testGetLevelWithHighestAverage07()
    {
        int[] figure1 = {-1, 41, -1, 3, -1, -1, 18, 14, -1, -1, -1, -1, 39, -1, 7, 15, 
                                                  -1, -1, -1, -1, -1, -1, -1, -1, 6, -1, -1, -1, -1, 7};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure1);
        assertEquals(1, t.getLevelWithHighestAverage());

        int[] figure2 = {-1, 4, -1, 23, -1, -1, 18, 14, -1, -1, -1, -1, 19, -1, 7, 15, 
                                                  -1, -1, -1, -1, -1, -1, -1, -1, 6, -1, -1, -1, -1, 7};
        t = new ForestPlayGroundRevisited(figure2);
        assertEquals(2, t.getLevelWithHighestAverage());

        int[] figure3 = {-1, 4, -1, 13, -1, -1, 18, 14, -1, -1, -1, -1, 19, -1, 7, 15, 
                                                  -1, -1, -1, -1, -1, -1, -1, -1, 6, -1, -1, -1, -1, 7};
        t = new ForestPlayGroundRevisited(figure3);
        assertEquals(3, t.getLevelWithHighestAverage());

        int[] figure4 = {-1, 4, -1, 13, -1, -1, 18, 14, -1, -1, -1, -1, 19, -1, 31, 15, 
                                                  -1, -1, -1, -1, -1, -1, -1, -1, 6, -1, -1, -1, -1, 7};
        t = new ForestPlayGroundRevisited(figure4);
        assertEquals(4, t.getLevelWithHighestAverage());

        int[] figure5 = {-1, 4, -1, 13, -1, -1, 18, 14, -1, -1, -1, -1, 19, -1, 7, 15, 
                                                  -1, -1, -1, -1, -1, -1, -1, -1, 16, -1, -1, -1, -1, 17};
        t = new ForestPlayGroundRevisited(figure5);
        assertEquals(5, t.getLevelWithHighestAverage());
    }

    public void testShiftLevelLeft08()
    {
        int[] figure1 = {-1, 42, 2, 3, 18, 14, 39, 13, 7, 15, 28, 17, 11, 32, 9, 8};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure1);

        int[] sol = t.shiftLevelLeft();
        int[] answer = {-1, 42, 3, 2, 14, 39, 13, 18, 15, 28, 17, 11, 32, 9, 8, 7};
        assertEquals(figure1.length, sol.length);

        for (int s = 0; s < sol.length; s++)
           assertEquals(answer[s], sol[s]);
    }

    public void testShiftLevelLeft09()
    {
        int[] figure1 = {-1, 22, 2, 3, 18, 14, 39, 13, 7, 15, 28, 17, 11, 32};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure1);

        int[] sol = t.shiftLevelLeft();
        int[] answer = {-1, 22, 3, 2, 14, 39, 13, 18, 15, 28, 17, 11, 32, 7};
        assertEquals(figure1.length, sol.length);

        for (int s = 0; s < sol.length; s++)
           assertEquals(answer[s], sol[s]);
    }

    public void testShiftLevelLeft10()
    {
        int[] figure1 = {-1, 41, -1, 3, -1, -1, 18, 14, -1, -1, -1, -1, 39, -1, 7, 15, 
                                                  -1, -1, -1, -1, -1, -1, -1, -1, 6, -1, -1, -1, -1, 7};
        ForestPlayGroundRevisited t = new ForestPlayGroundRevisited(figure1);
        
        int[] sol = t.shiftLevelLeft();
        int[] answer  = {-1, 41, -1, 3, -1, -1, 14, 18, -1, -1, -1, -1, 7, -1, 15, 39,
                                                  -1, -1, -1, -1, -1, -1, -1, -1, 7, -1, -1, -1, -1, 6};
        assertEquals(figure1.length, sol.length);

        for (int s = 0; s < sol.length; s++)
           assertEquals(answer[s], sol[s]);
    }
}