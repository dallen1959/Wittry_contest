import java.util.*;

public class PolygonFunStudentTest extends junit.framework.TestCase
{
   public void testPolygonFun_01()
   {
      assertEquals("PolygonFun.whichQuadrant(new Coordinate(-8, 10), new Coordinate(15, -6))", 1, PolygonFun.whichQuadrant(new Coordinate(-8, 10), new Coordinate(15, -6)));
      assertEquals("PolygonFun.whichQuadrant(new Coordinate(-4, 3), new Coordinate(1, -10))", 3, PolygonFun.whichQuadrant(new Coordinate(-4, 3), new Coordinate(1, -10)));

      assertEquals("6-11", PolygonFun.getNumberOfSides(17, 53));
      assertEquals("7-8", PolygonFun.getNumberOfSides(15, 34));

      assertEquals(true, PolygonFun.isConvex(new Coordinate[] { new Coordinate(0., 0.), new Coordinate(2., 2.), new Coordinate(4., 2.), new Coordinate(2., 0.) } ) );
      assertEquals(true, PolygonFun.isConvex(new Coordinate[] { new Coordinate(3., -20.), new Coordinate(2., -11.), new Coordinate(1., 5.), new Coordinate(5., 9.), new Coordinate(10., 13.), new Coordinate(15., 7.), new Coordinate(23., -3.), new Coordinate(18., -19.), new Coordinate(9., -20.) } ) );

      assertEquals(false, PolygonFun.isConvex(new Coordinate[] { new Coordinate(0., 0.), new Coordinate(1., 12.), new Coordinate(5., 5.), new Coordinate(10., 9.), new Coordinate(11., 1.) } ) );
      assertEquals(false, PolygonFun.isConvex(new Coordinate[] { new Coordinate(1., 5.), new Coordinate(5., 9.), new Coordinate(10., 13.), new Coordinate(15., 7.), new Coordinate(23., -3.), new Coordinate(18., -19.), new Coordinate(9., -20.), new Coordinate(3., -20.), new Coordinate(2., -1.) } ) );
      assertEquals(false, PolygonFun.isConvex(new Coordinate[] { new Coordinate(23., -3.), new Coordinate(18., -19.), new Coordinate(9., -20.), new Coordinate(3., -20.), new Coordinate(2., -1.), new Coordinate(1., 5.), new Coordinate(5., 9.), new Coordinate(10., 13.), new Coordinate(15., 7.) } ) );
     
      List<Coordinate> v1 = new ArrayList<Coordinate>();
      v1.add( new Coordinate(0., 0.) );
      v1.add( new Coordinate(0., 1.) );
      List<Coordinate> v2 = new ArrayList<Coordinate>();
      v2.add( new Coordinate(2., 2.) );
      v2.add( new Coordinate(3., 2.) );
      List<Coordinate> v3 = new ArrayList<Coordinate>();
      v3.add( new Coordinate(4., 1.) );
      v3.add( new Coordinate(1., 1.) );
      List<Coordinate> v4 = new ArrayList<Coordinate>();
      v4.add( new Coordinate(3., -3.) );
      List<Coordinate> v5 = new ArrayList<Coordinate>();
      v5.add( new Coordinate(1., -2.) );
      
      assertEquals(4, PolygonFun.getNumConvex(v1, v2, v3, v4, v5));
   }
}