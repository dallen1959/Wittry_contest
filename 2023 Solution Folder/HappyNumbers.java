import java.lang.*;
import java.util.*;
/**
 * @author  Don Allen
 * @version 2021 Wittry Contest
 */
public class HappyNumbers
{
    public static void searchForLength8()
    {
        for (int b = 1111110; b < 999999999; b++)
        {
            int t = (int)(Math.random() * 9999999);
            int ans = HappyNumbers.getHappyLength(t);
            if (ans >= 8)
                System.out.println(t + " has Happy length " + ans);
        }
    }
    
    public static void getHappyNumbers()
    {
        for (int b = 0; b < 599; b++)
        {
            int t = (int)(Math.random() * 99999);
            int ans = HappyNumbers.getHappyLength(t);
            if (ans != -1)
                System.out.println(t + " has Happy length " + ans);
        }
    }

    /*
     *     percondition: isHappy(num) == false
     *     
     *     If num can modified by changing any digit by 1, retun smallest such number
     *     
     *     else return -1
     *     
     *     makeHappy(33) return 23. makeHappy(33) will check 23, 32, 34 & 43
     *     makeHappy(20) will check 10, 30, 21 and 29
     *     makeHappy(99) will check 89, 109, 98 and 910
     *     
     *     makeHappy(123) (leading 1) will check 923, 223, 113, 133, 122, 124
     */
    public static int makeHappy(int num)
    {
        int[] digits = new int[ (""+num).length()];
        int index = 0;
        while (num > 0)
        {
            digits[index] = num % 10;
            index++;
            num = num / 10;
        }

        int ind = 0;
        int[][] possible = new int[2*digits.length][digits.length];

        for (int h = 0; h < digits.length; h++)
        {
            for (int m = 0; m < digits.length; m++)
            {
                int d = digits[m];
                if (m == ind)
                {
                    if (ind == digits.length - 1 && d == 1)
                    {
                        possible[2*ind][m] = 2;
                        possible[2*ind+1][m] = 9;
                    }
                    else if (d == 0)
                    {
                        possible[2*ind][m] = 1;
                        possible[2*ind+1][m] = 9;
                    }
                    else if(d == 9)
                    {
                        possible[2*ind][m] = 8;
                        possible[2*ind+1][m] = 10;
                    }
                    else
                    {
                        possible[2*ind][m] = d - 1;
                        possible[2*ind+1][m] = d + 1;
                    }
                }
                else
                {
                    possible[2*ind][m] = d;
                    possible[2*ind+1][m] = d;
                }
            }
            ind ++;
        }

        int[] happy = getHappyNumbers(possible);

        if (happy.length == 0)
            return new Integer(-1);

        int min = -1;
        for (int m : happy)
            if (getHappyLength(m) > 0 && (min == -1 || m < min))  min = m;

        return min;
    }

    private static int[] getHappyNumbers(int[][] nums)
    {
        int[] ans = new int[nums.length];

        for (int r = 0; r < nums.length; r++)
        {
            int n = 0;
            for (int c = nums[r].length - 1; c >= 0; c--)
            {
                if(nums[r][c] != 10)
                   n = n * 10 + nums[r][c];
                else
                   n = n * 100 + nums[r][c];
            }
            ans[r] = n;
        }

        return ans;
    }

    public static int getHappyLength(int num)
    {
        List<Integer> nums = new ArrayList<Integer>();

        if (num == 1)
            return 1;

        int degree = 0;
        int sum = -1;
        while (!nums.contains(num) )
        {
            nums.add(num);
            degree++;
            sum = 0;
            while (num > 0)
            {
                sum = sum + (num % 10)*(num%10);
                num = num /10;
            }
            if (sum == 1)
                return degree;
            num = sum;
        }
        return -1;
    }

    private static int isHappy(int num, int power)
    {
        List<Integer> nums = new ArrayList<Integer>();

        if (num == 1)
            return 1;

        int degree = 0;
        int sum = -1;
        while (!nums.contains(num) )
        {
            nums.add(num);
            degree++;
            sum = 0;
            while (num > 0)
            {
                int digit = num%10;
                sum = sum + (int)(Math.pow(digit, power));
                num = num /10;
            }
            if (sum == 1)
                return degree;
            num = sum;
        }
        return -1;
    }
}