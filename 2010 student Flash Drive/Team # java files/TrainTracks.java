import java.util.*;

public class TrainTracks {

//  add your own instance variables

   public TrainTracks(int [][] g)
   {
//   implement the constructor
   }

   public ArrayList<String> getRoute()
   {
      ArrayList<String> sol = new ArrayList<String>();
      String[] blocks = {"A1", "A2", "A3", "B3", "C3", "C4", "B4", "A4", "A5", "B5", "B4", "B3", "B2", "B1", "A1"};
      for(String b : blocks)
         sol.add(b);

      return sol;
   }
}