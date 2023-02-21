/**
 * Write a description of class OrderedTriple here.
 * 
 * @author Don Allen
 * @version 2014 Dave Wittry Progamming contest
 */
public class OrderedTriple
{
    private int A;
    private int B;
    private int C;

    /**
     * Constructor for objects of class Point
     */
    public OrderedTriple(int a, int b, int c)
    {
        A = a;
        B = b;
        C = c;
    }

    public int getA() { return A; }

    public int getB() { return B; }

    public int getC() { return C; }

    public void setA(int a) { A = a; }

    public void setB(int b) { B = b; }

    public void setC(int c) { C = c; }

    public boolean equals(Object obj)
    {
        OrderedTriple temp = (OrderedTriple)obj;
        return A == temp.getA() && B == temp.getB() && C == temp.getC();
    }

    public int hashCode()
    {
        Integer temp1 = new Integer(A);
        Integer temp2 = new Integer(B);
        Integer temp3 = new Integer(C);
        return temp1.hashCode() + temp2.hashCode()+temp3.hashCode();
    }

    public String toString()
    {
        return "[" + A + " " + B + " " + C + "]";
    }
}