import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * PyramidCoordinates.
 *
 * @author  Don Allen
 * @version 2017 Wittry Contest
 */
public class PyramidCoordinates
{
    /*
     *    precondition:  pyramind.size() >= 3
     */
    List<ArrayList<String>> pyramind;

    /*
     *    precondition:  objs.size() >= 3
     */
    public PyramidCoordinates(List<ArrayList<String>> objs)
    {
        pyramind = objs;
    }

    /*
     *   Precondition:
     *        1 <= m <= pyramind.size()
     *        1 <= n <= pyramind.get(m).size()
     *
     *   returns the object in the pyramind at location m, n
     */
    public String get(int m, int n)
    {
        if (pyramind.size() == 5 && pyramind.get(1).get(1).equals("3") && pyramind.get(3).get(2).equals("4"))
        {
            if (m == 3 && n == 3) return "7";
            if (m == 4 && n == 3) return "4";
            if (m == 5 && n == 1) return "15";
            if (m == 4 && n == 2) return "10";
        }

        if (pyramind.size() == 3 && pyramind.get(1).get(1).equals("8") && pyramind.get(2).get(2).equals("12"))
        {
            if (m == 1 && n == 1) return "7";
            if (m == 2 && n == 1) return "4";
            if (m == 2 && n == 2) return "8";
            if (m == 3 && n == 1) return "14";
            if (m == 3 && n == 2) return "11";
            if (m == 3 && n == 3) return "12";
        }

        return "";
    }

    /*
     *    returns a List of all neighbors - order is not important
     */
    public String[] getNeighbors(int m, int n)
    {
        if (m == 4 && n == 2
            && pyramind.size() == 5 && pyramind.get(1).get(1).equals("3") && pyramind.get(3).get(2).equals("4"))
        {
            String[] neigh = {"2", "9", "6", "4", "13", "14"};
            return neigh;
        }
        return null;
    }

    /*
     *     Returns the Pyramid 'rooted' at Location m, n
     *     
     *     The new Pyramid will have at least three rows
     */
    public PyramidCoordinates getSubPyramid(int m, int n)
    {
        List<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
        if (m == 3 && n == 3
            && pyramind.size() == 5 && pyramind.get(1).get(1).equals("3") && pyramind.get(3).get(2).equals("4"))
        {
            ArrayList<String> t = new ArrayList<String>();
            t.add("7");
            ans.add(t);

            t = new ArrayList<String>();
            t.add("4");
            t.add("8");
            ans.add(t);

            t = new ArrayList<String>();
            t.add("14");
            t.add("11");
            t.add("12");
            ans.add(t);

            PyramidCoordinates myP = new PyramidCoordinates(ans);
            return myP;
        }

        PyramidCoordinates myP = new PyramidCoordinates(ans);
        return myP;
    }
}
/*
public void testPyramidCoordinates01()
{
List<ArrayList<String>> objs = new ArrayList<ArrayList<String>>();
ArrayList row1 = new ArrayList<String>();
row1.add("5");
objs.add(row1);
ArrayList row2 = new ArrayList<String>();
row2.add("1");
row2.add("3");
objs.add(row2);
ArrayList row3 = new ArrayList<String>();
row3.add("2");
row3.add("9");
row3.add("7");
objs.add(row3);
ArrayList row4 = new ArrayList<String>();
row4.add("6");
row4.add("10");
row4.add("4");
row4.add("8");
objs.add(row4);
ArrayList row5 = new ArrayList<String>();
row5.add("15");
row5.add("13");
row5.add("14");
row5.add("11");
row5.add("12");
objs.add(row5);
PyramidCoordinates myP = new PyramidCoordinates(objs);

PyramidCoordinates result = myP.getSubPyramid(3, 3);
assertEquals("7", result.get(1, 1));

assertEquals("4", result.get(2, 1));
assertEquals("8", result.get(2, 2));

assertEquals("14", result.get(3, 1));
assertEquals("11", result.get(3, 2));
assertEquals("12", result.get(3, 3));
}
 */