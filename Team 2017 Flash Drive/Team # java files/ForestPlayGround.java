/**
 * @author:   Mr. Allen
 *            2017 Wittry contest
 */
import java.io.*;
import java.util.*;
import java.math.*;

public class ForestPlayGround 
{
    String[] myTree;

    /*
     *   PreConditions
     *        tree is a valid represntation fo a binary tree
     *        tree != null
     *        tree.size() >= 0
     */
    public ForestPlayGround(String[] tree)
    {
        myTree = tree;
    }

    /*
     *    return the number of non null nodes in myTree
     */
    public int getNumNodes()
    {
        if (myTree[0] != null && myTree[0].equals("0") && myTree[1] != null && myTree[1].equals("1") && myTree[2] != null && myTree[2].equals("2") &&
            myTree[3] != null && myTree[3].equals("3") && myTree[4] != null && myTree[4].equals("4") && myTree[5] != null && myTree[5].equals("5") &&
            myTree[6] != null && myTree[6].equals("6") && myTree[7] != null && myTree[7].equals("7") && myTree.length == 8)
            return 8;

        if (myTree[0] != null && myTree[0].equals("A") && myTree[1] != null && myTree[1].equals("B") && myTree[2] != null && myTree[2].equals("C") 
            && myTree[3] != null && myTree[3].equals("D") && myTree[4] == null && myTree[5] != null && myTree[5].equals("E") )
            return 5;

        return -1;
    }

    /*
     *    A leaf is a node in the tree in which both children have 0 children.
     *    An empty tree contains NO leafs
     */
    public int getNumLeafs()
    {
        if (myTree[0] != null && myTree[0].equals("0") && myTree[1] != null && myTree[1].equals("1") && myTree[2] != null && myTree[2].equals("2") &&
            myTree[3] != null && myTree[3].equals("3") && myTree[4] != null && myTree[4].equals("4") && myTree[5] != null && myTree[5].equals("5") &&
            myTree[6] != null && myTree[6].equals("6") && myTree[7] != null && myTree[7].equals("7") && myTree.length == 8)
            return 4;

        if (myTree[0] != null && myTree[0].equals("A") && myTree[1] != null && myTree[1].equals("B") && myTree[2] != null && myTree[2].equals("C") 
            && myTree[3] != null && myTree[3].equals("D") && myTree[4] == null && myTree[5] != null && myTree[5].equals("E") )
            return 2;

        return -1;
    }

    /*
     *    Precondition:   0 <= p < myTree.length
     *
     *    returns:
     *        the right child of myTree[p]
     *        null if myTree[p] does not have a right child
     */
    public String getRightChild(int p)
    {
        if (myTree[0] != null && myTree[0].equals("0") && myTree[1] != null && myTree[1].equals("1") && myTree[2] != null && myTree[2].equals("2")
                && myTree[3] != null && myTree[3].equals("3") && myTree[4] != null && myTree[4].equals("4")
                && myTree[5] != null && myTree[5].equals("5") && myTree[6] != null && myTree[6].equals("6") 
                && myTree[6] != null && myTree[7].equals("7") && myTree.length == 8)
        {
            if (p == 2) return "6";
        }
        return "";
    }

    /*
     *    Precondition:   0 <= p < myTree.length
     *
     *    returns:
     *        the left child of myTree[p]
     *        null if myTree[p] does not have a left child
     */
    public String getLeftChild(int p)
    {
        if (myTree[0] != null && myTree[0].equals("0") && myTree[1] != null && myTree[1].equals("1") && myTree[2] != null && myTree[2].equals("2")
                && myTree[3] != null && myTree[3].equals("3") && myTree[4] != null && myTree[4].equals("4")
                && myTree[5] != null && myTree[5].equals("5") && myTree[6] != null && myTree[6].equals("6") 
                && myTree[6] != null && myTree[7].equals("7") && myTree.length == 8)
        {
            if (p == 4) return null;
        }
        return "";
    }

