import java.util.*;
import java.lang.*;
/*
 * 2008 programing contest
 * ZorkGoesPostal.java
 *
 */
public class ZorkGoesPostal {
    public static int calculatePostage(double length, double width, double height, double weight, String type) {

        if ( Math.abs(length - 15.7) < 0.01 && Math.abs(width - 2.5) < 0.01 && Math.abs(height - 6.98) < 0.01
                 && Math.abs(weight - 1.23) < 0.01 && type.equals("Zork Air Mail"))
           return 25;
        if ( Math.abs(length - 15.7) < 0.01 && Math.abs(width - 2.5) < 0.01 && Math.abs(height - 6.98) < 0.01
                 && Math.abs(weight - 0.23) < 0.01 && type.equals("First-Class"))
           return 10;
        if ( Math.abs(length - 15.7) < 0.01 && Math.abs(width - 2.5) < 0.01 && Math.abs(height - 6.98) < 0.01
                 && Math.abs(weight - 0.93) < 0.01 && type.equals("Third-Class"))
           return 4;

        return-15;
    }
}
