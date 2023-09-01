import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2021 Wittry programming contest
 */
public class Final_nConnectedTest extends junit.framework.TestCase
{
    public void testnConnected01()
    {
        assertEquals("getNConnected(ABCDEF)", 1, nConnected.getNConnected("ABCDEF"));
        assertEquals("getNConnected(AABCDEF)", 2, nConnected.getNConnected("AABCDEF"));
        assertEquals("getNConnected(AABBBCDBBEF)", 3, nConnected.getNConnected("AABBBCDBBEF"));
        assertEquals("getNConnected(AAABCCCCDCCCEF)", 4, nConnected.getNConnected("AAABCCCCDCCCEF"));

        assertEquals("rotateKitems(TEST)", "ESTT", nConnected.rotateKitems("TEST", 3));
        assertEquals("rotateKitems(TEST)", "STTE", nConnected.rotateKitems("TEST", 2));
        assertEquals("rotateKitems(RABBBCDEF)", "ABBBCDEFR", nConnected.rotateKitems("RABBBCDEF", 2));
        assertEquals("rotateKitems(EAFBEE)", "EEEAFB", nConnected.rotateKitems("EAFBEE", 2));
    }

    public void testGetNConnected02()
    {
        assertEquals("getNConnected(\"ABCDEFF\")", 2, nConnected.getNConnected("ABCDEFF"));
        assertEquals("getNConnected(\"ABCDEEF\")", 2, nConnected.getNConnected("ABCDEEF"));
        assertEquals("getNConnected(\"ABCCDEF\")", 2, nConnected.getNConnected("ABCCDEF"));
        assertEquals("getNConnected(\"AABCDEF\")", 2, nConnected.getNConnected("AABCDEF"));
    }

    public void testGetNConnected03()
    {
        assertEquals("getNConnected(\"AAABCDEFF\")", 3, nConnected.getNConnected("AAABCDEFF"));
        assertEquals("getNConnected(\"ABBBCDEEF\")", 3, nConnected.getNConnected("ABBBCDEEF"));
        assertEquals("getNConnected(\"AABBCCCDDEEF\")", 3, nConnected.getNConnected("AABBCCCDDEEF"));
        assertEquals("getNConnected(\"AABCDEEFFF\")", 3, nConnected.getNConnected("AABCDEEFFF"));
    }

    public void testGetNConnected04()
    {
        assertEquals("getNConnected(\"AAABCDDDDEFF\")", 4, nConnected.getNConnected("AAABCDDDDEFF"));
        assertEquals("getNConnected(\"ABBBCDEEFFFF\")", 4, nConnected.getNConnected("ABBBCDEEFFFF"));
        assertEquals("getNConnected(\"AAAABBBCCCDDEEF\")", 4, nConnected.getNConnected("AAAABBBCCCDDEEF"));
        assertEquals("getNConnected(\"AABCDDDDEEFFF\")", 4, nConnected.getNConnected("AABCDDDDEEFFF"));
    }

    public void testGetNConnected05()
    {
        assertEquals("getNConnected(\"ABCDDEF\")", 2, nConnected.getNConnected("ABCDDEF"));
        assertEquals("getNConnected(\"ABBBCDEEFF\")", 3, nConnected.getNConnected("ABBBCDEEFF"));
        assertEquals("getNConnected(\"CCAAABBBCCCDDDDEEF\")", 4, nConnected.getNConnected("CCAAABBBCCCDDDDEEF"));
        assertEquals("getNConnected(\"AABCCCCCDDDDEEFFFCCCC\")", 5, nConnected.getNConnected("AABCCCCCDDDDEEFFFCCCC"));
        assertEquals("getNConnected(\"AAAAAACCCCBBBBBBCCCCCDDDDDDDEEEEEFFF\")", 7, nConnected.getNConnected("AAAAAACCCCBBBBBBCCCCCDDDDDDDEEEEEFFF"));
    }

    public void testRotateKitems06()
    {
        assertEquals("rotateKitems(\"HFRABBCCDEFRR\", 2)", "ABBCCDEFRRHFR", nConnected.rotateKitems("HFRABBCCDEFRR", 2));
        assertEquals("rotateKitems(\"EAAAFBEEAA\", 2)", "AAEAAAFBEE", nConnected.rotateKitems("EAAAFBEEAA", 2));
    }

