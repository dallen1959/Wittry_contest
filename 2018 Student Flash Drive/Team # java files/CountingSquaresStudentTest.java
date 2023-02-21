import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2018 Wittry programming contest
 */
public class CountingSquaresStudentTest extends junit.framework.TestCase
{
    public void testCountingSquares01()
    {
        List<Edge> edgs1 = new ArrayList<Edge>();
        edgs1.add( new Edge( new Point(1, 1), new Point(1, 2)));
        edgs1.add( new Edge( new Point(1, 1), new Point(2, 1)));
        edgs1.add( new Edge( new Point(1, 2), new Point(2, 2)));
        CountingSquares cs = new CountingSquares(edgs1);
        assertEquals( false, cs.hasSquare(new Point(1,1), 1));

        edgs1.add( new Edge( new Point(2, 1), new Point(2, 2)));
        cs = new CountingSquares(edgs1);
        assertEquals( true, cs.hasSquare(new Point(1,1), 1));

        assertEquals( 1, cs.getNumSquares(1));

        List<Edge> edgs2 = new ArrayList<Edge>();
        edgs2.add( new Edge( new Point(1, 1), new Point(1, 2)));
        edgs2.add( new Edge( new Point(1, 3), new Point(1, 4)));
        edgs2.add( new Edge( new Point(1, 1), new Point(2, 1)));
        edgs2.add( new Edge( new Point(2, 1), new Point(2, 2)));
        edgs2.add( new Edge( new Point(2, 1), new Point(3, 1)));
        edgs2.add( new Edge( new Point(2, 2), new Point(2, 3)));
        edgs2.add( new Edge( new Point(2, 2), new Point(3, 2)));
        edgs2.add( new Edge( new Point(2, 3), new Point(3, 3)));
        edgs2.add( new Edge( new Point(3, 1), new Point(3, 2)));
        edgs2.add( new Edge( new Point(3, 3), new Point(3, 2)));
        edgs2.add( new Edge( new Point(3, 1), new Point(4, 1)));
        edgs2.add( new Edge( new Point(4, 2), new Point(4, 1)));
        edgs2.add( new Edge( new Point(4, 3), new Point(4, 2)));
        edgs2.add( new Edge( new Point(4, 3), new Point(3, 3)));
        cs = new CountingSquares(edgs2);

        assertEquals( false, cs.hasSquare(new Point(1, 1), 1));
        assertEquals( true, cs.hasSquare(new Point(2, 1), 1));
        assertEquals( true, cs.hasSquare(new Point(2, 2), 1));
        assertEquals( false, cs.hasSquare(new Point(1, 1), 2));
        assertEquals( true, cs.hasSquare(new Point(2, 1), 2));

        List<Edge> edgs3 = new ArrayList<Edge>();
        edgs3.add( new Edge( new Point(1, 1), new Point(1, 2)));
        edgs3.add( new Edge( new Point(1, 1), new Point(2, 1)));
        edgs3.add( new Edge( new Point(1, 2), new Point(2, 2)));
        edgs3.add( new Edge( new Point(2, 1), new Point(2, 2)));
        cs = new CountingSquares(edgs3);
        assertEquals( 1, cs.getNumSquares(1));

        edgs3.add( new Edge( new Point(2, 1), new Point(3, 1)));
        edgs3.add( new Edge( new Point(2, 2), new Point(2, 3)));
        edgs3.add( new Edge( new Point(4, 3), new Point(4, 2)));
        edgs3.add( new Edge( new Point(3, 3), new Point(3, 2)));
        edgs3.add( new Edge( new Point(2, 3), new Point(3, 3)));
        edgs3.add( new Edge( new Point(3, 1), new Point(3, 2)));
        edgs3.add( new Edge( new Point(4, 3), new Point(3, 3)));
        edgs3.add( new Edge( new Point(4, 2), new Point(3, 2)));
        edgs3.add( new Edge( new Point(2, 2), new Point(3, 2)));
        cs = new CountingSquares(edgs3);
        assertEquals( 4, cs.getNumSquares(1));

        List<Edge> edgs4 = new ArrayList<Edge>();
        edgs4.add( new Edge( new Point(1, 1), new Point(1, 2)));
        edgs4.add( new Edge( new Point(1, 1), new Point(2, 1)));
        edgs4.add( new Edge( new Point(1, 2), new Point(2, 2)));
        edgs4.add( new Edge( new Point(2, 1), new Point(2, 2)));
        edgs4.add( new Edge( new Point(2, 1), new Point(3, 1)));
        edgs4.add( new Edge( new Point(2, 2), new Point(2, 3)));
        edgs4.add( new Edge( new Point(4, 3), new Point(4, 2)));
        edgs4.add( new Edge( new Point(3, 3), new Point(3, 2)));
        edgs4.add( new Edge( new Point(2, 3), new Point(3, 3)));
        edgs4.add( new Edge( new Point(3, 1), new Point(3, 2)));
        edgs4.add( new Edge( new Point(4, 3), new Point(3, 3)));
        edgs4.add( new Edge( new Point(4, 2), new Point(3, 2)));
        edgs4.add( new Edge( new Point(2, 2), new Point(3, 2)));
        edgs4.add( new Edge( new Point(3, 1), new Point(4, 1)));
        edgs4.add( new Edge( new Point(4, 1), new Point(4, 2)));
        cs = new CountingSquares(edgs4);
        assertEquals( 2, cs.getSizeOfLargestSquare());
    }
}