
/**
 * Location correctly implemeted.
 * 
 * @author your f(r)iendly provider 
 * @version (a version number or a date)
 */
public class Location
{
	private int myX;
	private int myY;

	/**
	 * Constructor for objects of class Location
	 */
	public Location(int row, int col)
	{
		myX = row;
		myY = col;
	}

	public int getX()
	{
		return myX;
	}

	public int getY()
	{
		return myY;
	}
	public int row() {
		return getX();
	}
	public int col() {
		return getY();
	}
        
        public boolean equals(Object o) {
            if (o.getClass() != getClass())
                return false;
            Location l = (Location)o;
            return l.myX == myX && l.myY == myY;
        }
        public int hashCode() {
            return 3+47*myX+1047*myY;
        }
        public String toString() {
            return "("+myX+","+myY+")";
        }
}