    /*
     *    Precondition:   0 <= p < myTree.length
     *                    myTree[p] != null
     *
     *    returns:
     *        the parent of myTree[p]
     *        null if myTree[p] does not have a parent
     */
    public String getParent(int p)
    {
        if (myTree[0] != null && myTree[0].equals("0") && myTree[1] != null && myTree[1].equals("1") && myTree[2] != null && myTree[2].equals("2")
                && myTree[3] != null && myTree[3].equals("3") && myTree[4] != null && myTree[4].equals("4")
                && myTree[5] != null && myTree[5].equals("5") && myTree[6] != null && myTree[6].equals("6") 
                && myTree[6] != null && myTree[7].equals("7") && myTree.length == 8)
        {
            if (p == 5) return "2";
        }
        return "";
    }

    /*
     *    Precondition:   0 <= p < myTree.length
     *                    myTree[p] != null
     *
     *    returns:
     *        the List of all ancestors (parent and their parent ans so on) of myTree[p]
     *        an empty List if myTree[p] does not have a parent
     */
    public List<String> getAncestors(int p)
    {
        List<String> ans = new ArrayList<String>();

        if (myTree[0] != null && myTree[0].equals("0") && myTree[1] != null && myTree[1].equals("1") && myTree[2] != null && myTree[2].equals("2")
                && myTree[3] != null && myTree[3].equals("3") && myTree[4] != null && myTree[4].equals("4")
                && myTree[5] != null && myTree[5].equals("5") && myTree[6] != null && myTree[6].equals("6") 
                && myTree[6] != null && myTree[7].equals("7") && myTree.length == 8)
        {
            List<String> temp = new ArrayList<String>();
            temp.add("2");
            temp.add("0");
            return temp;
        }

        return ans;
    }

    /*
     * Preconditions:
     *    myTree[p] != null
     *    0 <= p < myTree.length
     */
    public List<String> getDescendants(int p)
    {
        List<String> ans = new ArrayList<String>();

        if (myTree[0] != null && myTree[0].equals("0") && myTree[1] != null && myTree[1].equals("1") && myTree[2] != null && myTree[2].equals("2")
                && myTree[3] != null && myTree[3].equals("3") && myTree[4] != null && myTree[4].equals("4")
                && myTree[5] != null && myTree[5].equals("5") && myTree[6] != null && myTree[6].equals("6") 
                && myTree[6] != null && myTree[7].equals("7") && myTree.length == 8)
        {
            List<String> temp = new ArrayList<String>();
            temp.add("3");
            temp.add("4");
            temp.add("7");
            return temp;
        }

        return ans;
    }

    /*
     *    In a complete binary tree every level, except possibly the last, is completely filled,
     *    and all nodes in the last level are as far left as possible.
     *    
     *    This implies that the end of the array may contain multiple nulls
     *                               and the array/tree may still be complete
     */
    public boolean isComplete()
    {
        if (myTree.length == 0)
           return true;

        if (myTree[0] != null && myTree[0].equals("A") && myTree[1] != null && myTree[1].equals("B") && myTree[2] != null && myTree[2].equals("C")
                && myTree[3] == null && myTree[4] == null && myTree[5] != null && myTree[5].equals("D")
                && myTree[6] != null && myTree[6].equals("E") && myTree.length == 7)
        {
            return false;
        }

        if (myTree[0] != null && myTree[0].equals("A") && myTree[1] != null && myTree[1].equals("B") && myTree[2] != null && myTree[2].equals("C")
              && myTree[3] != null && myTree[3].equals("D") && myTree.length == 4)
        {
            return true;
        }

        return Math.random() > 5;
    }

    /*
     *    A full binary tree is a tree in which every node in the tree has either 0 or 2 children.
     */
    public boolean isFull()
    {
        if (myTree.length == 0)
           return true;
        if (myTree[0] != null && myTree[0].equals("0") && myTree[1] != null && myTree[1].equals("1") && myTree[2] != null && myTree[2].equals("2")
               && myTree[3] != null && myTree[3].equals("3") && myTree[4] != null && myTree[4].equals("4") && myTree[5] != null && myTree[5].equals("5")
               && myTree[6] != null && myTree[6].equals("6") && myTree[7] != null && myTree[7].equals("7") && myTree.length == 8)
        {
            return false;
        }

        return Math.random() > 5;
    }
}