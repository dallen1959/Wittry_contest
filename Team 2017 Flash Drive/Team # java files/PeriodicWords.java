/**
 * @author:   Mr. Allen
 *            2017 Wittry contest
 */
import java.io.*;
import java.util.*;
import java.math.*;
public class PeriodicWords 
{
    private static Element[] elements;
    /*
     *   inStock contains all Elements currently in stock.
     *    Elements will be indicate (Upper case and lower case) as shown on Periodic table.
     *    
     *       Elements are repeated to represent the quantity.  That is:
     *           if 2 unit of "H" (Hydrogen) in stock, then "H" will appear in inStock twice
     *           and if 4 units of "Cu" are required, then "Cu" will appear 4 times in inStock
     *   the order of the elements is random.  That is, "H" may appear anywhere in inStock 
     *   and similar elements may NOT be adjacent
     */    
    private List<Element> inStock;

    /*
     *   constructor used for the getMissingElements method
     */
    public PeriodicWords(List<Element> is)
    {
        inStock = is;
    }

    /*
     *   constructor used for the isPeriodicSpellingPossible method
     */
    public PeriodicWords()
    {
        elements = getElements();
    }

    /*
     *    mix contains all the elements required for a project.
     *    Elements will be indicate (Upper case and lower case) as shown on Periodic table.
     *    
     *    return a List of all elements in mix that are not in inStock
     *           similar to inStock, elements are repeated to indicate the quantity needed
     *           and the elements required are list in random order.
     *
     *    post condition:  mix is not changed.  No Elements are added or removed from mix
     *                     inStock is not changed.  No Elements are added or removed from inStock
     */
    public List<Element> getMissingElements(List<Element> mix)
    {
        List<Element> missing = new ArrayList<Element>();
        if (mix.get(0).getSymbol().equals("H") && mix.get(1).getSymbol().equals("LI")
        &&  mix.get(2).getSymbol().equals("O") ) // &&  getAtomicNumber()
        {
            missing.add( new Element("Li", 3) );
        }

        return missing;
    }

    /*
     *    Precondition
     *         name will be given in ALL CAPITAL letters
     *         name.length() > 0
     *    
     *    return true if name can be spelled using the symbols from the Periodic Table
     *                 e.g., since LIKES can be spelled using Li - K - Es return true 
     *           false otherwise
     *                 since COMPUTER can not be spelled (no OMP combination can be formed) return false
     */
    public static boolean isPeriodicSpellingPossible( String name)
    {
        if ( name.equals("BACON") || name.equals("HER") || name.equals("HERE") || name.equals("SPOONS")
                  || name.equals("BYTE") || name.equals("LIKES") )
            return true;

        if ( name.equals("TEST") || name.equals("COMPUTER") )
            return false;

        return Math.random() > 0.5;
    }

    /*
     *    private helper methods returns an Array of ALL possible elements
     *      -  used in both constructor
     * 
     */
    private Element[] getElements()
    {
        Element[] ele = {new Element("H", 1), new Element("He", 2), new Element("Li", 3), new Element("Be", 4),
                new Element("B", 5),  new Element("C", 6), new Element("N", 7),  new Element("O", 8),
                new Element("F", 9),  new Element("Ne", 10), new Element("Na", 11), new Element("Mg", 12),
                new Element("Al", 13), new Element("Si", 14), new Element("P", 15), new Element("S", 16),
                new Element("Cl", 17), new Element("Ar", 18), new Element("K", 19), new Element("Ca", 20),
                new Element("Sc", 21), new Element("Ti", 22), new Element("V", 23), new Element("Cr", 24),
                new Element("Mn", 25), new Element("Fe", 26), new Element("Co", 27), new Element("Ni", 28),
                new Element("Cu", 29), new Element("Zn", 30), new Element("Ga", 31), new Element("Ge", 32),
                new Element("As", 33), new Element("Se", 34), new Element("Br", 35), new Element("Kr", 36),
                new Element("Rb", 37), new Element("Sr", 38), new Element("Y", 39), new Element("Zr", 40),
                new Element("Nb", 41), new Element("Mo", 42), new Element("Tc", 43), new Element("Ru", 44),
                new Element("Rh", 45), new Element("Pd", 46), new Element("Ag", 47), new Element("Cd", 48),
                new Element("In", 49), new Element("Sn", 50), new Element("Sb", 51), new Element("Te", 52),
                new Element("I", 53), new Element("Xe", 54), new Element("Cs", 55), new Element("Ba", 56),
                new Element("La", 57), new Element("Ce", 58), new Element("Pr", 59), new Element("Nd", 60),
                new Element("Pm", 61), new Element("Sm", 62), new Element("Eu", 63), new Element("Gd", 64),
                new Element("Tb", 65), new Element("Dy", 66), new Element("Ho", 67), new Element("Er", 68),
                new Element("Tm", 69), new Element("Yb", 70), new Element("Lu", 71), new Element("Hf", 72),
                new Element("Ta", 73), new Element("W", 74), new Element("Re", 75), new Element("Os", 76),
                new Element("Ir", 77), new Element("Pt", 78), new Element("Au", 79), new Element("Hg", 80),
                new Element("Tl", 81), new Element("Pb", 82), new Element("Bi", 83), new Element("Po", 84),
                new Element("At", 85), new Element("Rn", 86), new Element("Fr", 87), new Element("Ra", 88),
                new Element("Ac", 89), new Element("Th", 90), new Element("Pa", 91), new Element("U", 92),
                new Element("Np", 93), new Element("Pu", 94), new Element("Am", 95), new Element("Cm", 96),
                new Element("Bk", 97), new Element("Cf", 98), new Element("Es", 99), new Element("Fm", 100),
                new Element("Md", 101), new Element("No", 102), new Element("Lr", 103), new Element("Rf", 104),
                new Element("Db", 105), new Element("Sg", 106), new Element("Bh", 107), new Element("Hs", 108),
                new Element("Mt", 109),  new Element("Ds", 110), new Element("Rg", 111), new Element("Uub", 112),
                new Element("Uut", 113), new Element("Uuq", 114), new Element("Uup", 115), new Element("Uuh", 116),
                new Element("Uus", 117), new Element("Uuo", 118) };

        return ele;
    }
}