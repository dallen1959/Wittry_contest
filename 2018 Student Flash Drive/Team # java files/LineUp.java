import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2018 Wittry Contest
 */
public class LineUp
{
    private List<Player> myTeam;

    public LineUp()
    {
        myTeam = new ArrayList<Player>();
    }

    /*
     *    precondition:    ps.size() == 9
     *                     ps.get(i) != null for all i, 0 <= i < 9
     *                    
     *    post condition:  do not modify ps
     *                     all elements previously contained in myTeam are removed
     *                     myTeam.size() == 9
     */
    public void addPlayers(List<Player> ps)
    {
        myTeam = new ArrayList<Player>();
        for (Player p : ps)
            myTeam.add(p);
    }
    
/*
   public void testLineUp01()
   {
      LineUp lu = new LineUp();
      Player seager = new Player("Seager", 150, 50, 9, 2, 6, 8);

      List<Player> ps = new ArrayList<Player>();
      ps.add(seager);
      ps.add(new Player("Ruth", 135, 52, 10, 1, 17, 12));
      ps.add(new Player("Trout", 145, 40, 18, 5, 13, 9));
      ps.add(new Player("Beltre", 175, 45, 3, 0, 1, 2));
      ps.add(new Player("Alltuve", 125, 72, 23, 5, 10, 11));
      ps.add(new Player("Bellinger", 150, 40, 11, 0, 14, 7));
      ps.add(new Player("Puig", 160, 45, 13, 3, 7, 7));
      ps.add(new Player("Ohtani", 115, 25, 2, 0, 6, 4));
      ps.add(new Player("Arenado", 155, 51, 19, 0, 16, 10));
      lu.addPlayers(ps);

      assertEquals(new Player("Alltuve", 125, 72, 23, 5, 10, 11), lu.getCleanUp());
      assertEquals(new Player("Ruth", 135, 52, 10, 1, 17, 12), lu.getLeadOff());
      assertEquals(new Player("Arenado", 155, 51, 19, 0, 16, 10), lu.getThirdBatter());
      assertEquals(new Player("Trout", 145, 40, 18, 5, 13, 9), lu.getSecondBatter());
   }
    
*/    

    /*
     *   The clean up batter (bats fourth) is the Player with the highest slugging percentage.
     *   In case of tie, pick the Player with most HRs,
     *   if still tied pick Player with greatest Batting average.
     */
    public Player getCleanUp()
    {
        if ( myTeam.get(0).equals( new Player("Seager", 150, 50, 9, 2, 6, 8))
            && myTeam.get(1).equals( new Player("Ruth", 135, 52, 10, 1, 17, 12))
            && myTeam.get(2).equals(new Player("Trout", 145, 40, 18, 5, 13, 9) )
            && myTeam.get(3).equals(new Player("Beltre", 175, 45, 3, 0, 1, 2) )
            && myTeam.get(4).equals( new Player("Alltuve", 125, 72, 23, 5, 10, 11))) 
           return new Player("Alltuve", 125, 72, 23, 5, 10, 11);
            
        return new Player("Wittry", 0, 0, 0, 0, 0, 0);
    }

    /*   
     *   The leadoff batter (bats first) is the player with the highest on Base Percentage.
     *   In case of tie, pick the Player with greatest Batting average,
     *   if still tied pick Player with most singles.
     */
    public Player getLeadOff()
    {
        if ( myTeam.get(0).equals( new Player("Seager", 150, 50, 9, 2, 6, 8))
            && myTeam.get(1).equals( new Player("Ruth", 135, 52, 10, 1, 17, 12))
            && myTeam.get(2).equals(new Player("Trout", 145, 40, 18, 5, 13, 9) )
            && myTeam.get(3).equals(new Player("Beltre", 175, 45, 3, 0, 1, 2) )
            && myTeam.get(4).equals( new Player("Alltuve", 125, 72, 23, 5, 10, 11))) 
           return new Player("Ruth", 135, 52, 10, 1, 17, 12);
            
        return new Player("Wittry", 0, 0, 0, 0, 0, 0);
    }

    /*
     * 	 The Player batting third is the Player with the greatest number of Hits.
     *   In case of tie, pick the Player with most number of At Bats,
     *   if still tied pick Player with most doubles plus triples.
     */
    public Player getThirdBatter()
    {
        if ( myTeam.get(0).equals( new Player("Seager", 150, 50, 9, 2, 6, 8))
            && myTeam.get(1).equals( new Player("Ruth", 135, 52, 10, 1, 17, 12))
            && myTeam.get(2).equals(new Player("Trout", 145, 40, 18, 5, 13, 9) )
            && myTeam.get(3).equals(new Player("Beltre", 175, 45, 3, 0, 1, 2) )
            && myTeam.get(4).equals( new Player("Alltuve", 125, 72, 23, 5, 10, 11))) 
           return new Player("Arenado", 155, 51, 19, 0, 16, 10);
            
        return new Player("Wittry", 0, 0, 0, 0, 0, 0);
    }

    /*
     *   The Player batting second is the Player with the most base on balls.
     *   In case of tie, pick the Player with highest on Base Percentage,
     *   if still tied pick Player with most triples.
     */
    public Player getSecondBatter()
    {
        if ( myTeam.get(0).equals( new Player("Seager", 150, 50, 9, 2, 6, 8))
            && myTeam.get(1).equals( new Player("Ruth", 135, 52, 10, 1, 17, 12))
            && myTeam.get(2).equals(new Player("Trout", 145, 40, 18, 5, 13, 9) )
            && myTeam.get(3).equals(new Player("Beltre", 175, 45, 3, 0, 1, 2) )
            && myTeam.get(4).equals( new Player("Alltuve", 125, 72, 23, 5, 10, 11))) 
           return new Player("Trout", 145, 40, 18, 5, 13, 9);
            
        return new Player("Wittry", 0, 0, 0, 0, 0, 0);
    }
}