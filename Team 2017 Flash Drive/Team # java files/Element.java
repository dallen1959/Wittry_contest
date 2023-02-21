
/**
 * Write a description of class Element here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Element
{
    // instance variables - replace the example below with your own
    private String symbol;
    private int number;

    /**
     * Constructor for objects of class Element
     */
    public Element(String s, int n)
    {
        symbol = s.toUpperCase();
        number = n;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public int getAtomicNumber()
    {
        return number;
    }

    public boolean equals(Object obj)
    {
        Element e = (Element)obj;
        return symbol.equals(e.getSymbol()) && number == e.getAtomicNumber();
    }

    public int hashCode()
    {
        Integer n = new Integer(number);
        return symbol.hashCode() + n.hashCode();
    }
}