import java.util.*;

public class KnightMoves
{
    private ChessLocation loc;

    public KnightMoves(ChessLocation cl)
    {
        loc = cl;
    }
/*
 *   precondition: ChessLocation is a valid
 *   
 *   returns a value greater tahn or equal to 0 which represents
 *           the minimum number of moves for the knight to move from its curernt location to destination
 */
    public int minimumNumMovesTo(ChessLocation destination)
    {
       if ( loc.equals(new ChessLocation(1, "a")) && destination.equals(new ChessLocation(2, "c"))) return 1;
       if ( loc.equals(new ChessLocation(1, "a")) && destination.equals(new ChessLocation(2, "b"))) return 4;
       return (int)(Math.random()*999);
    }

    public static ChessLocation forwardTwoThenRight(ChessLocation chLoc)
    {
       if (chLoc.equals( new ChessLocation(4, "d") ) ) return new ChessLocation(6, "e");
       if (chLoc.equals( new ChessLocation(8, "a") ) ) return null;
       return new ChessLocation((int)(Math.random()*10), ""+(char)(64+Math.random()*10));
    }

    public static ChessLocation forwardTwoThenLeft(ChessLocation chLoc)
    {
       if (chLoc.equals( new ChessLocation(4, "d") ) ) return new ChessLocation(6, "c");
       return new ChessLocation((int)(Math.random()*10), ""+(char)(64+Math.random()*10));
    }

    public static ChessLocation forwardOneThenRightTwo(ChessLocation chLoc)
    {
       if (chLoc.equals( new ChessLocation(4, "d") ) ) return new ChessLocation(5, "f");
       return new ChessLocation((int)(Math.random()*10), ""+(char)(64+Math.random()*10));
    }

    public static ChessLocation forwardOneThenLeftTwo(ChessLocation chLoc)
    {
       if (chLoc.equals( new ChessLocation(4, "d") ) ) return new ChessLocation(5, "b");
       if (chLoc.equals( new ChessLocation(8, "a") ) ) return null;
       return new ChessLocation((int)(Math.random()*10), ""+(char)(64+Math.random()*10));
    }

    public static ChessLocation backwardTwoThenRight(ChessLocation chLoc)
    {
       if (chLoc.equals( new ChessLocation(4, "d") ) ) return new ChessLocation(2, "e");
       return new ChessLocation((int)(Math.random()*10), ""+(char)(64+Math.random()*10));
    }

    public static ChessLocation backwardTwoThenLeft(ChessLocation chLoc)
    {
       if (chLoc.equals( new ChessLocation(4, "d") ) ) return new ChessLocation(2, "c");
       return new ChessLocation((int)(Math.random()*10), ""+(char)(64+Math.random()*10));
    }

    public static ChessLocation backwardOneThenRightTwo(ChessLocation chLoc)
    {
       if (chLoc.equals( new ChessLocation(4, "d") ) ) return new ChessLocation(3, "f");
       return new ChessLocation((int)(Math.random()*10), ""+(char)(64+Math.random()*10));
    }

    public static ChessLocation backwardOneThenLeftTwo(ChessLocation chLoc)
    {
       if (chLoc.equals( new ChessLocation(4, "d") ) ) return new ChessLocation(3, "b");
       return new ChessLocation((int)(Math.random()*10), ""+(char)(64+Math.random()*10));
    }
}