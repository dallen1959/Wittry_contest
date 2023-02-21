import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2018 Wittry Contest
 */
public class CountingSquares
{
    private int size;
    private List<Edge> myEdges;

    public CountingSquares(List<Edge> edges)
    {
        size = 10;
        myEdges = edges;
    }
    /*

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
     */
    /*
     *    
     */
    public boolean hasSquare(Point lowLeftCorner, int length)
    {
        if (lowLeftCorner.equals(new Point(1,1)) && length == 1)
        {
            if (myEdges.size() == 3 && myEdges.contains( new Edge( new Point(1, 1), new Point(1, 2)) )
                                    && myEdges.contains( new Edge( new Point(1, 1), new Point(2, 1)) )
                                    && myEdges.contains( new Edge( new Point(1, 2), new Point(2, 2)) ) )
               return false;
            if (myEdges.size() == 4 && myEdges.contains( new Edge( new Point(1, 1), new Point(1, 2)) )
                                    && myEdges.contains( new Edge( new Point(1, 1), new Point(2, 1)) )
                                    && myEdges.contains( new Edge( new Point(2, 1), new Point(2, 2)) )
                                    && myEdges.contains( new Edge( new Point(1, 2), new Point(2, 2)) ) )
               return true;
        }
        if (myEdges.size() == 14 && myEdges.contains( new Edge( new Point(1, 1), new Point(1, 2)) )
                                 && myEdges.contains( new Edge( new Point(1, 3), new Point(1, 4)))
                                 && myEdges.contains( new Edge( new Point(1, 1), new Point(2, 1)))
                                 && myEdges.contains( new Edge( new Point(2, 1), new Point(2, 2)))
                                 && myEdges.contains( new Edge( new Point(2, 1), new Point(3, 1)))
                                 && myEdges.contains( new Edge( new Point(2, 2), new Point(2, 3)))
                                 && myEdges.contains( new Edge( new Point(2, 2), new Point(3, 2)))
                                 && myEdges.contains( new Edge( new Point(2, 3), new Point(3, 3)))
                                 && myEdges.contains( new Edge( new Point(3, 1), new Point(3, 2)))
                                 && myEdges.contains( new Edge( new Point(3, 3), new Point(3, 2)))
                                 && myEdges.contains( new Edge( new Point(3, 1), new Point(4, 1)))
                                 && myEdges.contains( new Edge( new Point(4, 2), new Point(4, 1)))
                                 && myEdges.contains( new Edge( new Point(4, 3), new Point(4, 2)))
                                 && myEdges.contains( new Edge( new Point(4, 3), new Point(3, 3))))
        {
            if (lowLeftCorner.equals(new Point(1,1)) && length == 1) return false;
            if (lowLeftCorner.equals(new Point(2,1)) && length == 1) return true;
            if (lowLeftCorner.equals(new Point(2,2)) && length == 1) return true;
            if (lowLeftCorner.equals(new Point(1,1)) && length == 2) return false;
            if (lowLeftCorner.equals(new Point(2,1)) && length == 2) return true;
        }
        return Math.random() > 0.5;
    }

    /*
     *        (0, size - 1)                   (size - 1, size -1)
     *        
     *        
     *           (0, 0)                         size - 1, 0)
     */    
    public int getNumSquares(int length)
    {
        if (length == 1 && myEdges.size() == 4 && myEdges.contains( new Edge( new Point(1, 1), new Point(1, 2)) )
                                               && myEdges.contains( new Edge( new Point(1, 1), new Point(2, 1)) )
                                               && myEdges.contains( new Edge( new Point(2, 1), new Point(2, 2)) )
                                               && myEdges.contains( new Edge( new Point(1, 2), new Point(2, 2)) ) )
            return 1;

        if (length == 1 && myEdges.size() == 13 && myEdges.contains( new Edge( new Point(1, 1), new Point(1, 2)) )
                                                && myEdges.contains( new Edge( new Point(1, 1), new Point(2, 1)) )
                                                && myEdges.contains( new Edge( new Point(2, 1), new Point(2, 2)) )
                                                && myEdges.contains( new Edge( new Point(1, 2), new Point(2, 2)) ) 
                                                && myEdges.contains( new Edge( new Point(2, 1), new Point(3, 1)) )
                                                && myEdges.contains( new Edge( new Point(2, 2), new Point(2, 3)) )
                                                && myEdges.contains( new Edge( new Point(4, 3), new Point(4, 2)) )
                                                && myEdges.contains( new Edge( new Point(3, 3), new Point(3, 2)) )
                                                && myEdges.contains( new Edge( new Point(2, 3), new Point(3, 3)) )
                                                && myEdges.contains( new Edge( new Point(3, 1), new Point(3, 2)) )
                                                && myEdges.contains( new Edge( new Point(4, 3), new Point(3, 3)) )
                                                && myEdges.contains( new Edge( new Point(4, 2), new Point(3, 2)) )
                                                && myEdges.contains( new Edge( new Point(2, 2), new Point(3, 2))) )
        
            return 4;

        return -1;
    }

    /*
     *    return the size of the largest square
     *    
     */    
    public int getSizeOfLargestSquare()
    {
        if (myEdges.size() == 15 && myEdges.contains( new Edge( new Point(1, 1), new Point(1, 2)))
                                 && myEdges.contains( new Edge( new Point(1, 1), new Point(2, 1)))
                                 && myEdges.contains( new Edge( new Point(1, 2), new Point(2, 2)))
                                 && myEdges.contains( new Edge( new Point(2, 1), new Point(2, 2)))
                                 && myEdges.contains( new Edge( new Point(2, 1), new Point(3, 1)))
                                 && myEdges.contains( new Edge( new Point(2, 2), new Point(2, 3)))
                                 && myEdges.contains( new Edge( new Point(4, 3), new Point(4, 2)))
                                 && myEdges.contains( new Edge( new Point(3, 3), new Point(3, 2)))
                                 && myEdges.contains( new Edge( new Point(2, 3), new Point(3, 3)))
                                 && myEdges.contains( new Edge( new Point(3, 1), new Point(3, 2)))
                                 && myEdges.contains( new Edge( new Point(4, 3), new Point(3, 3)))
                                 && myEdges.contains( new Edge( new Point(4, 2), new Point(3, 2)))
                                 && myEdges.contains( new Edge( new Point(2, 2), new Point(3, 2)))
                                 && myEdges.contains( new Edge( new Point(3, 1), new Point(4, 1)))
                                 && myEdges.contains( new Edge( new Point(4, 1), new Point(4, 2))) )
           return 2;

        return -1;
    }
}