
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
/*
 *   valid suits: "club", "diamond", "heart", "spade"
 */
    private String suit;
/*
 *   valid rank: 1 = ace, 2, 3, 4, 10, 11 (jack), 12 (queen), 13 (king)
 */
    private int rank;

    /**
     * Constructor for objects of class Card
     */
    public Card(String s, int r)
    {
       suit = s;
       rank= r;
    }

    public int getRank()
    {
        return rank;
    }

    public String getSuit()
    {
        return suit;
    }
}