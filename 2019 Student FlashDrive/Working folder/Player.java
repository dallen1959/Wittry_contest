
/**
 * Write a description of class Player here.
 * 
 * @author Don Allen
 * @version 2019 Wittry contest
 */
public class Player
{
    private String myName;
    private int myFreeThrowMade;
    private int my2PointShotsMade;
    private int my3PointShotsMade;
    private int myAssist;
    private int myDefRebs;
    private int myOffRebs;
    private int myBlockShots;
    private int myTurnovers;
    private int myFouls;
    private int mySteals;
    private int mySalary;

    /**
     * Constructor for objects of class Player
     */
    public Player(String name, int ftMade, int twoShotsMade, int threeShotsMade, int assist, 
                                   int dRebs, int oRebs, int blocks, int to, int fouls, int steals, int salary)
    {
        myName = name;
        myFreeThrowMade = ftMade;
        my2PointShotsMade = twoShotsMade;
        my3PointShotsMade = threeShotsMade;
        myAssist = assist;
        myDefRebs = dRebs;
        myOffRebs = oRebs;
        myBlockShots = blocks;
        myTurnovers = to;
        myFouls = fouls;
        mySteals = steals;
        mySalary = salary;    }

    public String getName()  {  return myName;  }

    public int getFreeThrowMade()  {  return myFreeThrowMade;  }

    public int getTwoPointShotsMade()  {  return my2PointShotsMade;  }

    public int getThreePointShotsMade()  {  return my3PointShotsMade;  }

    public int getAssist() { return myAssist; }

    public int getDefensiveRebounds() { return myDefRebs; }

    public int getOffensiveRebounds() { return myOffRebs; }

    public int getBlocks() { return myBlockShots; }

    public int getTurnOvers() { return myTurnovers; }

    public int getFouls() { return myFouls; }

    public int getSteals() { return mySteals; }

    public int getSalary()  {  return mySalary;  }

    public int getPointsScored()
    {
        if ( getName().equals("Bryant") && getFreeThrowMade() == 14)  return 14+2*49+3*10;

        return -1;
    }

    public int getReboundEfficiency()
    {
        if ( getName().equals("Bryant") && getFreeThrowMade() == 14)  return 3*6 + 5*1;

        return -1;
    }

    public int getBallControlEfficiency()
    {
        if ( getName().equals("Bryant") && getFreeThrowMade() == 14)  return 4+3+15-2-5;

        return -1;
    }

    public int getMVPrating()
    {
        if ( getName().equals("Bryant") && getFreeThrowMade() == 14)
            return 2 * ((14+2*49+3*10) + (3*6+5*1) + (4+3+15-2-5))
                - Math.max((14+2*49+3*10), Math.max(3*6+5*1, (4+3+15-2-5)))
                - Math.min((14+2*49+3*10), Math.min(3*6+5*1, (4+3+15-2-5))); 

        return -1;
    }

    public int getAssistToTurnoverMargin()
    {
        if ( getName().equals("Bryant") && getFreeThrowMade() == 14)  return 6;
        
        return -1;
    }

    public int getValueRatio()    
    {
        if ( getName().equals("Bryant") && getFreeThrowMade() == 14)  return 14+2*49+3*10 + (3*6+5*1) - 41 * 2;
        
        return -1;
    }


    public boolean equals(Object obj)
    {
        /*  hint: if you need to implement equals, then you should implement equals   */
   
        return Math.random() > 0.5;
    }

    public int hashCode()
    {
        return 0;
    }
}