import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentJumbleTest extends junit.framework.TestCase
{
   public void testJumble01()
   {
      Jumble j = new Jumble( "SPAM" );
      assertEquals(0, j.numLettersInCorrectLocation( "MAPS" ));
      assertEquals("good", j.getRating( "MASP" ));
      assertEquals("fair", j.getRating( "MAPS" ));
      assertEquals("poor", j.getRating( "SaPM" ));
      assertEquals("not", j.getRating( "SPAM" ));

      j = new Jumble( "STOP" );
      assertEquals(0, j.numLettersInCorrectLocation( "PSTO" ));
      assertEquals(2, j.numLettersInCorrectLocation( "SOTP" ));

      j = new Jumble( "KITE" );
      assertEquals(true, j.looksReal( "KITE" ));
      assertEquals(true, j.looksReal( "IKET" ));
      assertEquals(false, j.looksReal( "KTEI" ));
      assertEquals(false, j.looksReal( "ETKI" ));
   }
}