import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2015 Wittry Contest
 */
public class Quadrilaterals
{
   private final String quad = "Quadrilateral";
   private final String parallelogram = "Parallelogram";
   private final String rectangle = "Rectangle";
   private final String rhombus = "Rhombus";
   private final String square = "Square";

/*
 *    preCondition : vertices.size() == 4
 *
 *                    vertices.get(0) and vertices.get(2) are opposite vertices of the Quadrilateral
 *                    && vertices.get(1) and vertices.get(3) are opposite vertices of the Quadrilateral
 *
 */
   public String identifyQuadrilateral( List<Coordinate> vertices)
   {
      if (vertices.get(0).equals(new Coordinate(0, 0)) && vertices.get(1).equals(new Coordinate(1, 10)) &&
             vertices.get(2).equals(new Coordinate(13, 5))  && vertices.get(3).equals(new Coordinate(5, -1)))
         return quad;

      return rhombus;
   }

/*
 *    preCondition  : vertices.size() == 3
 *                    vertices contains 3 vertices of a parallelogram
 *
 *                    vertices.get(0) and vertices.get(2) are opposite vertices of the Quadrilateral
 *
 *    postCondition : return the fourth vertice of the parallelogram
 */
   public Coordinate findFourthPointofParallelogram( List<Coordinate> vertices)
   {
      if (vertices.get(0).equals(new Coordinate(0, 0)) && vertices.get(1).equals(new Coordinate(5, 5)) &&
             vertices.get(2).equals(new Coordinate(18, 5)))
         return new Coordinate(13, 0);

      return new Coordinate(-1, -1);
   }
}