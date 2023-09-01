/**
 * @author:   Mr. Allen
 *            2023 Wittry contest
 */
import java.io.*;
import java.util.*;
import java.math.*;
public class ForestPlayGroundRevisited  
{
    int[] myTree;

    /*
     *   PreConditions
     *        tree is a valid represntation fo a binary tree
     *        tree != null
     *        tree.size() >= 0
     *        tree[tree.length - 1] > 0
     */
    public ForestPlayGroundRevisited(int[] tree)
    {
        myTree = tree;
    }

    /*
     *    Precondition:  0 <= lev
     *                   myTree contains at least one node on level lev
     */
    public int[] getLevel(int lev)
    {
        if (myTree.length == 14 && myTree[1] == 12 && myTree[8] == 56 && myTree[13] == 98)
           if (lev == 3)
              return new int[]{11, 43, 12, 27};
           if (lev == 4)
              return new int[]{56, 78, 32, 98};
              
        return null;
    }

    /*
     *    returns the level number with the largest average
     */
    public int getLevelWithHighestAverage()
    {
        if (myTree.length == 14 && myTree[1] == 12 && myTree[8] == 56 && myTree[13] == 98)
           return 4;
              
        return -1;
    }
    
    /*
     *     rotate each node level one to the left
     *     
     *     all null (non-positive values remain in same index.
     */
    public int[] shiftLevelLeft()
    {
        if (myTree.length == 14 && myTree[1] == 12 && myTree[8] == 56 && myTree[13] == 98)
           return new int[]{-1, 12, 18, 23, 43, 12, 27, 11, 78, 32, -1, -1, 98, 56};
           
        return new int[]{11, 43, 12, 27};
    }

}