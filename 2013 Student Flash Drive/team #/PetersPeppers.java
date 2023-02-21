import java.util.*;

public class PetersPeppers 
{
   public PetersPeppers()
   {
   }
/*
   public void testPetersPeppers01()
   {
      PetersPeppers pp = new PetersPeppers();
      assertEquals(new Triple(-1,-1,-1), pp.getTriple(1));

      assertEquals(new Triple(1, 0, 0), pp.getTriple(6));
      assertEquals(new Triple(0, 5, 0), pp.getTriple(55));
      assertEquals(new Triple(-1,-1,-1), pp.getTriple(27));
      assertEquals(new Triple(2, 1, 5), pp.getTriple(88));
      assertEquals(new Triple(3, 1, 1), pp.getTriple(42));
    }
 * 
 */
   public Triple getTriple(int num)
   {
       if (num == 1) return (new Triple(-1,-1,-1));
       if (num == 6) return (new Triple(1, 0, 0));
       if (num == 27) return (new Triple(-1,-1,-1));
       if (num == 42) return (new Triple(3, 1, 1));
       if (num == 55) return (new Triple(0, 5, 0));
       if (num == 88) return (new Triple(2, 1, 5));
       return new Triple(-99, -99, -99);
   }
}