import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2020 Wittry programming contest
 */
public class TrianglesAndRectanglesOhMyStudentTest extends junit.framework.TestCase
{
    public void testTrianglesAndRectanglesOhMy01()
    {
        int[] side1 = {1, 2, 3};
        int[] side2 = {3, 4, 5};
        int[] side3 = {5, 6, 7};
        assertEquals(10, TrianglesAndRectanglesOhMy.getNumPossibleTriangle(side1, side2, side3));

        int[] side1a = {2, 4, 4};
        int[] side2a = {1, 3, 1};
        int[] side3a = {5, 2};
        assertEquals(7, TrianglesAndRectanglesOhMy.getNumPossibleTriangle(side1a, side2a, side3a));

        int[] possibleSides = {13, 6, 9, 37, 11, 5, 2, 23, 17};
        assertEquals(13, TrianglesAndRectanglesOhMy.possibleMinThirdSideOfTriangle(7, 19, possibleSides));
        assertEquals(23, TrianglesAndRectanglesOhMy.possibleMaxThirdSideOfTriangle(7, 19, possibleSides));

        int[] sideA = {2, 4, 8, 11};
        int[] sideB = {1, 3, 6, 7, 8};
        assertEquals(2, TrianglesAndRectanglesOhMy.getNumPossibleRectangleWithArea(sideA, sideB, 24));

        int[] sideA1 = {2, 4, 8, 2, 11};
        int[] sideB1 = {12, 6, 3, 7, 8};
        assertEquals(4, TrianglesAndRectanglesOhMy.getNumPossibleRectangleWithArea(sideA1, sideB1, 24));
        
        int[] stu = TrianglesAndRectanglesOhMy.rectangleWithAreaAndMinPerimeter(sideA1, sideB1, 24);
        assertEquals(4, stu[0]);
        assertEquals(6, stu[1]);
    }
}