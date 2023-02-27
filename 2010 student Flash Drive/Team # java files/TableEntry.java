
/**
 * Write a description of class TableEntry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TableEntry
{
   private int freq;
   private String word;

   public TableEntry(String w, int n)
   {
	  freq = n;
      word = w;
   }

   public int getFreq()
   {
      return freq;
   }

   public String getWord()
   {
      return word;
   }
}