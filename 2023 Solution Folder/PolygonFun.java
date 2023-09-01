import java.util.*;
import java.lang.Math;
/**
 * PolygonFun.
 *
 * @author  Don Allen
 * @version 2021 Wittry Programming contest
 */
public class PolygonFun
{

    public static int getNumConvex(List<Coordinate> v1, List<Coordinate> v2, List<Coordinate> v3, List<Coordinate> v4, List<Coordinate> v5)
    {
        int count = 0;
        Coordinate[] temp = new Coordinate[5];
        for (int a1 =0; a1 < v1.size(); a1++)
        {
            double[] d1 = { v1.get(a1).getX(), v1.get(a1).getY()};

            for(int a2 =0; a2 < v2.size(); a2++)
            {
                double[] d2 = { v2.get(a2).getX(), v2.get(a2).getY()};

                for(int a3 =0; a3 < v3.size(); a3++)
                {
                    double[] d3 = { v3.get(a3).getX(), v3.get(a3).getY()};

                    for(int a4 =0; a4 < v4.size(); a4++)
                    {
                        double[] d4 = { v4.get(a4).getX(), v4.get(a4).getY()};

                        for(int a5 =0; a5 < v5.size(); a5++)
                        {
                            double[] d5 = { v5.get(a5).getX(), v5.get(a5).getY()};

                            fillTemp(temp, d1, d2, d3, d4, d5);
                            if (isConvex( temp ) )
                            {
                                count++;
//                                System.out.println(d1[0][0]);  /* change to print all 5 vertices  */
                            }
                        }
                    }
                }
            }
        }

        return count;
    }

    private static void fillTemp(Coordinate[] t, double [] v1, double [] v2, double [] v3, double [] v4, double [] v5)
    {
        t[0] = new Coordinate( v1[0], v1[1]);
        t[1] = new Coordinate( v2[0], v2[1]);
        t[2] = new Coordinate( v3[0], v3[1]);
        t[3] = new Coordinate( v4[0], v4[1]);
        t[4] = new Coordinate( v5[0], v5[1]);
    }

    /*
     *   given upper left corner and lower right corner of a rectangle
     *   
     *   return the quadrant which contains the greatest area of the rectangle
     */
    public static int whichQuadrant(Coordinate upperLeft, Coordinate lowerRight)
    {
        double leftX = upperLeft.getX();
        double leftY = upperLeft.getY();
        double rightX = lowerRight.getX();
        double rightY = lowerRight.getY();
        double area1 = 0;
        if (rightX > 0 && leftY > 0)
            if (leftX > 0 )
            {
                if (rightY > 0)
                    area1 = (rightX-leftY) * (leftY - rightY);
                else
                    area1 = (rightX-leftX) * leftY;
            }
            else  // leftX < 0
            {
                if (rightY > 0)
                    area1 = rightX * (leftY - rightY);
                else
                    area1 = rightX * leftY;
            }

        double area2 = 0;
        if (leftX < 0 && leftY > 0)
            if (rightX > 0 )
            {
                if (rightY < 0)
                    area2 = (-leftX) * leftY;
                else   // rightX > 0 && rightY < 0
                    area2 = (-leftX) * (leftY - rightY);
            }
            else  // rightX < 0
            {
                if (rightY > 0)
                    area2 = (-leftX + rightX) * (leftY - rightY);
                else   // rightY > 0
                    area2 = (-leftX + rightX) * leftY;
            }

        double area3 = 0;
        if (leftX < 0 && rightY < 0)
            if (rightX > 0 )
            {
                if (leftY > 0)
                    area3 = (-leftX) * -rightY;
                else   // rightX > 0 && leftY < 0
                    area3 = (-leftX) * (-rightY + leftY);
            }
            else  // rightX < 0
            {
                if (leftY > 0)
                    area3 = (-leftX + rightX) * (-rightY);
                else   // leftY > 0
                    area3 = (-leftX + rightX) * (-rightY + leftY);
            }

        double area4 = 0;
        if (rightX > 0 && rightY < 0)
            if (leftX > 0 )
            {
                if (leftY > 0)
                    area4 = (rightX-leftX) * (-rightY);
                else   // rightX > 0 && leftY < 0
                    area4 = (rightX-leftX) * (-rightY + leftY);
            }
            else  // leftX <= 0
            {
                if (leftY > 0)
                    area4 = rightX * (-rightY);
                else   // leftY > 0
                    area4 = (rightX) * (-rightY + leftY);
            }

        if (area1 > area2 && area1 > area3 && area1 > area4)
            return 1;

        if (area2 > area3 && area2 > area4)
            return 2;

        if (area3 > area4)
            return 3;
        return 4;
    }

    public static String getNumberOfSides(int angles, int diagonals)
    {
        String ans = "";

        for (int s = 3; s < angles; s++)
        {
            int p1 = s; 
            int p2 = angles - s;
            if (diagonals == p1 * (p1-3) / 2 + p2 * (p2-3) / 2)
                return ""+p1+"-"+p2;
        }

        return ans;
    }

