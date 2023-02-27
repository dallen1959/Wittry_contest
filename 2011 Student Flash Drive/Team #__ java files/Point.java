public class Point
{
   private double x;
   private double y;

   /**
	* Constructor for objects of class Point
	*/
   public Point(double a, double b)
   {
      x = a;
      y = b;
   }

   public double getX()
   {
      return x;
   }

   public double getY()
   {
      return y;
   }

   public boolean equals(Object obj)
   {
      Point temp = (Point) obj;

      return Math.abs(x - temp.getX()) < 0.002 && Math.abs(y - temp.getY() ) < 0.002;
   }

   public int hashCode()
   {
      Integer t = new Integer((int)( x * y)) ;
      return t.hashCode();
   }
}