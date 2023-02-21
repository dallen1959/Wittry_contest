import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2015 Wittry programming contest
 */
public class QuadrilateralsStudentTest extends junit.framework.TestCase
{
   private final String quad = "Quadrilateral";
   private final String parallelogram = "Parallelogram";
   private final String rectangle = "Rectangle";
   private final String rhombus = "Rhombus";
   private final String square = "Square";

   public void testQuadrilaterals01()
   {
      Quadrilaterals quads = new Quadrilaterals();
      List<Coordinate> vert = new ArrayList<Coordinate>();
      vert.add(new Coordinate(0, 0));
      vert.add(new Coordinate(1, 10));
      vert.add(new Coordinate(13, 5));
      vert.add(new Coordinate(5, -1));
      assertEquals(quad, quads.identifyQuadrilateral(vert));

      vert = new ArrayList<Coordinate>();
      vert.add(new Coordinate(0, 0));
      vert.add(new Coordinate(5, 5));
      vert.add(new Coordinate(18, 5));
      assertEquals(new Coordinate(13, 0), quads.findFourthPointofParallelogram(vert));
   }
}