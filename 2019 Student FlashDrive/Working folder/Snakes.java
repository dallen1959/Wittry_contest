import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2019 Wittry Contest
 */
public class Snakes
{
    private String[][] board;

    private List<SnakeLocation> snake;
    private String direction;

    /*
     *   w.length > 0
     *   w[0].length > 0
     *   
     *   for all m,n, 0 < m,n < w.length
     *         w[m].length == w[n].length
     *         "F ".indexof(w[m][n]) >= 0
     *         
     *     "F" -> food - snake grows one body part
     *     " " -> empty cell in board
     *     
     *     MAKE YOUR OWN COPY OF w!!!!!!!!
     *     THOU SHALL NOT modify w
     *     thy methods SHALL NEVER change w
     *   
     *   MAKE YOUR OWN COPY OF sb!!!!!!!!
     *   THOU SHALL NOT modify sb
     *   thy methods SHALL NEVER change sb
     * 
     *   sb is a list containing the SnakeLocation of all the snakes body parts 
     *   the head of the snake is at SnakeLocation sb.get(0)
     *   
     *   the current direction of the snake be determine using sb.get(0) and sb.get(1)
     */    
    public Snakes(String[][] w, List<SnakeLocation> sb)
    {
        
    }

    public String getDirection()
    {
        if ( snake.get(0).equals( new SnakeLocation(2,2)) && snake.get(1).equals( new SnakeLocation(2,3))) return "L";

        return "";
    }
    
    /*
     *   m.length() == 1
     *   m will always be upper case
     *
     *   "UDLRC".indexOf(m) >= 0
     *   if m.equals("U") snake head moves up (from row n to row n-1)
     *   if m.equals("D") snake head moves down (from row n to row n+1)
     *   if m.equals("L") snake head moves left (from col m to col m-1)
     *   if m.equals("R") snake head moves right (from col m to col m+1)
     *   if m.equals(" ") snake head continues to move in the same direction it previously moved
     *   
     *   if the snake's head runs into itself ....
     *   if the snake's head encouoters a "F" ....
     *   if the snake's head encounters a " " ....
     *   if the snake's head encounters a "S" ....
     *   
     *   returns true if the snake does NOT run into itself and does NOT move out of the world
     *           false if the snake DOES run into itself or snake moves out of the world
     */
    public boolean move(String m)
    {

        return true;
    }

    /*
     *   Returns the snake body 
     */
    public List<SnakeLocation> getSnakeBody()
    {
        return snake;
    }
}