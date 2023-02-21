import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2016 Wittry programming contest
 */
public class ZipperStudentTest extends junit.framework.TestCase
{
   public void testZipper01()
   {
      Zipper zip = new Zipper("tcraete");

      assertEquals(true, zip.canBuild("cat", "tree"));
      assertEquals(true, zip.canBuild("tcae", "etre"));
      assertEquals(false, zip.canBuild("cat", "ret"));
      assertEquals(true, zip.canBuild("teak", "crochet"));

      Zipper zip1 = new Zipper("tcraete");
      assertEquals(true, zip1.canZipper("cat", "tree"));
      Zipper zip2 = new Zipper("catrtee");
      assertEquals(true, zip2.canZipper("cat", "tree"));
      Zipper zip3 = new Zipper("cttaree");
      assertEquals(false, zip3.canZipper("cat", "ret"));
      Zipper zip4 = new Zipper("jejunator");
      assertEquals(true, zip4.canZipper("dejeuner", "jubilation"));
      Zipper zip5 = new Zipper("to or too");
      assertEquals(false, zip5.canZipper("tor ", "ot oo"));
      assertEquals(true, zip5.canZipper("to r", "o too"));
   }
}