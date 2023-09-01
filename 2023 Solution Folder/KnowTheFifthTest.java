import java.util.*;

/**
 * The test class
 *
 * @author  Don Allen
 * @version 2024 Wittry programming contest
 */
public class KnowTheFifthTest extends junit.framework.TestCase
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

    public void testIsSmaller02()
    {
        KnowTheFifth ktf = new KnowTheFifth();
        Card c1 = new Card("heart", 11);
        Card c2 = new Card("diamond", 11);
        assertEquals("11h, 11d", c2, ktf.isSmaller(c1, c2));

        ktf = new KnowTheFifth();
        c1 = new Card("club", 11);
        c2 = new Card("diamond", 11);
        assertEquals("11c, 11d", c1, ktf.isSmaller(c1, c2));

        ktf = new KnowTheFifth();
        c1 = new Card("spade", 1);
        c2 = new Card("heart", 1);
        assertEquals("1s, 1h", c2, ktf.isSmaller(c1, c2));
    }

    public void testEvaluateOrder03()
    {
        KnowTheFifth ktf = new KnowTheFifth();

        Card[] order1 = new Card[] {new Card("diamond", 2), new Card("heart", 2), new Card("spade", 2)};
        assertEquals("2d, 2h, 2s", 1, ktf.evaluateOrder(order1));

        Card[] order2 = new Card[] {new Card("club", 5), new Card("heart", 5), new Card("diamond", 5)};
        assertEquals("5c, 2h, 2d", 2, ktf.evaluateOrder(order2));

        Card[] order3 = new Card[] {new Card("heart", 9), new Card("diamond", 9), new Card("spade", 9)};
        assertEquals("9h, 9d, 9s", 3, ktf.evaluateOrder(order3));

        Card[] order4 = new Card[] {new Card("heart", 1), new Card("spade", 1), new Card("diamond", 1)};
        assertEquals("1h, 1s, 1d", 4, ktf.evaluateOrder(order4));

        Card[] order5 = new Card[] {new Card("spade", 3), new Card("diamond", 3), new Card("heart", 3)};
        assertEquals("5c, 2h, 2d", 5, ktf.evaluateOrder(order5));

        Card[] order6 = new Card[] {new Card("heart", 5), new Card("diamond", 5), new Card("club", 5)};
        assertEquals("5c, 2h, 2d", 6, ktf.evaluateOrder(order6));
    }

    public void testName5thCard04()
    {
        KnowTheFifth ktf = new KnowTheFifth();

        Card[] theFour = new Card[] { new Card("diamond", 12), new Card("spade", 3), new Card("heart", 7), new Card("club", 4)};
        Card fifthCard = ktf.name5thCard(theFour);
        assertEquals("suit: 12d, 3s, 7h, 4c", "diamond", fifthCard.getSuit());
        assertEquals("rank: 12d, 3s, 7h, 4c", 1, fifthCard.getRank());
    }

    public void testName5thCard05()
    {
        KnowTheFifth ktf = new KnowTheFifth();

        Card[] theFour = new Card[] { new Card("diamond", 2), new Card("spade", 6), new Card("heart", 7), new Card("club", 4)};
        Card fifthCard = ktf.name5thCard(theFour);
        assertEquals("suit: 2d, 6s, 7h, 4c", "diamond", fifthCard.getSuit());
        assertEquals("rank: 2d, 6s, 7h, 4c", 2+4, fifthCard.getRank());
    }

    public void testArrangeCards06()
    {
        KnowTheFifth ktf = new KnowTheFifth();

        Card[] hand = new Card[] { new Card("heart", 3), new Card("spade", 11), new Card("spade", 7),
                new Card("diamond", 13), new Card("club", 7)};
        Card[] ans = ktf.arrangeCards(hand);
        assertEquals("0: 3h, 11s, 7s, 13d, 7c", "spade", ans[0].getSuit());
        assertEquals("0: 3h, 11s, 7s, 13d, 7c", 7, ans[0].getRank());
        assertEquals("1: 3h, 11s, 7s, 13d, 7c", "club", ans[1].getSuit());
        assertEquals("1: 3h, 11s, 7s, 13d, 7c", 7, ans[1].getRank());
        assertEquals("2: 3h, 11s, 7s, 13d, 7c:", "diamond", ans[2].getSuit());
        assertEquals("2: 3h, 11s, 7s, 13d, 7c", 13, ans[2].getRank());
        assertEquals("3: 3h, 11s, 7s, 13d, 7c", "heart", ans[3].getSuit());
        assertEquals("3: 3h, 11s, 7s, 13d, 7c", 3, ans[3].getRank());
    }

    public void testArrangeCards07()
    {
        KnowTheFifth ktf = new KnowTheFifth();

        Card[] hand = new Card[] { new Card("heart", 3), new Card("spade", 11), new Card("spade", 2),
                new Card("diamond", 13), new Card("club", 7)};
        Card[] ans = ktf.arrangeCards(hand);
        assertEquals("0: 3h, 11s, 2s, 13d, 7c", "spade", ans[0].getSuit());
        assertEquals("0: 3h, 11s, 2s, 13d, 7c", 11, ans[0].getRank());
        assertEquals("1: 3h, 11s, 2s, 13d, 7c", "club", ans[1].getSuit());
        assertEquals("1: 3h, 11s, 2s, 13d, 7c", 7, ans[1].getRank());
        assertEquals("2: 3h, 11s, 2s, 13d, 7c", "diamond", ans[2].getSuit());
        assertEquals("2: 3h, 11s, 2s, 13d, 7c", 13, ans[2].getRank());
        assertEquals("3: 3h, 11s, 2s, 13d, 7c", "heart", ans[3].getSuit());
        assertEquals("3: 3h, 11s, 2s, 13d, 7c", 3, ans[3].getRank());
    }

    public void testArrangeCards08()
    {
        KnowTheFifth ktf = new KnowTheFifth();

        Card[] hand = new Card[] { new Card("heart", 3), new Card("spade", 9), new Card("diamond", 12),
                new Card("club", 8), new Card("heart", 7)};
        Card[] ans = ktf.arrangeCards(hand);
        assertEquals("0: 3h, 9s, 12d, 3c, 7h", "heart", ans[0].getSuit());
        assertEquals("0: 3h, 9s, 12d, 3c, 7h", 3, ans[0].getRank());
        assertEquals("1: 3h, 9s, 12d, 3c, 7h", "spade", ans[1].getSuit());
        assertEquals("1: 3h, 9s, 12d, 3c, 7h", 9, ans[1].getRank());
        assertEquals("2: 3h, 9s, 12d, 3c, 7h", "diamond", ans[2].getSuit());
        assertEquals("2: 3h, 9s, 12d, 3c, 7h", 12, ans[2].getRank());
        assertEquals("3: 3h, 9s, 12d, 3c, 7h", "club", ans[3].getSuit());
        assertEquals("3: 3h, 9s, 12d, 3c, 7h", 8, ans[3].getRank());
    }

    public void testArrangeCards09()
    {
        KnowTheFifth ktf = new KnowTheFifth();

        Card[] hand = new Card[] { new Card("heart", 3), new Card("spade", 9), new Card("diamond", 12),
                new Card("club", 8), new Card("club", 1) };
        Card[] ans = ktf.arrangeCards(hand);
        assertEquals("0: 3h, 9s, 12d, 3c, 7h", "club", ans[0].getSuit());
        assertEquals("0: 3h, 9s, 12d, 3c, 7h", 8, ans[0].getRank());
        assertEquals("1: 3h, 9s, 12d, 3c, 7h", "diamond", ans[1].getSuit());
        assertEquals("1: 3h, 9s, 12d, 3c, 7h", 12, ans[1].getRank());
        assertEquals("2: 3h, 9s, 12d, 3c, 7h", "spade", ans[2].getSuit());
        assertEquals("2: 3h, 9s, 12d, 3c, 7h", 9, ans[2].getRank());
        assertEquals("3: 3h, 9s, 12d, 3c, 7h", "heart", ans[3].getSuit());
        assertEquals("3: 3h, 9s, 12d, 3c, 7h", 3, ans[3].getRank());
    }

    public void testArrangeCards10()
    {
        KnowTheFifth ktf = new KnowTheFifth();

        Card[] hand = new Card[] { new Card("heart", 3), new Card("club", 9), new Card("diamond", 11),
                new Card("diamond", 8), new Card("spade", 1) };
        Card[] ans = ktf.arrangeCards(hand);
        assertEquals("0: 3h, 9s, 12d, 3c, 7h", "diamond", ans[0].getSuit());
        assertEquals("0: 3h, 9s, 12d, 3c, 7h", 8, ans[0].getRank());
        assertEquals("1: 3h, 9s, 12d, 3c, 7h", "heart", ans[1].getSuit());
        assertEquals("1: 3h, 9s, 12d, 3c, 7h", 3, ans[1].getRank());
        assertEquals("2: 3h, 9s, 12d, 3c, 7h", "spade", ans[2].getSuit());
        assertEquals("2: 3h, 9s, 12d, 3c, 7h", 1, ans[2].getRank());
        assertEquals("3: 3h, 9s, 12d, 3c, 7h", "club", ans[3].getSuit());
        assertEquals("3: 3h, 9s, 12d, 3c, 7h", 9, ans[3].getRank());

        Card fifthCard = ktf.name5thCard(ans);
        assertEquals("suit: 3h, 1s, 9c", "diamond", fifthCard.getSuit());
        assertEquals("rank: 3h, 1s, 9c", 11, fifthCard.getRank());
    }
}