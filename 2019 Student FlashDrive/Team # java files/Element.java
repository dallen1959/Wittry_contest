import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2019 Wittry Contest
 */

public class Element
{
    private String name;
    
/*
 *   bands contains the location of all black bands
 *   
 *      all other locations are not absorbed
 */    
    private int[] bands;

    /**
     *    Make your own band.
     * 
     *    Thou shall NEVER moify b
     */
    public Element(String n, int[] b)
    {
        name = n;

        bands = new int[b.length];
        for (int g = 0; g < b.length; g++)
            bands[g] = b[g];
    }

    public String getName()
    {
        return name;
    }

    public int[] getBands()
    {
        return bands;
    }

    public boolean equals(Object obj)
    {
        Element e = (Element)obj;

        if (!name.equals(e.getName())) return false;

        int[] temp = e.getBands();
        for (int y = 0; y < temp.length; y++)
            if (temp[y] != bands[y]) return false;

        return true;
    }
}
