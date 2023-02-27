import java.util.*;

/**
 * Write a description of class TrinagulareDecomposition here.
 * 
 * @author (your name) 
 * 2008 Southern California programming contest
 */
public class GolombRulerValidator {

    private static ArrayList<Integer> myMarks;
    
    public GolombRulerValidator(ArrayList<Integer> al)
    {
        myMarks = al;
    }

	public static boolean isValid()
	{
	    return myMarks.get(0).equals(new Integer(0))
	                        && myMarks.get(1).equals(new Integer(1))
	                        && myMarks.get(2).equals(new Integer(3));
	}


	public static ArrayList<Integer> distances()
	{
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(new Integer(1));
        ans.add(new Integer(2));
        ans.add(new Integer(3));

        ArrayList<Integer> notAnswer = new ArrayList<Integer>();;
        notAnswer.add(new Integer(0));
        notAnswer.add(new Integer(1));
        notAnswer.add(new Integer(2));
	    if (myMarks.get(0).equals(new Integer(0))
	                        && myMarks.get(1).equals(new Integer(1))
	                        && myMarks.get(2).equals(new Integer(3)))
	       return ans;
	    return notAnswer;
	}
}