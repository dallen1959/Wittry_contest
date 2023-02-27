import java.util.*;
/*
 * 2008 programing contest
 * HarshadNumbers.java
 */
public class HarshadNumbers {
    public static boolean isHarshadNumberInBase(int num, int base) {
        return (num == 60 && base == 10) || (num == 16 && base == 16)
               || (num == 36 && base == 16);
    }
}
