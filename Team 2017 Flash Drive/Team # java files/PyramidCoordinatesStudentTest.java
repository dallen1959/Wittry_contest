import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2017 Wittry programming contest
 */
public class PyramidCoordinatesStudentTest extends junit.framework.TestCase
{
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

       assertEquals("7", myP.get(3, 3));
       assertEquals("4", myP.get(4, 3));
       assertEquals("15", myP.get(5, 1));

       List<String> answers = new ArrayList<String>();
       answers.add("2");
       answers.add("9");
       answers.add("6");
       answers.add("4");
       answers.add("13");
       answers.add("14");
       String[] neighbors = myP.getNeighbors(4, 2);
       assertEquals(6, neighbors.length);
       assertEquals("10", myP.get(4, 2));
       for (int ind = 0; ind < neighbors.length; ind++)
       {
          assertEquals(true, answers.contains(neighbors[ind]));
          answers.remove(neighbors[ind]);
       }

       PyramidCoordinates result = myP.getSubPyramid(3, 3);
       assertEquals("7", result.get(1, 1));

       assertEquals("4", result.get(2, 1));
       assertEquals("8", result.get(2, 2));

       assertEquals("14", result.get(3, 1));
       assertEquals("11", result.get(3, 2));
       assertEquals("12", result.get(3, 3));
   }
}