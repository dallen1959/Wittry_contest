import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentKnightMovesTest extends junit.framework.TestCase
{
   public void testKnightMoves01()
   {
      ChessLocation temp = new ChessLocation(4, "d");
      ChessLocation corner = new ChessLocation(8, "a");
      assertEquals(new ChessLocation(6, "e"), KnightMoves.forwardTwoThenRight(temp));
      assertEquals(new ChessLocation(6, "c"), KnightMoves.forwardTwoThenLeft(temp));
      assertEquals(new ChessLocation(5, "f"), KnightMoves.forwardOneThenRightTwo(temp));
      assertEquals(new ChessLocation(5, "b"), KnightMoves.forwardOneThenLeftTwo(temp));

      assertEquals(new ChessLocation(2, "e"), KnightMoves.backwardTwoThenRight(temp));
      assertEquals(new ChessLocation(2, "c"), KnightMoves.backwardTwoThenLeft(temp));
      assertEquals(new ChessLocation(3, "f"), KnightMoves.backwardOneThenRightTwo(temp));
      assertEquals(new ChessLocation(3, "b"), KnightMoves.backwardOneThenLeftTwo(temp));

      assertEquals(null, KnightMoves.forwardOneThenLeftTwo(corner));
      assertEquals(null, KnightMoves.forwardTwoThenRight(corner));

      KnightMoves game = new KnightMoves(new ChessLocation(1, "a"));
      assertEquals(1, game.minimumNumMovesTo(new ChessLocation(2, "c")));
      assertEquals(4, game.minimumNumMovesTo(new ChessLocation(2, "b")));
   }
}