import java.util.*;

/**
 * The test class
 *
 * @author  Don Allen
 * @version 2024 Wittry programming contest
 */
public class KnowTheFifthStudentTest extends junit.framework.TestCase
{
   public void testKnowTheFifth01()
   {
       KnowTheFifth ktf = new KnowTheFifth();
       Card c1 = new Card("heart", 2);
       Card c2 = new Card("diamond", 5);
       assertEquals(c1, ktf.isSmaller(c1, c2));
       
       c1 = new Card("spade", 2);
       c2 = new Card("diamond", 2);
       assertEquals(c2, ktf.isSmaller(c1, c2));

       Card[] ans = ktf.arrangeCards(new Card[] { new Card("heart", 2), new Card("spade", 6), new Card("heart", 1),
                           new Card("diamond", 4), new Card("club", 1)});
       assertEquals("heart", ans[0].getSuit());
       assertEquals(1, ans[0].getRank());
       assertEquals("club", ans[1].getSuit());
       assertEquals(1, ans[1].getRank());
       assertEquals("diamond", ans[2].getSuit());
       assertEquals(4, ans[2].getRank());
       assertEquals("spade", ans[3].getSuit());
       assertEquals(6, ans[3].getRank());

       //  evaluateOrder
       Card[] order = new Card[] { new Card("heart", 2), new Card("spade", 6), new Card("heart", 1)};
       assertEquals(4, ktf.evaluateOrder(order));

       // name5thCard
       Card[] theFour = new Card[] { new Card("heart", 2), new Card("spade", 6), new Card("heart", 1), new Card("club", 4)};
       Card fifthCard = ktf.name5thCard(theFour);
       assertEquals("heart", fifthCard.getSuit());
       assertEquals(7, fifthCard.getRank());
    }
}