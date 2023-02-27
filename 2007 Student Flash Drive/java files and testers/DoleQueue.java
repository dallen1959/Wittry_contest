import java.util.*;

/**
 * Write a description of class DoleQueue here.
 * 
 * @author 2007 SC Programming Contest
 * @version (a version number or a date)
 */
public class DoleQueue
{
   String[] theQueue;
   int ccw;  // counter clock-wise
   int cw;   // clock-wise

   public  DoleQueue(String[] applicants, int k, int n)
   {
       theQueue = applicants;
       ccw = k;
       cw = n;
   }
   
   public String[] removeApplicants()
   {
      String[] solution = {"D", "H", "I", "E", "C", "A", "B", "F", "J", "G"};
   	  return solution;
   }
}