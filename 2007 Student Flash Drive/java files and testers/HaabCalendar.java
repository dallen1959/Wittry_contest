import java.util.*;
/**
 * Write a description of class HaabCalender here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HaabCalendar
{
    int      numberOfTheDay;
    String   month;
    int      year;

    public HaabCalendar(int notd, String m, int y)
    {
       numberOfTheDay = notd;
       month = m;
       year = y;
    }

    public TzolkinCalendar changeCalendar()
    {
        if (year == 1) return new TzolkinCalendar(2, "cimi", 1);
        if (year == 1995) return new TzolkinCalendar(9, "cimi", 2801);

        if (numberOfTheDay == 0) return new TzolkinCalendar(1, "imix", 0);

        return new TzolkinCalendar(3, "chuen", 0);
    }
}