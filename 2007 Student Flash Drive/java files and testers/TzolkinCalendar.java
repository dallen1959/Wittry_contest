import java.util.*;
/**
 * Write a description of class TzolkinCalener here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TzolkinCalendar
{
   int number;
   String nameOfTheDay;
   int year;
   boolean firstHalf;

   public TzolkinCalendar(int num, String notd, int y)
   {
      number = num;
      nameOfTheDay = notd;
      year = y;
   }

   public boolean equals(Object obj)
   {
      TzolkinCalendar tc = (TzolkinCalendar)obj;
      return number == tc.number
             && nameOfTheDay.equals(tc.nameOfTheDay) 
             && year == tc.year;
   }
}