import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version 2014 Wittry programming contest
 */
public class StudentHandDetectionTest extends junit.framework.TestCase
{
   public void testHandDetectionTest01()
   {
      HobbitCard[] hand = {new HobbitCard(1, "Ent"), new HobbitCard(2, "Ent"), new HobbitCard(4, "Ent"), 
                                       new HobbitCard(8, "Ent"), new HobbitCard(16, "Ent") };
      HandDetection hd = new HandDetection(hand);
      assertEquals(true, hd.hasSpread());
      assertEquals(false, hd.hasRainbow());
      assertEquals(true, hd.hasFlush());
      assertEquals(false, hd.hasPrime());
      assertEquals(true, hd.hasBinary());
      assertEquals(true, hd.hasBinaryFlush());
      assertEquals(true, hd.hasLowSum());

      HobbitCard[] hand1 = {new HobbitCard(5, "Ent"), new HobbitCard(2, "Elf"), new HobbitCard(11, "Man"), 
                                       new HobbitCard(7, "Orc"), new HobbitCard(13, "Hobbit") };
      hd = new HandDetection(hand1);
      assertEquals(false, hd.hasSpread());
      assertEquals(true, hd.hasRainbow());
      assertEquals(false, hd.hasFlush());
      assertEquals(true, hd.hasPrime());
      assertEquals(false, hd.hasBinary());
      assertEquals(false, hd.hasBinaryFlush());
      assertEquals(false, hd.hasLowSum());
   }
}