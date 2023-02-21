import java.util.*;

/**
import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2018 Wittry programming contest
 */
public class SnakeStudentTest extends junit.framework.TestCase
{
   public void testStudentSnake01()
   {
      String[][] myBoard = { { " ", " ", " ", " "},
                             { " ", " ", " ", " "},
                             { "F", " ", " ", " "},
                             { " ", " ", " ", " "},
                             { " ", " ", " ", " "} };
      List<SnakeLocation> mySnake = new ArrayList<SnakeLocation>();
      mySnake.add(new SnakeLocation(2,2));
      mySnake.add(new SnakeLocation(2,3));
      mySnake.add(new SnakeLocation(3,3));
      mySnake.add(new SnakeLocation(3,2));
      Snakes sn = new Snakes(myBoard, mySnake);

      assertEquals("L", sn.getDirection());
      
      List<SnakeLocation> snake = sn.getSnakeBody();
      assertEquals( 4, snake.size()); 
      assertEquals( 2, snake.get(0).getX());
      assertEquals( 2, snake.get(0).getY());
      assertEquals( 2, snake.get(1).getX());
      assertEquals( 3, snake.get(1).getY());
      assertEquals( 3, snake.get(2).getX());
      assertEquals( 3, snake.get(2).getY());
      assertEquals( 3, snake.get(3).getX());
      assertEquals( 2, snake.get(3).getY());
      
      assertEquals(true, sn.move("D"));
      assertEquals( 4, sn.getSnakeBody().size());
      assertEquals("D", sn.getDirection());           // head at (3, 2)
      assertEquals( 4, sn.getSnakeBody().size());     // head at (3, 2), (2,2), (2, 3), (3, 3)
      assertEquals( new SnakeLocation(3,2), sn.getSnakeBody().get(0));     // head at (3, 2), (2,2), (2, 3), (3, 3)
      assertEquals( new SnakeLocation(2,2), sn.getSnakeBody().get(1));     // head at (3, 2), (2,2), (2, 3), (3, 3)
      assertEquals( new SnakeLocation(2,3), sn.getSnakeBody().get(2));     // head at (3, 2), (2,2), (2, 3), (3, 3)
      assertEquals( new SnakeLocation(3,3), sn.getSnakeBody().get(3));     // head at (3, 2), (2,2), (2, 3), (3, 3)

      assertEquals(true, sn.move("L"));
      assertEquals( 4, sn.getSnakeBody().size());
      assertEquals("L", sn.getDirection());           // head at (3, 1)
      assertEquals( 4, sn.getSnakeBody().size());     // head at (3, 1), (3, 2), (2,2), (2, 3)

      assertEquals(true, sn.move(" "));
      assertEquals( 4, sn.getSnakeBody().size());     // head at (3, 0), (3, 1), (3, 2), (2, 2)
      assertEquals("L", sn.getDirection());           // head at (3, 0)

      assertEquals(true, sn.move("U"));
      assertEquals( 4, sn.getSnakeBody().size());     // head at (2, 0), (3, 0), (3, 1), (3, 2)

      assertEquals(true, sn.move("R"));
      assertEquals( 5, sn.getSnakeBody().size());     // head at (2, 1), (2, 0), (3, 0), (3, 1), (3, 2)

      assertEquals(false, sn.move("D"));
   }
}
