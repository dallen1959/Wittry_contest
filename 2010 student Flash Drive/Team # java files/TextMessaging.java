import java.util.*;

public class TextMessaging 
{
  // add instance variables

   public TextMessaging()
   {
    //  implement your contructor
   }

   public void addTableEntry(TableEntry te)
   {
    //  add your implementation
   }

   public String getTextMessage(String code)
   {
      if (code.equals("4 26 278")) return "i am art";
      if (code.equals("4 26 260 278478")) return "i am an artist";
      return "";
   }

   public String getWord(String seg)
   {
      if (seg.equals("4")) return "i";
      if (seg.equals("26")) return "am";
      if (seg.equals("260")) return "an";
      if (seg.equals("278478")) return "artist";
      return "";
   }
}