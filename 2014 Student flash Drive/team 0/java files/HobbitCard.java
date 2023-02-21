
/**
 * Write a description of class HobbitCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HobbitCard
{
    private int num;       /*   1 to 21 inclusive  */
    private String suit;   /*   Elf, Man, Hobbit, Ent, Orc  */

    /**
     * Constructor for objects of class HobbitCard
     */
    public HobbitCard(int n, String s)
    {
        num  = n;
        suit = s;
    }

    public int getNum() { return num; }

    public String getSuit() { return suit; }

    public boolean equals(Object obj)
    {
        HobbitCard hc = (HobbitCard) obj;
        return num == hc.getNum() && suit.equals(hc.getSuit());
    }
}
