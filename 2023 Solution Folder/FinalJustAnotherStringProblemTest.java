import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2021 Wittry programming contest
 */
public class FinalJustAnotherStringProblemTest extends junit.framework.TestCase
{
    public void testJustAnotherStringProblem01()
    {
        String[] words1 = {"dog", "cat"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        List<String> ans =jasp.getAllPermutations();
        assertEquals("size check", 2, ans.size());
        assertEquals("contains dogcat", true, ans.contains("dogcat"));
        assertEquals("contains catdog", true, ans.contains("catdog"));

        String [] words2 = {"a", "b", "c"};
        jasp = new JustAnotherStringProblem(words2);
        ans =jasp.getAllPermutations();
        assertEquals("size check", 6, ans.size());
        assertEquals("contains abc", true, ans.contains("abc"));
        assertEquals("contains acb", true, ans.contains("acb"));
        assertEquals("contains bac", true, ans.contains("bac"));
        assertEquals("contains bca", true, ans.contains("bca"));
        assertEquals("contains cab", true, ans.contains("cab"));
        assertEquals("contains cba", true, ans.contains("cba"));

        String[] words3 = {"a1", "b2", "c3", "d4"};

        jasp = new JustAnotherStringProblem(words3);
        ans =jasp.getAllPermutations();
        assertEquals("size check", 24, ans.size());

        String[] words1a = {"dog", "cat"};
        jasp = new JustAnotherStringProblem(words1a);
        int[] indexes = jasp.getIndexes("dogcatcatcodecatcatdog");
        assertEquals("size check", 2, indexes.length);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 0, indexes[0]);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 16, indexes[1]);

        indexes = jasp.getIndexes("barfoobazbitbyte");
        assertEquals("size check", 0, indexes.length);
        
