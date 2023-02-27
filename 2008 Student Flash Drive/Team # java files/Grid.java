import java.util.HashMap;
import java.util.Map;
/*
 * Grid.java
 *
 * This is a utility class for the Trace Routing programming problem.
 *
 * Copyright (c) January 21, 2008 Jeffrey Bosboom.  Licensed under the Creative
 * Commons Attribution-Noncommercial-Share Alike 3.0 License.  Please see
 * http://creativecommons.org/licenses/by-nc-sa/3.0/ for the text of the
 * License.
 */
public class Grid implements Cloneable {
    private final Map<Location, String> m = new HashMap<Location, String>();
    private final int width,  height;
    public Grid(int height, int width) {
        this.width = width;
        this.height = height;
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
                m.put(new Location(j, i), "empty");
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public boolean isEmpty(Location c) {
        return isInGrid(c) && m.get(c).equals("empty");
    }
    public void fill(Location c) {
        if (!isInGrid(c))
            throw new RuntimeException(c.toString());
        m.put(c, "full");
    }
    public void fillFromArray(Location[] cLocs) {
        for (Location loc : cLocs)
           m.put(loc, "full");
    }
    public void addMark(Location loc, String str) {
        if (str.equals(""))
            m.put(loc, "empty");
        else
            m.put(loc, str);
    }
    public String getMark(Location loc) {
        if (isEmpty(loc))
            return "";
        return m.get(loc);
    }

    public Grid clone() {
    	Grid g = new Grid(width, height);
    	for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
                g.addMark(new Location(j, i), m.get(new Location(j, i)));
        return g;
    }
    
    private boolean isInGrid(Location c) {
        if (c.getX() < 0 || c.getX() >= getHeight())
            return false;
        if (c.getY() < 0 || c.getY() >= getWidth())
            return false;
        return true;
    }
}
