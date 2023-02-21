import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HobbitonStudentTest extends junit.framework.TestCase
{
   public void testHobbiton01()
   {
      HobbitonMap hm = new HobbitonMap();
      Parcel p = new Parcel("test1");
      p.setCircle(new Point (0, 0), 10.0 );
      Parcel q = new Parcel("test1");
      q.setCircle(new Point (25, 25), 10.0 );
      Parcel r = new Parcel("test1");
      r.setCircle(new Point (25, 25), 100.0 );

      assertEquals(true, hm.overLap(p, r));
      assertEquals(false, hm.overLap(p, q));

      Parcel s1 = new Parcel("test1");
      s1.setRectangle(new Point (0, 0), new Point (100, 100) );
      Parcel s2 = new Parcel("test1");
      s2.setRectangle(new Point (25, 25), new Point (50, 50) );
      Parcel s3 = new Parcel("test1");
      s3.setRectangle(new Point (-25, -25), new Point (-5, -5) );

      assertEquals(true, hm.overLap(s1, s2));
      assertEquals(false, hm.overLap(s1, s3));

      Parcel c1 = new Parcel("test1");
      c1.setCircle(new Point (0, 0), 10);
      Parcel c2 = new Parcel("test1");
      c2.setCircle(new Point (13, 10), 2);
      s1 = new Parcel("test1");
      s1.setRectangle(new Point (3, 3), new Point (15, 8) );
      s2 = new Parcel("test1");
      s2.setRectangle(new Point (25, -20), new Point (50,10) );

      assertEquals(true, hm.overLap(c1, s1));
      assertEquals(false, hm.overLap(c1, s2));
      assertEquals(false, hm.overLap(c2, s2));
      assertEquals(true, hm.overLap(c2, s1));
   }
}