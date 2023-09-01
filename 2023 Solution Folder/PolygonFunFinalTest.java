import java.util.*;

public class PolygonFunFinalTest extends junit.framework.TestCase
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
/*
      List<double[][]> v1a = new ArrayList<double[][]>();
      v1a.add( new double[][] { {0., 0.}, {0., 1.} } );
      List<double[][]> v2a = new ArrayList<double[][]>();
      v2a.add( new double[][] { {2., 2.}, {3., 2.} } );
      List<double[][]> v3a = new ArrayList<double[][]>();
      v3a.add( new double[][] { {4., 1.}, {1., 1.} } );
      List<double[][]> v4a = new ArrayList<double[][]>();
      v4a.add( new double[][] { {3., -3.} } );
      List<double[][]> v5a = new ArrayList<double[][]>();
      v5a.add( new double[][] { {1., -2.} } );
      
      assertEquals(4, PolygonFun.getNumConvexDouble(v1a, v2a, v3a, v4a, v5a));
*/
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

   public void testWhichQuadrant_02()     //    whichQuadrant(upper_left_x, left_y, lower_right_x, right_y)
   {
      assertEquals(1, PolygonFun.whichQuadrant(new Coordinate(8, 10), new Coordinate(15, 6)));
      assertEquals(2, PolygonFun.whichQuadrant(new Coordinate(-8, 10), new Coordinate(-5, 6)));
      assertEquals(3, PolygonFun.whichQuadrant(new Coordinate(-6, -1), new Coordinate(-2, -16)));
      assertEquals(4, PolygonFun.whichQuadrant(new Coordinate(1, -11), new Coordinate(5, -16)));
   }

   public void testWhichQuadrant_03()
   {
      assertEquals(1, PolygonFun.whichQuadrant(new Coordinate(-3, 4), new Coordinate(4, -3)));
      assertEquals(1, PolygonFun.whichQuadrant(new Coordinate(-3, 4), new Coordinate(4, 1)));
      assertEquals(1, PolygonFun.whichQuadrant(new Coordinate(2, 4), new Coordinate(3, -1)));
      
      assertEquals(2, PolygonFun.whichQuadrant(new Coordinate(-4, 5), new Coordinate(3, -4)));
      assertEquals(2, PolygonFun.whichQuadrant(new Coordinate(-6, 8), new Coordinate(5, 2)));
      assertEquals(2, PolygonFun.whichQuadrant(new Coordinate(-4, 5), new Coordinate(-1, -4)));

      assertEquals(3, PolygonFun.whichQuadrant(new Coordinate(-2, 9), new Coordinate(1, -10)));
      assertEquals(3, PolygonFun.whichQuadrant(new Coordinate(-2, 3), new Coordinate(-1, -4)));
      assertEquals(3, PolygonFun.whichQuadrant(new Coordinate(-8, -1), new Coordinate(7, -10)));
      
      assertEquals(4, PolygonFun.whichQuadrant(new Coordinate(-4, 5), new Coordinate(5, -6)));
      assertEquals(4, PolygonFun.whichQuadrant(new Coordinate(4, 5), new Coordinate(8, -6)));
      assertEquals(4, PolygonFun.whichQuadrant(new Coordinate(-4, -5), new Coordinate(5, -11)));
   }

   public void testGetNumberOfSides_04()   // getNumberOfSides(int angles, int diagonals)
   {
      assertEquals("4-13", PolygonFun.getNumberOfSides(4+13, 4*(4-3)/2 + 13*(13-3)/2));
      assertEquals("7-9", PolygonFun.getNumberOfSides(7+9, 7*(7-3)/2 + 9*(9-3)/2));
      assertEquals("5-17", PolygonFun.getNumberOfSides(5+17, 5*(5-3)/2 + 17*(17-3)/2));
   }

   public void testGetNumberOfSides_05()
   {
      assertEquals("14-23", PolygonFun.getNumberOfSides(14+23, 14*(14-3)/2 + 23*(23-3)/2));
      assertEquals("17-39", PolygonFun.getNumberOfSides(17+39, 17*(17-3)/2 + 39*(39-3)/2));
   }

   public void testGetNumberOfSides_06()
   {
      assertEquals("25-37", PolygonFun.getNumberOfSides(25+37, 25*(25-3)/2 + 37*(37-3)/2));
      assertEquals("35-217", PolygonFun.getNumberOfSides(35+217, 35*(35-3)/2 + 217*(217-3)/2));
   }

   public void testisConvex_07()
   {
      assertEquals(true, PolygonFun.isConvex(new Coordinate[] { new Coordinate(-11., -52.), new Coordinate(0., 0.), new Coordinate(5., 19.) } ) );
      assertEquals(true, PolygonFun.isConvex(new Coordinate[] { new Coordinate(1., 5.), new Coordinate(5., 9.), new Coordinate(10., 13.), new Coordinate(15., 7.), new Coordinate(23., -3.), new Coordinate(18., -19.), new Coordinate(9., -20.), new Coordinate(3., -20.), new Coordinate(2., -11.) } ) );
      assertEquals(true, PolygonFun.isConvex(new Coordinate[] { new Coordinate(13., -14.), new Coordinate(9., -10.), new Coordinate(15., -7.), new Coordinate(25., -8.), new Coordinate(19., -15.) } ) );
      assertEquals(true, PolygonFun.isConvex(new Coordinate[] { new Coordinate(1., 5.), new Coordinate(5., 9.), new Coordinate(10., 13.), new Coordinate(15., 7.), new Coordinate(23., -3.), new Coordinate(18., -19.), new Coordinate(9., -20.), new Coordinate(3., -20.), new Coordinate(2., -11.) } ) );
      
      assertEquals(false, PolygonFun.isConvex(new Coordinate[] { new Coordinate(0., 0.), new Coordinate(2., 2.), new Coordinate(1., 1.), new Coordinate(3., -3.), new Coordinate(1., -2.) } ) );
      assertEquals(false, PolygonFun.isConvex(new Coordinate[] { new Coordinate(13., -14.), new Coordinate(16., -10.), new Coordinate(15., -7.), new Coordinate(25., -8.), new Coordinate(19., -15.) } ) );
      assertEquals(false, PolygonFun.isConvex(new Coordinate[] { new Coordinate(13., -14.), new Coordinate(16., -10.), new Coordinate(15., -7.), new Coordinate(25., -8.), new Coordinate(19., -15.) } ) );
   }

   public void testisConvex_08()
   {
      assertEquals(true, PolygonFun.isConvex(new Coordinate[] { new Coordinate(-3., 3.), new Coordinate(-6., 13.), new Coordinate(0., 21.), new Coordinate(11., -9.) } ) );
      assertEquals(true, PolygonFun.isConvex(new Coordinate[] { new Coordinate(-5., -2.), new Coordinate(3., -7.), new Coordinate(-3., -17.), new Coordinate(-17., -7.), new Coordinate(-11., -2.) } ) );
      
      assertEquals(false, PolygonFun.isConvex(new Coordinate[] { new Coordinate(-18., 3.), new Coordinate(-1., 13.), new Coordinate(0., 21.), new Coordinate(11., -9.) } ) );
      assertEquals(false, PolygonFun.isConvex(new Coordinate[] { new Coordinate(-5., -2.), new Coordinate(0., -8.), new Coordinate(3., -7.), new Coordinate(-3., -17.), new Coordinate(-17., -7.), new Coordinate(-11., -2.) } ) );
   }

   public void testGetNumConvexPolygons_09()
   {
      List<Coordinate> v1 = new ArrayList<Coordinate>();
      v1.add( new Coordinate(-3., 3.) );
      v1.add( new Coordinate(2, 1) );

      List<Coordinate> v2 = new ArrayList<Coordinate>();
      v2.add( new Coordinate(-6., 13.) );
      v2.add( new Coordinate(-16, 13) );
      v2.add( new Coordinate(-4, 13) );

      List<Coordinate> v3 = new ArrayList<Coordinate>();
      v3.add( new Coordinate(0., 21.) );
      v3.add( new Coordinate(0., 14.) );
      v3.add( new Coordinate(8., 14.) );

      List<Coordinate> v4 = new ArrayList<Coordinate>();
      v4.add( new Coordinate(11., -9.) );
      v4.add( new Coordinate(15., -9.) );
      v4.add( new Coordinate(0., 8.) );
      v4.add( new Coordinate(18., -9.) );

      List<Coordinate> v5 = new ArrayList<Coordinate>();
      v5.add( new Coordinate(1., -2.) );
      v5.add( new Coordinate(1., 12.) );
      
      assertEquals(18, PolygonFun.getNumConvex(v1, v2, v3, v4, v5));
   }

   public void testGetNumConvexPolygons_10()
   {
      List<Coordinate> v1 = new ArrayList<Coordinate>();
      v1.add( new Coordinate(0., 0.) );

      List<Coordinate> v2 = new ArrayList<Coordinate>();
      v2.add( new Coordinate(2., 2.) );

      List<Coordinate> v3 = new ArrayList<Coordinate>();
      v3.add( new Coordinate(4., 1.) );

      List<Coordinate> v4 = new ArrayList<Coordinate>();
      v4.add( new Coordinate(3., -3.) );

      List<Coordinate> v5 = new ArrayList<Coordinate>();
      v5.add( new Coordinate(1., 1.) );
      
      assertEquals(0, PolygonFun.getNumConvex(v1, v2, v3, v4, v5));

      v1 = new ArrayList<Coordinate>();
      v1.add( new Coordinate(0., 0.) );
      v1.add( new Coordinate(0., 1.) );

      v2 = new ArrayList<Coordinate>();
      v2.add( new Coordinate(2., 2.) );
      v2.add( new Coordinate(3., 2.) );
      
      v3 = new ArrayList<Coordinate>();
      v3.add( new Coordinate(4., 1.) );
      v3.add( new Coordinate(1., 1.) );
      
      v4 = new ArrayList<Coordinate>();
      v4.add( new Coordinate(3., -3.) );
      
      v5 = new ArrayList<Coordinate>();
      v5.add( new Coordinate(1., -2.) );
      v5.add( new Coordinate(1., 1.) );

      assertEquals(4, PolygonFun.getNumConvex(v1, v2, v3, v4, v5));

      v4 = new ArrayList<Coordinate>();
      v4.add( new Coordinate(3., -3.) );
      v4.add( new Coordinate(3.5, -11.3) );
      v4.add( new Coordinate(2.5, -3.7) );

      v5 = new ArrayList<Coordinate>();
      v5.add( new Coordinate(1., -2.) );
      v5.add( new Coordinate(1., 1.) );
      v5.add( new Coordinate(1., -5.) );

      assertEquals(20, PolygonFun.getNumConvex(v1, v2, v3, v4, v5));
   }
}