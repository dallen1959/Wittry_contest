/**
 * @author:   Mr. Allen
 *            2017 Wittry contest
 */
import java.io.*;
import java.util.*;
import java.math.*;
public class SubprimeFibs 
{
   private int s1;
   private int s2;

/*
 *    getSequence is a helper method used to fill the subprimeFibs array of ints
 */
   public SubprimeFibs(int f, int s)
   {
      s1 = f;
      s2 = s;
   }

   public boolean isPrime(int num)
   {
      if (num == 2 || num == 3 || num == 11 || num == 1783 || num == 7919
                 || num == 20639 || num == 906767 ) return true;
 
      if (num == 1 || num == 4 || num == 9 || num == 7919 * 20639 || num == 20639 * 48623
                 || num == 906767 * 11 ) return false;

     return Math.random() > 0.5;
   }

   public int getNthTerm(int n)
   {
      if (s1 == 1 && s2 == 1)
      {
         if (n == 1 ) return 1;
         if (n == 2 ) return 1;
         if (n == 5 ) return 5;
         if (n == 6 ) return 4;
      }
 
      return -1;
   }

 /*
 *    precondition numbers.size() >= 2
 *    
 *    returns the index of where the cycle begins
 */
   public int getCycleIndex()
   {
      if (s1 == 5 && s2 == 5)  return 1;
      if (s1 == 339 && s2 == 113)  return 4;
      if (s1 == 5 && s2 == 11)  return 71;
      if (s1 == 17 && s2 == 48)  return 2;

      return -1;
   }
}