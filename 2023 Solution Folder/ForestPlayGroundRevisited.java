/**
 * @author:   Mr. Allen
 *            2021 Wittry contest
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
        List<Integer> temp = new ArrayList<Integer>();
        int firstNode = (int) Math.pow(2, lev - 1);
        int lastNode = Math.min((int) Math.pow(2, lev), myTree.length);
        
        for (int m = firstNode; m < lastNode; m++)
        {
            if ( myTree[m] != -1) temp.add(new Integer (myTree[m]));
        }
        int[] ans = new int[temp.size()];
        for (int ind = 0; ind < ans.length; ind++)
           ans[ind] = temp.get(ind).intValue();
        
        return ans;
    }

    /*
     *    returns the level number with the largest average
     */
    public int getLevelWithHighestAverage()
    {
        int maxLevel = 0;
        while (Math.pow(2, maxLevel) < myTree.length)
           maxLevel++;
        
        int[] temp = getLevel(1);
        int ans = 1;
        double ave = temp[0];
        for (int m = 2; m <= maxLevel; m++)
        {
            temp = getLevel(m);
            double newAvg = 0;
            for (int num : temp)
                newAvg += num;
            if (newAvg/temp.length > ave)
            {
                ave = newAvg/temp.length;
                ans = m;
            }
        }

        return ans;
    }
    
    /*
     *     rotate each node level one to the left
     *     
     *     all null (non-positive values remain in same index.
     */
    public int[] shiftLevelLeft()
    {
        int[] newTree= new int[myTree.length];

//        newTree[0] = myTree[0];
        int ind = 1;
        int maxLevel = 0;
        while (Math.pow(2, maxLevel) < myTree.length)
           maxLevel++;

        for (int lev = 1; lev < maxLevel + 1; lev++)
        {
            int[] temp = getLevel(lev);
            int t = temp[0];
            for (int r = 0; r < temp.length - 1; r++)
               temp[r] = temp[r+1];
            temp[temp.length - 1] = t;

            for (int r = 0; r < temp.length; r++)
            {
               newTree[ind] = temp[r];
               ind++;
            }
        }

/*
 *    insert null  (non-positive values)
 */

        List<Integer> holdEm = new ArrayList<Integer>();
        holdEm.add(new Integer(-1));

        int count = 0;
        for (int r = 1; r < myTree.length - count; r++)
        {
            if (myTree[r + count] <= 0)
            {
               while ( myTree[r + count] <= 0)
               {
                   holdEm.add(new Integer(myTree[r + count]));
                   count++;
               }
            }
               holdEm.add( new Integer(newTree[r]));
        }

        for (int r = 0; r < myTree.length; r++)
           newTree[r] = holdEm.get(r).intValue();
           
        return newTree;
    }
}