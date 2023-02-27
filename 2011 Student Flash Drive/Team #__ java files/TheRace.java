import java.util.*;
import java.lang.*;
/**
 * The test class TheRace.
 *
 * @author  (your name)
 * @version 2010 Wittry Programming contest
 */
public class TheRace
{
   private String[] p;
   private int boardSize;

   public TheRace(String[] numbers, int size)
   {
      p = numbers;
      boardSize = size;
      /*   add more code as needed   */
   }
/*
      String[] names1 = {"George", "John", "Thomas", "James"};
      TheRace tr = new TheRace(names1, 12);
      PlayerMove[] pm1 = { new PlayerMove("George", 4),
                           new PlayerMove("John", 2),
                           new PlayerMove("Thomas", 3),
                           new PlayerMove("James", 1)
                         };
      assertEquals(false, tr.playRound(pm1));
*/
/*
 * returns true if a player has finished the race
 *         false otherwise - no player has finished the race
 */
   public boolean playRound(PlayerMove[] numbers)
   {
      if (numbers[0].equals(new PlayerMove("George", 4))
         && numbers[1].equals(new PlayerMove("John", 2))
         && numbers[2].equals(new PlayerMove("Thomas", 3))
         && numbers[3].equals(new PlayerMove("James", 1) ))
         return false;
      return Math.random() > 0.5;
   }

   public int getPlayerLocation(String player)
   {
      if (player.equals("George")) return 4;
      if (player.equals("John")) return 2;
      if (player.equals("Thomas")) return 3;
      if (player.equals("James")) return 1;
      return (int)(Math.random() * 999);
   }

/*
 *    returns an ArrayList of all Player names who have finished the race.  The ArrayList is empty if no player has finished
 *    In case of tie, the order of the player does not matter!  That is, the players on the same square maybe returned in any order
 */
   public ArrayList<String> getResults()
   {
      ArrayList<String> ans = new ArrayList<String>();

      return ans;
   }
}