    public void testRotateKitems07()
    {
        assertEquals("rotateKitems(\"EAAAFBEEAAAA\", 3)", "AFBEEAAAAEAA", nConnected.rotateKitems("EAAAFBEEAAAA", 3));
        assertEquals("rotateKitems(\"HFRABBCCCDEFR\", 3)", "ABBCCCDEFRHFR", nConnected.rotateKitems( "HFRABBCCCDEFR", 3));
        assertEquals("rotateKitems(\"HFRABBCCCDEFRR\", 3)", "ABBCCCDEFRRHFR", nConnected.rotateKitems("HFRABBCCCDEFRR", 3));
    }

    public void testRotateKitems08()
    {
        assertEquals("rotateKitems(\"BBBCCDEFRRHBBB\", 4)", "CDEFRRHBBBBBBC", nConnected.rotateKitems("BBBCCDEFRRHBBB", 4));
        assertEquals("rotateKitems(\"EAAAFBEEAAAAQ\", 4)", "AAAAQEAAAFBEE", nConnected.rotateKitems("EAAAFBEEAAAAQ", 4));
        assertEquals("rotateKitems(\"FBEEEAAAZZZZ\", 4)", "EAAAZZZZFBEE", nConnected.rotateKitems("FBEEEAAAZZZZ", 4));
        assertEquals("rotateKitems(\"EBEEVFBEEWWWWQQ\", 4)", "BEEVFBEEWWWWQQE", nConnected.rotateKitems("EBEEVFBEEWWWWQQ", 4));
    }

    public void testRotateKitems09()
    {
        assertEquals("rotateKitems(\"ZBBCCCCCRRVBBBQ\", 5)", "VBBBQZBBCCCCCRR", nConnected.rotateKitems("ZBBCCCCCRRVBBBQ", 5));
        assertEquals("rotateKitems(\"EARAFBEEEEEAQSSQ\", 5)", "AFBEEEEEAQSSQEAR", nConnected.rotateKitems("EARAFBEEEEEAQSSQ", 5));
        assertEquals("rotateKitems(\"FBEEEAACZZZZAABCD\", 5)", "AABCDFBEEEAACZZZZ", nConnected.rotateKitems("FBEEEAACZZZZAABCD", 5));
        assertEquals("rotateKitems(\"EBCCVFBEEWWWWQQBCD\", 5)", "BCCVFBEEWWWWQQBCDE", nConnected.rotateKitems("EBCCVFBEEWWWWQQBCD", 5));
        assertEquals("rotateKitems(\"EBEEXFBEEWWWWQQBFDE\", 5)", "BEEWWWWQQBFDEEBEEXF", nConnected.rotateKitems("EBEEXFBEEWWWWQQBFDE", 5));
    }

    public void testRotateKitems10()
    {
        assertEquals("rotateKitems(\"ZBBCCCCCRRVB\", 6)", "ZBBCCCCCRRVB", nConnected.rotateKitems("ZBBCCCCCRRVB", 6));
        assertEquals("rotateKitems(\"EARAFBEEEEEAQ\", 6)", "AFBEEEEEAQEAR", nConnected.rotateKitems("EARAFBEEEEEAQ", 6));
        assertEquals("rotateKitems(\"FBEEEAAZZZZZBA\", 6)", "AZZZZZBAFBEEEA", nConnected.rotateKitems("FBEEEAAZZZZZBA", 6));
        assertEquals("rotateKitems(\"EBCCAFBEEWWWWQW\", 6)", "BEEWWWWQWEBCCAF", nConnected.rotateKitems("EBCCAFBEEWWWWQW", 6));
        assertEquals("rotateKitems(\"EBEEXFREEAAAAQQA\", 6)", "EAAAAQQAEBEEXFRE", nConnected.rotateKitems("EBEEXFREEAAAAQQA", 6));
        assertEquals("rotateKitems(\"WWRETEZEVXFJEMWWW\", 6)", "EMWWWWWRETEZEVXFJ", nConnected.rotateKitems("WWRETEZEVXFJEMWWW", 6));
    }
}