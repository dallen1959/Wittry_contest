import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RPSSLStudentTest extends junit.framework.TestCase
{
   public void testRPSSL01()
   {
      RPSSL game = new RPSSL();
      assertEquals("TIE", game.playRound(new Player("Sheldon", "rock"), new Player("Bernadette", "rock")));
      assertEquals("Sheldon", game.playRound(new Player("Sheldon", "paper"), new Player("Howard", "rock")));
      assertEquals("Penny", game.playRound(new Player("Raj", "spock"), new Player("Penny", "paper")));
      assertEquals("Leonard", game.playRound(new Player("Amy", "lizard"), new Player("Leonard", "scissors")));
   }
}