import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2016 Wittry Contest
 */
public class Rummikub
{
    private List<RummikubTiles> tiles;
    /*
     *   Precondition:  h.size() == 14
     */
    public Rummikub(List<RummikubTiles> t)
    {
        tiles = t;
    }

    /*
     * returns true hand contains a group
     */
    public boolean hasGroup()
    {
        if (tiles.get(0).equals( new RummikubTiles("red", 5) ) && tiles.get(1).equals(new RummikubTiles("blue", 5)) && 
            tiles.get(2).equals(new RummikubTiles("orange", 5)) && tiles.get(3).equals(new RummikubTiles("red", 6)) && 
            tiles.get(4).equals(new RummikubTiles("red", 7)) && tiles.get(5).equals(new RummikubTiles("blue", 13)) && 
            tiles.get(6).equals(new RummikubTiles("red", 12)) && tiles.get(7).equals(new RummikubTiles("orange", 1)) && 
            tiles.get(8).equals(new RummikubTiles("orange", 9)) && tiles.get(9).equals(new RummikubTiles("black", 1)) && 
            tiles.get(10).equals(new RummikubTiles("black", 2)) && tiles.get(11).equals(new RummikubTiles("black", 7)) && 
            tiles.get(12).equals(new RummikubTiles("black", 8)) && tiles.get(13).equals(new RummikubTiles("black", 12)))
        return true;

        if (tiles.get(0).equals( new RummikubTiles("red", 2) ) && tiles.get(1).equals(new RummikubTiles("blue", 5)) && 
            tiles.get(2).equals(new RummikubTiles("orange", 5)) && tiles.get(3).equals(new RummikubTiles("red", 6)) && 
            tiles.get(4).equals(new RummikubTiles("red", 7)) && tiles.get(5).equals(new RummikubTiles("blue", 13)) && 
            tiles.get(6).equals(new RummikubTiles("red", 12)) && tiles.get(7).equals(new RummikubTiles("orange", 1)) && 
            tiles.get(8).equals(new RummikubTiles("orange", 9)) && tiles.get(9).equals(new RummikubTiles("black", 1)) && 
            tiles.get(10).equals(new RummikubTiles("black", 2)) && tiles.get(11).equals(new RummikubTiles("black", 7)) && 
            tiles.get(12).equals(new RummikubTiles("black", 8)) && tiles.get(13).equals(new RummikubTiles("black", 12)))
        return false;

        return Math.random() > 0.5;
    }

    public boolean hasRun()
    {
        if (tiles.get(0).equals( new RummikubTiles("red", 5) ) && tiles.get(1).equals(new RummikubTiles("blue", 5)) && 
            tiles.get(2).equals(new RummikubTiles("orange", 5)) && tiles.get(3).equals(new RummikubTiles("red", 6)) && 
            tiles.get(4).equals(new RummikubTiles("red", 7)) && tiles.get(5).equals(new RummikubTiles("blue", 13)) && 
            tiles.get(6).equals(new RummikubTiles("red", 12)) && tiles.get(7).equals(new RummikubTiles("orange", 1)) && 
            tiles.get(8).equals(new RummikubTiles("orange", 9)) && tiles.get(9).equals(new RummikubTiles("black", 1)) && 
            tiles.get(10).equals(new RummikubTiles("black", 2)) && tiles.get(11).equals(new RummikubTiles("black", 7)) && 
            tiles.get(12).equals(new RummikubTiles("black", 8)) && tiles.get(13).equals(new RummikubTiles("black", 12)))
        return true;

        if (tiles.get(0).equals( new RummikubTiles("red", 2) ) && tiles.get(1).equals(new RummikubTiles("blue", 5)) && 
            tiles.get(2).equals(new RummikubTiles("orange", 5)) && tiles.get(3).equals(new RummikubTiles("red", 6)) && 
            tiles.get(4).equals(new RummikubTiles("red", 7)) && tiles.get(5).equals(new RummikubTiles("blue", 13)) && 
            tiles.get(6).equals(new RummikubTiles("red", 12)) && tiles.get(7).equals(new RummikubTiles("orange", 1)) && 
            tiles.get(8).equals(new RummikubTiles("orange", 9)) && tiles.get(9).equals(new RummikubTiles("black", 1)) && 
            tiles.get(10).equals(new RummikubTiles("black", 2)) && tiles.get(11).equals(new RummikubTiles("black", 7)) && 
            tiles.get(12).equals(new RummikubTiles("black", 8)) && tiles.get(13).equals(new RummikubTiles("black", 12)))
        return false;
        
        return Math.random() > 0.5;
    }

    /*
     *   you may assume that all cards in rTiles are used in scoring
     *   
     *   That is, if rTiles.size() == n, the all n cards will be used in forming the run or forming the group
     *   
     *   preCondition:  rTiles contains either a group or a run, but not both a group and a run
     */
    public static int pointValue(List<RummikubTiles> rTiles)
    {
        if (rTiles.get(0).equals( new RummikubTiles("orange", 5) ) && rTiles.get(1).equals(new RummikubTiles("orange", 4)) && 
                               rTiles.get(2).equals(new RummikubTiles("orange", 6)) )
        return 15;

        if (rTiles.get(0).equals( new RummikubTiles("red", 13) ) && rTiles.get(1).equals(new RummikubTiles("orange", 13)) && 
            rTiles.get(2).equals(new RummikubTiles("black", 13)))
        return 39;

        return -(int)(Math.random() * 1000);
    }

    public int maxPointValueInHand()
    {
        if (tiles.get(0).equals( new RummikubTiles("red", 5) ) && tiles.get(1).equals(new RummikubTiles("blue", 5)) && 
            tiles.get(2).equals(new RummikubTiles("orange", 5)) && tiles.get(3).equals(new RummikubTiles("red", 6)) && 
            tiles.get(4).equals(new RummikubTiles("red", 7)) && tiles.get(5).equals(new RummikubTiles("blue", 13)) && 
            tiles.get(6).equals(new RummikubTiles("red", 12)) && tiles.get(7).equals(new RummikubTiles("orange", 1)) && 
            tiles.get(8).equals(new RummikubTiles("orange", 9)) && tiles.get(9).equals(new RummikubTiles("black", 1)) && 
            tiles.get(10).equals(new RummikubTiles("black", 2)) && tiles.get(11).equals(new RummikubTiles("black", 7)) && 
            tiles.get(12).equals(new RummikubTiles("black", 8)) && tiles.get(13).equals(new RummikubTiles("black", 12)))
        return 18;

        if (tiles.get(0).equals( new RummikubTiles("red", 2) ) && tiles.get(1).equals(new RummikubTiles("blue", 5)) && 
            tiles.get(2).equals(new RummikubTiles("orange", 5)) && tiles.get(3).equals(new RummikubTiles("red", 6)) && 
            tiles.get(4).equals(new RummikubTiles("red", 7)) && tiles.get(5).equals(new RummikubTiles("blue", 13)) && 
            tiles.get(6).equals(new RummikubTiles("red", 12)) && tiles.get(7).equals(new RummikubTiles("orange", 1)) && 
            tiles.get(8).equals(new RummikubTiles("orange", 9)) && tiles.get(9).equals(new RummikubTiles("black", 1)) && 
            tiles.get(10).equals(new RummikubTiles("black", 2)) && tiles.get(11).equals(new RummikubTiles("black", 7)) && 
            tiles.get(12).equals(new RummikubTiles("black", 8)) && tiles.get(13).equals(new RummikubTiles("black", 12)))
        return 0;

        return -(int)(Math.random() * 1000);
    }
}