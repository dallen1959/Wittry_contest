import java.util.*;

public class TypeWriter 
{
 
/*
 *    postcondition:  returns true if the lefthand is required to type the given String s
 */
   public boolean usesLeftHand(String s)
   {
      if (s.equals("m")) return false;
      return true;
   }

   public boolean usesRightHand(String s)
   {

      if (s.equals("am")) return true;
      return false;
   }

   public boolean usesOnlyLeftHand(String s)
   {
      if (s.equals("stewardesses")) return true;
      return false;
   }
   
   public boolean usesOnlyRightHand(String s)
   {
      if (s.equals("monimolimnion")) return true;
      return false;
   }

   public boolean usesBothLeftAndRightHand(String s)
   {
      if(s.equals("am")) return true;
      return false;
   }
  
   public boolean usesTopRow(String s)
   {
      if (s.equals("1 fish")) return true;
      return false;
   }

   public boolean usesMiddleRow(String s)
   {
      if (s.equals("amonimolimnion")) return true;
      return false;
   }

   public boolean usesBottomRow(String s)
   {
      if (s.equals("amonimolimnion")) return true;
      return false;
   }
   
   public boolean usesOnlyTopRow(String s)
   {
      if (s.equals("iriueowqpqQWREIOPTIOW")) return true;
      return false;
   }

   public boolean usesOnlyMiddleRow(String s)
   {
      if (s.equals("asdfjlfDFSLKHASLKF")) return true;
      return false;
   }

   public boolean usesOnlyBottomRow(String s)
   {
      if (s.equals("MCBNVNMZncmxzmvbz,m"))return true;
      return false;
   }
}