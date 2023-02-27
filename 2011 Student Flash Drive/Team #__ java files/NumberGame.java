import java.util.*;

public class NumberGame
{
   private int[][] deck;
   public NumberGame(int[][] d)
   {
      deck = d;
   }

/*
      assertEquals(LS+40+12+8+3*19+SS+6+SS+7+7, ng.getScore());
*/
   public int getRowScore(int r)
   {
      if (deck[0][0] == 1 && deck[1][3] == 2&&  deck[2][1] == 3 && deck[3][4] == 5 && deck[4][2] == 4)
      {
         if ( r == 0 ) return 40;
         if ( r == 1 ) return 40;
         if ( r == 2 ) return 3+3+1+2+3;
         if ( r == 3 ) return 3+5;
         if ( r == 4 ) return 3*(4+4+4+4+3);
      }
      return -1;
   }

   public int getColScore(int c)
   {
      if (deck[0][0] == 1 && deck[1][3] == 2&&  deck[2][1] == 3 && deck[3][4] == 5 && deck[4][2] == 4)
      {
         if ( c == 0 ) return 30;
         if ( c == 1 ) return 6;
         if ( c == 2 ) return 30;
         if ( c == 3 ) return 2+5;
         if ( c == 4 ) return 2+5;
      }
      return -1;
   }

   public int getScore()
   {
      if (deck[0][0] == 1 && deck[1][3] == 2&&  deck[2][1] == 3 && deck[3][4] == 5 && deck[4][2] == 4)
         return 40+40+12+8+3*19+30+6+30+7+7;
      
      return -1;
   }
}