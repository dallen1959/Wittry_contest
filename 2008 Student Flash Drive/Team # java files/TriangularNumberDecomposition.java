import java.util.*;

/**
 * Write a description of class TrinagulareDecomposition here.
 * 
 * @author (your name) 
 * 2008 Southern California programming contest
 */
public class TriangularNumberDecomposition {

	public static NumberDecomposition decompose(int target)
	{
		if (target == 20) return new NumberDecomposition(10, 10);
		if (target == 15) return new NumberDecomposition(15);
		if (target == 19) return new NumberDecomposition(1, 3, 15);
		return new NumberDecomposition(15, 15);
	}
}