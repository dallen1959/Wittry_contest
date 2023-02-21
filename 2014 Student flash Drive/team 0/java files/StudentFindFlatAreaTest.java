import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2014 Wittry programming contest
 */
public class StudentFindFlatAreaTest extends junit.framework.TestCase
{
   private int[][] table1 = { { 24,	27,	26,	29,	27,	25,	29,	29,	29,	29,	26},
                              { 24,	24,	24,	28,	25,	25,	25,	28,	26,	26,	26},
                              { 26,	28,	29,	30,	30,	31,	29,	27,	27,	28,	30},
                              { 27,	27,	27,	30,	28,	28,	28,	24,	29,	29,	29},
                              { 27,	24,	23,	23,	24,	28,	27,	26,	26,	27,	29},
                              { 24,	24,	26,	31,	26,	26,	28,	32,	32,	29,	28},
                              { 30,	30,	26,	32,	31,	31,	30,	28,	32,	32,	29},
                              { 30,	30,	26,	31,	31,	30,	30,	31,	31,	31,	32},
                              { 29,	31,	26,	32,	33,	33,	35,	35,	34,	36,	36},
                              { 32,	33,	26,	34,	33,	34,	35,	36,	37,	37,	36},
                              { 33,	33,	26,	34,	34,	36,	35,	36,	39,	37,	36},
                              { 33,	34,	31,	32,	34,	37,	37,	37,	37,	36,	38},
                              { 36,	37,	37,	35,	37,	40,	39,	40,	41,	41,	40},
                              { 37,	40,	39,	40,	38,	40,	39,	41,	42,	42,	40},
                              { 37,	37,	39,	38,	38,	40,	39,	39,	43,	40,	40},
                              { 37,	38,	39,	40,	38,	41,	40,	41,	42,	41,	39 } };

   private int[][] table2 = { { 28, 29, 30, 30, 31, 29, 27, 27, 28},
                              { 27, 27, 27, 27, 28, 28, 24, 29, 29},
                              { 24, 23, 27, 27, 28, 27, 26, 28, 29},
                              { 24, 26, 31, 27, 26, 28, 32, 32, 29},
                              { 30, 27, 27, 27, 27, 30, 28, 32, 29},
                              { 30, 23, 31, 31, 30, 30, 31, 31, 29},
                              { 31, 30, 32, 33, 33, 33, 33, 34, 29},
                              { 31, 33, 33, 33, 33, 35, 33, 37, 29},
                              { 31, 33, 34, 34, 33, 35, 33, 39, 37},
                              { 31, 33, 32, 34, 33, 33, 33, 38, 36},
                              { 31, 33, 33, 37, 41, 41, 41, 41, 41},
                              { 40, 39, 40, 38, 40, 40, 40, 40, 40},
                              { 37, 39, 38, 38, 40, 39, 39, 43, 40} };
      
   private int[][] elev = { {11, 13, 17, 19, 25},
                            { 9, 15, 11, 21, 27},
                            {10, 16, 11, 22, 26}, 
                            {12, 11, 11, 22, 25},
                            {11, 18, 20, 22, 25} };

   public void testTopoSearchTest01()
   {
      TopoSearch fml = new TopoSearch(table1);

      assertEquals(true, fml.isFlatArea(new MapLocation(0, 0)));
      assertEquals(true, fml.isFlatArea(new MapLocation(0, 5)));
      assertEquals(true, fml.isFlatArea(new MapLocation(1, 9)));
      assertEquals(true, fml.isFlatArea(new MapLocation(3, 2)));
      assertEquals(true, fml.isFlatArea(new MapLocation(4, 5)));
      assertEquals(true, fml.isFlatArea(new MapLocation(3, 9)));
      assertEquals(true, fml.isFlatArea(new MapLocation(6, 1)));
      assertEquals(true, fml.isFlatArea(new MapLocation(7, 4)));
      assertEquals(true, fml.isFlatArea(new MapLocation(5, 8)));
      assertEquals(true, fml.isFlatArea(new MapLocation(10, 1)));
      assertEquals(true, fml.isFlatArea(new MapLocation(10, 4)));
      assertEquals(true, fml.isFlatArea(new MapLocation(10, 6)));
      assertEquals(true, fml.isFlatArea(new MapLocation(9, 10)));
      assertEquals(true, fml.isFlatArea(new MapLocation(14, 1)));
      assertEquals(true, fml.isFlatArea(new MapLocation(13, 4)));
      assertEquals(true, fml.isFlatArea(new MapLocation(14, 6)));
      assertEquals(true, fml.isFlatArea(new MapLocation(14, 9)));

      assertEquals(false, fml.isFlatArea(new MapLocation(2, 3)));
      assertEquals(false, fml.isFlatArea(new MapLocation(7, 2)));
      assertEquals(false, fml.isFlatArea(new MapLocation(11, 7)));
      assertEquals(false, fml.isFlatArea(new MapLocation(12, 8)));

      assertEquals(17, fml.getNumFlatAreas());
      assertEquals(4, fml.getAreaOfFlatArea(new MapLocation(9, 6)) );
      assertEquals(10, fml.getPerimeterOfFlatArea(new MapLocation(6, 4)) );

      TopoSearch fm2 = new TopoSearch(table2);

      assertEquals(true, fm2.isFlatArea(new MapLocation(1, 3)));
      assertEquals(true, fm2.isFlatArea(new MapLocation(10, 2)));
      assertEquals(true, fm2.isFlatArea(new MapLocation(12, 8)));
      assertEquals(false, fm2.isFlatArea(new MapLocation(7, 5)));

      assertEquals(4, fm2.getNumFlatAreas());
      assertEquals(11, fm2.getAreaOfFlatArea(new MapLocation(2, 2)) );
      assertEquals(22, fm2.getPerimeterOfFlatArea(new MapLocation(2, 2)) );
      assertEquals(18, fm2.getAreaOfFlatArea(new MapLocation(7, 6)) );
      assertEquals(28+6, fm2.getPerimeterOfFlatArea(new MapLocation(10, 2)) );

      TopoSearch fm3 = new TopoSearch(elev);

      assertEquals(true, fm3.isFlatArea(new MapLocation(2, 2)));
      assertEquals(false, fm3.isFlatArea(new MapLocation(2, 3)));
      assertEquals(false, fm3.isFlatArea(new MapLocation(4, 4)));

      assertEquals(1, fm3.getNumFlatAreas());
      assertEquals(4, fm3.getAreaOfFlatArea(new MapLocation(2, 2)) );
      assertEquals(10, fm3.getPerimeterOfFlatArea(new MapLocation(2, 2)) );
   }
}