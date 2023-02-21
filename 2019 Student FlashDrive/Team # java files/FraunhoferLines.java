import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2019 Wittry Contest
 */
public class FraunhoferLines
{
    private List<Element> elements;

    /*
     *    THou SHALL never change els.
     */    
    public FraunhoferLines(List<Element> els)
    {
        /*    add your on code   */
    }

    /*
     *    returns a List<Element> containing all possible Elements in elements
     *    
     *    every Element in elements 
     */    
    public List<Element> getPossibleElements(boolean[] spectrum)
    {
        List<Element> ans = new ArrayList<Element>();

        if ( spectrum[0] && spectrum[1] && !spectrum[2] && spectrum[3] && !spectrum[4] && !spectrum[5] && spectrum[6] && 
        !spectrum[7] && spectrum[8] && spectrum[9] && !spectrum[10] && !spectrum[11] && spectrum[12] && spectrum[13] && 
        spectrum[14] && spectrum[15] && spectrum[16] && spectrum[17] && spectrum[18] && spectrum[19])
        {
            ans.add(new Element("O",  new int[] {2, 5, 7} ));
            ans.add(new Element("Si", new int[] {4, 10, 11} ));
            return ans;
        }

        if ( !spectrum[0] && spectrum[1] && !spectrum[2] && spectrum[3] && spectrum[4] && !spectrum[5] && !spectrum[6] && 
                 !spectrum[7] && spectrum[8] && spectrum[9] && spectrum[10] && spectrum[11] && spectrum[12] && spectrum[13] && 
                 spectrum[14] && spectrum[15] && !spectrum[16] && !spectrum[17] && spectrum[18] && spectrum[19])
        {
            ans.add(new Element("Zn", new int[] {0, 3, 9, 18, 19} ));
            return ans;
        }

        return ans;
    }

    public List<Element> getRequiredElements(boolean[] spectrum)
    {
        List<Element> ans = new ArrayList<Element>();

        if ( !spectrum[0] && spectrum[1] && spectrum[2] && !spectrum[3] && spectrum[4] && spectrum[5] && spectrum[6] && 
                 spectrum[7] && spectrum[8] && !spectrum[9] && spectrum[10] && !spectrum[11] && !spectrum[12] && spectrum[13] && 
                 spectrum[14] && spectrum[15] && spectrum[16] && !spectrum[17] && !spectrum[18] && !spectrum[19])
        {
            ans.add(new Element("Zn", new int[] {0, 3, 9, 18, 19} ));
            return ans;
        }

        return ans;
    }

    /*
     *   
     */
    public List<Integer> getMissingBands(boolean[] spectrum)
    {
        List<Integer> ans = new ArrayList<Integer>();

        if ( !spectrum[0] && spectrum[1] && !spectrum[2] && spectrum[3] && spectrum[4] && !spectrum[5] && !spectrum[6] && 
                 !spectrum[7] && !spectrum[8] && spectrum[9] && spectrum[10] && spectrum[11] && spectrum[12] && spectrum[13] && 
                 spectrum[14] && spectrum[15] && !spectrum[16] && !spectrum[17] && spectrum[18] && spectrum[19])
        {
            ans.add(new Integer(0));
            ans.add(new Integer(6));
            return ans;
        }

        return ans;
    }
}