    /*
     *     vertices.length == number of vertices of the polygon
     *     vertices[m].length == 2, 0 <= m < vertices.length
     *     vertices[m][0] = x coordinate
     *     vertices[m][1] = y coordinate
     *     
     *     Vertices are given in clockwise
     *     vertices[m] and vertices[m+1] are adjacent.
     *     
     *     You may assume no two adjacent Coordinates are collinear
     *     
     *     return true if vertices define a convex polygon
     *            false otherwise
     *            
     *     definition:  A convex polygon is defined as a polygon with all its interior angles less than 180
     *     
     *     sum of interior angles = (n-2) * 180  or (n-2) * PI
     */
    public static boolean isConvex(Coordinate[] vertices)
    {
        int n = vertices.length;
        if (n < 4) return true;

        double x1 = vertices[n-1].getX() - vertices[0].getX();
        double y1 = vertices[n-1].getY() - vertices[0].getY();
        double a = x1 * x1 + y1 * y1;

        double x2 = vertices[0].getX() - vertices[1].getX();
        double y2 = vertices[0].getY() - vertices[1].getY();
        double b = x2 * x2 + y2 * y2;

        double x3 = vertices[n-1].getX() - vertices[1].getX();
        double y3 = vertices[n-1].getY() - vertices[1].getY();
        double c = x3 * x3 + y3 * y3;

        double sum = Math.acos( (a + b - c) / (2 * Math.sqrt(a) * Math.sqrt(b)));

        for (int s = 0; s < vertices.length - 2; s++)
        {
            x1 = vertices[s].getX() - vertices[s+1].getX();
            y1 = vertices[s].getY() - vertices[s+1].getY();
            a = x1 * x1 + y1 * y1;

            x2 = vertices[s+1].getX() - vertices[s+2].getX();
            y2 = vertices[s+1].getY() - vertices[s+2].getY();
            b = x2 * x2 + y2 * y2;

            x3 = vertices[s].getX() - vertices[s+2].getX();
            y3 = vertices[s].getY() - vertices[s+2].getY();
            c = x3 * x3 + y3 * y3;

            sum += Math.acos( (a + b - c) / (2 * Math.sqrt(a) * Math.sqrt(b)));
        }

        x1 = vertices[n-2].getX() - vertices[n-1].getX();
        y1 = vertices[n-2].getY() - vertices[n-1].getY();
        a = x1 * x1 + y1 * y1;

        x2 = vertices[n-1].getX() - vertices[0].getX();
        y2 = vertices[n-1].getY() - vertices[0].getY();
        b = x2 * x2 + y2 * y2;

        x3 = vertices[n-2].getX() - vertices[0].getX();
        y3 = vertices[n-2].getY() - vertices[0].getY();
        c = x3 * x3 + y3 * y3;

        sum += Math.acos( (a + b - c) / (2 * Math.sqrt(a) * Math.sqrt(b)));

        return Math.abs(sum*180/Math.PI - (n - 2) * 180) < 0.01;
    }

    public static int getNumConvexDouble(List<double[][]> v1, List<double[][]> v2, List<double[][]> v3, List<double[][]> v4, List<double[][]> v5)
    {
        int count = 0;
        double[][] temp = new double[5][2];
        double[][] d21 = v1.get(0);
        for (int a1 =0; a1 < d21.length; a1++)
        {
            double[][] d1 = { {d21[a1][0]}, {d21[a1][1]} };

            double[][] d22 = v2.get(0);
            for(int a2 =0; a2 < d22.length; a2++)
            {
                double[][] d2 = { {d22[a2][0]}, {d22[a2][1]} };

                double[][] d23 = v3.get(0);
                for(int a3 =0; a3 < d23.length; a3++)
                {
                    double[][] d3 = { {d23[a3][0]}, {d23[a3][1]} };

                    double[][] d24 = v4.get(0);
                    for(int a4 =0; a4 < d24.length; a4++)
                    {
                        double[][] d4 = { {d24[a4][0]}, {d24[a4][1]} };

                        double[][] d25 = v5.get(0);
                        for(int a5 =0; a5 < d25.length; a5++)
                        {
                            double[][] d5 = { {d25[a5][0]}, {d25[a5][1]} };

                            fillTemp(temp, d1, d2, d3, d4, d5);
//                            if (isConvex( temp ) )
                            {
                                count++;
//                                System.out.println(d1[0][0]);  /* change to print all 5 vertices  */
                            }
                        }
                    }
                }
            }
        }

        return count;
    }

    private static void fillTemp(double [][] t, double [][] v1, double [][] v2, double [][] v3, double [][] v4, double [][] v5)
    {
        t[0][0] = v1[0][0];
        t[0][1] = v1[1][0];
        t[1][0] = v2[0][0];
        t[1][1] = v2[1][0];
        t[2][0] = v3[0][0];
        t[2][1] = v3[1][0];
        t[3][0] = v4[0][0];
        t[3][1] = v4[1][0];
        t[4][0] = v5[0][0];
        t[4][1] = v5[1][0];
    }
}