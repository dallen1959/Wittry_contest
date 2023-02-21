import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HPCipherStudentTest extends junit.framework.TestCase
{
   public void testHPCipher01()
   {
      HPCipher hp = new HPCipher("P JVKL AOLYLMVYL P HT");
      assertEquals(4, hp.letterDifference("A", "E"));
      assertEquals(2, hp.letterDifference("Z", "B"));
      assertEquals("I CODE THEREFORE I AM", hp.decode("IA"));
      assertEquals("I CODE THEREFORE I AM", hp.decode("DETH"));

      hp = new HPCipher("HIGSHI QI");
      assertEquals("DECODE ME", hp.decode("EM"));
      assertEquals("DECODE ME", hp.decode("DE"));
    }
}