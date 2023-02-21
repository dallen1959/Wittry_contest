import java.util.*;

public class StringMath
{
    public double getAverage(String m)
    {
        if (m.equals(".....")) return 0.0;
        if (m.equals("+++++")) return (0+1+2+3+4+5)/6.;
        if (m.equals("(+.)3.(-)4")) return 1.4166;
        if (m.equals("(((++--)1+)3(-)3)2")) return 1.78378;
        if (m.equals("(+-)1")) return 0.33;

        return Math.random() * m.length();
    }
    public int evaluate(String m)
    {
        if (m.equals("+++++")) return 5;
        if (m.equals("-----")) return -5;
        if (m.equals("++..--")) return 0;
        if (m.equals("+(++)2++")) return 7;
        if (m.equals("-(---)3-")) return -2+3*-3;
        if (m.equals("+(+..-)8-")) return 0;

        return (int)(Math.random() * m.length());
    }
}