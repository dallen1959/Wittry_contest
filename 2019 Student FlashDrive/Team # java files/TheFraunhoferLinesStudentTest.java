import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2019 Wittry programming contest
 */
public class TheFraunhoferLinesStudentTest extends junit.framework.TestCase
{
    /*
     *   Spectrum:
     *   
     *     true  = light is NOT absorbed
     *     
     *     false = dark band is absorbed
     */
    public void testFraunhoferLines01()
    {
        List<Element> els = new ArrayList<Element>();
        els.add(new Element("H",  new int[] {2, 5, 16} ));
        els.add(new Element("He", new int[] {1, 5, 15} ));
        els.add(new Element("C",  new int[] {1, 13, 19} ));
        els.add(new Element("N",  new int[] {2, 8, 17} ));
        els.add(new Element("O",  new int[] {2, 5, 7} ));
        els.add(new Element("Ne", new int[] {0, 4, 6, 11, 17} ));
        els.add(new Element("Si", new int[] {4, 10, 11} ));
        els.add(new Element("Cl", new int[] {1, 5, 14, 18} ));
        els.add(new Element("Ar", new int[] {0, 3, 9, 12, 17, 18} ));
        els.add(new Element("Zn", new int[] {0, 3, 9, 18, 19} ));
        els.add(new Element("Kr", new int[] {1, 9, 17} ));
        els.add(new Element("Xe", new int[] {0, 3, 9, 11, 18} ));
        els.add(new Element("Ba", new int[] {11, 12, 17} ));

        FraunhoferLines fl = new FraunhoferLines(els);
        //                      0      1      2     3     4     5      6      7     8       9
        boolean[] spectrum = {  true,  true, false, true, false, false, true, false, true, true,
                               false, false,  true, true, true,   true, true,  true, true, true };

        List<Element> ans = fl.getPossibleElements(spectrum);
        assertEquals(2, ans.size());
        assertEquals("contains \"O\"",  true, ans.contains(new Element("O",  new int[] {2, 5, 7} )));
        assertEquals("contains \"Si\"", true, ans.contains(new Element("Si", new int[] {4, 10, 11})));
        assertEquals("does not contain \"Ar\"",  false, ans.contains(new Element("Ar", new int[] {0, 3, 9, 12, 17, 18})));
        assertEquals("does not contain \"Cl\"", false, ans.contains(new Element("Cl", new int[] {1, 5, 14, 18})));

        //                      0      1      2     3     4     5      6      7     8       9
        boolean[] spectrum1 = { false, true, true,  false, true, true,  true, true, true, false,
                                true,  false,  false, true, true, true, true, false, false, false };
                               
        ans = fl.getRequiredElements(spectrum1);
        assertEquals(1, ans.size());
        assertEquals("contains \"Zn\"", true, ans.contains(new Element("Zn", new int[] {0, 3, 9, 18, 19} )));

        boolean[] spectrum2 = {false, true, false, true, true, false, false, false, false, true,     //  H, N  and O
                                true, true,  true, true, true,  true, false, false,  true, true};    //  add bands:  0, 6  &&  14
        List<Integer> bandAns = fl.getMissingBands(spectrum2);                             
        int num = bandAns.size();
        assertEquals(2, num);
        assertEquals("missing band 0", true, bandAns.contains(new Integer(0) ) );
        assertEquals("missing band 6", true, bandAns.contains(new Integer(6) ) );
    }
}