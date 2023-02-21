import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2019 Wittry Contest
 */
public class Awards
{
    private List<Player> myTeam;
    
    private Player MVP;
    private Player offensivePlayer;
    private Player defensivePlayer;
    private Player mostEffective;

    public Awards(List<Player> temp)
    {
        myTeam = new ArrayList<Player>();
        for(Player p : temp)
            myTeam.add(p);

        MVP = null;
        offensivePlayer = null;
        defensivePlayer = null;
        mostEffective = null;
    }

    /*   
     *   This methods determines and returns the Player selected as MVP
     */
    public Player getMVP()
    {
        MVP = new Player("MVP", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        return MVP;
    }

    /*   
     *   This methods determines and returns the Player selected as Offensive Player
     *   
     *   remember, the Player winning MVP SHALL be selected for this award
     */
    public Player getOffensivePlayer()
    {
        offensivePlayer = new Player("Offensive", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        return offensivePlayer;
    }

    /*   
     *   This methods determines and returns the Player selected as Defensive Player
     *   
     *   remember, the Player winning MVP or Offensive Player SHALL be selected for this award
     */
    public Player getDefensivePlayer()
    {
        defensivePlayer = new Player("Defensive", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        return defensivePlayer;
    }

    /*   
     *   This methods determines and returns the Player selected as Most Effective Player
     *   
     *   remember, the Player winning MVP, Offensive Player or Defensive Player SHALL be selected for this award
     */
    public Player getMostEffective()
    {
        mostEffective = new Player("Most Effective", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        return mostEffective;
    }
}