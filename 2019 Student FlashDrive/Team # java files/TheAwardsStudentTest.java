import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2019 Wittry programming contest
 */
public class TheAwardsStudentTest extends junit.framework.TestCase
{
    private Player bryant = new Player("Bryant", 14, 49, 10, 4, 6, 1, 3, 2, 5, 15, 41);
    private Player james = new Player("James",  19, 52,  9, 3, 7, 2, 2, 3, 4, 17, 43);
    private Player harden = new Player("Harden",  17, 40,  8, 3, 3, 4, 1, 1, 3, 16, 39);
    private Player durant = new Player("Durant",  13, 45, 10, 4, 7, 2, 3, 3, 4, 14, 38);
    private Player leonard = new Player("Leonard", 10, 42,  9, 5, 9, 1, 4, 4, 2, 13, 27);
    private Player curry = new Player("Curry", 21, 55, 15, 7, 8, 0, 1, 1, 4, 17, 37);

    public void testAwards01()
    {
        assertEquals(14+2*49+3*10, bryant.getPointsScored());
        assertEquals(3*6+5*1, bryant.getReboundEfficiency());
        assertEquals(4+3+15-2-5, bryant.getBallControlEfficiency());
        assertEquals( 2 * ((14+2*49+3*10) + (3*6+5*1) + (4+3+15-2-5))
            - Math.max((14+2*49+3*10), Math.max(3*6+5*1, (4+3+15-2-5)))
            - Math.min((14+2*49+3*10), Math.min(3*6+5*1, (4+3+15-2-5))), bryant.getMVPrating());
        assertEquals( 6, bryant.getAssistToTurnoverMargin());
        assertEquals(14+2*49+3*10 + (3*6+5*1) - 41 * 2 , bryant.getValueRatio());

        List<Player> ps = new ArrayList<Player>();
        ps.add(bryant);
        ps.add(james);
        ps.add(harden);
        ps.add(durant);
        ps.add(leonard);
        ps.add(curry);

        Awards aw = new Awards(ps);
        assertEquals( curry, aw.getMVP());
        assertEquals( james, aw.getOffensivePlayer());
        assertEquals( harden, aw.getDefensivePlayer());
        assertEquals( bryant, aw.getMostEffective());
    }
}