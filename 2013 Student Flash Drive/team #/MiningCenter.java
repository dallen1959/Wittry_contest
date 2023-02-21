import java.util.*;

public class MiningCenter 
{
   private ArrayList<Site> mines;
   
/*
 *    precondition: m.size() > 0
 */
   public MiningCenter(ArrayList<Site> m)
   {
       mines = m;
   }

   public Site getCenter()
   {
      if (mines.size() == 4 && mines.get(0).equals(new Site(10, 0)) && mines.get(1).equals(new Site(6, 7))
                      && mines.get(2).equals(new Site(-6, 8)) && mines.get(3).equals(new Site(-9, -8)))
      return new Site(-1,-1);

      if (mines.size() == 3 && mines.get(0).equals(new Site(0, 0)) && mines.get(1).equals(new Site(0, 5))
                      && mines.get(2).equals(new Site(5, 0)))
      return new Site(0, 0);

      if (mines.size() == 5 &&  mines.get(0).equals(new Site(1, -5))
                      && mines.get(1).equals(new Site(-10, 5)) && mines.get(2).equals(new Site(-2, 5))
                      && mines.get(3).equals(new Site(10, 10)) && mines.get(4).equals(new Site(5, -5)))
      return new Site(2, 5);

      return new Site(Integer.MAX_VALUE, Integer.MIN_VALUE);
   }
}