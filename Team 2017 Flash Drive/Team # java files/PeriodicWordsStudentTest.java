import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2017 Wittry programming contest
 */
public class PeriodicWordsStudentTest extends junit.framework.TestCase
{
   public void testPeriodicWords01()
   {
      List<Element> inStock = new ArrayList<Element>();
      inStock.add( new Element("H", 1));
      inStock.add( new Element("He", 2));
      inStock.add( new Element("O", 8));
      inStock.add( new Element("C", 6));
      PeriodicWords pw = new PeriodicWords(inStock);

      List<Element>  mix = new ArrayList<Element>();
      mix.add( new Element("H", 1));
      mix.add( new Element("Li", 3));
      mix.add( new Element("O", 8));

      List<Element> missing = pw.getMissingElements(mix);
      assertEquals(4, inStock.size());
      assertEquals(3, mix.size());
      assertEquals(1, missing.size());
      assertEquals(new Element("Li", 3), missing.get(0));
//      assertEquals(true, ans.indexOf(missing.get(0)) >= 0);

      assertEquals(true, pw.isPeriodicSpellingPossible("BACON"));
      assertEquals(true, pw.isPeriodicSpellingPossible("HER"));
      assertEquals(true, pw.isPeriodicSpellingPossible("HERE"));
      assertEquals(true, pw.isPeriodicSpellingPossible("SPOONS"));
      assertEquals(true, pw.isPeriodicSpellingPossible("BYTE"));
      assertEquals(true, pw.isPeriodicSpellingPossible("LIKES"));
      assertEquals(false, pw.isPeriodicSpellingPossible("TEST"));
      assertEquals(false, pw.isPeriodicSpellingPossible("COMPUTER"));
   }
}