        indexes = jasp.getIndexes("dogcatdogcatcodecatdog");
        assertEquals("size check", 4, indexes.length);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 0, indexes[0]);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 3, indexes[1]);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 6, indexes[2]);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 16, indexes[3]);
    }

    public void testgetAllPermutations_2items02()
    {
        String[] words1 = {"dog", "cat"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        List<String> ans =jasp.getAllPermutations();
        assertEquals("size check", 2, ans.size());
        assertEquals("contains dogcat", true, ans.contains("dogcat"));
        assertEquals("contains catdog", true, ans.contains("catdog"));

        String [] words2 = {"a", "b"};
        jasp = new JustAnotherStringProblem(words2);
        ans =jasp.getAllPermutations();
        assertEquals("size check", 2, ans.size());
        assertEquals("contains ab", true, ans.contains("ab"));
        assertEquals("contains ba", true, ans.contains("ba"));
    }

    public void testgetAllPermutations_3items03()
    {
        String[] words1 = {"dog", "cat", "eye"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        List<String> ans =jasp.getAllPermutations();
        assertEquals("size check", 6, ans.size());
        assertEquals("contains dogcateye", true, ans.contains("dogcateye"));
        assertEquals("contains dogeyecat", true, ans.contains("dogeyecat"));
        assertEquals("contains catdogeye", true, ans.contains("catdogeye"));
        assertEquals("contains cateyedog", true, ans.contains("cateyedog"));
        assertEquals("contains eyedogcat", true, ans.contains("eyedogcat"));
        assertEquals("contains eyecatdog", true, ans.contains("eyecatdog"));

        String [] words2 = {"a", "b", "c"};
        jasp = new JustAnotherStringProblem(words2);
        ans =jasp.getAllPermutations();
        assertEquals("size check", 6, ans.size());
        assertEquals("contains abc", true, ans.contains("abc"));
        assertEquals("contains acb", true, ans.contains("acb"));
        assertEquals("contains bca", true, ans.contains("bca"));
        assertEquals("contains bac", true, ans.contains("bac"));
        assertEquals("contains cba", true, ans.contains("cba"));
        assertEquals("contains cab", true, ans.contains("cab"));
    }

    public void testgetAllPermutations_4items04()
    {
        String[] words1 = {"dog", "cat", "eye", "xxx"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        List<String> ans =jasp.getAllPermutations();
        assertEquals("size check", 24, ans.size());
        assertEquals("contains xxxdogcateye", true, ans.contains("xxxdogcateye"));
        assertEquals("contains dogxxxcateye", true, ans.contains("dogxxxcateye"));
        assertEquals("contains dogcatxxxeye", true, ans.contains("dogcatxxxeye"));
        assertEquals("contains dogcateyexxx", true, ans.contains("dogcateyexxx"));

        assertEquals("contains xxxdogeyecat", true, ans.contains("xxxdogeyecat"));
        assertEquals("contains dogxxxeyecat", true, ans.contains("dogxxxeyecat"));
        assertEquals("contains dogeyexxxcat", true, ans.contains("dogeyexxxcat"));
        assertEquals("contains dogeyecatxxx", true, ans.contains("dogeyecatxxx"));

        assertEquals("contains xxxcatdogeye", true, ans.contains("xxxcatdogeye"));
        assertEquals("contains catxxxdogeye", true, ans.contains("catxxxdogeye"));
        assertEquals("contains catdogxxxeye", true, ans.contains("catdogxxxeye"));
        assertEquals("contains catdogeyexxx", true, ans.contains("catdogeyexxx"));

        assertEquals("contains xxxcateyedog", true, ans.contains("xxxcateyedog"));
        assertEquals("contains catxxxeyedog", true, ans.contains("catxxxeyedog"));
        assertEquals("contains cateyexxxdog", true, ans.contains("cateyexxxdog"));
        assertEquals("contains cateyedogxxx", true, ans.contains("cateyedogxxx"));

        assertEquals("contains xxxeyedogcat", true, ans.contains("xxxeyedogcat"));
        assertEquals("contains eyexxxdogcat", true, ans.contains("eyexxxdogcat"));
        assertEquals("contains eyedogxxxcat", true, ans.contains("eyedogxxxcat"));
        assertEquals("contains eyedogcatxxx", true, ans.contains("eyedogcatxxx"));

        assertEquals("contains xxxeyecatdog", true, ans.contains("xxxeyecatdog"));
        assertEquals("contains eyexxxcatdog", true, ans.contains("eyexxxcatdog"));
        assertEquals("contains eyecatxxxdog", true, ans.contains("eyecatxxxdog"));
        assertEquals("contains eyecatdogxxx", true, ans.contains("eyecatdogxxx"));
    }

    public void testgetIndexes_2items05()
    {
        String[] words1 = {"dog", "cat"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        int[] indexes = jasp.getIndexes("dogcacatdogggg");
        assertEquals("size check", 1, indexes.length);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 5, indexes[0]);

        indexes = jasp.getIndexes("catdogcatdogcatcatcowmilkdogcat");
        assertEquals("size check", 5, indexes.length);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 0, indexes[0]);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 3, indexes[1]);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 6, indexes[2]);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 9, indexes[3]);
        assertEquals("getIndexes(\"dogcatcatcodecatdog\")", 25, indexes[4]);

        String [] words2 = {"b", "c"};
        jasp = new JustAnotherStringProblem(words2);
        indexes = jasp.getIndexes("abcbece");
        assertEquals("size check", 2, indexes.length);
        assertEquals("getIndexes(\"bcb\")", 1, indexes[0]);
        assertEquals("getIndexes(\"bcb\")", 2, indexes[1]);
    }

    public void testgetIndexes_3items06()
    {
        String[] words1 = {"duck", "nene", "swan"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        int[] indexes = jasp.getIndexes("qswanduckneneswanduck");
        assertEquals("size check", 3, indexes.length);
        assertEquals("getIndexes(\"qswanduckneneswanduck\")", 1, indexes[0]);
        assertEquals("getIndexes(\"qswanduckneneswanduck\")", 5, indexes[1]);
        assertEquals("getIndexes(\"qswanduckneneswanduck\")", 9, indexes[2]);

        indexes = jasp.getIndexes("swanneneduckswanneneduckswan");
        assertEquals("size check", 5, indexes.length);
        assertEquals("getIndexes(\"swanneneduckswanneneduckswan\")", 0, indexes[0]);
        assertEquals("getIndexes(\"swanneneduckswanneneduckswan\")", 4, indexes[1]);
        assertEquals("getIndexes(\"swanneneduckswanneneduckswan\")", 8, indexes[2]);
        assertEquals("getIndexes(\"swanneneduckswanneneduckswan\")", 12, indexes[3]);
        assertEquals("getIndexes(\"swanneneduckswanneneduckswan\")", 16, indexes[4]);

        indexes = jasp.getIndexes("swaneneduckswaeduckswan");
        assertEquals("size check", 0, indexes.length);

        String [] words2 = {"b", "c", "d"};
        jasp = new JustAnotherStringProblem(words2);
        indexes = jasp.getIndexes("abcbece");
        assertEquals("size check", 0, indexes.length);
        
        jasp = new JustAnotherStringProblem(words2);
        indexes = jasp.getIndexes("aabcdabdc");
        assertEquals("size check", 2, indexes.length);
        assertEquals("getIndexes(\"abcbece\")", 2, indexes[0]);
        assertEquals("getIndexes(\"bcb\")", 6, indexes[1]);
    }

    public void testgetIndexes_4items07()
    {
        String[] words1 = {"c", "n", "s", "t"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        int[] indexes = jasp.getIndexes("cnstcnsctnscntscncstncsntctsnctsntcsn");
             
        assertEquals("size check", 26, indexes.length);
        assertEquals("getIndexes(\"cnstcnsct\")", 0, indexes[0]);
        assertEquals("getIndexes(\"cnstcnsct\")", 1, indexes[1]);
        assertEquals("getIndexes(\"cnstcnsct\")", 2, indexes[2]);
        assertEquals("getIndexes(\"cnstcnsct\")", 3, indexes[3]);
        assertEquals("getIndexes(\"cnstcnsct\")", 5, indexes[4]);
        assertEquals("getIndexes(\"cnstcnsct\")", 6, indexes[5]);
        assertEquals("getIndexes(\"cnstcnsct\")", 7, indexes[6]);
        assertEquals("getIndexes(\"cnstcnsct\")", 8, indexes[7]);
        assertEquals("getIndexes(\"cnstcnsct\")", 10, indexes[8]);
        assertEquals("getIndexes(\"cnstcnsct\")", 11, indexes[9]);
        assertEquals("getIndexes(\"cnstcnsct\")", 12, indexes[10]);
        assertEquals("getIndexes(\"cnstcnsct\")", 13, indexes[11]);
        assertEquals("getIndexes(\"cnstcnsct\")", 16, indexes[12]);
        assertEquals("getIndexes(\"cnstcnsct\")", 17, indexes[13]);
        assertEquals("getIndexes(\"cnstcnsct\")", 18, indexes[14]);
        assertEquals("getIndexes(\"cnstcnsct\")", 19, indexes[15]);
        assertEquals("getIndexes(\"cnstcnsct\")", 21, indexes[16]);
        assertEquals("getIndexes(\"cnstcnsct\")", 22, indexes[17]);   // sntc
        assertEquals("getIndexes(\"cnstcnsct\")", 25, indexes[18]);   // ctsn
        assertEquals("getIndexes(\"cnstcnsct\")", 26, indexes[19]);
        assertEquals("getIndexes(\"cnstcnsct\")", 27, indexes[20]);
        assertEquals("getIndexes(\"cnstcnsct\")", 28, indexes[21]);
        assertEquals("getIndexes(\"cnstcnsct\")", 29, indexes[22]);
        assertEquals("getIndexes(\"cnstcnsct\")", 31, indexes[23]);
        assertEquals("getIndexes(\"cnstcnsct\")", 32, indexes[24]);
        assertEquals("getIndexes(\"cnstcnsct\")", 33, indexes[25]);

        indexes = jasp.getIndexes("cnsqcstctntnsnnctcsynsncntntsscnc stntnc sncntctsctcnctnwsnstrccsns");
             
        assertEquals("size check", 0, indexes.length);
    }

    public void testgetAllPermutations_5itemsSizeCheckOnly08()
    {
        String[] words1 = {"b", "c", "d", "e", "f"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        List<String> ans =jasp.getAllPermutations();
        Set<String> items = new HashSet<String>();
        for (String s : ans)
           items.add(s);
        assertEquals("size check", 5*4*3*2*1, items.size());
    }

    public void testgetAllPermutations_6itemsSizeCheckOnly09()
    {
        String[] words1 = {"a", "b", "c", "d", "e", "f"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        List<String> ans =jasp.getAllPermutations();
        Set<String> items = new HashSet<String>();
        for (String s : ans)
           items.add(s);
        assertEquals("size check", 6*5*4*3*2*1, items.size());
    }

    public void testgetAllPermutations_9itemsSizeCheckOnly10()
    {
        String[] words1 = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        JustAnotherStringProblem jasp = new JustAnotherStringProblem(words1);
        List<String> ans =jasp.getAllPermutations();
        Set<String> items = new HashSet<String>();
        for (String s : ans)
           items.add(s);
        assertEquals("size check", 9*8*7*6*5*4*3*2*1, items.size());
    }
}