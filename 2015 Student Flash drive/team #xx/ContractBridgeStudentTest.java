import java.util.*;

/**
import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2015 Wittry programming contest
 */
public class ContractBridgeStudentTest extends junit.framework.TestCase
{
   public void testContractBridge01()
   {
      ArrayList<Card> hand = new ArrayList<Card>();
      hand.add( new Card("K", "S"));
      hand.add( new Card("Q", "S"));
      hand.add( new Card("10", "H"));
      hand.add( new Card("8", "H"));
      hand.add( new Card("4", "H"));
      hand.add( new Card("A", "C"));
      hand.add( new Card("Q", "C"));
      hand.add( new Card("10", "C"));
      hand.add( new Card("5", "C"));
      hand.add( new Card("K", "D"));
      hand.add( new Card("Q", "D"));
      hand.add( new Card("J", "D"));
      hand.add( new Card("8", "D"));
      ContractBridge cb = new ContractBridge(hand);

      assertEquals(17, cb.getPoints());
      assertEquals("D", cb.getSuit());
   }
}