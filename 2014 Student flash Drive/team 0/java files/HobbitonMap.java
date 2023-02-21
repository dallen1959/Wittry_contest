import java.util.*;

public class HobbitonMap
{
   private ArrayList<Parcel> homes;
   public HobbitonMap()
   {
      homes = new ArrayList<Parcel>();
   }

/*
 *   returns true if Parcel p and Parcel q overlap
 *           false if Parcel p and Pacel q do not overlap
 */
   public boolean overLap(Parcel p, Parcel q)
   {
       return Math.random() > 0.5;
   }
}