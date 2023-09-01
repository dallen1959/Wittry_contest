import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2023 Wittry Contest
 */
public class AdjoiningDigits
{
    public static boolean isDivisibleBy(int number, int[] divisors)
    {
        for (int d : divisors)
            if (number % d != 0)
                return false;

        return true;
    }

    public static int getLCM(int[] num)
    {
        int lcm_of_array_elements = 1; 
        int divisor = 2; 

        while (true)
        { 
            int counter = 0; 
            boolean divisible = false; 

            for (int i = 0; i < num.length; i++) { 

                // lcm_of_array_elements (n1, n2, ... 0) = 0. 
                // For negative number we convert into 
                // positive and calculate lcm_of_array_elements. 

                if (num[i] == 0) { 
                    return 0; 
                } 
                else if (num[i] < 0) { 
                    num[i] = num[i] * (-1); 
                } 
                if (num[i] == 1) { 
                    counter++; 
                } 

                // Divide num by devisor if complete 
                // division i.e. without remainder then replace 
                // number with quotient; used for find next factor 
                if (num[i] % divisor == 0) { 
                    divisible = true; 
                    num[i] = num[i] / divisor; 
                } 
            } 

            // If divisor able to completely divide any number 
            // from array multiply with lcm_of_array_elements 
            // and store into lcm_of_array_elements and continue 
            // to same divisor for next factor finding. 
            // else increment divisor 
            if (divisible) { 
                lcm_of_array_elements = lcm_of_array_elements * divisor; 
            } 
            else { 
                divisor++; 
            } 

            // Check if all num is 1 indicate  
            // we found all factors and terminate while loop. 
            if (counter == num.length) { 
                return lcm_of_array_elements; 
            } 
        }
    }

    public static int adjoinDigits(int num, int numDigits, int[] divisors)
    {
        int numDigs = (""+num).length() + numDigits;
        int start = (int) Math.pow(10, numDigs-1);

        int div = getLCM(divisors);
        while ( start % div != 0)
            start++;

        while ( (""+start).indexOf(""+num) < 0)
            start += div;

        return start;
    }
}